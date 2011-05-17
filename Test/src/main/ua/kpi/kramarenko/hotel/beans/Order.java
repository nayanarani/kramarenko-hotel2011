package ua.kpi.kramarenko.hotel.beans;

import java.sql.Date;
import java.util.HashSet;

/**
 * @author mathan
 *
 */
public interface Order {
	public HashSet<Room> getRooms();
	public void setRooms(HashSet<Room> rooms);	
	public Date getCheckInDate();
	public Date getCheckOutDate();
}
