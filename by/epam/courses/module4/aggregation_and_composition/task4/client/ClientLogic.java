package by.epam.courses.module4.aggregation_and_composition.task4.client;

import by.epam.courses.module4.aggregation_and_composition.task4.bankAccount.BankAccount;
import by.epam.courses.module4.aggregation_and_composition.task4.bank.Bank;
import by.epam.courses.module4.aggregation_and_composition.task4.bank.BankLogic;

public class ClientLogic {
    private static ClientLogic clientLogic;

    private ClientLogic() {}

    public static ClientLogic getInstance() {
        if (clientLogic == null) {
            clientLogic = new ClientLogic();
        }
        return clientLogic;
    }

    public void createNewBankAccount(int accountNumber, Client client) {
        if (!BankLogic.getInstance().isBankAccountAlreadyExist(accountNumber)) {
            Bank.getInstance().getBankAccounts().add(
                    new BankAccount(accountNumber, client));
        }
    }

    public void setMoney(int money, int accountNumber) {
        BankAccount account = BankLogic.getInstance().findBankAccount(accountNumber);
        if (account != null && account.isAccess()) {
            account.setBalance(account.getBalance() + money);
        }
    }

    public void getMoney(int money, int accountNumber) {
        BankAccount account = BankLogic.getInstance().findBankAccount(accountNumber);
        if (account != null && account.isAccess()) {
            account.setBalance(account.getBalance() - money);
        }
    }
}
