package by.behlard.j18.homeworks.hw9.task4;

import by.behlard.j18.homeworks.hw9.task4.entities.Account;
import by.behlard.j18.homeworks.hw9.task4.entities.Transaction;

import java.util.List;

public class TransactionsProcessing {

    public static List<Account> doTransactions(
            List<Account> accounts,
            List<Transaction> transactions
    ) {

        for (Transaction transaction : transactions) {

            doTransaction(transaction, accounts);
        }

        return accounts;
    }

    private static void doTransaction(Transaction transaction, List<Account> accounts) {

        if (validateTransaction(transaction, accounts)) {
            Account sender = accounts
                    .stream()
                    .filter(a -> transaction.getSender().equals(a.getName()))
                    .findAny()
                    .get();
            Account receiver = accounts
                    .stream()
                    .filter(a -> transaction.getReceiver().equals(a.getName()))
                    .findAny()
                    .get();

            sendMoney(sender, receiver, transaction.getAmount());
        }
    }

    private static void sendMoney(Account sender, Account receiver, int amount) {

        sender.updateMoney(-amount);
        receiver.updateMoney(amount);
    }

    private static boolean validateTransaction(Transaction transaction, List<Account> accounts) {

        if (accounts.stream().anyMatch(a -> transaction.getSender().equals(a.getName()))
                && accounts.stream().anyMatch(a -> transaction.getReceiver().equals(a.getName()))
                && transaction.getAmount() >= 0
        ) {
            Account sender = accounts
                    .stream()
                    .filter(a -> transaction.getSender().equals(a.getName()))
                    .findAny()
                    .get();
            if (sender.getAmount() >= transaction.getAmount())
                return true;
        }

        return false;
    }
}
