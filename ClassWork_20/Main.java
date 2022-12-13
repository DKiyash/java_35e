package java_35e_HW.ClassWork_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TODO
        // Имея бесконечный набор случайных интов
        // Реализуйте метод put, чтобы он сохранял эти значения в некоторой структуре
        // И метод top, возвращающий 5 наибольших значений из тех, которые были получены к текущему моменту
        // Без повторений
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            put(random.nextInt(), set);
        }
        list.addAll(set);
        set.clear();
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(
                Arrays.toString(top(list)));


    }

    // Сохраняет переданное значение
    static void put(int a, Set<Integer> set) {
        set.add(a);
    }

    // Выводит 5 наибольших значений
    static int[] top(List<Integer> list) {
        int[] res = new int[5];
        for (int i = 0; i < 5; i++) {
            res[i] = list.get(i);
        }
        return res;
    }


}
