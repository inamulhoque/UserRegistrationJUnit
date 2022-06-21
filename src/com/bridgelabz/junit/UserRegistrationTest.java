package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void testFirstNameHappy() {
        Scanner obj = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validFirstName("Inam");
        Assert.assertEquals(true, isValid);
    }
}
