package homework4.vehicles.inheritors;

import homework4.vehicles.MotorVehicle;

public final class Bus extends MotorVehicle {
    private String country;
    private double capacity; // вместимость

    public Bus(String name, int year, double engineVolume, String typeOfFuel, String country, double capacity) {
        this.country = country;
        this.capacity = capacity;
        this.setName(name);
        this.setYear(year);
        this.setEngineVolume(engineVolume);
        this.setTypeOfFuel(typeOfFuel);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void bookBus() {
        System.out.println("You book a bus successfully!");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel for BUS ...");
    }

    @Override
    public void drive() {
        System.out.println("Drive for BUS ...");
    }

    @Override
    public void wash() {
        System.out.println("Washing BUS ...");
    }
}
