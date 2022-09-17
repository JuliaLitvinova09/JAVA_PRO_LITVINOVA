package homework2.task3.furniture;

public class Table {
    private String color;
    private String model;

    public Table() {
    }

    public Table(String color, String model) {
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
        return "Table{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
