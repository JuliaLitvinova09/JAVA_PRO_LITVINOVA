package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Information {
    private ArrayList<String> userLogin = null;
    private HashSet<String> userMail = null;
    private HashMap<String, String> userInfo = null;

    public ArrayList<String> getUserLogin() {
        return userLogin;
    }

    public Information() {
        userLogin = new ArrayList<>();
        userMail = new HashSet<>();
        userInfo = new HashMap<>();
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
