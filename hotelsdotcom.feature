@HotelsDotCom @regression
Feature: Verify User results


  Background:

  @HotelsDotComVerifyStar-1
  Scenario: Verify user can only view the result by selected property class
    Given I am on default locations search result screen.
    When I select property class 4 stars.
    Then I verify system displays only 4 star hotels on search result.


  @HotelsDotComVerifyStar-2
  Scenario: Verify user can only view the result by selected property class
    Given I am on  my default locations search result screen.
    When I select property class 5 stars.
    Then I verify system displays only 5 star hotels on search result.


  @HotelsDotComVerifyStar-3
  Scenario: Verify user can only view the result by selected property class
    Given I am on beginning default locations search result screen.
    When I select property class 3 stars.
    Then I verify system displays only 3 star hotels on search result.

  @HotelsDotComVerifyDistance
  Scenario: Verify user can only see hotels 10 miles or less
    Given I am on  my beginning default locations search result screen.
    Then I verify system displays all hotels within 10 miles radius of airport.
    And I verify Hilton Hotel is within radius