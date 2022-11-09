package homework16;

import homework16.entity.Animal;
import homework16.entity.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // case ... lambda
        int varForCase = 6;
        switch (varForCase) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            default -> System.out.println("unknown month");

        }
        // case ... yield
        for (int i = 1; i < 4; i++) {
            String result = switch (i) {
                case 1:
                    yield "January";
                case 2:
                    yield "February";
                case 3:
                    yield "March";
                default:
                    throw new IllegalStateException("unknown month: " + i);
            };
            System.out.println(result);

        }
        // record
        Woman woman = new Woman("Anny", 25);
        System.out.println(woman);

        //instanceof
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal());
        animalsList.add(new Cat());

        for (Animal animal : animalsList)
            if (animal instanceof Cat castedCat) {
                castedCat.run();
            } else
                animal.run();

        // text blocks
        String text= """
                Twinkle, twinkle, little star,
                How I wonder what you are.
                Up above the world so high,
                Like a diamond in the sky.
                """;
        System.out.println(text);
    }
}
