package homework11.services;

public interface InterfaceFourth {
    static void staticMethodInterfaceFourth() {
        System.out.println("Call statis method in InterfaceFourth");
    }

    default void defaultMethod() {
        System.out.println("Call default method in InterfaceFourth");
    }

    void contractMethodAInterfaceFourth1();

    void contractMethodAInterfaceFourth2();
}
