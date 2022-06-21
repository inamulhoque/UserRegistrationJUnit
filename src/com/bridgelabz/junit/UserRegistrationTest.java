package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testLastName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validLastName("Hoque");
        Assert.assertEquals(true, isValid);
    }
}
