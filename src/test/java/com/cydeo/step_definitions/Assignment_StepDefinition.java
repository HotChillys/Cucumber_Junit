package com.cydeo.step_definitions;

import com.cydeo.pages.Assignment;
import com.cydeo.pages.Assignment_home_Page;
import com.cydeo.pages.Vehicles_page;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment_StepDefinition {

    Assignment assignment = new Assignment();
    Assignment_home_Page home_page = new Assignment_home_Page();
    Vehicles_page vehicles = new Vehicles_page();


    @Given("user logged in as truck driver")
    public void userLoggedInAsTruckDriver() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
        String username = ConfigurationReader.getProperty("username");
        assignment.usernameInput.sendKeys(username);
        String password = ConfigurationReader.getProperty("password");
        assignment.passwordInput.sendKeys(password);
        assignment.loginBtn.click();
        BrowserUtil.waitFor(2);
    }


    @Given("user hover over to Fleet")
    public void userHoverOverToFleet() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(home_page.fleet).pause(2000).perform();

    }

    @And("clicks Vehicles")
    public void clicksVehicles() {
        home_page.vehicles.click();
        BrowserUtil.waitFor(2);
    }

    @Then("user should see {string} header")
    public void userShouldSeeCarsHeader(String string) {
        Assert.assertEquals(string, vehicles.headerCars.getText());
    }


//    @And("use should be able to click Export Grid dropdown")
//    public void useShouldBeAbleToClickExportGridDropdown() {
//       // vehicles.ExportGridDropdown.click();
//        //BrowserUtil.waitFor(3);
//
//    }

    @And("user should verify Export Grid dropdown is on the left side of the page and is clickable")
    public void userShouldVerifyExportGridDropdownIsOnTheLeftSideOfThePage() {
        int gridX = vehicles.ExportGridDropdown.getLocation().getX();
        int pageX = vehicles.page.getLocation().getX();
        boolean isLeft = gridX < pageX;
        Assert.assertTrue(isLeft);
        boolean isClickable = BrowserUtil.isClickable( vehicles.ExportGridDropdown);
        Assert.assertTrue(isClickable);
    }
}
