package homework4.phones;

import homework4.phones.actions.ActionsSmartphone;

public abstract class Smartphone extends Phone implements ActionsSmartphone {
    String version;
    String color;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
