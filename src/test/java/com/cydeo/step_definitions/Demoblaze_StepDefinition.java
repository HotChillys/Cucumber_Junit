package com.cydeo.step_definitions;

import com.cydeo.pages.Demoblaze_Page;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Demoblaze_StepDefinition {

    Demoblaze_Page demoblazePage = new Demoblaze_Page();

    @Given("user is on Demoblaze home page")
    public void user_is_on_demoblaze_home_page() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
    }


    @When("user clicks on Laptops, Sony vaio i5 and Add to cart, Accept pop up confirmation.")
    public void userClicksOnLaptopsSonyVaioIAndAddToCartAcceptPopUpConfirmation() {
        demoblazePage.laptopsBtn.click();
        BrowserUtil.waitFor(1);
        demoblazePage.sonyVaioI5.click();
        BrowserUtil.waitFor(1);
        demoblazePage.addToCart.click();
        BrowserUtil.waitFor(1);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @And("user clicks on Home")
    public void userClicksOnHome() {
        demoblazePage.homeBtn.click();
        BrowserUtil.waitFor(1);
    }

    @And("user clicks on Phones, Samsung galaxy s6 and Add to cart, Accept pop up confirmation.")
    public void userClicksOnPhonesSamsungGalaxySAndAddToCartAcceptPopUpConfirmation() {
        demoblazePage.phonesBtn.click();
        demoblazePage.samsungGalaxyS6.click();
        BrowserUtil.waitFor(1);
        demoblazePage.addToCart.click();
        BrowserUtil.waitFor(1);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @And("user clicks on Monitors, Apple monitor 24 and Add to cart, Accept pop up confirmation.")
    public void userClicksOnMonitorsAppleMonitorAndAddToCartAcceptPopUpConfirmation() {
        demoblazePage.monitorsBtn.click();
        BrowserUtil.waitFor(1);
        demoblazePage.appleMonitor24.click();
        BrowserUtil.waitFor(1);
        demoblazePage.addToCart.click();
        BrowserUtil.waitFor(1);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Then("user clicks on cart and deletes Apple monitor 24 from cart")
    public void userClicksOnCartAndDeletesAppleMonitorFromCart() {
        demoblazePage.cartBtn.click();
        demoblazePage.appleMonitor24Delete.click();
        BrowserUtil.waitFor(2);
    }

    @And("user clicks on Place Order")
    public void userClicksOnPlaceOrder() {
        demoblazePage.placeOrderBtn.click();
        BrowserUtil.waitFor(3);
    }

    @And("user fill out the web form fields and click on Purchase")
    public void userFillOutTheWebFormFieldsAndClickOnPurchase() {
        Faker faker = new Faker();
        demoblazePage.name.sendKeys(faker.name().fullName());
        demoblazePage.country.sendKeys(faker.country().name());
        demoblazePage.city.sendKeys(faker.address().city());
        demoblazePage.creditCard.sendKeys(faker.finance().creditCard());
        demoblazePage.month.sendKeys("" + faker.number().numberBetween(1, 12));
        demoblazePage.year.sendKeys("" + faker.number().numberBetween(2000, 2050));
        BrowserUtil.waitFor(3);
        demoblazePage.purchaseBtn.click();
        BrowserUtil.waitFor(3);
    }

    @And("user captures purchase Id and Amount and clicks OK")
    public void userCapturesPurchaseIdAndAmountAndClicksOK() {
        String expectedId = "Id";
        String expectedAmount = "Amount";
        String actualText = demoblazePage.purchaseConfirmation.getText();
        Assert.assertTrue(actualText.contains(expectedId) && actualText.contains(expectedAmount));
        demoblazePage.okBtn.click();
        BrowserUtil.waitFor(3);
    }

    @And("user click on Cart")
    public void userClickOnCart() {
        demoblazePage.cartBtn.click();
        BrowserUtil.waitFor(3);
    }

    @And("Verify there is no product in the cart")
    public void verifyThereIsNoProductInTheCart() {
        boolean emptyCart = false;

        try {
            demoblazePage.noItem.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            emptyCart = true;
        }

        Assert.assertTrue(emptyCart);
    }
}
