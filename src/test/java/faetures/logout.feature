@test
Feature: test logout scenario
  Scenario: logout from the baseurl
    Given I logged out
    Then i should get valid status code