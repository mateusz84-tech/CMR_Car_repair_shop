package dao;

import model.User;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private final String READ_USER_QUERY = "SELECT * FROM users";


    public List<User> readUser(){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(READ_USER_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.executeQuery();
            List<User> employeeList = new ArrayList<>();
            while(resultSet.next()){
                User user = new User();
                user.setId_user(resultSet.getInt("id_group"));
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(resultSet.getString("role"));
                user.setPassword(resultSet.getString("password"));

                employeeList.add(user);
            }
            return employeeList;
        }catch (SQLException exception){
            exception.printStackTrace();
            return null;
        }
    }
}
