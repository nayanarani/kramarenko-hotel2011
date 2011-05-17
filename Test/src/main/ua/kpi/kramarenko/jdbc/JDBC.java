package ua.kpi.kramarenko.jdbc;


import ua.kpi.kramarenko.jdbc.mysql.DaoFactoryMySQL;
import ua.kpi.kramarenko.jdbc.to.api.BillDao;
import ua.kpi.kramarenko.jdbc.to.api.ClientDao;
import ua.kpi.kramarenko.jdbc.to.api.ContactDao;
import ua.kpi.kramarenko.jdbc.to.api.OrderDao;
import ua.kpi.kramarenko.jdbc.to.api.RequestDao;
import ua.kpi.kramarenko.jdbc.to.api.RoomDao;
import ua.kpi.kramarenko.resource.Property;
import ua.kpi.kramarenko.resource.ResourceManager;

public class JDBC {

	private static enum DBType {
		MySQL, H2;
	}
	
	private static final DBType driverType = DBType
	.valueOf(ResourceManager.config
			.getProperty(Property.config.DATABASE_TYPE));
	
	private static final DaoFactory daoFactory = createFactory(driverType);
	
	public static final OrderDao order = daoFactory.createOrderDao();
	public static final RequestDao request = daoFactory.createRequestDao();
	public static final RoomDao room = daoFactory.createRoomDao();
	public static final BillDao bill = daoFactory.createBillDao();
	public static final ClientDao client = daoFactory.createClientDao();
	public static final ContactDao contacts = daoFactory.createContactsDao();
	
	private static DaoFactory createFactory(DBType driverType) {
		switch (driverType) {
		case MySQL : return new DaoFactoryMySQL();
		default : return new DaoFactoryMySQL();
		}
	}
}
