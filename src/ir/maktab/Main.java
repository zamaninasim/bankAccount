package ir.maktab;

import ir.maktab.accounts.Account;
import ir.maktab.model.User;
import ir.maktab.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****welcome****");
        System.out.println("enter your info: name,lastname,nationalCode,address,postalCode,phoneNumber,fatherName");
        String info = scanner.nextLine();
        User user = UserService.creatUser(info);

        System.out.println("enter your amount:");
        long amount = scanner.nextLong();
        System.out.println("What do you need?\n" +
                "1)Batch of checks\n" +
                "2)Interest on deposit\n" +
                "3)None");
        int choice = scanner.nextInt();
        Account accountRequest = Account.factory(choice, amount, user,scanner);
        System.out.println(accountRequest);
    }
}
