Feature: Quiz game scoring

  Scenario: User answer a question correctly
    Given the user is playing the quiz game
    When the user answers the question correctly
    Then the user should receive 1 point

  Scenario: User answer a question incorrectly
    Given the user is playing the quiz game
    When the user answers the question incorrectly
    Then the user should receive 0 points
    