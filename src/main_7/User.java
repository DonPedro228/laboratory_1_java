package main_7;
import java.util.ArrayList;

public class User {
    private String name;
    private final ArrayList<BankAccount> accounts;

    public User() {
        this.name = "";
        this.accounts = new ArrayList<>();
    }

    public User(String userName) {
        this.name = userName;
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

    public void setName(String userName) {
        this.name = userName;
    }

    public int getTotalAccounts() {
        return accounts.size();
    }
}