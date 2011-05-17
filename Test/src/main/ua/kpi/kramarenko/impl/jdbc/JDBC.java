package ua.kpi.kramarenko.impl.jdbc;


import ua.kpi.kramarenko.api.jdbc.BillDao;
import ua.kpi.kramarenko.api.jdbc.ClientDao;
import ua.kpi.kramarenko.api.jdbc.ContactDao;
import ua.kpi.kramarenko.api.jdbc.DaoFactory;
import ua.kpi.kramarenko.api.jdbc.OrderDao;
import ua.kpi.kramarenko.api.jdbc.RequestDao;
import ua.kpi.kramarenko.api.jdbc.RoomDao;
import ua.kpi.kramarenko.impl.jdbc.mysql.DaoFactoryMySQL;
import ua.kpi.kramarenko.impl.rescon.Property;
import ua.kpi.kramarenko.impl.rescon.ResourceManager;

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
