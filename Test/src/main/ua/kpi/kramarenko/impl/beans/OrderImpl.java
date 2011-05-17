package ua.kpi.kramarenko.impl.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;

import ua.kpi.kramarenko.api.hotel.beans.Order;
import ua.kpi.kramarenko.api.hotel.beans.Room;

public class OrderImpl implements Order, Serializable {

	private static final long serialVersionUID = 1L;
	
	public OrderImpl() {
	}

	public OrderImpl(HashSet<Room> rooms, Date checkInDate, Date checkOutDate) {
		setRooms(rooms);
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	
	
	public HashSet<Room> getRooms() {
		return rooms;
	}

	
	public void setRooms(HashSet<Room> rooms) {
		this.rooms = rooms;
	}

	
	public Date getCheckInDate() {
		return checkInDate;
	}

	
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((checkInDate == null) ? 0 : checkInDate.hashCode());
		result = prime * result
				+ ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderImpl other = (OrderImpl) obj;
		if (checkInDate == null) {
			if (other.checkInDate != null)
				return false;
		} else if (!checkInDate.equals(other.checkInDate))
			return false;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		return true;
	}

	
	public String toString() {
		return "Order [rooms=" + rooms + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + "]";
	}

	private HashSet<Room> rooms;
	private Date checkInDate;
	private Date checkOutDate;

}
