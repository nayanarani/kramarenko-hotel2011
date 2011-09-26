package beans;

import java.util.List;

import beans.api.local.BillBeanLocal;

import javax.ejb.Stateless;

import entities.Bill;

/**
 * Session Bean implementation class BillBean
 */
@Stateless
public class BillBean implements BillBeanLocal {

    /**
     * Default constructor. 
     */
    public BillBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Bill> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
