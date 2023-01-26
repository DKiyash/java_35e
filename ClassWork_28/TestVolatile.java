package java_35e_HW.ClassWork_28;

public class TestVolatile {
    static volatile int a;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            (new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started");
                for (int j = 0; j < 10; j++) {
                    a += 1;
//                    a = finalI * 10 + j * 10;
                }
                System.out.println("a = " + a);
                System.out.println("current i= " + finalI);
                System.out.println(Thread.currentThread().getName() + " finished");
                System.out.println();
            })).start();
        }
        Thread.sleep(3000);
        System.out.println("FINAL a = " + a);
    }
}

//Представим ситуацию: несколько потоков одновременно обновляют значение volatile int a.
// Будет ли значение a оставаться корректным, если:
//1. Потоки просто записывают заранее известное значение в a
// 2. Потоки инкрементируют a
