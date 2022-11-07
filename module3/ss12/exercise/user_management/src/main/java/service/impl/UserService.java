package service.impl;

import model.User;
import repostory.IUserRepostory;
import repostory.impl.UserRepostory;
import service.IUserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepostory userRepostory = new UserRepostory();
    @Override
    public List<User> findAll() {
        return userRepostory.findAll();
    }

    @Override
    public boolean add(User user) {
        return userRepostory.add(user);
    }

    @Override
    public boolean update(User user) {
        return userRepostory.update(user);
    }

    @Override
    public List<User> findByCountry(String ctr) {
        return userRepostory.findByCountry(ctr);
    }

}
