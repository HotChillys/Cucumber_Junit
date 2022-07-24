package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("user types {word} and clicks enter")
    public void user_types_apple_and_clicks_enter(String searchWord) {
        googleSearchPage.searchBox.sendKeys(searchWord + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_steve_jobs_in_the_google_title(String word) {
        String expectedTitle = word+ " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        // junit assertion accept first argument as expected, second arg as actual
        Assert.assertEquals("Title is not as expected",expectedTitle, actualTitle);
        // or
        //Assert.assertTrue(actualTitle.equals(expectedTitle));


    }



}
