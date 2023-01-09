package factory;

public class BankFactory {
    public static Bank bankType(BankType type) {
        return type.getConstructor().get();
    }
}
