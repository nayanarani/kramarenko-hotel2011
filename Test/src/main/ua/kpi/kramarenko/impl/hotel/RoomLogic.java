/**
 * 
 */
package ua.kpi.kramarenko.impl.hotel;

import java.sql.Date;
import java.util.HashSet;

import ua.kpi.kramarenko.api.hotel.beans.Order;
import ua.kpi.kramarenko.api.hotel.beans.Room;
import ua.kpi.kramarenko.impl.jdbc.JDBC;

/**
 * @author mathan
 * 
 */
public class RoomLogic {

	public static HashSet<Room> availableRoomsHashSet = getAvailableRooms();

	/**
	 * Returns all free rooms for chosen time interval
	 * 
	 * @param checkInDate
	 *            - current user choice check-in date
	 * @param checkOutDate
	 *            - current user choice check-out date
	 * @return all free rooms for chosen time interval
	 */
	public HashSet<Room> getRoomsFor(Date checkInDate, Date checkOutDate) {
		// result set
		HashSet<Room> freeRooms = availableRoomsHashSet;

		Order[] processedOrders = JDBC.order.selectAll();
		// remove all currently occupied rooms from result set
		for (Order order : processedOrders) {
			if (!(order.getCheckOutDate().before(checkInDate)
					|| order.getCheckOutDate().equals(checkInDate)
					|| order.getCheckInDate().after(checkOutDate) || order
					.getCheckInDate().equals(checkOutDate))) {
				freeRooms.removeAll(order.getRooms());
			}
		}
		return freeRooms;
	}

	public HashSet<Room> getRoomsFor(int persons) {
		// result set
		HashSet<Room> rooms = new HashSet<Room>();
		
		for (int i = 1; i <= persons; i++) {
			Room[] rm = JDBC.room.selectWhereRoomCapasityIs(i);
			for (Room room : rm) {
				rooms.add(room);
			}
		}
		return rooms;
	}

	public HashSet<Room> getRoomsFor(int persons, Date checkInDate,
			Date checkOutDate) {
		HashSet<Room> rooms = new HashSet<Room>();
		rooms.addAll(getRoomsFor(persons));
		rooms.retainAll(getRoomsFor(checkInDate, checkOutDate));
		return rooms;
	}

	private static HashSet<Room> getAvailableRooms() {
		HashSet<Room> rooms = new HashSet<Room>();

		for (Room room : availableRoomsArray) {
			rooms.add(room);
		}
		return rooms;
	}

	private static Room[] availableRoomsArray = JDBC.room
			.selectAllAvailable();
}
