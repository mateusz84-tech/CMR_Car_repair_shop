package dao;

import model.Customer;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {

    private final String CREATE_CUSTOMER_QUERY = "INSERT INTO customer(first_name,last_name,repair_id) VALUES(?,?,?)";

    public Customer create(Customer customer){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_CUSTOMER_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, customer.getFirst_name());
            statement.setString(2, customer.getLast_name());
            statement.setInt(3,customer.getRepair_id());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                customer.setId_customer(id);
            }
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
        return customer;
    }
}
