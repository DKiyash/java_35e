package java_35e_HW.ClassWork_23;

public class Main {
    public static void main(String[] args) {
       System.out.println("2000 -> " + task4(2000));
       System.out.println("6000000 -> " + task4(6000000));
    }

    public static String task4 (int n) {
        String num = Integer.toString(n);
        int len = num.length();
        if(len < 4) {
            return num;
        }
        return task4(Integer.parseInt(num.substring(0, len-3))) + ',' + num.substring(len-3);
    }
}
// 2000 -> 2,000 6000000 -> 6,000,000