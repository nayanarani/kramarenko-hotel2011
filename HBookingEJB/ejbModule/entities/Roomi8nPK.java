package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Roomi8n database table.
 * 
 */
@Embeddable
public class Roomi8nPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "lancode", unique=true, nullable=false, length=2)
	private String lancode;

	@Column(name = "roomId",unique=true, nullable=false)
	private int roomId;

    public Roomi8nPK() {
    }
	public String getLancode() {
		return this.lancode;
	}
	public void setLancode(String lancode) {
		this.lancode = lancode;
	}
	public int getRoomId() {
		return this.roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Roomi8nPK)) {
			return false;
		}
		Roomi8nPK castOther = (Roomi8nPK)other;
		return 
			this.lancode.equals(castOther.lancode)
			&& (this.roomId == castOther.roomId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.lancode.hashCode();
		hash = hash * prime + this.roomId;
		
		return hash;
    }
}