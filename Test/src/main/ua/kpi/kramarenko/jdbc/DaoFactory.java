package ua.kpi.kramarenko.jdbc;

import ua.kpi.kramarenko.jdbc.to.api.BillDao;
import ua.kpi.kramarenko.jdbc.to.api.ClientDao;
import ua.kpi.kramarenko.jdbc.to.api.ContactDao;
import ua.kpi.kramarenko.jdbc.to.api.OrderDao;
import ua.kpi.kramarenko.jdbc.to.api.RequestDao;
import ua.kpi.kramarenko.jdbc.to.api.RoomDao;




public interface DaoFactory {
	
	public BillDao createBillDao();
	public ClientDao createClientDao();
	public ContactDao createContactsDao();
	public OrderDao createOrderDao();
	public RequestDao createRequestDao();
	public RoomDao createRoomDao();

}
