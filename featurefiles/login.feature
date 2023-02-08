Feature: User Authentication tests

  Background: #<Describe Here a PreCondition for ff scenarios>

  @One
  Scenario Outline: Login should be success
    Given User navigates to "<url>" using "<browser>"
    And User click on the login link
    And User enter the username as "ortoni"
    And User enter the password as "Pass1234"
    When User click on the login button
    Then Login should be success

    Examples: 
      | browser | url                                 |
      | chrome  | https://bookcart.azurewebsites.net/ |

  @positive
  Scenario Outline: Login should be success
    Given User navigates to "<url>" using "<browser>"
    And User click on the login link
    And User enter the username as "ortoni"
    And User enter the password as "Pass1234"
    When User click on the login button
    Then Login should be success

    Examples: 
      | browser | url                                 |
      | chrome  | https://bookcart.azurewebsites.net/ |
      | edge    | https://bookcart.azurewebsites.net/ |

  @negative
  Scenario Outline: Login should not be success
    Given User navigates to "<url>" using "<browser>"
    And User click on the login link
    Given User enter the username as "koushik"
    Given User enter the password as "Passkoushik"
    When User click on the login button
    But Login should fail

    Examples: 
      | browser | url                                 |
      | chrome  | https://bookcart.azurewebsites.net/ |
      | edge    | https://bookcart.azurewebsites.net/ |
