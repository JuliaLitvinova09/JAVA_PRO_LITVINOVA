package homework17;

public class ServiceClass {
    private static int counter = 0;

    public static int getThreadInfo() {
        System.out.println("counter: "+counter+"....Thread: " + Thread.currentThread().getName());
        return counter++;
    }
}
