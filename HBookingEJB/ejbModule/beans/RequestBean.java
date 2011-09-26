package beans;

import java.util.List;

import beans.api.local.RequestBeanLocal;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Request;

/**
 * Session Bean implementation class RequestBean
 */
@Stateless
@LocalBean
public class RequestBean implements RequestBeanLocal {

    /**
     * Default constructor. 
     */
    public RequestBean() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public List<Request> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Request> findAllRequestsForRoom(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
