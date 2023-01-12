package java_35e_HW.HW_25_2023;

public class Level1 {
    public static void main(String[] args) throws InterruptedException {
        //Thread N1
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread №1 " + Thread.currentThread().getName() + " started");
            System.out.println();
            long start = System.nanoTime();
            long timeForSleep_ms = 5_000;//start time for sleep thread N1 (ms)
            long timeForSleepCurrent_ms = timeForSleep_ms;//current time for sleep thread N1 (ms)
            long timeWasSleeping;//time that thread N1 was sleeping (ns)
            while (true) {
                try {
                    Thread.sleep(timeForSleepCurrent_ms);
                    timeWasSleeping = System.nanoTime() - start;//time that thread N1 was sleeping
                    System.out.println("Thread N1 was sleeping: " + timeWasSleeping / 1_000_000 + " ms");
                    break;
                } catch (InterruptedException e) {
                    timeWasSleeping = System.nanoTime() - start;//time that thread N1 was sleeping
                    System.out.println("Thread N1 interrupted");
                    System.out.println("Thread N1 was sleeping: " + timeWasSleeping / 1_000_000 + " ms");
                    timeForSleepCurrent_ms = (timeForSleep_ms * 1_000_000 - timeWasSleeping) / 1_000_000;
                    timeForSleepCurrent_ms = timeForSleepCurrent_ms > 0 ? timeForSleepCurrent_ms : 0;
                    System.out.println("Thread N1 has " + timeForSleepCurrent_ms + " ms to sleep");
                    System.out.println();
                }
            }
        });
        //Thread N2
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread №2 " + Thread.currentThread().getName() + " started");
            System.out.println();
            while (thread1.getState() != Thread.State.TERMINATED) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //If Thread N1 sleeps, it is interrupted
                if (thread1.getState() == Thread.State.TIMED_WAITING) thread1.interrupt();
            }
        });
        System.out.println("Thread N1 state: " + thread1.getState());
        thread1.start();
        System.out.println("Thread N1 state: " + thread1.getState());
        thread2.start();
        System.out.println();
        thread1.join();
        System.out.println("Thread N1 state: " + thread1.getState());
    }
}

//Level 1
//Создать 2 потока:
//1 Спит 10 секунд, обрабатывает InterruptedException следующим образом:
//Посчитать, сколько осталось до окончания сна через System.nanoTime()
//Написать в консоль, сколько еще осталось спать, продолжить спать оставшееся время
//2 Каждые 10 мс проверяет, спит ли поток 1 через Thread.getState()
//Если поток спит, разбудить его
//Если поток закончил выполнение, сделать return

