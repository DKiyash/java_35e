package java_35e_HW.HW_29.Lev_0;


public class MessageQueue {
    private String message;

    public synchronized void send(String newMessage) {
        while (this.message != null) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " (Sender) is trying send new message, but message exist");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.message = newMessage;
        System.out.println("message: \"" + message + "\"");
        notifyAll();
    }

    public synchronized void receive() {
        while (message == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            throw new IllegalStateException();
        }
        String res = message;
        System.out.println(Thread.currentThread().getName() + " (Receiver) received a message: \"" + message + "\"");
        message = null;
        System.out.println("message: \"" + message + "\"");
        System.out.println();
        notifyAll();
//        return res;
    }
}
