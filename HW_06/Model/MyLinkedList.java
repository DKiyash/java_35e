package java_35e_HW.HW_06.Model;

public class MyLinkedList {
    int size = 0;
    Node head;//head of list

    public void addElem(String elem){
        Node newNode = new Node(elem);
        if (head == null){
            this.head = newNode;
        }
        else {
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        size++;
    }

    public void removeElem(String elem){
        //If list is empty
        if (head == null){
            return;
        }
        //If list is not empty
        //Seach an element
        Node prevElem = null, currentElem = head;
        while (currentElem != null && currentElem.data != elem){
            prevElem = currentElem;
            currentElem = currentElem.next;
        }
        //If element is not present, nothing to do
        if (currentElem == null) {
            System.out.println("No element!!!");
            System.out.println();
            return;
        };

        //If element is found, remove it
        //If it is first element
        if (prevElem == null){
            head = currentElem.next;
        }
        //If it is not first element
        else {
            prevElem.next = currentElem.next;
        }
        size--;
    }

    //Function to swap two elements
    public void swapElements(String elemX, String elemY){
        //If list is empty
        if (head == null){
            return;
        }
        //If list is not empty
        //Seach for x
        Node prevElemX = null, currentElemX = head;
        while (currentElemX != null && currentElemX.data != elemX){
            prevElemX = currentElemX;
            currentElemX = currentElemX.next;
        }
        //Seach for y
        Node prevElemY = null, currentElemY = head;
        while (currentElemY != null && currentElemY.data != elemY){
            prevElemY = currentElemY;
            currentElemY = currentElemY.next;
        }

        //If element is not present, nothing to do
        if (currentElemX == null || currentElemY == null) return;

        //If element is found, swap
        // If x is not head of linked list
        if (prevElemX != null)
            prevElemX.next = currentElemY;
        else // make y the new head
            head = currentElemY;

        // If y is not head of linked list
        if (prevElemY != null)
            prevElemY.next = currentElemX;
        else // make x the new head
            head = currentElemX;

        // Swap next pointers
        Node temp = currentElemX.next;
        currentElemX.next = currentElemY.next;
        currentElemY.next = temp;

    }

    public void clearMyList(){
        head = null;
    }

    public void printMyList(){
        //If list is empty
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        //If list is not empty
        Node tmp = head;
        while (tmp.next != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }

    //Function to add list of elements
    public void addALLElem(MyLinkedList listOfElem){
        while (listOfElem.size != 0) {
            Node newNode = new Node(listOfElem.head.data);
            if (head == null){
                this.head = newNode;
            }
            else {
                Node tmp = head;
                while (tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = newNode;
            }
            size++;
            listOfElem.removeElem(listOfElem.head.data);
        }
    }

}



class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }
}
