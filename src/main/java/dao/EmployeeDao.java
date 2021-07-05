package dao;

import model.Employee;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

    private final String CREATE_EMPLOYEE_QUERY =
            "INSERT INTO employee(first_name,last_name,number_phone,email,notes,hourly_rate)VALUES(?,?,?,?,?)";
    private final String FIND_BY_ID = "SELECT * FROM employee WHERE id_employee = ?";
    private final String DELETE_BY_ID = "DELETE FROM employee WHERE id_employee = ?";
    private final String FIND_ALL = "SELECT * FROM employee";

    public Employee create (Employee employee){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_EMPLOYEE_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, employee.getFirst_name());
            statement.setString(2,employee.getLast_name());
            statement.setInt(3,employee.getNumber_phone());
            statement.setString(4,employee.getEmail());
            statement.setDouble(5,employee.getHourly_rate());

            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                employee.setId_employee(id);
            }
            return employee;

        }catch (SQLException exe){
            return null;
        }
    }
}
