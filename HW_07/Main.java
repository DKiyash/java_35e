package java_35e_HW.HW_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //Filling array
        fillRandomList(list1);
        fillRandomList(list2);

        //Measuring with For each and tmp
        measuringTimeForEach(list1);
        measuringTimeForEach(list2);
        System.out.println();

        //Measuring with Classic For and size()
        measuringTimeClassicFor1(list1);
        measuringTimeClassicFor1(list2);
        System.out.println();

        //Measuring with Classic For and tmp = size()
        measuringTimeClassicFor2(list1);
        measuringTimeClassicFor2(list2);
        System.out.println();

        //Measuring with Classic For, tmp = size(), reverse (i--)
        measuringTimeClassicFor3(list1);
        measuringTimeClassicFor3(list2);
        System.out.println();

        //Measuring with Iterator
        measuringTimeIterator(list1);
        measuringTimeIterator(list2);
        System.out.println();

        //Measuring with ListIterator
        measuringTimeListIterator(list1);
        measuringTimeListIterator(list2);
        System.out.println();
    }

    public static void fillRandomList(List<Integer> list) {
        for (int i = 0; i < 10_000_000; i++) {
            list.add((int) Math.round(Math.random() * 100));
        }
    }

    public static void measuringTimeForEach(List<Integer> list) {
        int tmp;
        long start = System.currentTimeMillis();
        for (Integer number:list) {
            tmp = number;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static void measuringTimeClassicFor1(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.size();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static void measuringTimeClassicFor2(List<Integer> list) {
        int tmp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            tmp = list.size();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }
    public static void measuringTimeClassicFor3(List<Integer> list) {
        int tmp;
        long start = System.currentTimeMillis();
        for (int i = list.size(); i > 0; i--) {
            tmp = list.size();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static void measuringTimeIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int tmp;
        long start = System.currentTimeMillis();
        while (iterator.hasNext()) {
            tmp = iterator.next();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

    public static void measuringTimeListIterator(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        int tmp;
        long start = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            tmp = listIterator.next();
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
    }

}

//First level: 1. создать лист, наполнить его 10М> элементами
//внутри тела кладем i- тый элемент в переменную temp
//перебрать for-each loop
//classic for и вызываем list.size() для каждой итерации
//classic for, но list.size() определяем в переменную
//classic for, list.size() определяем в переменную, перебираем с конца (i--)
//используя Itertor
//используя ListIterator
//для всех случаев сделать замер времени
//результат вывести в консоль
