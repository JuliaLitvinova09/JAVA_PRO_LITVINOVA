package homework14;

import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        1.1. Predicate: метод, который на вход принимает дробное значение зарплаты.
//        Если это значение больше 1500.0, то возвращает значение true;
        Predicate<Double> salary = (PredicateSalary) -> (PredicateSalary > 1500.0 ? true : false);
        System.out.println("PredicateSalary.test(): " + salary.test(1501.00));
        System.out.println("PredicateSalary.test(): " + salary.test(1499.99));
        System.out.println();

//        1.2. Consumer: метод, который на вход принимает строку, преобразует ее в массив символов и потом печатает
//        эти символы в консоль в виде символов, а не строки;
        Consumer<String> consumer = (consumerString) -> System.out.println(Arrays.toString(consumerString.toCharArray()));
        consumer.accept("Hello!");
        System.out.println();

//        1.3. Function: метод, который на вход принимает целое число от 1 до 10, а возвращает строку в соответствии
//        этому числу, только словом. Например: 3 -> “three”. Если число вне диапазона, то возвращать слово “unknown”;
        Function<Integer, String> function = (functionInteger) -> numberTranslation(functionInteger);
        System.out.println("function.apply(): " + function.apply(1));
        System.out.println("function.apply(): " + function.apply(3));
        System.out.println("function.apply(): " + function.apply(10));
        System.out.println("function.apply(): " + function.apply(0));
        System.out.println();

        //  1.4. Supplier: метод, который возвращает любое значение на Ваше усмотрение;
        Supplier<String> supplier = () -> numberTranslation(9);
        System.out.println("supplier.get(): " + supplier.get());
        System.out.println();

        //  1.5 BiFunction: метод, который принимает дробное и целоей значение и если одно отнять от другого
        // остаток остается меньше 1, то возвращает сообщение, что остаток меньше единицы. если больше 1,
        // то число которое осталось;

        BiFunction<Double, Integer, String> biFunction =
                (functionInteger, functionDouble) ->
                        (functionInteger - functionDouble < 1 ?
                                "remainder less than 1" :
                                Double.toString(functionInteger - functionDouble));
        System.out.println("biFunctionResult is: " + biFunction.apply(101.50, 101));
        System.out.println("biFunctionResult is: " + biFunction.apply(101.50, 100));
        System.out.println();

//        1.6. FiveDigitFunction: метод, который принимает 4 разных параметра и возвращает пятый параметр.
//        Функциональный интерфейс создать свой. Логика на свое усмотрение.

        FiveDigitFunctionI<Double, Double, Double, Double, String> myFunction =
                (valA, valB, valC, valD) -> ((valA + valB) < (valC + valD) ? "YES" : "NO");
        System.out.println("fiveDigitFunction: " + myFunction.fiveDigitFunction(10.1, 10.9, 0.1, 10.9));
        System.out.println("fiveDigitFunction: " + myFunction.fiveDigitFunction(1.1, 1.9, 10.1, 10.9));
        System.out.println();

//        1.7. Создать один из функциональных интерфейсов, которые мы не рассматривали, но взять из существующих
//        в java (пакет java.util.function) и логику реализовать тоже на свое усмотрение.
        // например: интерфейс  IntToDoubleFunction

        IntToDoubleFunction intVariable = (intVar) -> intVar / 10;
        System.out.println("IntToDoubleFunction: " + intVariable.applyAsDouble(100));
    }

    static String numberTranslation(Integer number) {
        String[] numbersStr = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        try {
            return numbersStr[number - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "unknown";
        }
    }
}
