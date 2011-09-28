package entities;

import entities.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Administrator.selectAll", query = "Select a from Administrator a"),
	@NamedQuery(name = "Administrator.selectById", query = "Select a from Administrator a "
			+ "where a.userId = :value"),
	@NamedQuery(name = "Administrator.authenticate", query = "Select a from Administrator a "
			+ "WHERE a.email = :value AND a.password = :value2") })
@DiscriminatorValue(value = "administrator")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Administrator extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
   
}
