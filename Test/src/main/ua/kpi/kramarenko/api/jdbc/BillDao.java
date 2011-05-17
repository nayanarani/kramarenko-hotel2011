package ua.kpi.kramarenko.api.jdbc;

import ua.kpi.kramarenko.api.hotel.beans.Bill;

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
