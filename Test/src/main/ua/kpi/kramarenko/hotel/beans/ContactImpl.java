package ua.kpi.kramarenko.hotel.beans;

import java.io.Serializable;

public class ContactImpl implements ua.kpi.kramarenko.hotel.beans.Contact, Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int clientId;
	private int requestId;
	private String telephoneNo;

	public ContactImpl() {
	}

	
	public int getId() {
		return id;
	}

	
	public int getClientId() {
		return clientId;
	}

	
	public int getRequestId() {
		return requestId;
	}

	
	public String getTelephoneNo() {
		return telephoneNo;
	}

	
	public void setClientId(int clientId) {
		this.clientId = clientId;		
	}

	
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

}
