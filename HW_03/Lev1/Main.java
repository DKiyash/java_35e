package java_35e_HW.HW_03.Lev1;

import java_35e_HW.HW_03.Lev1.Model.Season;

public class Main {
    public static void main(String[] args) {
        Season favoritSeason = Season.AUTUMN;
        System.out.println("My favorit season is " + favoritSeason);
        System.out.println("Average temperature: " + favoritSeason.getTemp());
        favoritSeason.getDescription();
        System.out.println();

        for (Season fs: Season.values()) {
            System.out.println("Season " + fs.ordinal() + ": " + fs.name());
            System.out.println("Average temperature: " + fs.getTemp());
            fs.getDescription();
            fs.iLike(fs);
            System.out.println();

        }
    }
}

//1. Времена года
//        Создать перечисление, содержащее названия времен года.
//        Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
//        Создать метод, который принимает на вход переменную созданного вами enum типа.
//        Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее.
//        Используем оператор switch.
//        Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//        Добавить конструктор принимающий на вход среднюю температуру.
//        Создать метод getDescription, возвращающий строку “Холодное время года”.
//        Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//        В цикле распечатать все времена года, среднюю температуру и описание времени года.
