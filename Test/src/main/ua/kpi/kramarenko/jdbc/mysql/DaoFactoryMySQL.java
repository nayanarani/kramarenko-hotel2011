package ua.kpi.kramarenko.jdbc.mysql;


import ua.kpi.kramarenko.jdbc.DaoFactory;
import ua.kpi.kramarenko.jdbc.to.api.BillDao;
import ua.kpi.kramarenko.jdbc.to.api.ClientDao;
import ua.kpi.kramarenko.jdbc.to.api.ContactDao;
import ua.kpi.kramarenko.jdbc.to.api.OrderDao;
import ua.kpi.kramarenko.jdbc.to.api.RequestDao;
import ua.kpi.kramarenko.jdbc.to.api.RoomDao;

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
