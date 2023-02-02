package abstract_factory;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType materialType){
        return materialType.getConstructor().get();
    }
}
