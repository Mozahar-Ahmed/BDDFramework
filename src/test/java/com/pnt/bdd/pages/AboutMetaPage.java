package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AboutMetaPage {
@FindBy(xpath = "//img[@class='_a2wq img']")
private WebElement metaLogo;
    public void validateUserCanSeeTheMetaLogo() {
        TestBase.sleepFor(5);
        Assert.assertTrue(metaLogo.isDisplayed());
    }
@FindBy(linkText = "Who We Are")
private WebElement whoWAreButton;
    public void validateUserCanClickOnWhoWeAreButton() {
        whoWAreButton.click();
    }
@FindBy(linkText = "Welcome to Meta")
private WebElement welcomeToMetaButton;
    public void validateUserCanSeeTheWelcomeToMetaButton() {
        Assert.assertTrue(welcomeToMetaButton.isDisplayed());
    }
}
