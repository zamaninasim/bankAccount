package ir.maktab.accounts;

import ir.maktab.model.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ShortTermAccount extends Account {
    private static final double monthlyProfit = 0.1;

    public ShortTermAccount() {
    }

    public ShortTermAccount(long amount, User user) {
        super(amount, user);
        calculateInterests();
    }

    public void calculateInterests() {
        LocalDate currentDate = calculateDateOfToday();
        long daysBetween = ChronoUnit.DAYS.between(super.getAccountOpeningDate(),currentDate);
        long mounts = daysBetween / 30;
        double profit =mounts*(super.getBalance()*monthlyProfit);
        super.setBalance(super.getBalance() + (long) profit);
    }

    @Override
    public String toString() {
        return "***ShortTermAccount***" +
                "\nwelcome " + super.getUser().getName() + " " + super.getUser().getLastname()
                + "\nyour accountId is=" + super.getAccountId() +
                "\nyour balance is=" + super.getBalance() +
                "\nyour account open in=" + super.getAccountOpeningDate();
    }
}
