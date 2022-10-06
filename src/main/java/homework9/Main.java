package homework9;

import java.io.IOException;

import static homework9.MyScanner.scanner;

public class Main {
    public static final String USER_FILE_NAME = "src/main/resources/homework9/users.txt";

    public static void main(String[] args) throws IOException {
        task1();
        registration();
        login();
    }

    public static void task1() throws IOException {
        System.out.println("Task#1: writing and reading a verse.");
        String fileName = "src/main/resources/homework9/task1.txt";
        FileUtilities fileUtilities = new FileUtilities();
        fileUtilities.writeFile(fileName);
        fileUtilities.readFile(fileName);
        System.out.println();
    }

    public static void registration() throws IOException {
        System.out.println("Task#2: user registration.");
        FileUtilities fileUtilities = new FileUtilities();
        System.out.println("Enter your future login: ");
        String inputLogin = scanner.nextLine();
        String inputPassword = null;

        System.out.println("Enter your password: ");
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                inputPassword = scanner.nextLine();
            } else {
                System.out.println("repeat your password: ");
                String inputPasswordRepeat = scanner.nextLine();
                if (!inputPassword.equals(inputPasswordRepeat)) {
                    System.out.println("Ehe entered passwords do not match!!! ");
                    return;
                }
            }
        }
        // попали сюда - значит пароль и повтор введены верно
        fileUtilities.writeFileWithAppend(USER_FILE_NAME, inputLogin + "|" + inputPassword + "\n");
        System.out.println("Registration completed successfully!");
    }

    public static void login() {
        System.out.println("Task#3: user login.");
        FileUtilities fileUtilities = new FileUtilities();

        if (fileUtilities.checkLoginPasswordSuccessfully(USER_FILE_NAME)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Username/password combination not found. Try later!");
        }
    }
}
