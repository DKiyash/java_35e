package java_35e_HW.ClassWork_02;

import java_35e_HW.ClassWork_02.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<Movie> list1 = new ArrayList<>();
        list1.add(new Movie(4, "Name_1", 1999));
        list1.add(new Movie(2, "Name_3", 1957));
        list1.add(new Movie(5, "Name_2", 2015));
        list1.add(new Movie(1, "Name_8", 2000));
        System.out.println(list1);
        System.out.println();

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println();

        RatingComparator ratingComparator = new RatingComparator();
        Collections.sort(list1,ratingComparator);
        System.out.println(list1);
        System.out.println();

        NameComparator nameComparator = new NameComparator();
        Collections.sort(list1,nameComparator);
        System.out.println(list1);
        System.out.println();

    }
}

/*
      1. Создайте класс Movie, имплементирующий Comparable<Movie> с тремя private переменными rating, name , year
    Отсортируйте фильмы по годам (не забывайте создать конструктор и геттеры)
    Создайте ArrayList и заполните фильмами
    Выведите фильмы до сортировки и после сортировки.
    2. К прошлому заданию выполните сортировку по имени, рейтингу с помощью Comporator,
     а сортировку по годам оставьте неизменной.
    3. Создать класс Товар, имеющий переменные имя, цена, рейтинг.
    Создать класс Категория, имеющий переменные имя и множество товаров.
     Создать несколько объектов класса Категория.
     Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
    Используем классы компараторы для каждого вида сортировки.
     */
