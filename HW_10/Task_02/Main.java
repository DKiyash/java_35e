package java_35e_HW.HW_10.Task_02;

public class Main {
    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque();
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: addFirst, addLast");
        myDeque.addLast("Third");
        System.out.println(myDeque);
        myDeque.addFirst("Second");
        System.out.println(myDeque);
        myDeque.addFirst("First");
        System.out.println(myDeque);
        myDeque.addLast("Forth");
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: offerFirst, offerLast");
        myDeque.offerFirst(56);
        System.out.println(myDeque);
        myDeque.offerLast(99);
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: removeFirst, removeLast");
        myDeque.removeFirst();
        System.out.println(myDeque);
        myDeque.removeLast();
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: pollFirst, pollLast");
        myDeque.pollFirst();
        System.out.println(myDeque);
        myDeque.pollLast();
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: getFirst, getLast");
        System.out.println(myDeque.getFirst());
        System.out.println(myDeque);
        System.out.println(myDeque.getLast());
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: peekFirst, peekLast");
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque);
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: offer, remove, poll");
        myDeque.offer("Forth");
        myDeque.offer(88);
        System.out.println(myDeque);
        System.out.println(myDeque.remove());
        System.out.println(myDeque);
        System.out.println(myDeque.poll());;
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: element, peek");
        System.out.println(myDeque.element());
        System.out.println(myDeque);
        System.out.println(myDeque.peek());
        System.out.println(myDeque);
        System.out.println();

        System.out.println("Проверка работы команд: push, pop");
        myDeque.push(99);
        System.out.println(myDeque);
        System.out.println(myDeque.pop());
        System.out.println(myDeque);
        System.out.println();

    }
}
//TODO
// Разработать реализацию интерфейса Deque на основе ArrayList
// (public class MyDeque extends ArrayList implements Deque)
