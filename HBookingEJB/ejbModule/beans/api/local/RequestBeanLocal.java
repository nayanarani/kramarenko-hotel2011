package beans.api.local;
import java.util.List;

import javax.ejb.Local;

import entities.Request;

@Local
public interface RequestBeanLocal {

	List<Request> findAll();
	Request findById(Integer id);
	List<Request> findAllRequestsForRoom(int id);
}
