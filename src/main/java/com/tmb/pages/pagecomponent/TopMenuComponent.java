package com.tmb.pages.pagecomponent;

import org.openqa.selenium.By;

import static com.tmb.utils.SeleniumUtils.click;

public class TopMenuComponent {

   // private static final By LNK_ADMIN = By.id("menu_admin_viewAdminModule");
    private String topMenus = "menu_%replaceable%";

   /* @FindBy(id = "menu_pim_viewPimModule")
    private WebElement LNK_PIM;

    @FindBy(id = "menu_leave_viewLeaveModule")
    private WebElement LNK_LEAVE;

    public TopMenuComponent(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }*/

    public void clickOnMenu(String menu){
        String pim_viewPimModule = topMenus.replaceAll("%replaceable", "pim_viewPimModule");
        click(By.id(pim_viewPimModule),menu);
    }

    //Dynamic locators is not possible
    // webelement --> By, String

    /*public void clickAdmin(){
        SeleniumUtils.click(LNK_ADMIN);
    }
    public void clickPIMMenu(){
        SeleniumUtils.click(LNK_PIM);
    }*/
}
