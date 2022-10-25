package java_35e_HW.HW_06;

import java_35e_HW.HW_06.Model.MyLinkedList;

public class MainWithMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addElem("Red");
        myLinkedList1.addElem("Green");
        myLinkedList1.addElem("Black");
        myLinkedList1.addElem("Pink");
        myLinkedList1.addElem("Orange");
        myLinkedList1.printMyList();
        System.out.println();

        myLinkedList1.removeElem("Black");
        myLinkedList1.printMyList();
        System.out.println();

        //---------------------------------------------------------
        System.out.println("Task 2:");
        myLinkedList1.clearMyList();
        myLinkedList1.addElem("Red");
        myLinkedList1.addElem("Green");
        myLinkedList1.addElem("Black");
        myLinkedList1.addElem("Pink");
        myLinkedList1.addElem("Orange");
        myLinkedList1.printMyList();
        System.out.println();

        myLinkedList1.swapElements("Red", "Black");
        myLinkedList1.printMyList();
        System.out.println();

        //---------------------------------------------------------
        System.out.println("Task 3:");
        myLinkedList1.clearMyList();
        myLinkedList1.addElem("Red");
        myLinkedList1.addElem("Green");
        myLinkedList1.addElem("Black");
        myLinkedList1.addElem("White");
        myLinkedList1.addElem("Pink");
        myLinkedList1.printMyList();
        System.out.println();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addElem("Red");
        myLinkedList2.addElem("Green");
        myLinkedList2.addElem("Black");
        myLinkedList2.addElem("Pink");
        myLinkedList2.printMyList();
        System.out.println();

        myLinkedList1.addALLElem(myLinkedList2);
        myLinkedList1.printMyList();

    }
}
