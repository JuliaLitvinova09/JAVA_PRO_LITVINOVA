package homework11.services;

public interface InterfaceThird {
    static void staticMethodInterfaceThird() {
        System.out.println("Call statis method in InterfaceThird");
    }

    default void defaultMethod() {
        System.out.println("Call default method in InterfaceThird");
    }

    void contractMethodAInterfaceThird1();

    void contractMethodAInterfaceThird2();
}
