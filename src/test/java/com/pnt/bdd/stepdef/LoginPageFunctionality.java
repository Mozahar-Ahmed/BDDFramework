package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.LoginPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFunctionality {

    private LoginPage loginPage;

    @Then("^user can see the login page is displayed$")
    public void user_can_see_the_login_page_is_displayed() {
        loginPage = PageFactory.initElements(TestBase.driver, LoginPage.class);
        loginPage.validateFBLogoIsDisplayedOnLoginPage();
    }

}
