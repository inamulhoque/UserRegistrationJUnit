package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid = userRegistration.validMobile("+91 9101149275");
        Assert.assertEquals(true, isValid);
    }
}
