package ua.kpi.kramarenko.api.jdbc;

import ua.kpi.kramarenko.api.hotel.beans.Contact;

/**
 * @author mathan
 *
 */
public interface ContactDao {
	
	public Contact[] selectAll();
	public Contact[] selectWhereClientIdIs();
	public Contact[] selectWhereRequestIdIs();
	public Contact[] selectWhereTelephoneNoIs();
	public Contact[] selectWhereIdIs();
}
