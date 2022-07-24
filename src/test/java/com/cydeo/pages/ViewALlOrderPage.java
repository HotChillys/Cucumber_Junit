package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewALlOrderPage {

    public ViewALlOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

// we need to locate the first cell of the first row

    @FindBy(xpath = "(//div//table//tbody//tr//td)[1]")
    public WebElement newCustomerCell;

}
