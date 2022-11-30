package homework18;

import homework18.deadlock.Cat;
import homework18.deadlock.CatColor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static AtomicInteger counter = new AtomicInteger(20000);

    public static void main(String[] args) throws InterruptedException {
        taskWithThreadPool();
        taskWithLock();

        // тут мы зависаем...
        taskWithDeadLock();
    }

    public static void taskWithThreadPool() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                for (int k = 0; k < 10000; k++) {
                    Thread thread = new Thread(() -> {
                        counter.decrementAndGet();
                    });
                    thread.start();
                }
            });
        }

        executorService.shutdown();
        System.out.println("Wait for result...threads work for a long time ");
        Thread.sleep(10000); // чтобы все 10 000 потоков отработали, нужно время
        // значение переменной всегда должно быть 0 (на старте 20000 и потом декремент)
        System.out.println("Counter result: " + counter);
        System.out.println();
    }

    public static void taskWithLock() {
        Figure figure = new Figure();

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                figure.draw();
                figure.fill();
                figure.print(); // при тестировании можно закомментить эту строку, чтобы убедиться,
                // что lock-unlock сработает
                System.out.println();
            });
            thread.start();
        }

    }

    public static void taskWithDeadLock() {
        Cat cat = new Cat();
        CatColor catColor = new CatColor();

        cat.setCatColor(catColor);
        catColor.setCat(cat);

        Thread thread1 = new Thread(() -> System.out.println(cat.getInfoFromColor()));
        Thread thread2 = new Thread(() -> System.out.println(catColor.getInfoFromCat()));

        thread1.start();
        thread2.start();
        // тут мы висим.....

    }
}