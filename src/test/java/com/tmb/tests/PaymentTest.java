package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.driver.DriverManager;
import com.tmb.pages.LoginPage;
import com.tmb.testdata.TestData;
import com.tmb.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @FrameworkAnnotation
    @Test(description = "To check something",dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
    public void test2(TestData testdata){
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication("fdss","sdfsf");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");
    }

}
