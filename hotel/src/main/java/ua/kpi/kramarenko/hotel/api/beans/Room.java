/**
 * 
 */
package ua.kpi.kramarenko.hotel.api.beans;

/**
 * @author mathan
 *
 */
public interface Room {
	public int getId();
	public String getRoomClass();
	public String getRoomType();
	public int getCapasity();
	public float getRate();
}
