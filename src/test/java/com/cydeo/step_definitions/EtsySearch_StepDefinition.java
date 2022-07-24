package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class EtsySearch_StepDefinition {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on {string}")
    public void user_is_on(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("Etsy"));
    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

//********************************************************************************

    @Given("User is on Etsy home page")
    public void userIsOnHttpsWwwEtsyCom() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Etsy"));
    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox()  {
         etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }

    @And("User clicks search button")
    public void userClicksSearchButton()  {
        etsySearchPage.clickBtn.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        String expected = "Wooden spoon";
        System.out.println("expected -->" +expected);
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));
    }

    //**********************************************************************

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
        etsySearchPage.searchBox.sendKeys(string);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
