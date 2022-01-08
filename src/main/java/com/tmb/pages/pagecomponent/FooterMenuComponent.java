package com.tmb.pages.pagecomponent;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private static final By labelFooterMessage = By.id("footer");

    public String getFooterLabel(){
       return DriverManager.getDriver().findElement(labelFooterMessage).getText();
    }
}
