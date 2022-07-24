package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SmartBearOrder_StepDefinition {

    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("User is on SmartBear Tester account page")
    public void user_is_on_smart_bear_tester_account_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx ");
        smartBearOrderPage.username.sendKeys("Tester");
        smartBearOrderPage.password.sendKeys("test");
        smartBearOrderPage.loginBtn.click();
    }
    @Given("User clicks on Order")
    public void user_clicks_on_order() {
        smartBearOrderPage.order.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBearOrderPage.product);
        select.selectByVisibleText(string.replace(" ", ""));
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearOrderPage.quantity.sendKeys(quantity);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearOrderPage.customerName.sendKeys(string);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearOrderPage.street.sendKeys(string);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearOrderPage.city.sendKeys(string);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearOrderPage.state.sendKeys(string);
    }
    @When("User enters {string}")
    public void user_enters(String string) {
        smartBearOrderPage.zipcode.sendKeys(string);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String visa) {
        smartBearOrderPage.cardType.click();
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearOrderPage.cardNumber.sendKeys(string);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearOrderPage.cardExpireDate.sendKeys(string);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearOrderPage.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_john_wick_is_in_the_list(String string) {
        smartBearOrderPage.viewAllOrder.click();

        String actualText = smartBearOrderPage.newCustomer.getText();
        Assert.assertTrue(actualText.contains(string));
    }




}
