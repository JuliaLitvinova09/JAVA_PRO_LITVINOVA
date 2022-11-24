package homework17.threades;

import homework17.ServiceClass;

public class UserThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("UserThread is running....Thread " + Thread.currentThread().getName());
            ServiceClass.getThreadInfo();

        }
    }
}
