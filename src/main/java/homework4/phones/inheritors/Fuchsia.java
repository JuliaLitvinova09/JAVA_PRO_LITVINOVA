package homework4.phones.inheritors;

import homework4.phones.Smartphone;

public final class Fuchsia extends Smartphone {
    int subVer;
    String nameOS;

    public Fuchsia(String name,String color, int year,int subVer, String nameOS) {
        this.subVer = subVer;
        this.nameOS = nameOS;
        this.setName(name);
        this.setColor(color);
        this.setYear(year);
        this.setName(name);
    }
    @Override
    public void call() {
        System.out.println("CALL for Fuchsia");
    }

    @Override
    public void sms() {
        System.out.println("SMS for Fuchsia");
    }

    @Override
    public void internet() {
        System.out.println("INTERNET for Fuchsia");

    }
    public void openChromeFuchsiaOS() {
        System.out.println("openChrome for Fuchsia");

    }
}
