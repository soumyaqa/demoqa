Feature: Home page
  User can see the home page of demoqa website

  Scenario: Identify the website by title
    Given I have "chrome" open
      When I visit "demoqa.com"
      Then home page title should be "Demoqa | Just another WordPress site"