package bank;


// by GPT

public class Savings {
    // Atributos privados
    private String accountHolder;
    private double balance;
    private double interestRate;

    // Construtor
    public Savings(String accountHolder, double initialDeposit, double interestRate) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    // Método para depositar dinheiro
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Método para sacar dinheiro
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Método para calcular o saldo com juros
    public void applyInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Interest applied. New balance: " + balance);
    }

    // Getters e Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
