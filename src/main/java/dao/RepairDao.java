package dao;

import model.Repair;
import pl.matkoc.DBUtil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepairDao {

    private final String CREATE_REPAIR_QUERY =
            "INSERT INTO repair" +
                    "(id_employee,id_status,id_car,repair_date_year,repair_date_month," +
                    "repair_date_day,description_repair,repair_parts_cost,repair_hourly_rate,repair_cost,working_hours) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public Repair create(Repair repair){

        try(Connection connection = DBUtil.getConn()){
            PreparedStatement statement = connection.prepareStatement(CREATE_REPAIR_QUERY,
                    PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1,repair.getId_employee());
            statement.setInt(2,repair.getId_status());
            statement.setInt(3,repair.getId_car());
            statement.setInt(4,repair.getRepair_date_year());
            statement.setInt(5,repair.getRepair_date_month());
            statement.setInt(6,repair.getRepair_date_day());
            statement.setString(7,repair.getDescription_repair());
            statement.setDouble(8,repair.getRepair_parts_cost());
            statement.setDouble(9,repair.getRepair_hourly_rate());
            statement.setDouble(10,repair.getRepair_cost());
            statement.setInt(11,repair.getWorking_hours());
            ResultSet resultSet = statement.getGeneratedKeys();
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                repair.setId_repair(id);
            }
            return repair;
        }catch (SQLException exc){
            exc.printStackTrace();
            return null;
        }
    }
}
