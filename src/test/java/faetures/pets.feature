Feature: validate pet creation
  Scenario Outline: validate pet creation
    Given I create pet with name "<name>" and "<id>"
    Then I should validate correct response with correct "<name>"
    Examples:
    | name | id |
    |shams | 12 |