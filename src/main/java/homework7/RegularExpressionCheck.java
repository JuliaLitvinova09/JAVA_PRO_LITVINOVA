package homework7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionCheck {
    public boolean numberPhoneIsValid(String inputNumber) {
        String regEx = "^\\+38-?(\\d{3})-?(\\d{3})-?(\\d{2})-?(\\d{2})";
        // разрешаем формат с дефисом и без (-?)
        //+38-066-555-55-55 и +380665552233


        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(inputNumber);
        boolean match = matcher.matches();

        return match;
    }

    public boolean emailIsValid(String inputEmail) {
        String regEx = "(^[\\w]+)@([\\w]+[.?])[a-zA-Z]{3}$";
        // правило для почты такое: [\W] до @ -  все словообразующие символы – буквы, цифры и знак подчеркивания
        // после @  - та же проверка, после точки домен один раз, т.е. можно вводить "kit@fff.com"
        // и нельзя "kit@fff.hillel.com"
        // после точки - только 3 знака - можно .com  и нелья .comm

        Pattern pattern = Pattern.compile(regEx,
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(inputEmail);
        boolean match = matcher.matches();

        return match;
    }

    public boolean dateOfBirthIsValid(String inputEmail) {
        String regEx = "(0?[1-9]|[12][0-9]|[3][01])-(0?[1-9]|1[012])-\\d{4}";
        // формат даты ДД-ММ-ГГГГ
        // задумано так, что принимает без нуля, например 01/01/2001 и 1/1/2001 (0?)
        // для чисел 30 и 31 диапазон прописываем отдельно [3][01]

        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(inputEmail);
        boolean match = matcher.matches();

        return match;
    }
}
