package java_35e_HW.HW_10.Task_01;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack);
        System.out.println(myStack.size());
        //Проверка работы команды pop при пустом массиве
        System.out.println(myStack.pop());
        System.out.println();

        //Проверка работы команды push
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");
        myStack.push("Forth");
        myStack.push("Fifth");
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println();

        //Проверка работы команды peek
        System.out.println(myStack.peek());
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println();

        //Проверка работы команды pop
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println();

    }
}
//TODO
// Написать реализацию Stack, не используя стандартные классы java.util.collection.
// Stack должен иметь 4 основных метода (push, pop, peek, size) и работать на основе массива.
// Стоит учесть необходимость динамически менять размер массива при добавлении новых элементов.
