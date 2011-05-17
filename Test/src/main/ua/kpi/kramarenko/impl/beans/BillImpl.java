/**
 * 
 */
package ua.kpi.kramarenko.impl.beans;

import java.io.Serializable;
import java.sql.Date;

import ua.kpi.kramarenko.api.hotel.beans.Bill;
import ua.kpi.kramarenko.api.hotel.beans.Request;

/**
 * @author mathan 
 * 
 */
public class BillImpl implements Bill, Serializable {

	private static final long serialVersionUID = 1L;

	public BillImpl() {
	}

	public BillImpl(int id, Request request, Date date, float sum) {
		this.id = id;
		this.request = request;
		this.date = date;
		this.sum = sum;
	}
	
	public int getId() {
		return id;
	}

	public Request getRequest() {
		return request;
	}

	public Date getDate() {
		return date;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	private int id;
	private Request request;
	private Date date; 
	private float sum;
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BillImpl)) {
			return false;
		}
		BillImpl other = (BillImpl) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
}
