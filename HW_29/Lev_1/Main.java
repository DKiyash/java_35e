package java_35e_HW.HW_29.Lev_1;

public class Main {
    public static int numberLoops = 4;
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(2);
        for (int i = 0; i < 2; i++) {
            (new Thread(new Sender(messageQueue))).start();
            (new Thread(new Receiver(messageQueue))).start();
        }
    }
}

class Sender implements Runnable{
    MessageQueue messageQueue;

    public Sender(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started (Sender)");
        System.out.println();
        for (int i = 0; i < Main.numberLoops; i++) {
            messageQueue.send("Incoming message №" + i + " from (Sender): "
                    + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " finished (Sender)");
        System.out.println();
    }
}

class Receiver implements Runnable{
    MessageQueue messageQueue;

    public Receiver(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started (Receiver)");
        System.out.println();
        for (int i = 0; i < Main.numberLoops; i++) {
            messageQueue.receive();
        }
        System.out.println(Thread.currentThread().getName() + " finished (Receiver)");
        System.out.println();
    }
}


