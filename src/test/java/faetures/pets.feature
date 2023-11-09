Feature: validate pet creation
  Scenario Outline: validate pet creation
    Given I create pet with name "<name>""
    Then I should validate correct response with correct "<name>"
    Examples:
    | name | id |
    |cat | 12 |