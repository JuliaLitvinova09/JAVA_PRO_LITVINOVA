package homework11;

import homework11.services.InterfaceFirst;
import homework11.services.InterfaceFourth;
import homework11.services.InterfaceSecond;
import homework11.services.InterfaceThird;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        part1HomeWork();
        part2HomeWork();
    }

    public static void part1HomeWork() {
        System.out.println("************************************");
        InterfaceFirst.staticMethodAInterfaceFirst();
        InterfaceSecond.staticMethodAInterfaceSecond();
        InterfaceThird.staticMethodInterfaceThird();
        InterfaceFourth.staticMethodInterfaceFourth();

        System.out.println();
        ClassExample1 classExample1 = new ClassExample1();
        classExample1.defaultMethod();
        classExample1.contractMethodAInterfaceFirst1();
        classExample1.contractMethodAInterfaceFirst2();
        classExample1.contractMethodAInterfaceThird1();
        classExample1.contractMethodAInterfaceThird2();

        System.out.println();
        ClassExample2 classExample2 = new ClassExample2();
        classExample2.defaultMethod();
        classExample2.contractMethodAInterfaceFirst1();
        classExample2.contractMethodAInterfaceFirst2();
        classExample2.contractMethodAInterfaceSecond1();
        classExample2.contractMethodAInterfaceSecond2();
        classExample2.contractMethodAInterfaceFourth1();
        classExample2.contractMethodAInterfaceFourth2();

    }

    public static void part2HomeWork() {
        Optional<String> optional;
        ServiceUtils serviceUtils = new ServiceUtils();

        System.out.println("Attempt #1 (correct):");
        String eMail = "julia@mail.com";
        optional = serviceUtils.checkString(eMail);
        System.out.println(optional.get());

        // По заданию я поняла, что так и надо, чтобы вышла ошибка, проверка
        // /if (optionalString.isPresent())  не нужна.
        //"Вызвать в классе Main этот хелпер передав не валидное значение и вызвать ошибку
        // используя Optional функции, пытаясь получить значение из вернувшегося результата (метод get);"

        System.out.println("Attempt #2 (not correct):");
        eMail = "julia@ukr.mail.com";
        optional = serviceUtils.checkString(eMail);
        System.out.println(optional.get());

 //       демонстрация с null
//        System.out.println("Attempt #3 (not correct):");
//        eMail=null;
//        optional = serviceUtils.checkString(eMail);
//        System.out.println(optional.get());
    }
}
