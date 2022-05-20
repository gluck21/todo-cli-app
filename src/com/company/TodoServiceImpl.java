package com.company;

import java.util.List;

public class TodoServiceImpl implements TodoService{

    @Override
    public void addTodo(Todo todo, String task) {
        List<String> todoList = todo.getTodoList();
        todoList.add(task);
    }

    @Override
    public void getTodos(Todo todo) {
        List<String> todoList = todo.getTodoList();
        if (todoList.isEmpty()){
            System.out.println("No task todo, please Add task todo");
        }
        for (String todo1 : todoList) {
            System.out.println(todo1);
        }
    }

    @Override
    public void removeTodo(Todo todo, String taskToRemove) {
        List<String> todoList = todo.getTodoList();
        if (todoList.contains(taskToRemove)){
            todoList.remove(taskToRemove);
        }else {
            System.out.println("The task you want remove does not exist");
        }
    }
}
