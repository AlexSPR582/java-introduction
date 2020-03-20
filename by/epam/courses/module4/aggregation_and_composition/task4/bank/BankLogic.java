package by.epam.courses.module4.aggregation_and_composition.task4.bank;

import by.epam.courses.module4.aggregation_and_composition.task4.bankAccount.BackAccountLogic;
import by.epam.courses.module4.aggregation_and_composition.task4.bankAccount.BankAccount;

import java.util.Comparator;

public class BankLogic {
    private static BankLogic bankLogic;

    private BankLogic() {}

    public static BankLogic getInstance() {
        if (bankLogic == null) {
            bankLogic = new BankLogic();
        }
        return bankLogic;
    }

    public int calculateBalanceOfAllAccount(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            sum += bankAccount.getBalance();
        }
        return sum;
    }

    public int calculateBalanceOfPlusAccounts(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            if (bankAccount.getBalance() > 0){
                sum += bankAccount.getBalance();
            }
        }
        return sum;
    }

    public int calculateBalanceOfMinusAccounts(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            if (bankAccount.getBalance() < 0){
                sum += bankAccount.getBalance();
            }
        }
        return sum;
    }

    public void sortBankAccountsByAccountNumber() {
        Bank.getInstance().getBankAccounts().sort(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getAccountNumber() - o2.getAccountNumber();
            }
        });
    }

    public void sortBankAccountsByBalance() {
        Bank.getInstance().getBankAccounts().sort(new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getBalance() - o2.getBalance();
            }
        });
    }

    public void blockBankAccount(int accountNumber){
        BackAccountLogic.getInstance().blockBankAccount(findBankAccount(accountNumber));
        System.out.println("счёт заблокирован");
    }

    public void unlockBankAccount(int accountNumber){
        BackAccountLogic.getInstance().unlockBankAccount(findBankAccount(accountNumber));
        System.out.println("счёт разблокирован");
    }

    public boolean isBankAccountAlreadyExist(int accountNumber) {
        if (findBankAccount(accountNumber) != null) {
            System.out.println("Счёт с таким номером уже существует");
            return true;
        }
        return false;
    }

    public void printAllAccounts() {
        for (BankAccount account: Bank.getInstance().getBankAccounts()) {
            BackAccountLogic.getInstance().printBankAccount(account);
            System.out.println();
        }
    }

    public BankAccount findBankAccount(int accountNumber) {
        for (BankAccount account: Bank.getInstance().getBankAccounts()) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
