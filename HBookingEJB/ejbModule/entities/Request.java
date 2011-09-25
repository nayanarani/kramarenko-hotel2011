package entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.Set;

/**
 * The persistent class for the Request database table.
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries({
		@NamedQuery(name = "Request.selectAll", query = "Select r from Request r"),
		@NamedQuery(name = "Request.selectById", query = "Select r from Request r WHERE r.billId = :value"),
		@NamedQuery(name = "Request.selectByClientId", query = "Select r from Request r WHERE r.clientId = :value") })
@Table(name = "Request")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "billId", unique = true, nullable = false)
	private int billId;

	@Temporal(TemporalType.DATE)
	@Column(name = "checkInDate", nullable = false)
	private Date checkInDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "checkOutDate", nullable = false)
	private Date checkOutDate;

	@Column(name = "clientId", nullable = false)
	private int clientId;

	@Column(name = "persons", nullable = false)
	private int persons;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "requestDate", nullable = false)
	private Date requestDate;

	// bi-directional many-to-many association to Room
	@ManyToMany(mappedBy = "requests")
	private Set<Room> rooms;

	public Request() {
	}

	public int getBillId() {
		return this.billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Date getCheckInDate() {
		return this.checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return this.checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getPersons() {
		return this.persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Set<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

}