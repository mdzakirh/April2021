Feature: This feature is to test signin

  Background: I always be in the signin page

  Scenario Outline: This Scenario covers positive signin testing
    Given I am  in a "<signinPage>"
    When Insert valid "<userName>" in username text box
    And Insert valid "<password>" in password text box
    And Click on signin button
    Then User should be in user homepage

    Examples: 
      | signinPage                 | userName                | password     |
      | https://www.saucedemo.com/ | standard_user           | secret_sauce |
      | https://www.saucedemo.com/ | locked_out_user         | secret_sauce |
      | https://www.saucedemo.com/ | problem_user            | secret_sauce |
      | https://www.saucedemo.com/ | performance_glitch_user | secret_sauce |
