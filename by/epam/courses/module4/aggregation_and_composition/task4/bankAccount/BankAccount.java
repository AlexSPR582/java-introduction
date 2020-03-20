package by.epam.courses.module4.aggregation_and_composition.task4.bankAccount;

import by.epam.courses.module4.aggregation_and_composition.task4.client.Client;

import java.util.Objects;

public class BankAccount {
    private int accountNumber;
    private Client client;
    private boolean access = true;
    private int balance = 0;

    public BankAccount(int accountNumber, Client client){
        this.accountNumber = accountNumber;
        this.client = client;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber &&
                access == that.access &&
                balance == that.balance &&
                Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, client, access, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", client=" + client +
                ", access=" + access +
                ", balance=" + balance +
                '}';
    }
}
