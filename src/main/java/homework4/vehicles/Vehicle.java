package homework4.vehicles;

import homework4.vehicles.actions.ServiceVehicle;
import homework4.vehicles.actions.VehicleActions;

public abstract class Vehicle implements VehicleActions, ServiceVehicle { // транспортное средство
    private int year;
    private String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
