package homework18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Figure {
    Lock lock = new ReentrantLock();

    public void draw() {
        lock.lock();
        System.out.println("Draw figure");

    }

    public void fill() {
        System.out.println("Fill figure");
    }

    public void print() {
        System.out.println("PRINT figure");
        lock.unlock();
    }
}
