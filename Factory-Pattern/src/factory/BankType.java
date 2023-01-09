package factory;

import java.util.function.Supplier;

public enum BankType {
    VIETCOMBANK(VietcomBank::new), TPBANK(TPBank::new), UNIBANK(UniBank::new);
    private final Supplier<Bank> constructor;

    BankType(Supplier<Bank> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Bank> getConstructor() {
        return constructor;
    }
}
