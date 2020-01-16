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
      "name": "@PDR"
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
formatter.step({
  "line": 13,
  "name": "Dahsboard should be updated with latest aircraft vitals",
  "keyword": "Then "
});
formatter.examples({
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
        "FHA762OIU"
      ],
      "line": 17,
      "id": "to-verify-aircraft-vitals-on-dashboard;user-request-for-latest-aircraft-vital;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 45763243800,
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
  "name": "User is already logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.userLoggedIn()"
});
formatter.result({
  "duration": 99960949700,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 493708000,
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
      "name": "@PDR"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User navigate to dashboard for aircaft FHA762OIU",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User verify dashboard is displayed with all required aircraft vitals for aircraft FHA762OIU",
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
formatter.step({
  "line": 13,
  "name": "Dahsboard should be updated with latest aircraft vitals",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FHA762OIU",
      "offset": 39
    }
  ],
  "location": "Dashboard.NavigateToGivenAircraft(String)"
});
formatter.result({
  "duration": 2608465100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FHA762OIU",
      "offset": 82
    }
  ],
  "location": "Dashboard.verifyAndGetAircraftVitals(String)"
});
formatter.result({
  "duration": 16750370500,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.refreshingDashboardToUpdateAircraftVitals()"
});
formatter.result({
  "duration": 219234082500,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyDashboardresults()"
});
formatter.result({
  "duration": 207900,
  "status": "passed"
});
});