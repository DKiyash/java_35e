package java_35e_HW.HW_03.Lev2.Model;

public class Pants extends Clothes implements WomenClothing, MensClothing{
    public Pants(String name, ClothesSizes clothesSize, double price, String color, Sex sex) {
        super(name, clothesSize, price, color, sex);
    }

    @Override
    public void dressMan() {
        System.out.println("Men's pants is dressed");
    }

    @Override
    public void dressWomen() {
        System.out.println("Women's pants is dressed");
    }
}
