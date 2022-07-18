package adlister;

import adlister.Todo;

import java.util.List;

public interface Todos {
    List<Todo> findAllTodos();
    long createTodo(Todo todo);
}
