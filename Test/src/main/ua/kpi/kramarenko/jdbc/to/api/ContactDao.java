package ua.kpi.kramarenko.jdbc.to.api;

import ua.kpi.kramarenko.hotel.beans.Contact;

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
