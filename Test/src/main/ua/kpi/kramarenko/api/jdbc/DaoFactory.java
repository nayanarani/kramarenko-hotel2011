package ua.kpi.kramarenko.api.jdbc;




public interface DaoFactory {
	
	public BillDao createBillDao();
	public ClientDao createClientDao();
	public ContactDao createContactsDao();
	public OrderDao createOrderDao();
	public RequestDao createRequestDao();
	public RoomDao createRoomDao();

}
