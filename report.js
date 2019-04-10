$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelsdotcom.feature");
formatter.feature({
  "line": 2,
  "name": "Verify User results",
  "description": "",
  "id": "verify-user-results",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HotelsDotCom"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 26827076294,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "Verify user can only view the result by selected property class",
  "description": "",
  "id": "verify-user-results;verify-user-can-only-view-the-result-by-selected-property-class",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@HotelsDotComVerifyStar-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on default locations search result screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I select property class with 5 stars.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify system displays only 5 star hotels on search result.",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelsSD.verifySearchResultScreen()"
});
formatter.result({
  "duration": 70573909930,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.propertySelection()"
});
formatter.result({
  "duration": 590657469,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.displayOnlyProperStarClass()"
});
formatter.result({
  "duration": 3195905667,
  "status": "passed"
});
formatter.after({
  "duration": 462045535,
  "status": "passed"
});
});