package repostory;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepostory {
    List<User> findAll();
    boolean add(User user);
    boolean update(User user);
    List<User> search(String ctr);
    boolean deleteUser(int id);
    List<User> getUserById(int id);
    boolean insertUserStore(User user);
    void addUserTransaction();

}
