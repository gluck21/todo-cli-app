package com.company;

import java.util.List;

public interface TodoService {
    void addTodo(Todo todo, String task);
    void getTodos(Todo todo);
    void removeTodo(Todo todo, String taskToRemove);
}
