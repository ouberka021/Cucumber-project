package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class VytrackLoginPageSteps {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(ConfigurationReader.getProperty("driver_username"),
                        ConfigurationReader.getProperty("driver_password"));

    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {

        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(ConfigurationReader.getProperty("sales_manager_username"),
                        ConfigurationReader.getProperty("sales_manager_password"));


    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {

        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.
                login(ConfigurationReader.getProperty("store_manager_username"),
                        ConfigurationReader.getProperty("store_manager_password"));


    }

    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {
      VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
      vytrackLoginPage.login(userType.replace(" ","_"));
    }


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        DashboardPage dashboardPage=new DashboardPage();

        BrowserUtils.waitForTitleContains("Dashboard");
        Assert.assertTrue(dashboardPage.userProfile.isDisplayed());
       // BrowserUtils.sleep(5);
       // Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));


    }

    @When("the user login with {string},{string}")
    public void the_user_login_with(String username, String password) {

        VytrackLoginPage vytrackLoginPage=new VytrackLoginPage();
        vytrackLoginPage.login(username,password);


    }
    @Then("the user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {

        BrowserUtils.verifyURLContains("login");

    }

}
