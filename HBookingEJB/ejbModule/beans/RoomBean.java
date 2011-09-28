package beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import beans.api.local.RoomBeanLocal;
import entities.Room;

/**
 * Session Bean implementation class RoomBean
 */
@Stateless
public class RoomBean implements RoomBeanLocal {

	private Logger logger = Logger.getLogger(getClass().getName());

	@PersistenceContext(unitName = "HBookingEJB")
	private EntityManager entityManager;

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

	@SuppressWarnings("unchecked") 
	@Override
	public List<Room> findAll() {
		List<Room> resultlList = entityManager.createNamedQuery("Room.selectAll").getResultList();
		logger.info(resultlList);
		return resultlList; 
	} 

	@SuppressWarnings("unchecked")
	@Override
	public List<Room> findAllActive() {
		return entityManager.createNamedQuery("Room.selectAllActive")
				.getResultList();
	}

	@Override
	public String getLocalizedDescription(Room room, String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeRoom(Room room) {
		// TODO Auto-generated method stub
		return false;
	}

}
