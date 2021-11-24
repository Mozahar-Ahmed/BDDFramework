package com.pnt.bdd.stepdef;

import com.pnt.bdd.pages.AboutMetaPage;
import com.pnt.bdd.pages.HomePage;
import cucumber.api.java.en.Then;

public class LearnAboutMeta {
HomePage homePage;
AboutMetaPage aboutMetaPage;
    @Then("^user click on the about button from footer$")
    public void user_click_on_the_about_button_from_footer()   {
        homePage.validateAboutButtonIsBeingClicked();

    }

    @Then("^user can see the meta page is displayed$")
    public void user_can_see_the_meta_page_is_displayed()   {
        aboutMetaPage.validateUserCanSeeTheMetaLogo();
    }

    @Then("^user click on the who we are button from the header$")
    public void user_click_on_the_who_we_are_button_from_the_header()   {
         aboutMetaPage.validateUserCanClickOnWhoWeAreButton();
    }

    @Then("^user see the welcome to meta is displayed$")
    public void user_see_the_welcome_to_meta_is_displayed()  {
        aboutMetaPage.validateUserCanSeeTheWelcomeToMetaButton();

    }

}
