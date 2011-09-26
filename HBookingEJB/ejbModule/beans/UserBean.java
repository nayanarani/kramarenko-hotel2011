package beans;

import beans.api.local.UserBeanLocal;

import javax.ejb.Stateless;

import entities.User;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
public class UserBean implements UserBeanLocal {

    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User findByLoginAndPassword(String login, int passwordHash) {
		// TODO Auto-generated method stub
		return null;
	}

}
