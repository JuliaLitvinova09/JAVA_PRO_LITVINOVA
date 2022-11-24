package homework17.threades;

import homework17.ServiceClass;

import java.util.concurrent.Callable;

public class UserCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.println("UserCallable is running....Thread " + Thread.currentThread().getName());
            System.out.println();
            ServiceClass.getThreadInfo();

        }
        return "RETURN RESULT OF UserCallable. Thread :" + Thread.currentThread().getName();
    }
}
