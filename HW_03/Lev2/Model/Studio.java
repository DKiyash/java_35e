package java_35e_HW.HW_03.Lev2.Model;

import java.util.List;

public class Studio{

    public void dressWomen(List<Clothes> clothes) {
        for (Clothes cl: clothes) {
            if (cl.sex == Sex.FEMALE){
                System.out.println("Наименование: " + cl.name);
                System.out.println("Размер: " + cl.clothesSize);
                System.out.println("Цена: " + cl.price);
                System.out.println("Цвет: " + cl.color);
                System.out.println();
            }
        }
    }

    public void dressMan(List<Clothes> clothes) {
        for (Clothes cl: clothes) {
            if (cl.sex == Sex.MALE){
                System.out.println("Наименование: " + cl.name);
                System.out.println("Размер: " + cl.clothesSize);
                System.out.println("Цена: " + cl.price);
                System.out.println("Цвет: " + cl.color);
                System.out.println();
            }
        }

    }

}
