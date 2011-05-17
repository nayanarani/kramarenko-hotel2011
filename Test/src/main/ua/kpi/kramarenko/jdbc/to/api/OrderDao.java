package ua.kpi.kramarenko.jdbc.to.api;

import java.sql.Date;

import ua.kpi.kramarenko.hotel.beans.Order;

/**
 * @author mathan
 *
 */
public interface OrderDao{
	
	public Order[] selectAll();
	public Order[] selectWhereRoomIdIs(int roomId);
	public Order[] selectWhereRequestIdIs(int requestId);
	public Order[] selectWhereCheckInDateIs(Date checkInDate);
	public Order[] selectWhereCheckOutDateIs(Date checkOutDate);
}
