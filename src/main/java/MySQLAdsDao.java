import com.mysql.cj.jdbc.Driver;

import javax.servlet.ServletException;
import javax.servlet.jsp.jstl.core.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAdsDao {
    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        }catch (SQLException e){
            throw new RuntimeException("error connecting to db", e);
        }
    }}
}
