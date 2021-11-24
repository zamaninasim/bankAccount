package ir.maktab.model;

public final class UserBuilder {
    private String name;
    private String lastname;
    private String nationalCode;
    private String address;
    private String postalCode;
    private String phoneNumber;
    private String fatherName;

    private UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserBuilder withNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public User build() {
        User user = new User();
        user.setName(name);
        user.setLastname(lastname);
        user.setNationalCode(nationalCode);
        user.setAddress(address);
        user.setPostalCode(postalCode);
        user.setPhoneNumber(phoneNumber);
        user.setFatherName(fatherName);
        return user;
    }
}
