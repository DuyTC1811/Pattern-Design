package abstract_factory.table;

import abstract_factory.FurnitureAbstractFactory;
import abstract_factory.wood.Chair;
import abstract_factory.wood.PlasticChair;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
