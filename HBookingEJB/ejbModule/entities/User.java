package entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;

/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "user")
@NamedQueries({
		@NamedQuery(name = "User.selectAll", query = "Select u from User u"),
		@NamedQuery(name = "User.selectById", query = "Select u from User u "
				+ "where u.userId = :value"),
		@NamedQuery(name = "User.authenticate", query = "Select u from User u "
				+ "WHERE u.email = :value AND u.password = :value2") })
@Table(name = "User")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "userId", unique = true, nullable = false)
	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "clientDate", nullable = false)
	private Date clientDate;

	@Column(name = "contactTelephone", nullable = false, length = 45)
	private String contactTelephone;

	@Column(name = "dtype", nullable = false, length = 45)
	private String dtype;

	@Column(name = "email", nullable = false, length = 45)
	private String email;

	@Column(name = "firstName", nullable = false, length = 45)
	private String firstName;

	@Column(name = "lastName", nullable = false, length = 45)
	private String lastName;

	@Column(name = "middleName", length = 45)
	private String middleName;

	@Column(name = "password", nullable = false)
	private int password;

	public User() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

	public Date getClientDate() {
		return this.clientDate;
	}

	public String getContactTelephone() {
		return this.contactTelephone;
	}

	public String getDtype() {
		return this.dtype;
	}

	public String getEmail() {
		return this.email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public int getPassword() {
		return this.password;
	}

	public int getUserId() {
		return this.userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}

	public void setClientDate(Date clientDate) {
		this.clientDate = clientDate;
	}

	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", contactTelephone=" + contactTelephone
				+ ", clientDate=" + clientDate + ", dtype=" + dtype
				+ ", password=" + password + "]";
	}

}