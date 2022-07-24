package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashSet;
import java.util.List;

public class TechCrunch_Page {
    public TechCrunch_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='river-byline__authors']")
    public List<WebElement> authors;

    @FindBy(xpath = "//figure[@class='post-block__media']")
    public List<WebElement> images;

    @FindBy(xpath = "//header[@class='post-block__header']")
    public List<WebElement> latestNews;

    @FindBy(xpath = "//h1[@class='article__title']")
    public WebElement articleTitle;

    @FindBy(xpath = "//div[@class='article-content']//a")
    public List<WebElement> articleLinks;


}
