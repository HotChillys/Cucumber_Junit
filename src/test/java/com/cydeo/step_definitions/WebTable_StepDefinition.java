package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefinition {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("User is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("WebTable.url");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.username.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters(String string) {
        webTableLoginPage.password.sendKeys(string);
    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginBtn.click();
    }
    @Then("User should see url contains {string}")
    public void user_should_see_url_contains_orders(String string) {
       BrowserUtil.verifyURLContains(string);
    }
//**************************************************************************************
    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.login(username, password);
    }
//*****************************************************************************************
    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
//        webTableLoginPage.username.sendKeys(credentials.get("username"));
//        webTableLoginPage.password.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginBtn.click();

        //using method from page
        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }
}
