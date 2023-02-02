package abstract_factory;

import abstract_factory.table.PlasticFactory;
import abstract_factory.wood.WoodFactory;

import java.util.function.Supplier;

public enum MaterialType {
    FLASTIC(PlasticFactory::new), WOOD(WoodFactory::new);
    private final Supplier<FurnitureAbstractFactory> constructor;

    MaterialType(Supplier<FurnitureAbstractFactory> constructor) {
        this.constructor = constructor;
    }
    public Supplier<FurnitureAbstractFactory> getConstructor() {
        return constructor;
    }
}
