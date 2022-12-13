package java_35e_HW.HW_19;

public class HW_19 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("Hello"));
        System.out.println(sb.append("Hello"));
        System.out.println(sb.append("Hello"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("Hello"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.insert(0, " "));
        System.out.println();
    }
}

//First level: 1. Реализовать свой кастомный класс CustomStringBuilder,
//который будет хранить в себе массив char, будет immutable и будет поддерживать
//операци toString, charAt, length, append
