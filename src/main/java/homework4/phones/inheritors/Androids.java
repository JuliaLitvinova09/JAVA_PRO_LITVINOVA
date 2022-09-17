package homework4.phones.inheritors;

import homework4.phones.Smartphone;

public final class Androids extends Smartphone {
    double cameraSize;
    double screenSize;

    public Androids(String name,String color, int year,double cameraSize, double screenSize) {
        this.cameraSize = cameraSize;
        this.screenSize = screenSize;
        this.setName(name);
        this.setColor(color);
        this.setYear(year);
        this.setName(name);
    }
    @Override
    public void call() {
        System.out.println("CALL for Androids");
    }

    @Override
    public void sms() {
        System.out.println("SMS for Androids");
    }

    @Override
    public void internet() {
        System.out.println("INTERNET for Androids");

    }
    public void openChrome() {
        System.out.println("openChrome for Androids");

    }
}
