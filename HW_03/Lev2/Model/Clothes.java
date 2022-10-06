package java_35e_HW.HW_03.Lev2.Model;

public abstract class Clothes {
    protected ClothesSizes clothesSize;
    protected double price;
    protected String color;
    protected String name;
    protected Sex sex;

    public Clothes(String name, ClothesSizes clothesSize, double price, String color, Sex sex) {
        this.name = name;
        this.clothesSize = clothesSize;
        this.price = price;
        this.color = color;
        this.sex = sex;
    }
}
