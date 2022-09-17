package homework1;

import java.util.Arrays;

public class Main {
    public static byte varSampleByte = 100;
    public static short varSampleShort;
    public static long varSampleLong;
    public static float varSampleFloat;
    public static boolean varSampleBoolean;

    public static String sampleStr1 = "This is the first way to create a string.";
    public static String sampleStr2 = new String("This is the second way to create a string.");

    public static int varSampleInt1, varSampleInt2, varSampleInt3;
    public static double varSampleDbl1, varSampleDbl2, varSampleDbl3;

    public static void main(String[] args) {

        taskWithArithmeticOperations(); // п. 3,4 домашнего задания
        taskWithLogicalOperations(); // п. 5 домашнего задания

        taskWithIncrementAndDecrementOperations(); // п. 6 домашнего задания
        taskWithOneDimensionalArrays(); // п. 7 домашнего задания
    }

    private static void taskWithArithmeticOperations() {
        task3();
        task4();
    }

    private static void task3() {
        System.out.println("Арифметические операции --------------");
        varSampleInt1 = (int) (varSampleByte * 1.5) + 5;
        System.out.println("1. varSampleInt1: " + varSampleInt1);

        varSampleInt2 = 100 * varSampleInt1 / 2;
        System.out.println("2. varSampleInt2: " + varSampleInt2);

        varSampleInt3 = (varSampleInt2 * 100) % 3;
        System.out.println("3. varSampleInt3: " + varSampleInt3);

        varSampleShort = (short) (100 + (varSampleByte % 3));
        System.out.println("4. varSampleShort: " + varSampleShort);

        varSampleLong = varSampleShort * 10000 - 10000;
        System.out.println("5. varSampleLong: " + varSampleLong);

        System.out.println();

        varSampleFloat = (float) (varSampleInt3 * 155.5) + 10;
        System.out.println("6. varSampleFloat: " + varSampleFloat);

        varSampleDbl1 = varSampleFloat * 10 / 20;
        System.out.println("7. varSampleDbl1: " + varSampleDbl1);

        varSampleDbl2 = varSampleDbl1 % 2 + 15;
        System.out.println("8. varSampleDbl2: " + varSampleDbl2);

        varSampleDbl3 = (varSampleDbl2 - varSampleDbl1) * 10.5;
        System.out.println("9. varSampleDbl3: " + varSampleDbl3);

        System.out.println("10. Sum double var: " + (varSampleDbl1 + varSampleDbl2 + varSampleDbl3));
    }

    private static void task4() {
        System.out.println("Операции с присвоением --------------");
        System.out.println("Sample #1 : " + (varSampleInt1 += 1));
        System.out.println("Sample #2 : " + (varSampleInt2 -= 1));
        System.out.println("Sample #3 : " + (varSampleInt3 *= 10));
        System.out.println("Sample #4 : " + (varSampleInt1 += 1));
        System.out.println("Sample #5 : " + (varSampleInt1 /= 2));
        System.out.println("Sample #6 : " + (varSampleInt1 %= 4));
        System.out.println("Sample #7 : " + (varSampleDbl3 += varSampleInt1));
        System.out.println("Sample #8 : " + (varSampleDbl2 -= varSampleDbl3));
        System.out.println("Sample #9 : " + (varSampleShort *= 1.5));
        System.out.println("Sample #10: " + (varSampleInt1 += varSampleInt2 * 2));
    }

    private static void taskWithLogicalOperations() {
        System.out.println("Логические операции --------------");
        int varSampleInt1 = 1;
        int varSampleInt2 = 2;
        int varSampleInt3 = 3;

        int varSampleInt4 = varSampleInt1;

        boolean varSampleBoolean2 = false;
        boolean varSampleBoolean3 = true;


        System.out.println("1) " + (varSampleInt1 <= varSampleInt3 && varSampleInt3 < varSampleInt2));
        System.out.println("2) " + (varSampleInt1 != varSampleInt3 || varSampleInt1 != varSampleInt2));
        System.out.println("3) " + (varSampleInt1 == varSampleInt4 && varSampleInt1 == varSampleInt2 || varSampleInt1 != varSampleInt3));
        System.out.println("4) " + (varSampleInt1 <= varSampleInt4 || varSampleInt1 < varSampleInt4 && varSampleInt1 != varSampleInt4));

        // п.4, только скобки иначе
        System.out.println("5) " + ((varSampleInt1 <= varSampleInt4 || varSampleInt1 < varSampleInt4) && varSampleInt1 != varSampleInt4));

        // пример с тернарными операциями
        varSampleBoolean = ((varSampleInt1 == varSampleInt4) && varSampleInt4 >= varSampleInt3 * 2) ? true : false;

        System.out.println("varSampleBoolean: " + varSampleBoolean);
        System.out.println("equals: " + (varSampleBoolean2 == varSampleBoolean3));

    }

    private static void taskWithIncrementAndDecrementOperations() {
        int count = 1;

        System.out.println("Операции на инкремент и декремент --------------");

        System.out.println(count--);
        System.out.println(count++);
        System.out.println(count++);
        System.out.println(--count);
        System.out.println(count++);
        System.out.println(count--);
        System.out.println(count--);
        System.out.println(++count);

    }

    private static void taskWithOneDimensionalArrays() {
        int length = 10;
        int[] array = new int[length];

        System.out.println("Создание одномерного массива --------------");

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

    }
}
