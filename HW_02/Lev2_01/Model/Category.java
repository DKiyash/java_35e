package java_35e_HW.HW_02.Lev2_01.Model;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Produkt> produkts;

    public Category(String name) {
        this.name = name;
        this.produkts = new ArrayList<Produkt>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Produkt> getProdukts() {
        return produkts;
    }

    public void printOfListCategory(){
        System.out.println("--------------------");
        System.out.println("Category: " + name);
        System.out.println();
        for (Produkt pr: produkts) {
            System.out.println("Name: " + pr.getName());
            System.out.println("Price: " + pr.getPrice());
            System.out.println("Rating: " + pr.getRating());
            System.out.println();
        }
    }

}
