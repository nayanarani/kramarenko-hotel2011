package ua.kpi.kramarenko.jdbc.to.api;

import java.sql.Date;

import ua.kpi.kramarenko.hotel.beans.Request;

public interface RequestDao {
	
	public Request[] selectAll();
	public Request[] selectWhereIdIs(int id);
	public Request[] selectWherePersonsIs(int persons);
	public Request[] selectWhereClientIdIs(int clientId);
	public Request[] selectWhereContactIdIs(int contactId);
	public Request[] selectWhereDateIs(Date date);	

}
