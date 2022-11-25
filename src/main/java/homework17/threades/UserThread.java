package homework17.threades;

import homework17.ServiceClass;

public class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            System.out.println("UserThread, thread " + Thread.currentThread().getName() +
                    "; counter: " + ServiceClass.getThreadInfo());
        }
    }
}
