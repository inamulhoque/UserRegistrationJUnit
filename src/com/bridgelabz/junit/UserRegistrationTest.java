package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validFirstName("Inam");
        Assert.assertEquals(true, isValid);
    }
}
