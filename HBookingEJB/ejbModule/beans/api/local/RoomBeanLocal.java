package beans.api.local;

import javax.ejb.Local;

import entities.Room;

@Local
public interface RoomBeanLocal {

	boolean changeRoom(Room room);

	boolean addRoom(Room room);

	Room findRoomById(int id);

	Room[] findAll();

	Room[] findAllActive();

	String getLocalizedDescription(Room room, String language);

}
