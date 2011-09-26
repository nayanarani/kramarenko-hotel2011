package beans.api.local;
import javax.ejb.Local;

import entities.User;

@Local
public interface UserBeanLocal {
	User findByLoginAndPassword(String login, int passwordHash);
}
