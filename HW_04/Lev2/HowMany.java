package java_35e_HW.HW_04.Lev2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        char currentChar;
        if (string1 == "") System.out.println("Вы ничего не ввели");
        else {
            int counter = 1;
            System.out.println("Вы ввели: " + string1);
            for (char i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == ' ') counter++;
            }
            System.out.println("Количество слов: " + counter);
        }

    }
}
//Second level: Напишите программу HowMany.java, которая определит, сколько слов Вы ввели с консоли.
//1.Вводим предложение в консоль (Scanner)
//2.Начальное количество слов равно 0 (int count = 0)
//3.Если ввели хотя бы одно слово, тогда считать будем считать, иначе конец программы (Продумайте логику)
//4.Проверяем каждый символ, не пробел ли это
//5.Если пробел - увеличиваем количество слов на 1
//6.Выводим число слов в предложении:
//"Вы ввели " + count + "слов"