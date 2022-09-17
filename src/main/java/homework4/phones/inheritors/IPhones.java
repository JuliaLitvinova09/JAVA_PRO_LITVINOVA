package homework4.phones.inheritors;

import homework4.phones.Smartphone;

public final class IPhones extends Smartphone {
    double cameraType;
    String screenType;

    public IPhones(String name,String color, int year,double cameraType, String screenType) {
        this.cameraType = cameraType;
        this.screenType = screenType;
        this.setName(name);
        this.setColor(color);
        this.setYear(year);
        this.setName(name);
    }

    @Override
    public void call() {
        System.out.println("CALL for IPhones");
    }

    @Override
    public void sms() {
        System.out.println("SMS for IPhones");
    }

    @Override
    public void internet() {
        System.out.println("INTERNET for IPhones");

    }

    public void openSafari() {
        System.out.println("openSafari for IPhones");

    }
}
