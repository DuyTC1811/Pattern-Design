package abstract_factory.wood;

import abstract_factory.FurnitureAbstractFactory;
import abstract_factory.table.Table;
import abstract_factory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
