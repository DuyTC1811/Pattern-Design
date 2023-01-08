package factory;

public class BankFactory {
    public static Bank bankType(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case UNIBANK:
                return new UniBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
