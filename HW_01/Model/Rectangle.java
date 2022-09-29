package java_35e_HW.HW_01.Model;

public class Rectangle {
    private int leight;
    private int width;

    public Rectangle(int leight, int width) {
        this.leight = leight;
        this.width = width;
    }

    private int Area(int leight, int width) {
        return leight * width;
    }

    public void outputArea() {
        System.out.println("Длина: " + leight + ", ширина: " + width);
        System.out.println("Площадь: " + Area(width, leight));
        System.out.println("Периметр: " + 2 * (width + leight));
        System.out.println();
    }
}
