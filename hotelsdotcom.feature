@HotelsDotCom @regression
Feature: Verify User results


  Background:

  @HotelsDotComVerifyStar-1
  Scenario: Verify user can only view the result by selected property class
    Given I am on default locations search result screen.
    When I select property class with 4 stars.
    Then I verify system displays only 5 star hotels on search result.




  @HotelsDotComVerifyDistance
  Scenario: Verify user can only see hotels 10 miles or less
    Given I am on  my beginning default locations search result screen.
    Then I verify system displays all hotels within 10 miles radius of airport.
    And I verify Hilton Hotel is within radius


