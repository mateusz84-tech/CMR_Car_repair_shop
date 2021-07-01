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

    private static DataSource getInstance() {
        if(dataSource == null) {
            try {
                Context ctx = new InitialContext();
                Context envContext = (Context)ctx.lookup("java:/comp/env");
                dataSource = (DataSource)envContext.lookup("jdbc/cmr_car_repair");
            } catch (NamingException e) {
                e.printStackTrace();}}
        return dataSource;}
    public static Connection getConn() throws SQLException {
        return getInstance().getConnection();
    }
}
