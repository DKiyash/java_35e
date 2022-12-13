package java_35e_HW.ClassWork_20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();

        System.out.println("Input data (Ctrl+D - exit):");
//        map = countEachLetter(scanner.nextLine());
        scanner.close();

    }

    //TODO
    // Написать метод, который возвращает мапу, которая содержит напротив каждрй буквы латинского алфавита
    // Количество повторение этой буквы в переданной стркое
    // Строку читать из консоли
//    static Map<Character, Integer> countEachLetter(String s) {
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        Map<Character, Integer> map = new HashMap<>();
//        s = s.toLowerCase();
//        char[] ch = s.toCharArray();
//        for (char chh: ch) {
//            if alphabet.contains(String.valueOf(chh))
//
//        }
//        // Заполнить мапу
//        // Читать строку посимвольно и увеличивать нужную запись в мапе
//        return map;
//    }
}
