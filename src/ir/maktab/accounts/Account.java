package ir.maktab.accounts;

import ir.maktab.model.User;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Account {
    private int accountId;
    private long balance = 0;
    private long amount;
    private User user;
    private LocalDate accountOpeningDate;

    public Account() {
    }

    public Account(long amount, User user) {
        this.accountId = (int) (Math.random() * 1000000);
        this.amount = amount;
        this.balance = this.balance + amount;
        this.user = user;
        this.accountOpeningDate = calculateDateOfToday();
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(LocalDate accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public LocalDate calculateDateOfToday() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        return localDate;
    }

    public static Account factory(int choice, long amount, User user) {
        boolean check = false;
        Account account = null;
        if (choice == 1) {
            while (!check) {
                if (amount >= 100000) {
                    account = new CurrentAccount(amount, user);
                    check = true;
                } else {
                    System.out.println("your amount must be more than 100000 tomaan.");
                    amount = 100000;
                }
            }
        } else if (choice == 2) {
            while (!check) {
                if (amount >= 50000) {
                    account = new ShortTermAccount(amount, user);
                    check = true;
                } else {
                    System.out.println("your amount must be more than 50000 tomaan.");
                    amount = 50000;
                }
            }
        } else if (choice == 3) {
            while (!check) {
                if (amount >= 100000) {
                    account = new LongTermAccount(amount, user);
                    check = true;
                } else {
                    System.out.println("your amont must be more than 100000 tomaan,enter new amount.");
                    amount = 100000;
                }
            }
        }
        return account;
    }
}

