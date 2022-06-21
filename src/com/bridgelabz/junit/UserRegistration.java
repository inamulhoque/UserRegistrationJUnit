package com.bridgelabz.junit;

public class UserRegistration {
    public boolean validMobile(String mobile) {

        String nameRegex = "\\+\\d\\d+\\s+[\\d]{10}$";
        return mobile.matches(nameRegex);
    }
}
