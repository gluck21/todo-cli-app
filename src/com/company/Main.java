package com.company;

import java.util.Scanner;

public class Main extends TodoServiceImpl{

    public static void main(String[] args) {
        Main main = new Main();
        Todo todo = new Todo();
        while (true){
        System.out.println("""
            INSTRUCTIONS:
            B. Choose 1 to add todo
            C. Choose 2 to read todo
            D. choose 3 to delete todo
            E. To end the programme, input any other number.""");



            Scanner choice = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int todoChoice = choice.nextInt();

            if(todoChoice != 1 && todoChoice != 2 && todoChoice != 3) {
                break;
            }
            if (todoChoice == 1){
                Scanner stuffsTodo = new Scanner(System.in);
                System.out.println("Enter task: ");
                String task = stuffsTodo.nextLine();
                main.addTodo(todo,task);
            }else if(todoChoice == 2){
                System.out.println("The tasks you have to do are: ");
                main.getTodos(todo);
            }else {
                Scanner stuffsTodo = new Scanner(System.in);
                System.out.println("Enter task to delete: ");
                String task = stuffsTodo.nextLine();
                main.removeTodo(todo, task);
            }
        }
    }
}
