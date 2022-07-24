package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginBtn;

    /**
     * no param
     * When we call this method, it will directly login using
     * username: Test
     * password: Tester
     */
    public void login(){
        this.username.sendKeys("Test");
       this.password.sendKeys("Tester");
        this.loginBtn.click();
    }

    /**
     * this mwthod will accept two args and login
     * @param name
     * @param pw
     */
    public void login(String name, String pw){
        username.sendKeys(name);
        password.sendKeys(pw);
        loginBtn.click();
    }

    /**
     * we can also create another overloaded login method using configuration.properties
     */
}
