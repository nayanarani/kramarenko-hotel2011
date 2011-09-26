package beans.api.local;

import java.util.List;

import javax.ejb.Local;

import entities.Bill;

@Local
public interface BillBeanLocal {

	List<Bill> findAll();

	Bill findById(Integer id);
}
