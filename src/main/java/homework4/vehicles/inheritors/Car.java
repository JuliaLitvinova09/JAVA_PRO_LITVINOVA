package homework4.vehicles.inheritors;

import homework4.vehicles.MotorVehicle;

public final class Car extends MotorVehicle {
    private String color;
    private String typeOfCar; // механика, автомат и т.д.

    public Car(String name, int year, double engineVolume, String typeOfFuel, String color, String typeOfCar) {
        this.color = color;
        this.typeOfCar = typeOfCar;
        this.setName(name);
        this.setYear(year);
        this.setEngineVolume(engineVolume);
        this.setTypeOfFuel(typeOfFuel);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public void callCarTaxi() {
        System.out.println("You call CAR taxi successfully");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel for CAR ...");
    }

    @Override
    public void drive() {
        System.out.println("Drive for CAR ...");
    }

    @Override
    public void wash() {
        System.out.println("Washing CAR ...");
    }
}
