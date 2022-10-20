package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Information {
    private ArrayList<String> userLogin = new ArrayList<>();
    private HashSet<String> userMail = new HashSet<>();
    private HashMap<String, String> userInfo = new HashMap<>();

    public ArrayList<String> getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(ArrayList<String> userLogin) {
        this.userLogin = userLogin;
    }

    public HashSet<String> getUserMail() {
        return userMail;
    }

    public void setUserMail(HashSet<String> userMail) {
        this.userMail = userMail;
    }

    public HashMap<String, String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<String, String> userInfo) {
        this.userInfo = userInfo;
    }
}
