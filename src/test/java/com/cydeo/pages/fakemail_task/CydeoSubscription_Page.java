package com.cydeo.pages.fakemail_task;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CydeoSubscription_Page {
    public CydeoSubscription_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath =  "//div//a[.=\'Sign Up For Mailing List\']")
    public WebElement cydeoSignUpBtn;

    @FindBy(name = "full_name")
    public WebElement nameInput;

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "wooden_spoon")
    public WebElement signUpBtn;

    @FindBy(name = "signup_message")
    public WebElement signUpMessage;






}
