package com.company;

import java.util.ArrayList;
import java.util.List;

public class Todo {
    List<String> todoList = new ArrayList<>();

    public List<String> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<String> todoList) {
        this.todoList = todoList;
    }
}
