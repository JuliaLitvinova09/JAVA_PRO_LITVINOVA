package homework2.task2;

public class ClassExampleTask2 {
    private final double price;
    private final String color;
    private final int count;

    public ClassExampleTask2() {
        this.price = 10.5;
        this.color = "red";
        this.count = 1;
    }


    public ClassExampleTask2(double price, String color, int count) {
        this.price = price;
        this.color = color;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }
//  SET-теры для переменных  final не могут быть реализованы
    // такие переменные в нашем примере инициализировали через конструктор

//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
}
