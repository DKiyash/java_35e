package java_35e_HW.HW_03.Lev2.Model;

public class Tshirt extends Clothes implements WomenClothing, MensClothing{
    public Tshirt(String name, ClothesSizes clothesSize, double price, String color, Sex sex) {
        super(name, clothesSize, price, color, sex);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's T-shirt is dressed");
    }

    @Override
    public void dressWomen() {
        System.out.println("Women's T-shirt is dressed");
    }
}
