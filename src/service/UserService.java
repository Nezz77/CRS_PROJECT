package service;

import dao.UserDao;
import dto.UserDto;
import java.sql.Connection;

public class UserService {
     private UserDao userDao;

    public UserService(Connection connection) {
        this.userDao = new UserDao(connection);
    }

    public UserDto authenticate(String username, String password) {
        return userDao.authenticateUser(username, password);
    }
}
