package dao;

import model.Car;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDao {

    private final String CREATE_CAR_QUERY =
            "INSERT INTO car(id_car,id_customer,model,mark,year_of_production,registration_number,technical_inspection_date) VALUES(?,?,?,?,?,?,?)";


    public Car create(Car car){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_CAR_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, car.getId_customer());
            statement.setInt(2, car.getId_car());
            statement.setString(3,car.getMark());
            statement.setString(4,car.getModel());
            statement.setInt(5,car.getYear_of_production().getYear());
            statement.setString(6,car.getRegistration_number());
            statement.setInt(7,car.getTechnical_inspection_date().getYear());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                car.setId_car(id);
            }
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
        return car;
    }
}
