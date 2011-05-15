package ua.kpi.kramarenko.hotel.api.beans;

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
	public String getRights();
	public void setRights(String rigths);
	public String getStatus();
	public void setStatus(String status);
}
