package java_35e_HW.HW_03.Lev2.Model;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(String name, ClothesSizes clothesSize, double price, String color, Sex sex) {
        super(name, clothesSize, price, color, sex);
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt is dressed");
    }
}
