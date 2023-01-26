package java_35e_HW.ClassWork_31;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutorService implements ExecutorService {
    @Override
    public void shutdown() {
        Thread.currentThread().interrupt();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return null;
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return null;
    }

    @Override
    public Future<?> submit(Runnable task) {
        new Thread(task).start();
        new Thread(task).start();
        return null;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return null;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override
    public void execute(Runnable command) {

    }

    public static void main(String[] args) throws InterruptedException {
        MyExecutorService myExecutorService = new MyExecutorService();
        myExecutorService.submit(()-> {
            System.out.println(Thread.currentThread().getName() + " started");
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread.sleep(2000);
        myExecutorService.shutdown();

    }
}

//Реализовать свой ExecutorService, который получает Runnable task и выполняет его в двух потоках одновременно
//Обязательно должен быть реализован метод shutdown, и Future<?> submit(Runnable task);
//
//Другие методы реализовывать не обязатоелньо