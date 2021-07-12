package com.Amela.Dao;

import com.Amela.Model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void intertUser(User user) throws SQLException;
    User selectUser(int id);
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;

    List<User> selectAllUsers();
}
