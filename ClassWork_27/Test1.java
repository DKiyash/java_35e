package java_35e_HW.ClassWork_27;

public class Test1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        Thread thread4 = new Thread(new MyThread());
        Thread thread5 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

//        MyDemon myDemon = new MyDemon(5);


    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        System.out.println();
        long start = System.nanoTime();
        long timeForSleep_ms = 10_000;//start time for sleep thread N1 (ms)
        long timeForSleepCurrent_ms = timeForSleep_ms;//current time for sleep thread N1 (ms)
        long timeWasSleeping;//time that thread N1 was sleeping (ns)
        while (true) {
            try {
                Thread.sleep(timeForSleepCurrent_ms);
                System.out.println(Thread.currentThread().getName() + " stoped");
                System.out.println();
                break;
            } catch (InterruptedException e) {
                timeWasSleeping = System.nanoTime() - start;//time that thread N1 was sleeping
                timeForSleepCurrent_ms = (timeForSleep_ms * 1_000_000 - timeWasSleeping) / 1_000_000;
                timeForSleepCurrent_ms = timeForSleepCurrent_ms > 0 ? timeForSleepCurrent_ms : 0;
            }
        }
    }
}

class MyDemon extends Thread{
    public boolean [] array;
    public Runnable [] arrayThread;
    MyDemon (int arraySize, Runnable [] arrayThread){
        array = new boolean[arraySize];
        this.arrayThread = arrayThread;
        for (int i = 0; i < 5; i++) {
            array[i] = false;
        }
    }
    public void run(){
//        while (true){
//        }
    }
}

//Создать 5 потоков, которые будут спать по 10 секунд, причем если поток был разбужен,
// он должен уйти обратно в сон на оставшееся время
//Создать 6й демон-поток, который в бесконечном цикле будет проверять, спят ли основные потоки
// и менять значение в массиве по индексу на true, если они спят
//Поток main каждые 10мс проверяет состояние массива и будит все спящие потоки
