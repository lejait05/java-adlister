package adlister;

import com.mysql.cj.jdbc.Driver;

import javax.servlet.jsp.jstl.core.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLTodoDao implements Todos {
    private Connection connection;

    public MySQLTodoDao(){
        try{
            Config config = new Config();

        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection();
        config.getUrl(), config.getUser(), config.getPassword();
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Todo> findAllTodos() {
        return null;
    }

    @Override
    public long createTodo(Todo todo) {
        return 0;
    }
}
