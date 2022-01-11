package com.tmb.tests;

import com.tmb.annotations.FrameworkAnnotation;
import com.tmb.pages.LoginPage;
import com.tmb.reports.ExtentManager;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"Admin","admin123","OrangeHRM123"}
        };
    }

    @FrameworkAnnotation
    @Test(description = "To check whether the user the title of orangehrm website homepage is displayed correctly",dataProvider = "getData")
    public void titleValidationTest(String username, String password, String expectedTitle) {

        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage
                .loginToApplication(username,password)
                .getHomePageTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


        //to keep all your locators and methods in one class
    }
}
