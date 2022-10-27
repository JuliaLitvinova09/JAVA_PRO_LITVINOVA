package homework11;

import homework11.services.InterfaceFourth;
import homework11.services.InterfaceSecond;

public class ClassExample2 implements InterfaceSecond, InterfaceFourth {
    @Override
    public void defaultMethod() {
        System.out.println("Call override default method in ClassExample2");
    }

    @Override
    public void contractMethodAInterfaceFirst1() {
        System.out.println("ClassExample2: Call override contract method #1  from InterfaceFirst");
    }

    @Override
    public void contractMethodAInterfaceFirst2() {
        System.out.println("ClassExample2: Call override contract method #2  from InterfaceFirst");
    }

    @Override
    public void contractMethodAInterfaceFourth1() {
        System.out.println("ClassExample2: Call override contract method #1  from InterfaceFourth");
    }

    @Override
    public void contractMethodAInterfaceFourth2() {
        System.out.println("ClassExample2: Call override contract method #2  from InterfaceFourth");
    }


    @Override
    public void contractMethodAInterfaceSecond1() {
        System.out.println("ClassExample2: Call override contract method #1  from InterfaceSecond");
    }

    @Override
    public void contractMethodAInterfaceSecond2() {
        System.out.println("ClassExample2: Call override contract method #2  from InterfaceSecond");
    }
}
