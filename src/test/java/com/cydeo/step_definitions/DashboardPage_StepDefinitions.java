package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardPage_StepDefinitions {

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModuleNames) {

        BrowserUtils.waitForTitleContains("Dashboard");
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitForPageToLoad(10);
        List<String> actualModuleNames = BrowserUtils.getElementsText(dashboardPage.modules);

        Assert.assertEquals(expectedModuleNames,actualModuleNames);

    }
}
