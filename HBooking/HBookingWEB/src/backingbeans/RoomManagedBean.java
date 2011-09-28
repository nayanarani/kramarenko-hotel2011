package backingbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import beans.RoomBean;
import beans.api.local.RoomBeanLocal;

import com.thoughtworks.xstream.XStream;

import entities.Room;

@ManagedBean(name = "room")
@SessionScoped
public class RoomManagedBean {

	private class RoomBeanMock extends RoomBean {

		private List<Room> allRooms;

		public RoomBeanMock() {
			setAllRooms(roomBean.findAll());
		}

		public List<Room> getAllRooms() {
			return allRooms;
		}

		public void setAllRooms(List<Room> allRooms) {
			this.allRooms = allRooms;
		}

		@Override
		public boolean addRoom(Room room) {
			getAllRooms().add(room);
			return true;
		}

		@Override
		public boolean changeRoom(Room room) {
			for (Room roomToEdit : getAllRooms()) {
				if (roomToEdit.getRoomId() == room.getRoomId()) {
					roomToEdit = room;
				}
			}
			return true;
		}

		@Override
		public List<Room> findAll() {
			return getAllRooms();
		}

		@Override
		public List<Room> findAllActive() {
			List<Room> foundRooms = new ArrayList<Room>();
			for (Room room : getAllRooms()) {
				if (room.getRoomIsAvailable() == true) {
					foundRooms.add(room);
				}
			}
			return foundRooms;
		}

		@Override
		public Room findRoomById(int id) {
			for (Room room : getAllRooms()) {
				if (room.getRoomId() == id) {
					return room;
				}
			}
			return null;
		}

		@Override
		protected void finalize() throws Throwable {
			XStream xStream = new XStream();
			System.out.println(xStream.toXML(getAllRooms()));
			super.finalize();
		}

		@Override
		public boolean removeRoom(Room room) {
			getAllRooms().remove(room);
			return true;
		}
	}

	private DataModel<Room> model;

	private Room room;

	private RoomBeanLocal roomBean;

	private RoomBeanMock roomBeanMock;

	public RoomManagedBean() throws NamingException {
		roomBean = (RoomBeanLocal) new InitialContext()
				.lookup("java:global/HBooking/HBookingEJB/RoomBean");
		roomBeanMock = new RoomBeanMock();
		model = new ListDataModel<Room>();
		setRoom(new Room());
		List<Room> rooms = roomBeanMock.findAll();
		model.setWrappedData(rooms);
	}

	public String addRoom() {
		roomBeanMock.addRoom(getRoom());
		return "list_all_rooms";
	}

	public String editRoom() {
		roomBeanMock.changeRoom(getRoom());
		return "list_all_rooms";
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String setupAddRoom() {
		setRoom(new Room());
		return "add_room";
	}

	public String setupEditRoom() {
		setRoom(model.getRowData());
		return "edit_room";
	}

	public String removeRoom() {
		room = model.getRowData();
		roomBeanMock.removeRoom(room);
		return "list_all_rooms";
	}

	public DataModel<Room> getModel() {
		return model;
	}

	public void setModel(DataModel<Room> model) {
		this.model = model;
	}

}
