package ua.kpi.kramarenko.api.hotel.beans;

import java.sql.Date;

/**
 * @author mathan
 *
 */
public interface Request {

	public int getId();
	
	public Client getClient();
	
	public Order getOrder();
	public void setOrder(Order order);
	
	public int getPersons();
	public void setPersons(int persons);
	
	public String getContact();
	public void setContact(String contact);
	
	//______________________________________________ TODO
	
	public String getRoomClass();
	public void setRoomClass(String roomClass);
	
	public String getRoomType();
	public void setRoomType(String roomType);
	
	public Date getCheckInDate();
	public void setCheckInDate(Date checkInDate);
	
	public Date getCheckOutDate();
	public void setCheckOutDate(Date checkOutDate);
	
	public String getStatus();
	public void setStatus(String status);
	
	public Date getDate();
	
}
