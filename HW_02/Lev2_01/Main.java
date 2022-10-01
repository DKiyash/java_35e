package java_35e_HW.HW_02.Lev2_01;

import java_35e_HW.HW_02.Lev2_01.Model.Basket;
import java_35e_HW.HW_02.Lev2_01.Model.Category;
import java_35e_HW.HW_02.Lev2_01.Model.Produkt;
import java_35e_HW.HW_02.Lev2_01.Model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creation of two new objects of type "category"
        Category category1 = new Category("Laptops");
        Category category2 = new Category("Smartphones");

        //Adding products to each new category
        category1.getProdukts().add(new Produkt("GIGABYTE AERO 16 YE5-A4DE948HP", 3_499.00, 4));
        category1.getProdukts().add(new Produkt("Apple MacBook Pro 13.3'' MNEQ3D/A", 1_649.00, 3));
        category1.getProdukts().add(new Produkt("MSI Raider GE66 12UHS-211", 4_499.00, 5));

        category2.getProdukts().add(new Produkt("Xiaomi 11T 5G Dual-SIM EU", 348.99, 4));
        category2.getProdukts().add(new Produkt("Samsung Galaxy S20", 507.89, 3));
        category2.getProdukts().add(new Produkt("Google Pixel 6a", 429.00, 5));

        //Output list of products to each new category
        category1.printOfListCategory();
        category2.printOfListCategory();

        //Creation new object of type "User"
        User user1 = new User("user1_login", "user1_password");

        //Adding products to user basket
        user1.getUserBasket().getProdukts().add(category1.getProdukts().get(2));
        user1.getUserBasket().getProdukts().add(category2.getProdukts().get(0));

        //Output list of products from user basket
        System.out.println("User name: " + user1.getUserLogin());
        System.out.println();
        user1.getUserBasket().printOfListBasket();


    }
}

// 1 задача
// Интернет-Магазин
// 1.Создать класс Товар, имеющий переменные имя, цена, рейтинг.
// 2.Создать класс Категория, имеющий переменные имя и массив товаров.
// 3.Создать несколько объектов класса Категория.
// 4.Создать класс Basket, содержащий массив купленных товаров.
// 5.Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
