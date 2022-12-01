package java_35e_HW.HW_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyScaner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Key and Value");
        String strKey = scanner.next();
        String strValue = scanner.next();

        //Check type of Key
        if (tryParseInt(strKey) != null) {//if Key is Integer
            System.out.println("Key is Integer");
            //Check type of Value
            if (tryParseInt(strValue) != null) {//if Value is Integer
                System.out.println("Value is Integer");
                Map<Integer, Integer> map = new HashMap<>();
                map.put(Integer.valueOf(strKey), Integer.valueOf(strValue));
                System.out.println(map);
            } else if (tryParseDouble(strValue) != null) {//if Value is Double
                System.out.println("Value is Double");
                Map<Integer, Double> map = new HashMap<>();
                map.put(Integer.valueOf(strKey), Double.valueOf(strValue));
                System.out.println(map);
            } else {//if Value is String
                System.out.println("Value is String");
                Map<Integer, String> map = new HashMap<>();
                map.put(Integer.valueOf(strKey), strValue);
                System.out.println(map);
            }
        } else if (tryParseDouble(strKey) != null){//if Key is Double
            System.out.println("Key is Double");
            //Check type of Value
            if (tryParseInt(strValue) != null) {//if Value is Integer
                System.out.println("Value is Integer");
                Map<Double, Integer> map = new HashMap<>();
                map.put(Double.valueOf(strKey), Integer.valueOf(strValue));
                System.out.println(map);
            } else if (tryParseDouble(strValue) != null) {//if Value is Double
                System.out.println("Value is Double");
                Map<Double, Double> map = new HashMap<>();
                map.put(Double.valueOf(strKey), Double.valueOf(strValue));
                System.out.println(map);
            } else {//if Value is String
                System.out.println("Value is String");
                Map<Double, String> map = new HashMap<>();
                map.put(Double.valueOf(strKey), strValue);
                System.out.println(map);
            }
        }
        else {
            System.out.println("Key is String");
            //Check type of Value
            if (tryParseInt(strValue) != null) {//if Value is Integer
                System.out.println("Value is Integer");
                Map<String, Integer> map = new HashMap<>();
                map.put(strKey, Integer.valueOf(strValue));
                System.out.println(map);
            } else if (tryParseDouble(strValue) != null) {//if Value is Double
                System.out.println("Value is Double");
                Map<String, Double> map = new HashMap<>();
                map.put(strKey, Double.valueOf(strValue));
                System.out.println(map);
            } else {//if Value is String
                System.out.println("Value is String");
                Map<String, String> map = new HashMap<>();
                map.put(strKey, strValue);
                System.out.println(map);
            }
        }

        scanner.close();
    }

    private static Integer tryParseInt(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return null; // не-а, не int
        }
    }

    private static Double tryParseDouble(String s) {
        try {
            return Double.valueOf(s);
        } catch (NumberFormatException e) {
            return null; // не-а, не double
        }
    }

}

//TODO
// 1. Написать программу, которая, используя сканнер, считытвает
// из консоли пары значений. На основе этих значений создается HashMap,
// типизированный типами этих значений, затем туда добавляются элементы.
// Любые значения в парах могут принимать типы Integer, String и Double
// (Возможны вариации String, String или Integer, Integer)
