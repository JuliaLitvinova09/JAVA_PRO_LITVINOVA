package homework11.services;

public interface InterfaceSecond extends InterfaceFirst {

    static void staticMethodAInterfaceSecond() {
        System.out.println("Call statis method in InterfaceSecond");
    }

    @Override
    default void defaultMethod() {
        System.out.println("Call default method in InterfaceSecond");
    }

    void contractMethodAInterfaceSecond1();

    void contractMethodAInterfaceSecond2();
}
