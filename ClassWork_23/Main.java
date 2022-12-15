package java_35e_HW.ClassWork_23;

public class Main {
    public static void main(String[] args) {
        int i = 123456789;
        System.out.println(separ(i));
    }

    public static String separ(int n) {
        String num = Integer.toString(n);
        int len = num.length();
        if(len < 4) {
            return num;
        }
        return separ(Integer.parseInt(num.substring(0, len-3))) + ',' + num.substring(len-3);
    }
}
