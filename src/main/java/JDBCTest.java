import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private static List<String> getAlbumNames() {
        List<String> albumNames = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT dept_name FROM employees.departments");
            while (rs.next()){
                albumNames.add(rs.getString("dept_name"));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return albumNames;
    }

    public static void main(String[] args) {
        List<String>albumNames = getAlbumNames();
        for (String albumName: albumNames){
            System.out.println(albumName);
        }
    }
}
