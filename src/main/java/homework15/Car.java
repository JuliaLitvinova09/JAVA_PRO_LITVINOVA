package homework15;

import java.util.Map;

public class Car {
    private String numCar;
    private Integer year;


    public Car(String numCar, Integer year) {
        this.numCar = numCar;
        this.year = year;
    }

    public Car(Map.Entry<String, Integer> stringIntegerEntry) {
        this.numCar = stringIntegerEntry.getKey();
        this.year = stringIntegerEntry.getValue();
    }

    public String getNumCar() {
        return numCar;
    }

    public void setNumCar(String numCar) {
        this.numCar = numCar;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public static String staticMethodForCar(String numCar) {
        return "Static method for car: " + numCar;
    }
}

