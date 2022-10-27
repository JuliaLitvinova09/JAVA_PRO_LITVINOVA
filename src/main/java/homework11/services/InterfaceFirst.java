package homework11.services;

public interface InterfaceFirst {
    static void staticMethodAInterfaceFirst() {
        System.out.println("Call statis method in InterfaceFirst");
    }

    default void defaultMethod() {
        System.out.println("Call default method in InterfaceFirst");
    }

    void contractMethodAInterfaceFirst1();

    void contractMethodAInterfaceFirst2();
}
