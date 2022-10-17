package java_35e_HW.HW_05.Lev2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //----------- Task 1 ------------------------------------------------------------
        List<String> stringList = new ArrayList<>();
        stringList.add("First string");
        stringList.add("Second string, the longest");
        stringList.add("Third string, long");
        stringList.add("Forth string");
        System.out.println(stringList);

        System.out.println("All strings with length 12 symbols:");
        System.out.println(listStringsGivenLength(stringList, 12));
        System.out.println();

        //----------- Task 2 ------------------------------------------------------------
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(21);
        integers.add(15);
        integers.add(27);
        integers.add(50);
        System.out.println(integers);
        System.out.println(listOddNumbers(integers));
        System.out.println();

        //----------- Task 3 ------------------------------------------------------------
        stringList.clear();
        stringList.add("aaa");
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
        stringList.add("ddd");
        stringList.add("ccc");
        stringList.add("fff");
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ttt");
        System.out.println(stringList);

        listNoRepeats(stringList);
        System.out.println(stringList);
        System.out.println();
        //----------- Task 4 ------------------------------------------------------------
        stringList.clear();
        stringList.add("Первое предложение со словами разной длины");
        stringList.add("Второе пред ло же ние с раз личной длиной каждого слова");
        System.out.println("Исходный текст:");
        for (String str:stringList) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Удаляем все слова длиной 3 и менее:");
        delShotWordFromlist(stringList, 3);
        for (String str:stringList) {
            System.out.println(str);
        }

    }

    //----------- Method for Task 1 ------------------------------------------------------------
    private static List<String> listStringsGivenLength(List<String> stringList, int givenLength) {
        List<String> newStringList = new ArrayList<>();
        for (String str : stringList) {
            if (str.length() == givenLength) newStringList.add(str);
        }
        return newStringList;
    }
    //----------- Method for Task 2 ------------------------------------------------------------
    private static List<Integer> listOddNumbers(List<Integer> integers) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : integers) {
            if (number % 2 != 0) newList.add(number);
        }
        return newList;
    }
    //----------- Method for Task 3 ------------------------------------------------------------
    private static List<String> listNoRepeats(List<String> strings) {
        HashSet<String> hs = new HashSet<>();
        hs.addAll(strings);
        strings.clear();
        strings.addAll(hs);
        return strings;
    }
    //----------- Method for Task 4 ------------------------------------------------------------
    private static List<String> delShotWordFromlist(List<String> stringList, int givenLength) {
        int counter = 0;//первое слово или нет, чтобы не ставить впереди пробел
        for (String str : stringList) {
            String newString = "";
            String[] arrayString = str.split(" ");
            for (String arSrt: arrayString) {
                if (arSrt.length() > givenLength) {
                    if (counter == 0) newString = newString + arSrt + " ";
                    else {
                        newString = newString + " " + arSrt;
                        counter++;
                    }
                };
            }
            stringList.set(stringList.indexOf(str), newString);
            counter = 0;
        }
        return stringList;
    }
}

// Second level:
// 1.у вас есть список значений String и вы должны вернуть список
// со всеми значениями String определенной длины
// 2.у вас есть список значений int и вы должны вернуть список,
// содержащий только нечетные числа
// 3.у вас есть список значений String, и вы должны вернуть список
// этих значений без каких-либо дубликатов.
// 4.упражнение для списков массивов Удалить слишком короткие слова
