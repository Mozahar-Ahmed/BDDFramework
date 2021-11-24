Feature: login functionality features

  Background:
    Given user open the browser and navigate to facebook.com
    When user see the logo is displayed
@smoke
  Scenario Outline: user not being able to login using invalid credential
    Then user insert the invalid <username> and <password>
    And user click on the  button
    And user can see the error message is displayed
    And user close the browser
    Examples:
       | username| password|
       |demouser1|demopass1|
       |demouser2 |demopass2|

  Scenario: user being able to click on login button from the footer of the login page
    Then user click on the login button from footer
    And user can see the login page is displayed
    And user close the browser

  #Scenario: user being able to click on signup button from the footer of the login page
    #Then user click on the signup button from footer
    #And user can see the signup page is displayed