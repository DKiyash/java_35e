package java_35e_HW.HW_02.Lev2_01.Model;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Produkt> produkts;

    public Basket() {
        this.produkts = new ArrayList<Produkt>();
    }

    public ArrayList<Produkt> getProdukts() {
        return produkts;
    }

    public void printOfListBasket(){
        System.out.println("------List of Basket-------");
        System.out.println();
        for (Produkt pr: produkts) {
            System.out.println("Name: " + pr.getName());
            System.out.println("Price: " + pr.getPrice());
            System.out.println("Rating: " + pr.getRating());
            System.out.println();
        }
    }

}
