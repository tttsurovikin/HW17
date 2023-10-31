import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(new Bank("Bank1", 35.5));
        banks.add(new Bank("Bank2", 36.0));
        banks.add(new Bank("Bank3", 35.8));
        banks.add(new Bank("Bank4", 36.2));
        banks.add(new Bank("Bank5", 35.9));
        banks.add(new Bank("Bank6", 36.1));
        banks.add(new Bank("Bank7", 35.7));
        banks.add(new Bank("Bank8", 36.3));
        banks.add(new Bank("Bank9", 35.6));
        banks.add(new Bank("Bank10", 36.4));
        banks.add(new Bank("Bank11", 35.4));
        banks.add(new Bank("Bank12", 36.5));
        banks.add(new Bank("Bank13", 35.3));
        banks.add(new Bank("Bank14", 36.6));

        double dollars = 1000.0;
        double maxAmount = 0.0;
        ArrayList<String> maxBanks = new ArrayList<>();

        for (Bank bank : banks){
            double amount = dollars * bank.getExchangeRate();
            if (amount > maxAmount){
                maxAmount = amount;
                maxBanks.clear();
                maxBanks.add(bank.getName());
            } else if (amount == maxAmount) {
                maxBanks.add(bank.getName());
            }
        }

        System.out.println("Кращий банк щоб обміняти доллари на гривні:");
        for (String bankName : maxBanks){
            System.out.println(bankName);
        }

    }
}
