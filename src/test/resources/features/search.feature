Feature: Search Actions
  @tag
  Scenario: The users should see searched word in the results
    Given User on waatwo sitee
    When User click homes content
    And User searches "keyword"
    Then User see keyword
