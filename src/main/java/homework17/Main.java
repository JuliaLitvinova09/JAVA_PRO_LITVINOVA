package homework17;

import homework17.threades.UserCallable;
import homework17.threades.UserRunnable;
import homework17.threades.UserThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //     Поток № 1
        UserThread userThread= new UserThread();
        userThread.start();
        //userThread.join();

        //    Поток №2
        UserRunnable userRunnable = new UserRunnable();
        Thread runnableThread = new Thread(userRunnable);
        runnableThread.start();
        //runnableThread.join();

        //   Поток №2
        UserCallable userCallable = new UserCallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(userCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        //thread.join();

        String result = stringFutureTask.get();
        System.out.println("UserCallable returns " + result);

    }
}
