package java_35e_HW.HW_07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int) Math.round(Math.random() * 10));
        }
        System.out.println(list);
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - start);
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
