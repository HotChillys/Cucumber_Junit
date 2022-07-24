package com.cydeo.step_definitions;

import com.cydeo.pages.fakemail_task.CydeoSubscription_Page;
import com.cydeo.pages.fakemail_task.FakeMail_page;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class FakeMail_StepDefinition {

    FakeMail_page fakeMailPage = new FakeMail_page();
    CydeoSubscription_Page cydeoSubscriptionPage = new CydeoSubscription_Page();

    @Given("user is on fakemail page {string}")
    public void user_is_on_fakemail_page(String string) {
        Driver.getDriver().get(string);
    }


    @And("user clicks copy")
    public void userClicksCopy() {
        fakeMailPage.copyBtn.click();
        BrowserUtil.waitFor(1);
    }

    @Then("user navigates to cydeo test page {string}")
    public void userNavigatesToCydeoTestPage(String arg0) {
        Driver.getDriver().get(arg0);
        BrowserUtil.waitFor(1);
    }

    @And("user clicks on Sign Up For Mailing List")
    public void userClicksOnSignUpForMailingList() {
        cydeoSubscriptionPage.cydeoSignUpBtn.click();
        BrowserUtil.waitFor(1);
    }

    @And("User enters valid name")
    public void userEntersValidName() {
        Faker faker = new Faker();
        cydeoSubscriptionPage.nameInput.sendKeys(faker.name().fullName());
    }

    @And("user paste email that copied from fakemail web page")
    public void userPasteEmailThatCopiedFromFakemailWebPage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(cydeoSubscriptionPage.emailInput)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .release()
                .perform();
    }

    @And("user clicks sign up button")
    public void userClicksSignUpButton() {
        cydeoSubscriptionPage.signUpBtn.click();
        BrowserUtil.waitFor(1);
    }

    @Then("verify {string} this message is displayed")
    public void verifyThankYouForSigningUpClickTheButtonBelowToReturnToTheHomePageThisMessageIsDisplayed(String string) {

      for (String eachHandle : Driver.getDriver().getWindowHandles()) {

          Driver.getDriver().switchTo().window(eachHandle);
      }
      BrowserUtil.waitFor(1);
        Assert.assertEquals(string, cydeoSubscriptionPage.signUpMessage.getText());
        BrowserUtil.waitFor(1);
    }

    @Then("user navigates back to fakemail web page {string}")
    public void userNavigatesBackToFakemailWebPage(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @And("Verify that you’ve received an email from -> {string}")
    public void verifyThatYouVeReceivedAnEmailFromDoNotReplyPracticeCydeoCom(String string) {
        BrowserUtil.waitFor(1);
        Assert.assertTrue(fakeMailPage.newEmail.getText().contains(string));
    }

    @And("user click on the email to open it")
    public void userClickOnTheEmailToOpenIt() {
        fakeMailPage.newEmail.click();
    }

    @And("Verify that email is from: {string}")
    public void verifyThatEmailIsFrom(String arg0) {
        Assert.assertEquals(arg0, fakeMailPage.emailFrom.getText());
    }

    @And("Verify that subject is: {string}")
    public void verifyThatSubjectIsThanksForSubscribingToPracticeCydeoCom(String string) {
        Assert.assertEquals(string, fakeMailPage.emailMessage.getText());
    }
}
