package entities;

import entities.Request;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bill
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Bill extends Request implements Serializable {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "billDate", nullable = false)
	private Date billDate;

	@Column(name = "sum", nullable = false)
	private float sum;

	private static final long serialVersionUID = 1L;

	public Bill() {
		super();
	}

	public Date getBillDate() {
		return this.billDate;
	}

	public float getSum() {
		return this.sum;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

}
