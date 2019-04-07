@mobile-ionic @mobile-regression
Feature: Ionic app feature

  @ionic-app1
  Scenario: Verify user should be able to view default main menu bar items
    Given I am on home page of the app
    When I click on hamburger menu
    Then I verify default main menu bar fields

    @ionic-app2
    Scenario: Verify user can disable all filters
    Given I am on a home page of the app
    When I click on filter button
    And I disable "Angular" option
    And I click on All Reset Filer button
    Then I verify all options are enabled

    @ionic-app3
    Scenario: Verify user should be able to slide right on tutorial pages
      Given I am on Splash screen of the ionic conference app
      When I swipe right 3 times on tutorials slides
      Then I verify Continue button is displayed