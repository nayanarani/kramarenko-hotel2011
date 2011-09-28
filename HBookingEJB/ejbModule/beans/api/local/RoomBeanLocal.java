package beans.api.local;

import java.util.List;

import javax.ejb.Local;

import entities.Room;

@Local
public interface RoomBeanLocal {

	boolean changeRoom(Room room);

	boolean addRoom(Room room);

	Room findRoomById(int id);

	List<Room> findAll();

	List<Room> findAllActive();

	String getLocalizedDescription(Room room, String language);

	boolean removeRoom(Room room);

}
