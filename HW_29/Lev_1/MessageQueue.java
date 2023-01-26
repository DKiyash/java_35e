package java_35e_HW.HW_29.Lev_1;

import java.util.*;

public class MessageQueue {
    private Queue<String> messages;
    private int listLimit;

    public MessageQueue(int listLimit) {
        this.messages = new LinkedList<>();
        this.listLimit = listLimit;
    }

    public synchronized void send(String newMessage) {
        while (messages.size() >= listLimit) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " (Sender) is trying send new message, but queue is full");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        messages.add(newMessage);
        System.out.println("message: \"" + newMessage + "\" added");
        System.out.println("NOW number of message: " + messages.size());
        notifyAll();
    }

    public synchronized void receive() {
        while (messages.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            throw new IllegalStateException();
        }
        String res = messages.poll();
        System.out.println(Thread.currentThread().getName() + " (Receiver) received a message: \"" + res + "\"");
        System.out.println("NOW number of message: " + messages.size());
//        System.out.println("MESSAGES: \n" + messages);
        System.out.println();
        notifyAll();
//        return res;
    }
}

