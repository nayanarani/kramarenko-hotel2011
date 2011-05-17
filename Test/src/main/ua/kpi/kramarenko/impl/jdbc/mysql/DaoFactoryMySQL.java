package ua.kpi.kramarenko.impl.jdbc.mysql;


import ua.kpi.kramarenko.api.jdbc.BillDao;
import ua.kpi.kramarenko.api.jdbc.ClientDao;
import ua.kpi.kramarenko.api.jdbc.ContactDao;
import ua.kpi.kramarenko.api.jdbc.DaoFactory;
import ua.kpi.kramarenko.api.jdbc.OrderDao;
import ua.kpi.kramarenko.api.jdbc.RequestDao;
import ua.kpi.kramarenko.api.jdbc.RoomDao;

public class DaoFactoryMySQL implements DaoFactory {


	
	public BillDao createBillDao() {
		return new BillDaoMySQL();
	}

	
	public ClientDao createClientDao() {
		return new ClientDaoMySQL();
	}

	
	public ContactDao createContactsDao() {
		return new ContactDaoMySQL();
	}

	
	public OrderDao createOrderDao() {
		return new OrderDaoMySQL();
	}

	
	public RequestDao createRequestDao() {
		return new RequestDaoMySQL();
	}

	
	public RoomDao createRoomDao() {
		return new RoomDaoMySQL();
	}

}
