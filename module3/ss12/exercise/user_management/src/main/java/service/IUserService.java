package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findAll();
    boolean add(User user);
    boolean update(User user);
    List<User> findByCountry(String ctr);
}
