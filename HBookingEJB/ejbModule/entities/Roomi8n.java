package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the Roomi8n database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Roomi8n.selectAll", query = "Select r from Roomi8n r"),
		@NamedQuery(name = "Roomi8n.selectById", query = "Select r from Roomi8n r " +
				"where r.id.roomId = :value AND r.id.lancode =:value2") })
@Table(name = "Roomi8n")
public class Roomi8n implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Roomi8nPK id;

	@Column(name = "roomDescription", nullable = false, length = 45)
	private String roomDescription;

	// bi-directional many-to-one association to Room
	@ManyToOne
	@JoinColumn(name = "roomId", nullable = false, insertable = false, updatable = false)
	private Room room;

	public Roomi8n() {
	}

	public Roomi8nPK getId() {
		return this.id;
	}

	public void setId(Roomi8nPK id) {
		this.id = id;
	}

	public String getRoomDescription() {
		return this.roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}