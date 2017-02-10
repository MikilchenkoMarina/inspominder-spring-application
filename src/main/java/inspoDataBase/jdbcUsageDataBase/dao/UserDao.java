package inspoDataBase.jdbcUsageDataBase.dao;

import inspoDataBase.jdbcUsageDataBase.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mmikilchenko on 09.02.2017.
 */
public interface UserDao {
    public void addUser(User user);

    public User getUserById(int id);

    public void deleteUserById(int id);

    public List<User> showAllUsers();

}
