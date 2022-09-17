package homework3;

import homework3.users.Admin;
import homework3.users.Support;
import homework3.users.User;

import java.util.Scanner;

public class UserService {
    private String etalonStr;
    private String checkSubStr;
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public UserService(String etalonStr) {
        this.etalonStr = etalonStr;
    }

    public void userAction(User user) {
        boolean answer;
        String checkSubStr;


        if (user instanceof Admin) {
            System.out.println("ADMIN:");
            checkSubStr = user.wright(scanner);
            answer = ((Admin) user).checkString(etalonStr, checkSubStr);
            System.out.println("String " + (answer ? "" : " not ") + "contains substring " + checkSubStr);
            etalonStr = ((Admin) user).removeSubstring(etalonStr, answer);
            if (etalonStr == null) {
                System.out.println("clear the string");
            }
        } else if (user instanceof Support) {
            System.out.println("SUPPORT:");
            checkSubStr = user.wright(scanner);
            answer = ((Support) user).checkString(etalonStr, checkSubStr);
            System.out.println("String " + (answer ? "" : " not ") + "contains substring " + checkSubStr);

        } else if (user instanceof User) {
            System.out.println("USER:");
            checkSubStr = user.wright(scanner);

        }

    }
}