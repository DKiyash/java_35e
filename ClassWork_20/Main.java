package java_35e_HW.ClassWork_20;

import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TODO
        // Имея бесконечный набор случайных интов
        // Реализуйте метод put, чтобы он сохранял эти значения в некоторой структуре
        // И метод top, возвращающий 5 наибольших значений из тех, которые были получены к текущему моменту
        // Без повторений
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            put(random.nextInt(), set);
        }
        System.out.println(set);

    }

    // Сохраняет переданное значение
    static void put(int a, Set<Integer> set) {
        set.add(a);
    }

    // Выводит 5 наибольших значений
    static int[] top() {

        return new int[0];
    }


}
