package ua.kpi.kramarenko.jdbc.to.api;

import ua.kpi.kramarenko.hotel.beans.Bill;

/**
 * @author mathan
 *
 */
public interface BillDao {
	
	public Bill[] selectAll();
	public Bill[] selectWhereIdIs();
	public Bill[] selectWhereRequestIdIs();
	public Bill[] selectWhereSumIs();
	public Bill[] selectWhereDateIs();

}
