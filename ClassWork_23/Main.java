package java_35e_HW.ClassWork_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("2000 -> " + task4(2000));
        System.out.println("6000000 -> " + task4(6000000));

        System.out.println(setThousandSeparator("12345678"));
    }

    public static String task4(int n) {
        String num = Integer.toString(n);
        int len = num.length();
        if (len < 4) {
            return num;
        }
        return task4(Integer.parseInt(num.substring(0, len - 3))) + ',' + num.substring(len - 3);
    }

    public static String setThousandSeparator(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder(s).reverse();

        Pattern p = Pattern.compile("(\\d{3})");
        Matcher m = p.matcher(reversed);

        if (s.length() < 4) {
            return s;
        }
        int count = 0;
        while (m.find() && sb.length() - count < s.length() - 3) {
            sb.append(m.group()).append(",");
            count++;
        }
        int dif = s.length() - (sb.length() - count);
        sb.append(reversed.substring(reversed.length() - dif));

        return sb.reverse().toString();

    }

}
// 2000 -> 2,000 6000000 -> 6,000,000
