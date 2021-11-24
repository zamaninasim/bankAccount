package ir.maktab.accounts;

import ir.maktab.model.User;

public class LongTermAccount extends Account {
    public LongTermAccount(long amount, User user) {
        super(amount, user);
    }

    @Override
    public String toString() {
        return "***LongTermAccount***" +
                "\nwelcome " + super.getUser().getName() + " " + super.getUser().getLastname()
                + "\nyour accountId is=" + super.getAccountId() +
                "\nyour balance is=" + super.getBalance() +
                "\nyour account open in=" + super.getAccountOpeningDate();
    }
}