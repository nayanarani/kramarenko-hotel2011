package ua.kpi.kramarenko.hotel.beans;

import java.io.Serializable;
import java.sql.Date;


public class RequestImpl implements ua.kpi.kramarenko.hotel.beans.Request, Serializable {

	private static final long serialVersionUID = 1L;
	
	public RequestImpl() {
		
	}

	public RequestImpl(int id, Client client, Order order, int persons,
			String contact, String status) {
		this.id = id;
		this.client = client;
		setOrder(order);
		setPersons(persons);
		setContact(contact);
		setStatus(status);
	}

	
	public int getId() {
		return id;
	}

	
	public Client getClient() {
		return client;
	}

	
	public Order getOrder() {
		return order;
	}

	
	public void setOrder(Order order) {
		this.order = order;
	}

	
	public int getPersons() {
		return persons;
	}

	
	public void setPersons(int persons) {
		this.persons = persons;
	}

	
	public String getContact() {
		return contact;
	}

	
	public void setContact(String contact) {
		this.contact = contact;
	}

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public Date getDate() {
		return date;
	}

	
	public String getRoomClass() {
		return roomClass;
	}

	
	public void setRoomClass(String roomClass) {
		this.roomClass = roomClass;
	}

	
	public String getRoomType() {
		return roomType;
	}

	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
	public Date getCheckInDate() {
		return checkInDate;
	}

	
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestImpl other = (RequestImpl) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	public String toString() {
		return "Request [id=" + id + ", client=" + client + ", order=" + order
				+ ", persons=" + persons + ", contact=" + contact + ", status="
				+ status + ", date=" + date + ", roomClass=" + roomClass
				+ ", roomType=" + roomType + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + "]";
	}

	private int id;
	private Client client;
	private Order order;
	private int persons;
	private String contact;
	private String status;
	private Date date;
	private String roomClass;
	private String roomType;
	private Date checkInDate;
	private Date checkOutDate;

}
