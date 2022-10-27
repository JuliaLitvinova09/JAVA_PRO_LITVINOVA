package homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class InitializationData {
    public static void initializeInformation(Information information) {
        int countRecords = 30;
        String valString = null;
        String valStringMail = null;

        ArrayList<String> userLogin = new ArrayList<>();
        HashSet<String> userMail = new HashSet<>();
        HashMap<String, String> hashMapUserInfo = new HashMap<>();
        //  2.1. Наполнить тридцатью уникальными значениями каждое из 3х полей класса “Information”
        //   (можно автоматически в цикле);
        for (int i = 1; i <= countRecords; i++) {
            valString = "user" + i;
            userLogin.add(valString);

            valStringMail = valString.concat("@mail.ua");
            userMail.add(valStringMail);
            hashMapUserInfo.put(valStringMail, valString);
        }
        //  2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений
        //      (Будьте внимательны при наполнении Списка псевдонимов пользователя,
        //      так как эта коллекция не гарантирует уникальность значений);
        for (int i = 1; i <= 10; i++) {
            valString = "newUser" + i;
            if (!userLogin.contains(valString)) {
                userLogin.add(valString);
                valStringMail = valString.concat("@mail.ua");
                userMail.add(valStringMail);
                hashMapUserInfo.put(valStringMail, valString);
            }
        }
        if (checkSize(userLogin, userMail, hashMapUserInfo)) {
            information.setUserLogin(userLogin);
            information.setUserMail(userMail);
            information.setUserInfo(hashMapUserInfo);
        } else {
              System.out.println("initialization error");
        }
    }

    //  2.3. При возврате сущности “Information” созданного класса “InitializationData”
    //  необходимо, чтобы размер 3х полей был одинаковым(List.size() == Set.size() = Map.size()).
    private static boolean checkSize(ArrayList<String> userLogin, HashSet<String> userMail,
                                     HashMap<String, String> hashMapUserInfo) {
        return ((userLogin.size() == userMail.size()) && (userMail.size() == hashMapUserInfo.size()));
    }
}
