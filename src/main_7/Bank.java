package main_7;
import java.util.ArrayList;

public class Bank {
    private String name;
    private String currency;
    private final ArrayList<BankAccount> accounts;
    private int totalAccounts;

    public Bank(String nameBank, String currency) {
        this.name = nameBank;
        this.currency = currency;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        if (accounts.size() < 100) {
            accounts.add(account);
        } else {
            System.out.println("Max count of accounts reached!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String nameBank) {
        this.name = nameBank;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getTotalAccounts() {
        return accounts.size();
    }

    public double getCurrencyRate(String currencyFrom, String currencyTo) {
        if (currencyFrom.equals(currencyTo)) {
            return 1.0;
        }

        if (currencyFrom.equals("USD") && currencyTo.equals("EUR")) {
            return 0.85;
        } else if (currencyFrom.equals("EUR") && currencyTo.equals("USD")) {
            return 1.20;
        }

        if (currencyFrom.equals("UAH") && currencyTo.equals("USD")) {
            return 0.042;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("UAH")) {
            return 42.0;
        }

        return 1.0;
    }
}
