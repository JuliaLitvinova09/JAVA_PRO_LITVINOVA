package homework16.entity;

public sealed class Animal permits Cat {

    public void run() {
        System.out.println("Run Animal...");
    }
}
