package homework7;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        StringHelper stringHelper = new StringHelper();
        System.out.println("Sample #1");
        String inputStr = "Good morning! My name is Julia";
        char[] inputCharArray0 = {'\r', '\n', '\n', '\t', '\n', ' ',};
        System.out.println(stringHelper.formatString(inputStr, inputCharArray0));
        //---------------------------------------
        System.out.println();
        System.out.println("Sample #2");

        inputStr = "Good morning! My name is ";
        char[] inputCharArray = {'J', 'u', 'l', 'i', 'A', '!', '\t'};
        System.out.println("Line center character: \"" + stringHelper.formatString(inputStr, inputCharArray) + "\"");
        //---------------------------------------
        System.out.println();
        System.out.println("Sample #3");
        inputStr = "012345";
        char[] inputCharArray2 = {'6', '7', '8', '9', '\t'};
        System.out.println("Line center character: \"" + stringHelper.formatString(inputStr, inputCharArray2) + "\"");
        //---------------------------------------
        System.out.println();
        System.out.println("Sample #4");
        inputStr = "12345";
        // тут захватит "5" с пробелом
        System.out.println("Line center character: \"" + stringHelper.formatString(inputStr, inputCharArray2) + "\"");

    }

    public static void task2() {
        System.out.println("----------- TASK 2 -----------------------");

        checkPhone();

        System.out.println();

        checkEMail();

        System.out.println();

        checkDateOfBirth();
    }


    public static void checkPhone() {
        RegularExpressionCheck phoneFormatCheck = new RegularExpressionCheck();

        String inputNumber = "+380890670012";
        System.out.println("Phone " + inputNumber + " is valid: " + phoneFormatCheck.numberPhoneIsValid(inputNumber));

        inputNumber = "+370890670012";
        System.out.println("Phone " + inputNumber + " is valid: " + phoneFormatCheck.numberPhoneIsValid(inputNumber));

        inputNumber = "+38-067-555-00-12";
        System.out.println("Phone " + inputNumber + " is valid: " + phoneFormatCheck.numberPhoneIsValid(inputNumber));

        inputNumber = "38-067-555-00-12";
        System.out.println("Phone  " + inputNumber + " is valid: " + phoneFormatCheck.numberPhoneIsValid(inputNumber));

    }

    public static void checkEMail() {
        RegularExpressionCheck emailFormatCheck = new RegularExpressionCheck();

        String inputEmail = "Garry@fb.vom";
        System.out.println("E-mail " + inputEmail + " is valid: " + emailFormatCheck.emailIsValid((inputEmail)));

        inputEmail = "kit@fff.hillel.com";
        System.out.println("E-mail " + inputEmail + " is valid: " + emailFormatCheck.emailIsValid((inputEmail)));

        inputEmail = "kit_3@fff.com";
        System.out.println("E-mail " + inputEmail + " is valid: " + emailFormatCheck.emailIsValid((inputEmail)));

        inputEmail = "ki#t@fff.com";
        System.out.println("E-mail " + inputEmail + " is valid: " + emailFormatCheck.emailIsValid((inputEmail)));
    }

    private static void checkDateOfBirth() {
        RegularExpressionCheck dateOfBirthCheck = new RegularExpressionCheck();

        String inputBD = "31-12-2012";
        System.out.println("Date of birth " + inputBD + " is valid: " + dateOfBirthCheck.dateOfBirthIsValid((inputBD)));

        inputBD = "20-13-2012";
        System.out.println("Date of birth " + inputBD + " is valid: " + dateOfBirthCheck.dateOfBirthIsValid((inputBD)));

        inputBD = "45-00-2012";
        System.out.println("Date of birth " + inputBD + " is valid: " + dateOfBirthCheck.dateOfBirthIsValid((inputBD)));

        inputBD = "1-1-2012";
        System.out.println("Date of birth " + inputBD + " is valid: " + dateOfBirthCheck.dateOfBirthIsValid((inputBD)));
    }
}
