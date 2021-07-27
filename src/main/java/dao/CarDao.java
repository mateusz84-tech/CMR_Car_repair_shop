package dao;

import model.Car;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDao {

    private final String CREATE_CAR_QUERY =
            "INSERT INTO car(id_customer,model,mark,year_of_production,registration_number," +
                    "technical_inspection_year, technical_inspection_month, technical_inspection_day) VALUES(?,?,?,?,?,?,?,?)";


    public Car create(Car car){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_CAR_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, car.getId_customer());
            statement.setString(2,car.getMark());
            statement.setString(3,car.getModel());
            statement.setInt(4,car.getYear_of_production());
            statement.setString(5,car.getRegistration_number());
            statement.setInt(6,car.getTechnical_inspection_year());
            statement.setInt(7,car.getTechnical_inspection_month());
            statement.setInt(8,car.getTechnical_inspection_day());
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
