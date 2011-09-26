package beans.api.local;

import java.util.List;

import javax.ejb.Local;

import entities.Administrator;

@Local
public interface AdministratorBeanLocal {

	/**
	 * @return full list of Administrators
	 */
	List<Administrator> findAll();

	/**
	 * @param id
	 *            - Administrator id parameter by which we search
	 * @return single Administrator, corresponding to the specified id
	 */
	Administrator findById(Integer id);

	/**
	 * @param login
	 * @param passwordHash
	 * @return Administrator, corresponding to the specified login and password,
	 *         and will return null if authentification fails
	 */
	Administrator authenticate(String login, int passwordHash);
}
