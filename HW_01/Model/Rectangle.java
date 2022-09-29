package java_35e_HW.HW_01.Model;

public class Rectangle {
    private int width;
    private int leight;

    public Rectangle(int width, int leight) {
        this.width = width;
        this.leight = leight;
    }

    private int Area(int width, int leight) {
        return width * leight * 2;
    }

    public void outputArea() {
        System.out.println("Длина: " + leight + ", ширина: " + width);
        System.out.println("Площадь: " + Area(width, leight));
        System.out.println("Периметр: " + 2 * (width + leight));
        System.out.println();
    }
}
