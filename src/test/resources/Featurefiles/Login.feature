@Login
Feature: To validate Login functionality in facebook application

  Background: 
    Given User have to enter facebook login through chrome browser

  @smoke @sanity
  Scenario: 
    
    
         To validate Login by using invalid username and invalid password

    When User have to enter invalid username and invalid password
      | Username | Ashik             |
      | password | ashik123          |
      | email    | ashi123@gmail.com |
    And User have to Click login button
    Then User should be in invalid credentials page

  @sanity
  Scenario: 
    
      To validate Login by using valid username and invalid password

    When User have to enter valid username and invalid password
      | Username | Email                 | password    |
      | selenium | selenium123@gmail.com | seelnium123 |
      | java     | jaav123@gmail.com     | java123     |
      | jira     | jira123@gmail.com     | jira123     |
    And User have to Click login button
    Then User should be in invalid credentials page
