package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicles_page {
    public Vehicles_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Cars']")
    public WebElement headerCars;

    @FindBy(xpath = "(//div[@class='btn-group'])[2]//a")
    public WebElement ExportGridDropdown;

    @FindBy(xpath = "(//a[@title='Refresh'])[1]")
    public WebElement refresh;

    @FindBy(xpath = "(//i[@class='fa-refresh'])[2]")
    public WebElement reset;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-720087880\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/a/i\n")
    public WebElement gridSetting;

    @FindBy(xpath = "//label[contains(text(),'Page:')]")
    public WebElement page;

}
