package java_35e_HW.ClassWork_01;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> list = new ArrayList<>();

//    public void addCommand(int index, String newTask){
//        if (index < 0 && index >= this.list.size()){
//            this.list.add(newTask);
//            System.out.println("Добавлено дело в конец списка" + newTask);
//        }
//        else {
//            this.list.add(index, newTask);
//            System.out.println("Добавлено дело в по заданному индексу" + newTask);
//        }
//    }
    public void addCommand(String newTask){
            this.list.add(newTask);
            System.out.println("Добавлено дело в конец списка " + newTask);
    }

    public void printList(){
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println("Дело № "+ i + " - " + this.list.get(i));
        }
    }

}
