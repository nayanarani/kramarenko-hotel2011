package ua.kpi.kramarenko.hotel.beans;

import java.sql.Date;

/**
 * @author mathan
 *
 */
public interface Bill {
	
	public int getId();
	public Request getRequest();
	public Date getDate();
	public float getSum();
	public void setSum(float sum);
}
