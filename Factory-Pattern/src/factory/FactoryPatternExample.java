package factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Bank bank = BankFactory.bankType(BankType.UNIBANK);
        System.out.println(bank.getBankName());
    }
}