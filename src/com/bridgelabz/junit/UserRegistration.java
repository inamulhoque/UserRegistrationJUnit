package com.bridgelabz.junit;

public class UserRegistration {
    public boolean validEmail(String mail) {

        String nameRegex = "^[a-z\\\\d+_.-]+@[a-z\\\\d.-]+$";
        return mail.matches(nameRegex);
    }
}
