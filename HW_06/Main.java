package java_35e_HW.HW_06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("Pink");
        linkedList1.add("Orange");

        System.out.println(linkedList1);
        linkedList1.remove("Black");
        System.out.println(linkedList1);
        System.out.println();

        linkedList1.add(2, "Black");
        System.out.println(linkedList1);
        swapElements(linkedList1, "Red", "Black");
        System.out.println(linkedList1);
        System.out.println();

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Red");
        linkedList2.add("Green");
        linkedList2.add("Black");
        linkedList2.add("White");
        linkedList2.add("Pink");

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Red");
        linkedList3.add("Green");
        linkedList3.add("Black");
        linkedList3.add("Pink");
        linkedList2.addAll(linkedList3);
        System.out.println(linkedList2);

    }

    public static void swapElements(LinkedList<String> linkedList, String elem_1, String elem_2) {
        int index_1 = linkedList.indexOf(elem_1);
        int index_2 = linkedList.indexOf(elem_2);

        if (index_1 == -1 || index_2 == -1) {
            return;
        }

        linkedList.set(index_1, elem_2);
        linkedList.set(index_2, elem_1);
    }

}

//First level: 1. Напишите программу для удаления указанного элемента из связанного списка.
//Вывод:
//The Original linked list: [Red, Green, Black, Pink, orange]
//The New linked list: [Red, Green, Pink, orange]
//
// Напишите программу для замены двух элементов в связанном списке.
// Вывод:
// The Original linked list: [Red, Green, Black, Pink, orange]
//The New linked list after swap: [Black, Green, Red, Pink, orange]
//
// Напишите Jпрограмму для объединения двух связанных списков.
// Вывод:
// List of first linked list: [Red, Green, Black, White, Pink]
//List of second linked list: [Red, Green, Black, Pink]
//New linked list: [Red, Green, Black, White, Pink, Red, Green, Black, Pink]


