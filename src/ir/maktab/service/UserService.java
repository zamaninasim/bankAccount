package ir.maktab.service;

import ir.maktab.model.User;
import ir.maktab.model.UserBuilder;

public class UserService {

    public static User creatUser(String info) {
        String[] splitInfo = info.split(",");
        String name = splitInfo[0];
        String lastname = splitInfo[1];
        String nationalCode = splitInfo[2];
        String address = splitInfo[3];
        String postalCode = splitInfo[4];
        String phoneNumber = splitInfo[5];
        String fatherName = splitInfo[6];
        User user = UserBuilder.anUser()
                .withName(name)
                .withLastname(lastname)
                .withNationalCode(nationalCode)
                .withAddress(address)
                .withPostalCode(postalCode)
                .withPhoneNumber(phoneNumber)
                .withFatherName(fatherName)
                .build();
        return user;
    }
}
