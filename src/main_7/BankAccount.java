package main_7;

public class BankAccount {
    private String owner;
    private double balance;
    private final Bank bank;

    public BankAccount() {
        this.owner = "";
        this.balance = 0.0;
        this.bank = null;
    }

    public BankAccount(String ownerName, double initialBalance, Bank associatedBank) {
        this.owner = ownerName;
        this.balance = initialBalance;
        this.bank = associatedBank;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String ownerName) {
        this.owner = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public Bank getBank() {
        return bank;
    }

    public void transferTo(BankAccount targetAccount, double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient balance!");
            return;
        }

        Bank sourceBank = this.getBank();
        Bank targetBank = targetAccount.getBank();

        double finalAmount = amount;

        // Currency conversion
        if (!sourceBank.getCurrency().equals(targetBank.getCurrency())) {
            double conversionRate = sourceBank.getCurrencyRate(sourceBank.getCurrency(), targetBank.getCurrency());
            finalAmount = amount * conversionRate;
        }

        // Calculate commission
        double commission = 0.0;
        if (this.getOwner().equals(targetAccount.getOwner())) {
            if (sourceBank == targetBank) {
                commission = 0.0;
            } else {
                commission = 0.02;
            }
        } else {
            if (sourceBank == targetBank) {
                commission = 0.03;
            } else {
                commission = 0.06;
            }
        }

        finalAmount -= finalAmount * commission;

        this.balance -= amount;
        targetAccount.setBalance(targetAccount.getBalance() + finalAmount);
    }
}
