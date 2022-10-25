package java_35e_HW.ClassWork_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList1 = new TodoList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter command (LIST, ADD, EDIT, DELETE, EXIT): ");

        while (true){
            String[] words = in.nextLine().split(" ");
            String command = words[0];
//            int index = Integer.parseInt(words[1]);
            String newTask = "";
            for (int i = 1; i < words.length; i++) {
                newTask += words[i] + " ";
            }

            if (command.equals(ComandList.EXIT.toString())){
                break;
            }
            if (command.equals(ComandList.LIST.toString())){
                todoList1.printList();
            }
            if (command.equals(ComandList.ADD.toString())){
                todoList1.addCommand(newTask);
//                todoList1.addCommand(index,newTask);
            }
            else System.out.println("Wrong command");
        }
    }
}

// Разработайте программу — список дел, который управляется командами в консоли. Команды: LIST, ADD, EDIT, DELETE.
// Для работы с данными списка дел в проекте находится класс TodoList,
// который должен отвечать за хранение и работу со списком дел.
// В классе Main напишите код для реализации взаимодействия с пользователем через ввод команд в консоль.
// Принцип работы команд:
//
// LIST — выводит дела с их порядковыми номерами;
// ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд,
// если указать номер; если указан несуществующий индекс - добавить в конец списка.
// EDIT — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать.
// DELETE — удаляет; если указан несуществующий индекс - ничего не делать. Команды вводятся пользователем в консоль одной строкой.
// Примеры работы со списком дел (жирным шрифтом выделен ввод пользователя)
//
// ADD buy milk Добавлено дело "buy milk"
// ADD learn java Добавлено дело "learn java"
// LIST 0 - buy milk
// 1 - learn java
// EDIT 0 make a cup of tea
// Дело "buy milk" заменено на "make a cup of tea"
// DELETE 1
// Дело "learn java" удалено
// LIST 0 - make a cup of tea
// DELETE 100
// Дело с таким номером не существует
