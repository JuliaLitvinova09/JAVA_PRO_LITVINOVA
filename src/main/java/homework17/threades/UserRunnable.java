package homework17.threades;

import homework17.ServiceClass;

public class UserRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("UserRunnable is running....Thread " + Thread.currentThread().getName());
            ServiceClass.getThreadInfo();

        }

    }
}
