package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement FBLogo;
    @FindBy(linkText = "Log In")
    private WebElement loginButton;

    public void validateFBLogoIsDisplayed() {
        TestBase.sleepFor(5);
        Assert.assertTrue(FBLogo.isDisplayed());
    }

    public void validateLoginButtonInFooterIsBeingClicked() {
        loginButton.click();
    }

    @FindBy(id = "email")
    private WebElement usernameField;
    @FindBy(id = "pass")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//div[@class='_9ay7']")
    private WebElement loginErrorMessage;

    public void validateUserCanInsertInvalidCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void validateUserCanClickOnLoginButton() {
        TestBase.sleepFor(5);
        loginBtn.click();
    }

    public void validateUserCanSeeTheErrorMessage() {
        TestBase.sleepFor(8);
        Assert.assertTrue(loginErrorMessage.isDisplayed());
    }

    @FindBy(linkText = "About")
    private WebElement aboutButtonInFooter;

    public void validateAboutButtonIsBeingClicked() {
        aboutButtonInFooter.click();
    }
}
