package ua.kpi.kramarenko.impl.beans;

import java.io.Serializable;
import java.sql.Date;

import ua.kpi.kramarenko.api.hotel.beans.Client;
import ua.kpi.kramarenko.api.hotel.beans.Contact;

public class ClientImpl implements Client, Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private Contact[] contacts;
	private Date date;
	private String login;
	private int passwordHash;
	private String rights;
	private String status;
	

	public ClientImpl() {
	}

	public ClientImpl(int id, String name, Date date, Contact[] contacts,
			String login, String rights, String status) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.login = login;
		this.contacts = contacts;
		setRights(rights);
		setStatus(status);
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Contact[] getContacts() {
		return contacts;
	}


	public String getLogin() {
		return login;
	}


	public Date getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientImpl other = (ClientImpl) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", contacts=" + contacts
				+ ", date=" + date + ", login=" + login + "]";
	}


	public String getRights() {
		return rights;
	}


	public void setRights(String rights) {
		this.rights = rights;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public int getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(int passwordHash) {
		this.passwordHash = passwordHash;
	}

}
