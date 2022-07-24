package com.cydeo.step_definitions;

import com.cydeo.pages.TechCrunch_Page;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TechCrunch_StepDefinition {

    TechCrunch_Page techCrunchPage = new TechCrunch_Page();

    @Given("user is on Tech Crunch home page")
    public void user_is_on_tech_crunch_home_page() {
        Driver.getDriver().get("https://techcrunch.com/");
    }


    @And("user should see all the author name")
    public void userShouldSeeAllTheAuthorName() {
        for (int i = 0; i < techCrunchPage.authors.size(); i++) {
            Assert.assertTrue(techCrunchPage.authors.get(i).isDisplayed());
        }
    }

    @And("user should see all the images")
    public void userShouldSeeAllTheImages() {
        for (int i = 0; i < techCrunchPage.images.size(); i++) {
            Assert.assertTrue(techCrunchPage.images.get(i).isDisplayed());
        }
    }

    @When("user clicks on one of the news from The Latest News")
    public void userClicksOnOneOfTheNewsFromTheLatestNews() {
        Faker faker = new Faker();
        BrowserUtil.waitFor(2);
        for (int i = 1; i < techCrunchPage.latestNews.size(); i++) {
            int n = faker.number().numberBetween(1, techCrunchPage.latestNews.size()-1);
            techCrunchPage.latestNews.get(n).click();
            break;
        }
    }

    @Then("news title should be the same with browser title")
    public void newsTitleShouldBeTheSameWithBrowserTitle() {
        BrowserUtil.waitFor(3);
        String articleTitle = techCrunchPage.articleTitle.getText();
        String browserTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(browserTitle.contains(articleTitle));
    }

    @And("verify all the links from the news content")
    public void verifyAllTheLinksFromTheNewsContent() {
        for (int i = 0; i < techCrunchPage.articleLinks.size(); i++) {
            Assert.assertTrue(techCrunchPage.articleLinks.get(i).isDisplayed());
        }
    }
}
