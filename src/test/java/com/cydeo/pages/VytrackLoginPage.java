package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;


    @FindBy(xpath = "//button")
    public WebElement loginButton;



    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();

    }
}
