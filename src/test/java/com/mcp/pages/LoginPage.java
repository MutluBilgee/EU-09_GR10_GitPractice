package com.mcp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(name = "USER_REMEMBER")
    public WebElement rememberBtn;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
        // verification that we logged
    }

}
