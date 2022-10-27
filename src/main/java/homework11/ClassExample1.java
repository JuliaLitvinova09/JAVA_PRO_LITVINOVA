package homework11;

import homework11.services.InterfaceFirst;
import homework11.services.InterfaceThird;

public class ClassExample1 implements InterfaceFirst, InterfaceThird {
    @Override
    public void defaultMethod() {
        System.out.println("Call override default method in ClassExample1");
    }

    @Override
    public void contractMethodAInterfaceFirst1() {
        System.out.println("ClassExample1: Call override contract method #1  from InterfaceFirst");
    }

    @Override
    public void contractMethodAInterfaceFirst2() {
        System.out.println("ClassExample1: Call override contract method #2  from InterfaceFirst");
    }

    @Override
    public void contractMethodAInterfaceThird1() {
        System.out.println("ClassExample1: Call override contract method #1  from InterfaceThird");
    }

    @Override
    public void contractMethodAInterfaceThird2() {
        System.out.println("ClassExample1: Call override contract method #2  from InterfaceThird");
    }
}
