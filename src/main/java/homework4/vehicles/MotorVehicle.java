package homework4.vehicles;

import homework4.vehicles.actions.MotorVehicleActions;

public abstract class MotorVehicle extends Vehicle implements MotorVehicleActions { // механическое транспортное средство
    private double engineVolume;
    private String typeOfFuel;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
