Feature: BBC news header navigation
  Scenario: User navigates to home page
    Given User is on "https://www.bbc.com"
    When the user clicks on "Weather"
    Then browser loads the Weather page