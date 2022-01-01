package com.tmb.tests;

import com.tmb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest {

    FrameworkConfig config;
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        config = ConfigFactory.create(FrameworkConfig.class);
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(config.timeout(), TimeUnit.SECONDS);//presence of element in the dom
        driver.get(config.url());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "To check whether the user the title of orangehrm website homepage is displayed correctly")
    public void titleValidationTest() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
}
