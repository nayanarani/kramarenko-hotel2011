package ua.kpi.kramarenko.api.hotel.beans;

import java.sql.Date;


/**
 * @author mathan
 *
 */
public interface Client {
	public int getId();
	public String getName();
	public Date getDate();
	public Contact[] getContacts();
	public String getLogin();
	public int getPasswordHash();
	public void setPasswordHash(int passwordHash);
	public String getRights();
	public void setRights(String rigths);
	public String getStatus();
	public void setStatus(String status);
}
