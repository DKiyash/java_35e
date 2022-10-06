package java_35e_HW.HW_03.Lev2;

import java_35e_HW.HW_03.Lev2.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tie tie1 = new Tie("Галстук", ClothesSizes.L, 25, "Черный", Sex.MALE);
        Skirt skirt1 = new Skirt("Юбка", ClothesSizes.XS, 35, "Серый", Sex.FEMALE);
        Pants pants1 = new Pants("Штаны", ClothesSizes.L, 45, "Зеленый", Sex.MALE);
        Pants pants2 = new Pants("Штаны", ClothesSizes.M, 55, "Красный", Sex.FEMALE);
        Tshirt tshirt1 = new Tshirt("Футболка", ClothesSizes.M, 15, "Оранжевый", Sex.FEMALE);
        Tshirt tshirt2 = new Tshirt("Футболка", ClothesSizes.L, 10, "Синий", Sex.MALE);

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(tie1);
        clothes.add(skirt1);
        clothes.add(pants1);
        clothes.add(pants2);
        clothes.add(tshirt1);
        clothes.add(tshirt2);

        Studio studio = new Studio();
        System.out.println("Женская одежда");
        studio.dressWomen(clothes);
        System.out.println();

        System.out.println("Мужская одежда");
        studio.dressMan(clothes);
    }
}

//2. Одежда
//Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
//Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
//Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
//Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40),
//соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
//Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
//Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
//Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
//Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
//Галстук (реализует интерфейсы "Мужская Одежда").
//Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину,
//на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину выводит на консоль всю
//информацию о женской одежде.
//То же самое для метода одетьМужчину.
