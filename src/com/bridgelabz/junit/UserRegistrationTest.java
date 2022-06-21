package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validEmail("inam.xyz@bl.co.in");
        Assert.assertEquals(true, isValid);
    }
}
