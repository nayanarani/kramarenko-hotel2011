package ua.kpi.kramarenko.impl.beans;

import java.io.Serializable;

public class RoomImpl implements ua.kpi.kramarenko.api.hotel.beans.Room, Serializable {

	private static final long serialVersionUID = 1L;
	
	public RoomImpl() {
	}

	public RoomImpl(int id, String roomClass, String roomType, int capasity,
			float rate) {
		this.id = id;
		this.roomClass = roomClass;
		this.roomType = roomType;
		this.capasity = capasity;
		this.rate = rate;
	}

	
	public int getId() {
		return id;
	}

	
	public String getRoomClass() {
		return roomClass;
	}

	
	public String getRoomType() {
		return roomType;
	}

	
	public int getCapasity() {
		return capasity;
	}

	
	public float getRate() {
		return rate;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomImpl other = (RoomImpl) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	public String toString() {
		return "Room [id=" + id + ", roomClass=" + roomClass + ", roomType="
				+ roomType + ", capasity=" + capasity + ", rate=" + rate + "]";
	}

	private int id;
	private String roomClass;
	private String roomType;
	private int capasity;
	private float rate;

}
