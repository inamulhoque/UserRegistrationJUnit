package com.bridgelabz.junit;

public class UserRegistration {
    public boolean validFirstName(String name) {

        String nameRegex = "^[A-Z][a-z]{2,}";
        return name.matches(nameRegex);
    }
}
