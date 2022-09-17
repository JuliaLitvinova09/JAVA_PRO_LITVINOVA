package homework3.users;

public class Admin extends Support {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }

    public String removeSubstring(String etalonStr, boolean containsSubStr) {
        return (containsSubStr ? etalonStr : null);
    }
}
