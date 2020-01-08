$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dashboard.feature");
formatter.feature({
  "line": 1,
  "name": "To verify aircraft vitals on dashboard",
  "description": "",
  "id": "to-verify-aircraft-vitals-on-dashboard",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "User request for latest aircraft vital",
  "description": "",
  "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@StartTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User navigate to dashboard for aircaft \u003cAircraft tail Number\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User verify dashboard is displayed with all required aircraft vitals for aircraft \u003cAircraft tail Number\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User refresh dashboard for updated aircraft vitals",
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Then Dahsboard should be updated with latest aircraft vitals"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital;",
  "rows": [
    {
      "cells": [
        "Aircraft tail Number"
      ],
      "line": 16,
      "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital;;1"
    },
    {
      "cells": [
        "N336HT"
      ],
      "line": 17,
      "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15834785200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "user is logged into application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#When User log out from the application"
    }
  ],
  "line": 5,
  "name": "User is already logged in to application by username conaircraftnhltestuser1@gmail.com ,Password cirrus005",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "conaircraftnhltestuser1@gmail.com",
      "offset": 53
    },
    {
      "val": "cirrus005",
      "offset": 97
    }
  ],
  "location": "Login.userIsLoggedIn(String,String)"
});
formatter.result({
  "duration": 77317882600,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 490374100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User request for latest aircraft vital",
  "description": "",
  "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@StartTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User navigate to dashboard for aircaft N336HT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User verify dashboard is displayed with all required aircraft vitals for aircraft N336HT",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User refresh dashboard for updated aircraft vitals",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "N336HT",
      "offset": 39
    }
  ],
  "location": "Dashboard.NavigateToGivenAircraft(String)"
});
formatter.result({
  "duration": 5491541000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N336HT",
      "offset": 82
    }
  ],
  "location": "Dashboard.verifyAndGetAircraftVitals(String)"
});
formatter.result({
  "duration": 53440199100,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.refreshDashboard()"
});
formatter.result({
  "duration": 33600,
  "status": "passed"
});
formatter.uri("Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout application",
  "description": "",
  "id": "logout-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 425800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User logged out the application",
  "description": "",
  "id": "logout-application;user-logged-out-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@EndTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User log out from the application",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 46029090400,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 11617281900,
  "status": "passed"
});
formatter.after({
  "duration": 980000,
  "status": "passed"
});
});