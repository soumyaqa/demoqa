@in-progress
Feature: Contents of the home page tab
  @in-progress
  Scenario Outline: On the Tab
    Given I'm on the homepage
    When I select <tabNumber> Tab
    Then I should see <tabTitle> as title

  Examples:
  | tabNumber | tabTitle |
  | 1 | "Content 1 Title" |
  | 2 | "Content 2 Title" |