package homework2.task3;

import homework2.task3.furniture.Armchair;
import homework2.task3.furniture.Sofa;
import homework2.task3.furniture.Table;

public class Main {
    public static void main(String[] args) {
        Armchair armchair = new Armchair("white", "NK-1");
        Sofa sofa = new Sofa("white", "NK-1", "Decor");
        Table table = new Table("white", "NK-1");
        //1-й способ создания эксемпляра класса house
        House house1 = new House(armchair, sofa, table);
        System.out.println(house1);

        System.out.println("----------------------------");

        //2-й способ создания эксемпляра класса house
        House house2 = new House();
        house2.setSofa(sofa);
        house2.setTable(table);
        house2.setArmchair(armchair);

        System.out.println(house2);


    }


}
