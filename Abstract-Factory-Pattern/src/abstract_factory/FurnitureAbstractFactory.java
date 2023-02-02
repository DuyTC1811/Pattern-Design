package abstract_factory;

import abstract_factory.table.Table;
import abstract_factory.wood.Chair;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
