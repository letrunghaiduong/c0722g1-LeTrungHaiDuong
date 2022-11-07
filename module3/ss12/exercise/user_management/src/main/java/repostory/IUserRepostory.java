package repostory;

import model.User;

import java.util.List;

public interface IUserRepostory {
    List<User> findAll();
    boolean add(User user);
    boolean update(User user);
    List<User> findByCountry(String ctr);

}
