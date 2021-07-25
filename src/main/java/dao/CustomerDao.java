package dao;

import model.Customer;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {

    private final String CREATE_CUSTOMER_QUERY = "INSERT INTO customer(first_name,last_name,repair_id) VALUES(?,?,?)";

    // zapytanie do wyświetlenia ostatnio dodanego klienta aby przy formularzu dodawanie nowego samochodu wpisać poprawne id klienta
//    private final String FIND_LAST_ADD_CUSTOMER = "SELECT * FROM customer ORDER BY id_customer DESC LIMIT 1";

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

//    public Customer lastAdded(){
//
//        try(Connection connection = DBUtil.getConn()){
//            PreparedStatement statement = connection.prepareStatement(FIND_LAST_ADD_CUSTOMER);
//            ResultSet resultSet = statement.executeQuery();
//            Customer customer = new Customer();
//            customer.setId_customer(resultSet.getInt("id_customer"));
//            customer.setFirst_name(resultSet.getString("first_name"));
//            customer.setLast_name(resultSet.getString("last_name"));
//
//            return customer;
//        }catch (SQLException exception){
//            exception.printStackTrace();
//            return null;
//        }
//    }
}
