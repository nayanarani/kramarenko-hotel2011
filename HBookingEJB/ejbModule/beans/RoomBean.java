package beans;

import javax.ejb.Stateless;

import beans.api.local.RoomBeanLocal;
import entities.Room;

/**
 * Session Bean implementation class RoomBean
 */
@Stateless
public class RoomBean implements RoomBeanLocal {

	/**
	 * Default constructor.
	 */
	public RoomBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean changeRoom(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRoom(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room findRoomById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room[] findAllActive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalizedDescription(Room room, String language) {
		// TODO Auto-generated method stub
		return null;
	}

}
