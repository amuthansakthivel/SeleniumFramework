package com.tmb.tests;

import com.tmb.driver.DriverManager;
import com.tmb.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @Test
    public void test2(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication("fdss","sdfsf");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");
    }

}
