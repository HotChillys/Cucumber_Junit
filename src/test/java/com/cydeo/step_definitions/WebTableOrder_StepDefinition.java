package com.cydeo.step_definitions;

import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewALlOrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTable_BasePage;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefinition {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    WebTable_BasePage webTable_basePage = new WebTable_BasePage();
    OrderPage orderPage = new OrderPage();
    ViewALlOrderPage viewALlOrderPage = new ViewALlOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        //getting the page using the URL from configuration.properties
        String url = ConfigurationReader.getProperty("WebTable.url");
        Driver.getDriver().get(url);

        // calling login method to log in to web table app
        webTableLoginPage.login();

        // clicking to "order" link to go to order page
        webTable_basePage.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(orderPage.product);
        select.selectByVisibleText(string);
    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {

        //clear(); method clears the inputBox
        orderPage.quantity.clear();
        //or use Keys to delete
        //orderPage.quantity.sendKeys(Keys.BACK_SPACE);

        orderPage.quantity.sendKeys(String.valueOf(quantity));
        //or concatenate
        // orderPage.quantity.sendKeys(quantity + "");
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.customerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.street.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.zipcode.sendKeys(string);
    }
    @When("user enters credit card type {string}")
    public void user_enters_credit_card_type(String string) {
//        List<WebElement> cardType = orderPage.cardType;
//        for (WebElement each : cardType) {
//            if (each.getAttribute("value").equalsIgnoreCase(string)) {
//                each.click();
//            }
//        }
        BrowserUtil.clickRadioButton(orderPage.cardType, string);
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.expiryDate.sendKeys(string);
    }
    @When("user clicks process order button")
    public void user_clicks_process_order_button() {
        orderPage.processOrderBtn.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {

        String actualName = viewALlOrderPage.newCustomerCell.getText();
        Assert.assertEquals(expectedName, actualName );

    }



}
