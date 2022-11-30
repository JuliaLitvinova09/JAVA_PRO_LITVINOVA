package homework18.deadlock;

public class CatColor {
    private Cat cat;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public synchronized String getInfo() {
        return "Hello from color cat";
    }

    public synchronized String getInfoFromCat() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return cat.getInfo();
    }

}
