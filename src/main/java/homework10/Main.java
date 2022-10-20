package homework10;

// В классе Main создайте еще один дополнительный внутренний метод, который на вход будет
// принимать 2 параметра (1- список из любых числовых оберток примитивов(Byte, Integer….),
// тут необходимо подумать про wildcards; 2-полученная переменная “Information”),
// и возвращать он будет обработанный “Information”. В этом методе необходимо написать следующую логику:
//         3.1. пройтись по всему списку переданному и преобразовав значение в строку
//         записать в список псевдонимов пользователя;
//         3.2. Далее к данному значению добавить какое-нибудь заданное значение
//         (например: @mail.ua) и записать в набор почт пользователя и Мапу их соотношения;
//        3.3. Так же необходимо реализовать проверку уже существующей почты в наборе
//        и не записывать данное значение в случае совпадения
//
//        4. В этом же классе Main в методе запуска программы необходимо написать логику
//        работы всей системы:
//        4.1. вызовите InitializationData, который в свою очередь создаст,
//        наполнит и вернет объект Information со всеми значениями;
//        4.2. Далее создайте Список с какими-то обертками примитивов(пару значений достаточно);
//        4.3. Вызовите дополнительный созданный метод Main и передайте все необходимое
//        - убедитесь что все работает.
//        4.4. Выведите полученный результат в консоль.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Information information = new Information();
        InitializationData.initializeInformation(information);

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(20.0);

        AddData(numbers, information);
        System.out.println(information.getUserLogin().toString());
        System.out.println(information.getUserMail().toString());
        System.out.println(information.getUserInfo().toString());

    }

    public static void AddData(ArrayList<? extends Number> values, Information information) {
        String varUser = null;
        String varMail = null;
        for (Number value : values) {
            varUser = "user" + value.toString();
            if (!information.getUserLogin().contains(varUser)) {
                varMail = varUser + "@mail.ua";
                if (!information.getUserMail().contains(varMail)) {
                    information.getUserLogin().add(varUser);
                    information.getUserMail().add(varMail);
                    information.getUserInfo().put(varMail, varUser);
                } else {
                    System.out.println("Mail " + varMail + " exists. Skip it...");
                }
            } else {
                System.out.println("Login " + varUser + " exists. Skip it...");
            }
        }
    }
}

