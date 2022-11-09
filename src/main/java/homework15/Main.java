package homework15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //  1. Создать пустой поток с двумя любыми промежуточными операциями
        //   и одной терминальной-которая напечатает результат коллекции;

        ArrayList<String> myArray = new ArrayList<>();

        System.out.println(" -------------  TASK 1 -------------");
        Stream<String> emptyStream = myArray.stream();

        emptyStream
                .sorted()
                .map(str -> str.toLowerCase())
                .forEach(e -> System.out.println("print for my stream: " + e));

        //  2. Создать поток с Листом данных(на Ваше усмотрения), который будет иметь
        //     две промежуточные операции  и результатом выполнения получить Набор данных;
        System.out.println(" -------------  TASK 2 -------------");
        myArray.add("Element_2");
        myArray.add("Element_2"); // дублируем, чтобы увидеть, что в сет попадет только одна запись
        myArray.add("Element_3");
        Stream<String> listStream = myArray.stream();

        Set<String> listStreamResult = listStream
                .sorted()
                .map(str -> str.toLowerCase())
                .collect(Collectors.toSet());

        System.out.println(listStreamResult.toString());

        // 3. Создать поток Набора данных(на Ваше усмотрение), который не будет иметь промежуточных данных
        //     и результатом будет Лист данных;
        System.out.println(" -------------  TASK 3 -------------");
        HashSet<String> mySet = new HashSet<>();
        mySet.add("March");
        mySet.add("January");
        mySet.add("February");
        List<String> myListStream = mySet.stream().collect(Collectors.toList());
        System.out.println(myListStream);

        // 4. Создать Коллекцию в виде “ключ-значение”, наполнить, получив значение ключей пройтись по всем,
        //    напечатать их значение и результатом сохранить в виде коллекции;
        System.out.println(" -------------  TASK 4 -------------");
        HashMap<Integer, String> myHashMap = new HashMap();
        myHashMap.put(1, "Anna");
        myHashMap.put(2, "Den");
        myHashMap.put(3, "Jon");
        myHashMap.put(4, "Julia");


        Set<Integer> keys = myHashMap.keySet().stream()
                .map(element -> {
                    System.out.println("print from stream: " + element);
                    return element;
                })
                .collect(Collectors.toSet());


//        5. Cоздать коллекцию из 10 строчных значений в виде чисел.
//        Используя стрим пропустить первое значение, указать лимит 8 значений,
//        преобразовать все значения в int, отфильтровать значения только четных
//        значения и собрать результат в коллекцию ТОЛЬКО уникальных значений;
        System.out.println(" -------------  TASK 5 -------------");
        List<String> stringsNum = Arrays.asList("0", "1", "2", "3", "4", "6", "8", "8", "8", "9");
        Set<Integer> newSet = stringsNum.stream()
                .skip(1)
                .limit(8)
                .map(Integer::valueOf)
                .filter(n -> n % 2 == 0)
                .distinct() // это лишнее, так как выгрузка в сет все равно даст уникальные значения
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //  6. Создать поток, сразу наполнив его данными(не из коллекции), преобразовать в многопоточный поток,
        //     отсортировать, задать фильтр(на свое усмотрение) и найти первый элемент, который попадется
        //     (как результат выполнения);
        System.out.println(" -------------  TASK 6 -------------");
        Stream<String> newStream = Stream.of("January", "February", "March", "April", "May");
        Optional resultStr = newStream
                .parallel()
                .sorted()
                .filter(str -> str.length() > 4)
                .findFirst();
        System.out.println(resultStr.get()); // проверку не делаем, тут заведомо все ок

//        7. Создать поток, в котором показать применения всех 4х возможных вызовов Ссылочных методов.
//        На свое усмотрение, но должны быть примеры вызовов всех методов в одном потоке.
//        Можно создавать свои классы и методы для примера вызова, можно использовать представленные уже в Java;
        System.out.println(" -------------  TASK 6 -------------");

        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("aA1234BX", 2008);
        cars.put("aI1567BE", 2009);
        cars.put("KE1234TT", 2010);
        cars.put("bM1234BE", 2009);
        cars.put("CI9999AA", 2009);

        cars.entrySet().stream()
                .map(Car::new)// 1. ссылка на конструктор
                .map(Car::getNumCar) // 2. ссылка на нестатический метод конкретного объекта.
                .map(String::toUpperCase) // 3. ссылка на нестатический метод любого объекта конкретного типа;
                .map(Car::staticMethodForCar) // 4. ссылка на статический метод;
                .forEach(System.out::println);
    }
}
