package beans;

import java.util.List;

import beans.api.local.AdministratorBeanLocal;

import javax.ejb.Stateless;

import entities.Administrator;

/**
 * Session Bean implementation class AdministratorBean
 */
@Stateless
public class AdministratorBean implements AdministratorBeanLocal {
	
    /**
     * Default constructor. 
     */
    public AdministratorBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Administrator authenticate(String login, int passwordHash) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrator> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrator findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
