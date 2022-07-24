package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoblaze_Page {
    public Demoblaze_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeBtn;

    @FindBy(id = "cartur")
    public WebElement cartBtn;

    @FindBy(xpath = "//div[@class='list-group']//a[.='Phones']")
    public WebElement phonesBtn;

    @FindBy(xpath = "//div[@class='list-group']//a[.='Laptops']")
    public WebElement laptopsBtn;

    @FindBy(xpath = "//div[@class='list-group']//a[.='Monitors']")
    public WebElement monitorsBtn;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    public WebElement samsungGalaxyS6;

    @FindBy(xpath = "//a[.='Apple monitor 24']")
    public WebElement appleMonitor24;

    @FindBy(xpath = "//div//td[.='Apple monitor 24']/following-sibling::td[2]/a")
    public WebElement appleMonitor24Delete;

    @FindBy(xpath = "//div/button[.='Place Order']")
    public WebElement placeOrderBtn;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement creditCard;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    public WebElement purchaseBtn;

    @FindBy(xpath = "//p[@style='display: block;']")
    public WebElement purchaseConfirmation;

    @FindBy (xpath = "//div[@class='sa-confirm-button-container']")
    public WebElement okBtn;

    @FindBy(xpath = "//div//td")
    public WebElement noItem;




}
