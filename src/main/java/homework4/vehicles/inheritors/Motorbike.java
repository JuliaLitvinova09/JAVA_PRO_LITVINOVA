package homework4.vehicles.inheritors;

import homework4.vehicles.MotorVehicle;

public final class Motorbike extends MotorVehicle {
    private String typeOfMotorbike;
    private double weight;

    public Motorbike(String name, int year, double engineVolume, String typeOfFuel, String typeOfMotorbike, double weight) {
        this.typeOfMotorbike = typeOfMotorbike;
        this.weight = weight;
        this.setName(name);
        this.setYear(year);
        this.setEngineVolume(engineVolume);
        this.setTypeOfFuel(typeOfFuel);
    }


    public String getTypeOfMotorbike() {
        return typeOfMotorbike;
    }

    public void setTypeOfMotorbike(String typeOfMotorbike) {
        this.typeOfMotorbike = typeOfMotorbike;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void callMotorbikeTaxi() {
        System.out.println("You call motorbike taxi successfully");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel for Motorbike ...");
    }

    @Override
    public void drive() {
        System.out.println("Drive for Motorbike ...");
    }

    @Override
    public void wash() {
        System.out.println("Washing Motorbike ...");
    }
}
