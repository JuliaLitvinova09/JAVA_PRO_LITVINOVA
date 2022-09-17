package homework2.task3.furniture;

public class Armchair {
    private String color;
    private String model;

    public Armchair() {
    }

    public Armchair(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
