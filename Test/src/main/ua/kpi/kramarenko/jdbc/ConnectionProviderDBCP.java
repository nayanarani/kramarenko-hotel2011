package ua.kpi.kramarenko.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp.ConnectionFactory;
import org.apache.tomcat.dbcp.dbcp.DriverManagerConnectionFactory;
import org.apache.tomcat.dbcp.dbcp.PoolingDataSource;
import org.apache.tomcat.dbcp.dbcp.PoolableConnectionFactory;
import org.apache.tomcat.dbcp.pool.ObjectPool;
import org.apache.tomcat.dbcp.pool.impl.GenericObjectPool;

import ua.kpi.kramarenko.resource.Property;
import ua.kpi.kramarenko.resource.ResourceManager;

public class ConnectionProviderDBCP {

	private final int MAX_ACTIVE = Integer.parseInt(ResourceManager.config
			.getProperty(Property.config.MAX_ACTIVE));
	private final int MAX_IDLE = Integer.parseInt(ResourceManager.config
			.getProperty(Property.config.MAX_IDLE));
	private final int MIN_IDLE = Integer.parseInt(ResourceManager.config
			.getProperty(Property.config.MIN_IDLE));
	private final int MAX_WAIT = Integer.parseInt(ResourceManager.config
			.getProperty(Property.config.MAX_WAIT));

	private PoolingDataSource dataSource = null;

	public ConnectionProviderDBCP(String driver, String url, String user,
			String password) {
		// try {
		// Class.forName(driver);
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		dataSource = setupDataSource(url, user, password);
	}

	public synchronized Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void close(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet resultSet, Statement statement) {
		close(resultSet);
		close(statement);
	}
	
	public static void close(Statement statement) {
		try {
			if (statement != null)
				statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private PoolingDataSource setupDataSource(String url, String user,
			String password) {
		GenericObjectPool.Config config = new GenericObjectPool.Config();

		config.maxActive = MAX_ACTIVE;
		config.maxIdle = MAX_IDLE;
		config.minIdle = MIN_IDLE;
		config.maxWait = MAX_WAIT;

		ObjectPool connectionPool = new GenericObjectPool(null, config);

		ConnectionFactory connectionFactory = new DriverManagerConnectionFactory(
				url, user, password);

		new PoolableConnectionFactory(connectionFactory, connectionPool, null,
				null, false, true);

		PoolingDataSource poolingDataSource = new PoolingDataSource(
				connectionPool);

		return poolingDataSource;
	}
}
