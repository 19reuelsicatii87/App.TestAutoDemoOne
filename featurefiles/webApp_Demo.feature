@UserAuthentication
Feature: User Authentication tests

  Background: #<Describe Here a PreCondition for ff scenarios>

  @One
  Scenario Outline: Login should be success
    Given User navigates to "<url>" using "<browser>"
    And User click on the login link
    And User enter the username as "ortoni"
    And User enter the password as "Pass1234"
    When User click on the login button
    Then User sees that login is successful

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
    Then User sees that login is successful

    Examples: 
      | browser | url                                 |
      | chrome  | https://bookcart.azurewebsites.net/ |
      | chrome  | https://bookcart.azurewebsites.net/ |

  @negative
  Scenario Outline: Login should not be success
    Given User navigates to "<url>" using "<browser>"
    And User click on the login link
    Given User enter the username as "koushik"
    Given User enter the password as "Passkoushik"
    When User click on the login button
    But User sees that login is not successful

    @examples
    Examples: 
      | browser | url                                 |
      | chrome  | https://bookcart.azurewebsites.net/ |
      | chrome  | https://bookcart.azurewebsites.net/ |
