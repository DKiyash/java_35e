package java_35e_HW.HW_15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Реализовать кастомный StringBuilder с методами append, reverse и toString.
        // Append должен добавлять значения во внутренний массив
        // toString должен возвращать строку, собранную из значений в порядке добавления
        // reverse должен возвращать строку, собранную из значений в обратном порядке
        // Для методов toSting и Reverse нужно использовать Function с методами compose и andThen
        MyStringBuilder sb = new MyStringBuilder();
        sb.append("H")
                .append("e")
                .append("l")
                .append("l")
                .append("o")
                .append(" ")
                .append("w")
                .append("o")
                .append("r")
                .append("l")
                .append("d");

        System.out.println(sb.toString());
        System.out.println(sb.reverse());
    }
}

class MyStringBuilder {
    private static List<String> strings = new ArrayList<>();

    public String toString() {
        String[] result = new String[]{""};
        Function<String, String> f = e -> result[0] += e;
        for (String s : strings) {
            f.apply(s);
        }
        return result[0];
    }

    public String reverse() {
        String[] result = new String[]{""};
        Function<String, String> f = e -> result[0] = e + result[0];
        for (String s : strings) {
                f.apply(s);
        }
        return result[0];
    }

    public MyStringBuilder append(String s) {
        strings.add(s);
        return this;
    }
}
