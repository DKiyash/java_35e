package java_35e_HW.HW_01.Model;

public class Area {
    private int leight;
    private int width;

    public Area(int leight, int width) {
        this.leight = leight;
        this.width = width;
    }

    public int returnArea() {
        return leight * width;
    }


}
