package com.bridgelabz.junit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest {
    @Test
    public void testEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isValid1 = userRegistration.validEmail("abc-100@abc.net");
        boolean isValid2 = userRegistration.validEmail("abc.101@yahoo.com.au");
        Assert.assertEquals(true, isValid1);
        Assert.assertEquals(true, isValid2);
    }
}
