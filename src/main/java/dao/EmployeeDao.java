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
            "INSERT INTO employee(first_name,last_name,number_phone,email,notes,hourly_rate,password)VALUES(?,?,?,?,?,?,?)";
    private final String FIND_BY_ID = "SELECT * FROM employee WHERE id_employee = ?";
    private final String FIND_EMPLOYEE_BY_EMAIL = "SELECT * FROM employee WHERE email = ?";
    private final String CHANGE_PASSWORD_EMPLOYEE_QUERY = "UPDATE employee SET password = ? WHERE email = ?";
    private final String DELETE_BY_ID = "DELETE FROM employee WHERE id_employee = ?";
    private final String FIND_ALL = "SELECT * FROM employee";
    private final String FIND_ALL_BY_EMAIL_AND_PASSWORD = "SELECT email, password FROM employee";
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
            statement.setString(7, employee.getPassword());
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

    // function that search employee by email only
    public Employee readByEmail(String email){
        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(FIND_EMPLOYEE_BY_EMAIL);
            statement.setString(1,email);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                Employee employee = new Employee();
                employee.setFirst_name(resultSet.getString("first_name"));
                employee.setLast_name(resultSet.getString("last_name"));
                employee.setNumber_phone(resultSet.getInt("number_phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setNotes(resultSet.getString("notes"));
                employee.setHourly_rate(resultSet.getDouble("hourly_rate"));
                employee.setPassword(resultSet.getString("password"));
                employee.setId_employee(resultSet.getInt("id_employee"));

                return employee;
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return null;
    }

    // function to change password only
    public void update (Employee employee){
        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CHANGE_PASSWORD_EMPLOYEE_QUERY);
            statement.setString(1, employee.getPassword());
            statement.setString(2, employee.getEmail());
            statement.executeUpdate();

        }catch (SQLException exc){
            exc.printStackTrace();
        }
    }

    // function that search employee by email and password only
    public List<Employee> findByEmailAndPassword(){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(FIND_ALL_BY_EMAIL_AND_PASSWORD);
            ResultSet resultSet = statement.executeQuery();
            List<Employee> employeeList = new ArrayList<>();
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setEmail(resultSet.getString("email"));
                employee.setPassword(resultSet.getString("password"));

                employeeList.add(employee);
            }
            return employeeList;
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
    }

    public List<Employee> findAll(){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = statement.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setId_employee(resultSet.getInt("id_employee"));
                employee.setFirst_name(resultSet.getString("first_name"));
                employee.setLast_name(resultSet.getString("last_name"));
                employee.setNumber_phone(resultSet.getInt("number_phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setNotes(resultSet.getString("notes"));
                employee.setHourly_rate(resultSet.getDouble("hourly_rate"));
                employee.setPassword(resultSet.getString("password"));

                employees.add(employee);
            }
            return employees;
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
    }
}
