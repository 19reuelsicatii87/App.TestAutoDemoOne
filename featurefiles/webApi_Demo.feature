@UserList
Feature: User Authentication tests

  Background: #<Describe Here a PreCondition for ff scenarios>

  @ListAllUser
  Scenario Outline: GET list All User
    Given App draft RequestSpecBuilder
    And App set baseURI to "<baseURI>"
    And App set basePath to "<basePath>"
    When App execute a GET Request
    Then App receives a response status 200
    And App receives a response Body

    Examples: 
      | response | baseURI           | basePath   |
      | chrome   | https://reqres.in | /api/users |

  @OneUser
  Scenario Outline: GET one User using URI
    Given App draft RequestSpecBuilder
    And App set baseURI to "<baseURI>"
    And App set basePath to "<basePath>"
    When App execute a GET Request
    Then App receives a response status 300
    And App receives a response Body

    Examples: 
      | response | baseURI           | basePath     |
      | chrome   | https://reqres.in | /api/users/2 |

  @QueryString
  Scenario Outline: GET user with  Query String
    Given App draft RequestSpecBuilder
    And App set baseURI to "<baseURI>"
    And App set basePath to "<basePath>"
    And App set queryString to Key as "<key>" with Value as "<vaue>"
    When App execute a GET Request
    Then App receives a response status 400
    And App receives a response Body

    Examples: 
      | response | baseURI           | basePath   | key   | vaue |
      | chrome   | https://reqres.in | /api/users | delay |    3 |

  @CreateUser
  Scenario Outline: POST create user with Form String
    Given App draft RequestSpecBuilder
    And App set baseURI to "<baseURI>"
    And App set basePath to "<basePath>"
    And App set formString to Key as "<key1>" with Value as "<vaue1>"
    And App set formString to Key as "<key2>" with Value as "<vaue2>"
    When App execute a POST Request
    Then App receives a response status 201
    And App receives a response Body

    Examples: 
      | response | baseURI           | basePath   | key          | vaue             | key1 | vaue1    | key2 | vaue2  |
      | chrome   | https://reqres.in | /api/users | Content-Type | application/json | name | morpheus | job  | leader |
