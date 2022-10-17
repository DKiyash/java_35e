package java_35e_HW.HW_05.Lev1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("First string");
        stringList.add("Second string");
        stringList.add("Third string");
        stringList.add("Forth string");
        System.out.println(stringList);
        stringListToUpperCase(stringList);
        System.out.println(stringList);
        stringListToLowerCase(stringList);
        System.out.println(stringList);
        System.out.println();

        System.out.println(listOfLengthStrList(stringList));
        System.out.println();

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        System.out.println(integers);
        System.out.println(integerListX2(integers));
        System.out.println();
    }

    private static List<String> stringListToUpperCase(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
        }
        return stringList;
    }

    private static List<String> stringListToLowerCase(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toLowerCase());
        }
        return stringList;
    }

    private static List<Integer> listOfLengthStrList(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();
        for (String str : stringList) {
            integerList.add(str.length());
        }
        return integerList;
    }

    private static List<Integer> integerListX2(List<Integer> integers){
        List<Integer> newIntegerList = new ArrayList<>();
        for (Integer number: integers) {
            newIntegerList.add(number*2);
        }
        return newIntegerList;
    }
}

//First level:
// 1.у вас есть список строковых значений, и вы должны вернуть список
// со всеми этими строковыми значениями в нижнем регистре
// (или в верхнем регистре)
// 2.у вас есть список значений int и вы должны вернуть список,
// каждое значение которого умножается на 2
// 3.у вас есть список значений String, и вы должны вернуть
// список длины каждого из этих значений String.
