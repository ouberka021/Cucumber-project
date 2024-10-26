package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {


    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-menu")
    public WebElement userProfile;


    @FindBy(css = "#main-menu ul.nav-multilevel li.dropdown-level-1")
    public List<WebElement> modules;

}
