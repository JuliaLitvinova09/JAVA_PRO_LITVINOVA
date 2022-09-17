package homework2.task3.furniture;

public class Sofa {
    private String cloth;
    private String model;
    private String manufacturer;

    public Sofa() {
    }

    public Sofa(String cloth, String model, String manufacturer) {
        this.cloth = cloth;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getCloth() {
        return cloth;
    }

    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "cloth='" + cloth + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
