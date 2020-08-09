package com.bitrix24.pages;

import com.bitrix24.Utilities.ConfigurationReader;
import com.bitrix24.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    public void login(){
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        passWord.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }


}
