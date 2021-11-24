Feature: learn about meta
  Scenario: user being able to travel to welcome to meta page from the facebook landing page
    Given user open the browser and navigate to facebook.com
    When user see the logo is displayed
    Then user click on the about button from footer
    Then user can see the meta page is displayed
    Then user click on the who we are button from the header
    And user see the welcome to meta is displayed