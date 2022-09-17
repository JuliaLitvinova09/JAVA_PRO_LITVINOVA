package homework3.users;

public class Support extends User {
    public Support() {
    }

    public Support(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }

    public boolean checkString(String etalonString, String checkSubStr) {
        if (etalonString == null || checkSubStr == null) {
            return false;
        }
        return (etalonString.contains(checkSubStr));
    }


}

