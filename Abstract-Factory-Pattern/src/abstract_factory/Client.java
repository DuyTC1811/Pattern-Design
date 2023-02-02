package abstract_factory;

import abstract_factory.table.Table;
import abstract_factory.wood.Chair;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();
    }
}