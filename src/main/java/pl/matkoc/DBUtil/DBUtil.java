package pl.matkoc.DBUtil;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.transform.Source;
import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
    private static DataSource dataSource;
    public static Connection getConn() throws SQLException {
        return getInstance().getConnection();
    }
    private static DataSource getInstance() {
        if(dataSource == null) {
            try {
                Context ctx = new InitialContext();
                dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/crm_car_repair");
            } catch (NamingException e) {
                e.printStackTrace();}}
        return dataSource;}
}
