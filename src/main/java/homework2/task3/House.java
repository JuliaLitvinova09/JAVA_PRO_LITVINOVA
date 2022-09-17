package homework2.task3;

import homework2.task3.furniture.Armchair;
import homework2.task3.furniture.Sofa;
import homework2.task3.furniture.Table;

public class House {
    private Armchair armchair;
    private Sofa sofa;
    private Table table;

    public House() {
    }

    public House(Armchair armchair, Sofa sofa, Table table) {
        this.armchair = armchair;
        this.sofa = sofa;
        this.table = table;
    }

    public Armchair getArmchair() {
        return armchair;
    }

    public void setArmchair(Armchair armchair) {
        this.armchair = armchair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "House{" + "\n" +
                armchair + "\n" +
                sofa + "\n" +
                table + "\n" +
                '}';
    }
}
