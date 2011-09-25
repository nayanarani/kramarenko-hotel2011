package entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;

/**
 * The persistent class for the Room database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Room.selectAll", query = "Select r from Room r"),
		@NamedQuery(name = "Room.selectById", query = "Select r from Room r "
				+ "where r.roomId = :value"),
		@NamedQuery(name = "Room.selectAvailable", query = "Select r from Room r "
				+ "WHERE r.roomIsAvailable = 1"),
		@NamedQuery(name = "Room.selectByType", query = "Select r from Room r "
				+ "WHERE r.roomType = :value"),
		@NamedQuery(name = "Room.selectByClass", query = "Select r from Room r "
				+ "WHERE r.roomClass = :value") })
@Table(name = "Room")
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "roomId", unique = true, nullable = false)
	private int roomId;

	@Column(name = "roomCapacity", nullable = false)
	private int roomCapacity;

	@Column(name = "roomClass", nullable = false, length = 45)
	private String roomClass;

	@Column(name = "roomDescription", length = 200)
	private String roomDescription;

	@Column(name = "roomIsAvailable", nullable = false)
	private byte roomIsAvailable;

	@Column(name = "roomRate", nullable = false)
	private int roomRate;

	@Column(name = "roomType", nullable = false, length = 45)
	private String roomType;

	// bi-directional many-to-many association to Request
	@ManyToMany
	@JoinTable(name = "Orders", joinColumns = { @JoinColumn(name = "roomId", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "billId", nullable = false) })
	private Set<Request> requests;

	// bi-directional many-to-one association to Roomi8n
	@OneToMany(mappedBy = "room")
	private Set<Roomi8n> roomi8ns;

	public Room() {
	}

	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomCapacity() {
		return this.roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getRoomClass() {
		return this.roomClass;
	}

	public void setRoomClass(String roomClass) {
		this.roomClass = roomClass;
	}

	public String getRoomDescription() {
		return this.roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public byte getRoomIsAvailable() {
		return this.roomIsAvailable;
	}

	public void setRoomIsAvailable(byte roomIsAvailable) {
		this.roomIsAvailable = roomIsAvailable;
	}

	public int getRoomRate() {
		return this.roomRate;
	}

	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Set<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}

	public Set<Roomi8n> getRoomi8ns() {
		return this.roomi8ns;
	}

	public void setRoomi8ns(Set<Roomi8n> roomi8ns) {
		this.roomi8ns = roomi8ns;
	}

}