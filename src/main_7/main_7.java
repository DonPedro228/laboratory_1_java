package main_7;

public class main_7 {
    public static void main(String[] args) {

        Bank bank1 = new Bank("Bank1", "USD");
        Bank bank2 = new Bank("Bank2", "EUR");


        User user1 = new User("John");
        User user2 = new User("Alice");


        BankAccount account1 = new BankAccount("John", 1000.0, bank1);
        BankAccount account2 = new BankAccount("John", 500.0, bank2);
        BankAccount account3 = new BankAccount("Alice", 2000.0, bank1);


        user1.addAccount(account1);
        user1.addAccount(account2);
        user2.addAccount(account3);


        bank1.addAccount(account1);
        bank1.addAccount(account3);
        bank2.addAccount(account2);


        System.out.println("Balance of John in Bank1 (USD): " + account1.getBalance());
        System.out.println("Balance of John in Bank2 (EUR): " + account2.getBalance());
        System.out.println("Balance of Alice in Bank1 (USD): " + account3.getBalance());

        account1.transferTo(account2, 200.0);


        System.out.println("\nAfter transfer:");
        System.out.println("Balance of John in Bank1 (USD): " + account1.getBalance());
        System.out.println("Balance of John in Bank2 (EUR): " + account2.getBalance());


        account1.transferTo(account3, 300.0);


        System.out.println("\nAfter the second transfer:");
        System.out.println("Balance of John in Bank1 (USD): " + account1.getBalance());
        System.out.println("Balance of Alice in Bank1 (USD): " + account3.getBalance());
    }
}
