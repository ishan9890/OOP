class BankAccount {
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String accNum, String holder, double initialBalance) {
        accountNumber = accNum;
        holderName = holder;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "John Doe", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
