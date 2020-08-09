Feature: Login
  Agile story:As a user I should be able to log in to the landing page
  with valid credentials.

  Background:
    Given User is on the login page
    When User login as authorized user


@loginScenario
  Scenario:Authorized user login scenario

    When User login as authorized user
    Then User should be on the main page



