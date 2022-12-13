package java_35e_HW.ClassWork_22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(7);
        list.add(2);
        list.add(20);
        System.out.println(list);
        System.out.println(chekList1(list));
        System.out.println(chekList2(chekList1(list)));
    }

    public static List<Integer> chekList1(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        boolean f = false;
        for (int i : list) {
            if (i == 0 && i ==1) {
                tmp.add(i);
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) f = true;
            }
            if (!f) tmp.add(i);
            f = false;
        }
        return tmp;
    }
    public static int chekList2(List<Integer> list) {
        return list.size();
    }

}
//TODO:
// 1. Написать метод, который получает на вход список
// 2. Для каждого вызова первого метода, полученную коллекцию нужно разбить по элементам и каждый элемент
// передать во второй метод, который так же будет типизирован типом коллекции
// Второй метод должен проверять, является ли число простым, а первый метод должен возвращать количество
// простых чисел в коллекции
