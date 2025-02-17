Feature: Test End to End Contact Page functionality

  Scenario: validate login page functionality
    Given user open login page url on "chrome" browser
    When user enter valid "prafulp1010@gmail.com" and "Pr@ful0812"
    And user click on login button

  Scenario: validate home page functionality
    When user is on home page and validate title
    Then user validate url
    And user validate logo

  Scenario: validate contact page create functionality
    When user click on contact link
    And user click on create button
    And user enter first name and last name
    And user click on contact save button
