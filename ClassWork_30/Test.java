package java_35e_HW.ClassWork_30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static String string = "HelloWorld";
    public static int index;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(string.length());
        for (int i = 0; i < string.length(); i++) {
            executorService.execute(new PrintLetter());

        }

    }
}
class PrintLetter implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " = " + Test.string.charAt(Test.index));
    }
}
//Написать программу, которая считтывает слово с клавиатуры и создает столько потоков,
//сколько символов в слове. Каждый поток должен вывести одну букву слова, таким образом,
//чтобы после выполнения программы было выведено
// все слово целиком в нужном порядке, без пропусков и ошибок