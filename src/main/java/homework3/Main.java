package homework3;

import homework3.users.Admin;
import homework3.users.Support;
import homework3.users.User;

public class Main {
    public static void main(String[] args) {

        String inputString = "sea sand \n stone sea \n sea sea \n stone sand";
        System.out.println("START WITH STRING: ");
        System.out.println(inputString);

        User[] userArray = {new User("User", "UserSurname", "user@mm.com", "rtrtr", "m", "Ukraine"),
                new Support("Support", "SupportSurname", "Support@mm.com", "saffrrr", "m", "Ukraine"),
                new Admin("Admin", "AdminSurname", "admin@mm.com", "gf333", "m", "Ukraine")};

        //Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService(inputString);

        for (User userArrays : userArray) {
            userService.userAction(userArrays);
            System.out.println("--------------------------");
        }
    }
}