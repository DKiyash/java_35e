package java_35e_HW.HW_02;

import java_35e_HW.HW_02.Model.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(false, "fish", 4);
        Cat cat2 = new Cat(false, "milk", 4, "Grey");

        System.out.println("Cat is Vegetarian? " + cat1.isVegetarian());
        System.out.println("Cat eats " + cat1.getEats());
        System.out.println("Cat has " + cat1.getNoOfLegs());
        System.out.println("Cat color is " + cat1.getColor());
        System.out.println();

        System.out.println("Cat is Vegetarian? " + cat2.isVegetarian());
        System.out.println("Cat eats " + cat2.getEats());
        System.out.println("Cat has " + cat2.getNoOfLegs());
        System.out.println("Cat color is " + cat2.getColor());
        System.out.println();

    }
}

    // First level:
    // 1. Создайте родительский класс Animal, у которого есть следующие поля:
    // boolean vegetarian - вегетарианец или нет
    // String eats - что ест
    // int noOfLegs - количество ног
    // *Не забывайте использовать принцип инкапсуляции (private)
    // 2. Создайте конструктор
    // 3. Создайте геттеры и сеттеры для каждой переменной (для переменной vegetarian геттер будет isVegeterian)
    // 4. Создайте подкласс Cat и унаследуйте конструктор с Animal, при этом добавив новую переменную color
    // 5. Для Cat будет два конструктора (и оба унаследованные с класса Animal). Первый конструктор будет с уже назначенным color(Например, white)
    // Второй конструктор будет с color, который должен ввести пользователь(т.е. просто оставляем как параметр). А также будут унаследованные переменные.
    // 6. А также создайте геттеры и сеттеры для переменной color в классе Cat
    // 7. Создайте Main класс, в котором будет два экземляра класса Cat (первый - с конструктором, где color стоит по умолчанию,
    //    второй, где color нужно ввести как параметр)
    // 8.Выведите все методы для Cat, которые были унаследованны с Animal, а также метод getColor(который мы уже назначили в классе
    // Cat)
    // Пример вывода:
    // Cat is Vegetarian?false
    // Cat eats milk
    // Cat has 4 legs.
    // Cat color is black