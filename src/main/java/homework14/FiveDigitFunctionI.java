package homework14;

@FunctionalInterface
public interface FiveDigitFunctionI<A, B, C, D, E> {
    E fiveDigitFunction(A a, B b, C c, D d);
}
