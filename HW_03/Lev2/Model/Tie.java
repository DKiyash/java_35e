package java_35e_HW.HW_03.Lev2.Model;

public class Tie extends Clothes implements MensClothing{
    public Tie(String name, ClothesSizes clothesSize, double price, String color, Sex sex) {
        super(name, clothesSize, price, color, sex);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie is dressed");
    }
}
