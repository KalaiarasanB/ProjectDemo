
Feature: User login

  Scenario Outline: user login
  
    When user enters the username "<Username>" and the password "<Password>"
    And user click on login
    Then I verify the title of the page

    Examples: 
      | Username  | Password |
      | JG1945    |Kalai@2020|