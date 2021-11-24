package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LandingPageFunctionality {
    private HomePage homePage;

    @Given("^user open the browser and navigate to facebook\\.com$")
    public void user_open_the_browser_and_navigate_to_facebook_com() {
        TestBase.setupDriver();
        TestBase.driver.get("https://www.facebook.com/");
        TestBase.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }

    @When("^user see the logo is displayed$")
    public void user_see_the_logo_is_displayed() {
        homePage = PageFactory.initElements(TestBase.driver, HomePage.class);
        homePage.validateFBLogoIsDisplayed();
    }
    @Then("^user click on the login button from footer$")
    public void user_click_on_the_login_button_from_footer() {
        homePage.validateLoginButtonInFooterIsBeingClicked();

    }

    @Then("^user insert the invalid (.*) and (.*)$")
    public void userInsertTheInvalidUsernameAndPassword(String username, String password) {
          homePage.validateUserCanInsertInvalidCredentials(username, password);
    }
    @And("^user click on the login button$")
    public void userClickOnTheLoginButton() {
        homePage.validateUserCanClickOnLoginButton();
    }

    @Then("^user can see the error message is displayed$")
    public void userCanSeeTheErrorMessageIsDisplayed() {
        homePage.validateUserCanSeeTheErrorMessage();

    }
    @Then("^user close the browser$")
    public void user_close_the_browser() {
        TestBase.driver.close();
    }

}
