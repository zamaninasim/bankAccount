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

}

