package com.bridgelabz.junit;

public class UserRegistration {
    public boolean validPassword(String password) {

        String nameRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{7,}$";
        return password.matches(nameRegex);
    }
}
