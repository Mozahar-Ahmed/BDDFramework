Feature: calculator feature
  Background:
  Scenario: user being able to calculate how much he can borrow using calculator
    Given user open the browser and navigate to myhome.freddiemac.com
    When user see the my home logo is displayed
    Then user click on the tools and resources button in the header
    Then user see the Tools and Resources page is displayed
    Then user click on the calculators button
    Then user see the calculators page is displayed
    Then user click on the how much money can you borrow button
    And user see the Mortgage affordability calculator is displayed

