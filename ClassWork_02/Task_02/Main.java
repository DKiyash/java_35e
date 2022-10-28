package java_35e_HW.ClassWork_02.Task_02;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Category_1");
        Category category2 = new Category("Category_2");
        Category category3 = new Category("Category_3");

        category1.getProductList().add(new Product("Name_09", 152.56, 8));
        category1.getProductList().add(new Product("Name_02", 552.60, 1));
        category1.getProductList().add(new Product("Name_05", 100.56, 3));

        CategoryNameComparator categoryNameComparator = new CategoryNameComparator();
        System.out.println("До сортировки по имени");
        System.out.println(category1);
        System.out.println();

        System.out.println("После сортировки по имени");
        Collections.sort(category1.getProductList(), categoryNameComparator);
        System.out.println(category1);
        System.out.println();

        CategoryPriceComparator categoryPriceComparator = new CategoryPriceComparator();
        System.out.println("До сортировки по цене");
        System.out.println(category1);
        System.out.println();

        System.out.println("После сортировки по цене");
        Collections.sort(category1.getProductList(), categoryPriceComparator);
        System.out.println(category1);
        System.out.println();

        CategoryRatingComparator categoryRatingComparator = new CategoryRatingComparator();
        System.out.println("До сортировки по рейтингу");
        System.out.println(category1);
        System.out.println();

        System.out.println("После сортировки по рейтингу");
        Collections.sort(category1.getProductList(), categoryRatingComparator);
        System.out.println(category1);
        System.out.println();
    }
}

/*    3. Создать класс Товар, имеющий переменные имя, цена, рейтинг.
            Создать класс Категория, имеющий переменные имя и множество товаров.
            Создать несколько объектов класса Категория.
            Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
            Используем классы компараторы для каждого вида сортировки.
            */