package dao;

import model.Employee;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private final String CREATE_EMPLOYEE_QUERY =
            "INSERT INTO employee(first_name,last_name,number_phone,email,notes,hourly_rate)VALUES(?,?,?,?,?,?)";
    private final String FIND_BY_ID = "SELECT * FROM employee WHERE id_employee = ?";
    private final String DELETE_BY_ID = "DELETE FROM employee WHERE id_employee = ?";
    private final String FIND_ALL = "SELECT * FROM employee";
    private Employee employee;

    public Employee create (Employee employee){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_EMPLOYEE_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, employee.getFirst_name());
            statement.setString(2,employee.getLast_name());
            statement.setInt(3,employee.getNumber_phone());
            statement.setString(4,employee.getEmail());
            statement.setString(5,employee.getNotes());
            statement.setDouble(6,employee.getHourly_rate());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                employee.setId_employee(id);
            }
            return employee;

        }catch (SQLException exe){
            exe.printStackTrace();
            return null;
        }
    }

    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Employee employee = new Employee();
                resultSet.getInt("id_employee");
                resultSet.getString("first_name");
                resultSet.getString("last_name");
                resultSet.getInt("number_phone");
                resultSet.getString("email");
                resultSet.getString("notes");
                resultSet.getDouble("hourly_rate");
                resultSet.getString("password");

                employees.add(employee);
            }
            return employees;
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
    }
}
