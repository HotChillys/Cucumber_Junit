package com.cydeo.pages.fakemail_task;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakeMail_page {

        public FakeMail_page() {
                PageFactory.initElements(Driver.getDriver(), this);
        }

@FindBy(xpath = "(//div/a[.='Copy'])[3]")
        public WebElement copyBtn;

        @FindBy(xpath = "//tbody[@id='schranka']")
        public WebElement newEmail;

        @FindBy(id = "odesilatel")
        public WebElement emailFrom;

        @FindBy(id = "predmet")
        public WebElement emailMessage;



















}
