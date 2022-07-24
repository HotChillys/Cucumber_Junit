package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderPage {

    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy(xpath = "(//*[.='Order'])[2]")
    public WebElement order;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantity;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipcode;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement cardExpireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy(xpath = "//*[.='View all orders']")
    public WebElement viewAllOrder;

    @FindBy(xpath = "(//div//tbody//tr//td)[2]")
    public WebElement newCustomer;





}
