package java_35e_HW.HW_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyScaner2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data (Key (String) = Value (Integer), Ctrl+D - exit):");

        while (scanner.hasNext()){
            String key = scanner.next();
            scanner.next();
            Integer value = scanner.nextInt();
            map.put(key, value);
        }
        System.out.println(map);
        scanner.close();
    }

}

//TODO
//  * Отдельно написать модификацию программы, которая будет читать
//  значения в формате строки (nextLine) в формате "key = value" без кавычек.
//  Ключи могут быть только строками, а значения только integer
