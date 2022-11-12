package java_35e_HW.HW_11.Task_02;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("АЕ485326", "Иванов И.И.");
        myHashMap.put("АА321352", "Петров П.П.");
        myHashMap.put("КА789613", "Сидоров С.С.");
        myHashMap.put("КА789613", "Сидоров С.С.");
        myHashMap.put("АЕ485326", "Иванов И.И.");
        myHashMap.put("АЕ4853262", "Иванов И.И.");
        myHashMap.put("АЕ4853263", "Иванов И.И.");
        myHashMap.put("АЕ4853264", "Иванов И.И.");
        myHashMap.put("АЕ4853265", "Иванов И.И.");
        myHashMap.put("АЕ4853266", "Иванов И.И.");
        myHashMap.put("АЕ4853267", "Иванов И.И.");
        myHashMap.put("АЕ4853268", "Иванов И.И.");
        myHashMap.put("АЕ4853269", "Иванов И.И.");
        myHashMap.put("АЕ48532610", "Иванов И.И.");
        myHashMap.put("АЕ48532611", "Иванов И.И.");
        myHashMap.put("АЕ48532612", "Иванов И.И.");
        myHashMap.put("АЕ48532613", "Козлов К.К.");
        myHashMap.put("АЕ48532614", "Иванов И.И.");
        System.out.println();

        System.out.println(myHashMap);
        System.out.println("Size: " + myHashMap.getSize());
        System.out.println();

        System.out.println(myHashMap.get("АЕ48532613"));
        System.out.println(myHashMap.get("АЕ485326136"));


    }
}

//TODO
//  Напишите простую реализацию HashMap на основе динамического массива.
//  Для этого вам потребуется реализовать класс Node, где будет храниться ключ и значений и метод,
//  который будет искать нужный индекс массива через hashcode ключа и размер массива.
//  Стоить учесть, что при увеличении размера массива нужно провесить рехэшинг
//  (перезаписать все существующие элементы массива на новые позиции, так как изменился размер).
//  Если этого не сделать, поиск по индексам будет работать некорректно.
//  В рамках данного задания вам не нужно волноваться о потенциальных коллизиях
