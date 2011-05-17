package ua.kpi.kramarenko.jdbc.to.api;

import ua.kpi.kramarenko.hotel.beans.Client;

/**
 * @author mathan
 *
 */
public interface ClientDao {
	
	public Client[] selectAll();
	public Client[] selectWhereIdIs();
	public Client[] selectWhereNameIs();
	public Client[] selectWhereLoginIs();
	public Client[] selectActive();
	public Client[] selectBanned();
	public Client[] selectWhereContactsIs();

}
