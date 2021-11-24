package ir.maktab.accounts;

import ir.maktab.model.User;

public class CurrentAccount extends Account {
    private int chequeSerialNumber;

    public CurrentAccount(long amount, User user) {
        super(amount, user);
        this.chequeSerialNumber = (int) (Math.random() * 1000000);
    }

    public int getChequeSerialNumber() {
        return chequeSerialNumber;
    }

    public void setChequeSerialNumber(int chequeSerialNumber) {
        this.chequeSerialNumber = chequeSerialNumber;
    }

    @Override
    public String toString() {
        return "***CurrentAccount***" +
                "\nwelcome " + super.getUser().getName() + " " + super.getUser().getLastname() +
                "\nyour accountId is=" + super.getAccountId() +
                "\nyour balance is=" + super.getBalance() +
                "\nyour account open in=" + super.getAccountOpeningDate() +
                "\nyour chequeSerialNumber is=" + chequeSerialNumber;
    }
}
