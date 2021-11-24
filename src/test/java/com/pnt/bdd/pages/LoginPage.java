package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    @FindBy(xpath = "//img[@class='_97vu img']")
    private WebElement facebookLogo;

    public void validateFBLogoIsDisplayedOnLoginPage() {
        TestBase.sleepFor(5);
        Assert.assertTrue(facebookLogo.isDisplayed());
    }



    }
