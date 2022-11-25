package homework17.threades;

import homework17.ServiceClass;

import java.util.concurrent.Callable;

public class UserCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            System.out.println("UserCallable, thread " + Thread.currentThread().getName() +
                    "; counter: " + ServiceClass.getThreadInfo());

        }
        return "RETURN RESULT OF UserCallable. Thread :" + Thread.currentThread().getName();
    }
}
