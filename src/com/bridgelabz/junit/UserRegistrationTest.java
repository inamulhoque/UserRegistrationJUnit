package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validPassword("Assam@1234");
        Assert.assertEquals(true, isValid);
    }
}
