package homework11;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceUtils {
    public Optional checkString(String inputString) {
        Optional<String> optionalString = Optional.ofNullable(inputString);
        if (optionalString.isEmpty() || !emailIsValid(inputString)) {
            return Optional.empty();
        }
        return optionalString;

    }

    private boolean emailIsValid(String inputEmail) {
        String regEx = "(^[\\w]+)@([\\w]+[.?])[a-zA-Z]{3}$";
        // до @ -  все словообразующие символы – буквы, цифры и знак подчеркивания
        // после @  - та же проверка + после точки домен один раз, т.е. можно вводить "julia@mail.com"
        // и нельзя "julia@mail.hillel.com"
        // после точки - только 3 знака - можно .ukr  и нелья .ukrain

        Pattern pattern = Pattern.compile(regEx,
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(inputEmail);
        boolean match = matcher.matches();

        return match;
    }
}
