package adlister;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLTodoDao implements Todos {
    private Connection connection;

    public MySQLTodoDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
        config.getUrl(), config.getUser(), config.getPassword());
    } catch (SQLException e) {
           e.printStackTrace();
        }
    }
    @Override
    public List<Todo> findAllTodos() {
        List<Todo> todos = new ArrayList<>();
        String query = "SELECT * FROM todos";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                Todo todo = new Todo(rs.getString("name"));
                todos.add(todo);
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return todos;
    }

    public static void main(String[] args) {
        Todos todoDao = new MySQLTodoDao(new Config());
        List<Todo> todos = todoDao.findAllTodos();
        for (Todo todo : todos){
            System.out.println(todo.getName());
        }
    }

    @Override
    public long createTodo(Todo todo) {
        long createdId = 0;
        String query = "INSERT INTO todos(name)  VALUES " + " (' " + todo.getName() + " ' )";
        try{
            Statement statement = connection.createStatement();
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()){
            createdId = rs.getLong(1);
        }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return createdId;
    }

}
