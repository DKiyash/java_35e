package java_35e_HW.ClassWork_11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Berlin", "London");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        String begin = "";
        for (Map.Entry<String, String> e : tickets.entrySet()) {
            if (!tickets.containsValue(e.getKey())) begin = e.getKey();
        }
        System.out.println(begin);
        String current = begin;
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(current + " -> " + tickets.get(current));
            current = tickets.get(current);
        }
    }
}


//    Найти маршрут из заданного списка билетов
//    Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//
//        Выход:
//        Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon


