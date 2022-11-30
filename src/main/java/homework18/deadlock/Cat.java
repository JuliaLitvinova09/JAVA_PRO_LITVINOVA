package homework18.deadlock;

public class Cat {
    private CatColor catColor;


    public void setCatColor(CatColor catColor) {
        this.catColor = catColor;
    }

    public synchronized String getInfo() {
        return "Hello from CAT";
    }

    public synchronized String getInfoFromColor() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return catColor.getInfo();
    }


}