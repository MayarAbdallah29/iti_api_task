@test
Feature: iti project feature file
  Scenario Outline: login to the pet store
    Given I navigate to the pet store
    When I login using valid credentials "<username>" and "<password>"
    Then I should get a correct response "<username>" and "<password>"

    Examples:
      | username | password |
      | mayar    | test     |
      | mayar2   | test     |