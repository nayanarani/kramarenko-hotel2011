package beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import beans.api.local.AdministratorBeanLocal;
import entities.Administrator;

/**
 * Session Bean implementation class AdministratorBean
 */
@Stateless
public class AdministratorBean implements AdministratorBeanLocal {
	@PersistenceContext(unitName = "HBookingEJB")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * beans.api.local.AdministratorBeanLocal#authenticate(java.lang.String,
	 * int)
	 */
	@Override
	public Administrator authenticate(String login, int passwordHash) {
		Administrator administrator = null;
		Query query = entityManager
				.createNamedQuery("Administrator.authenticate");
		query.setParameter("email", login);
		query.setParameter("password", passwordHash);

		try {
			administrator = (Administrator) query.getSingleResult();
		} catch (NoResultException e) {
			// Autentication failed, no such login/password. Log failure.
		} catch (NonUniqueResultException e) {
			// This is very bad
		}
		return administrator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see beans.api.local.AdministratorBeanLocal#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Administrator> findAll() {
		return entityManager.createNamedQuery("Administrator.selectAll")
				.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see beans.api.local.AdministratorBeanLocal#findById(java.lang.Integer)
	 */
	@Override
	public Administrator findById(Integer id) {
		Administrator administrator = null;
		Query query = entityManager
				.createNamedQuery("Administrator.selectById");
		query.setParameter("userId", id);
		try {
			administrator = (Administrator) query.getSingleResult();
		} catch (NoResultException e) {
			return administrator;
		}
		return administrator;
	}
}
