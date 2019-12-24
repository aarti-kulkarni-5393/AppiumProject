$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Cirrus Connected Mobile App",
  "description": "",
  "id": "login-to-cirrus-connected-mobile-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User logged in to cirrus application with valid credentails",
  "description": "",
  "id": "login-to-cirrus-connected-mobile-app;user-logged-in-to-cirrus-application-with-valid-credentails",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username \u003cUsername\u003e and password \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User submit the details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should \"be succesfully\" logged in to application",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 10,
      "value": "#Then User log out from the application"
    }
  ],
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-to-cirrus-connected-mobile-app;user-logged-in-to-cirrus-application-with-valid-credentails;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "login-to-cirrus-connected-mobile-app;user-logged-in-to-cirrus-application-with-valid-credentails;;1"
    },
    {
      "cells": [
        "conaircraftnhltestuser1@gmail.com",
        "cirrus005"
      ],
      "line": 14,
      "id": "login-to-cirrus-connected-mobile-app;user-logged-in-to-cirrus-application-with-valid-credentails;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "User logged in to cirrus application with valid credentails",
  "description": "",
  "id": "login-to-cirrus-connected-mobile-app;user-logged-in-to-cirrus-application-with-valid-credentails;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username conaircraftnhltestuser1@gmail.com and password cirrus005",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User submit the details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should \"be succesfully\" logged in to application",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyUserIsOnLoginPage()"
});
formatter.result({
  "duration": 38089908400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "conaircraftnhltestuser1@gmail.com",
      "offset": 20
    },
    {
      "val": "cirrus005",
      "offset": 67
    }
  ],
  "location": "Login.enterUserNameAndPassword(String,String)"
});
formatter.result({
  "duration": 2047421600,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "duration": 1346893400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "be succesfully",
      "offset": 13
    }
  ],
  "location": "Login.verifyUSerLoggedIn(String)"
});
formatter.result({
  "duration": 61217064000,
  "status": "passed"
});
formatter.uri("MyProfile.feature");
formatter.feature({
  "line": 1,
  "name": "MyProfile",
  "description": "",
  "id": "myprofile",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "User should be able to update user details",
  "description": "",
  "id": "myprofile;user-should-be-able-to-update-user-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User is on My profile page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User update first name \u003cFirstName\u003e ,last name \u003cLastName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User details should be updated to first name \u003cFirstName\u003e ,Last name \u003cLastName\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "myprofile;user-should-be-able-to-update-user-details;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 32,
      "id": "myprofile;user-should-be-able-to-update-user-details;;1"
    },
    {
      "cells": [
        "test 1",
        "test 1"
      ],
      "line": 33,
      "id": "myprofile;user-should-be-able-to-update-user-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "User logged into application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 488714400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User should be able to update user details",
  "description": "",
  "id": "myprofile;user-should-be-able-to-update-user-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User is on My profile page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User update first name test 1 ,last name test 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User details should be updated to first name test 1 ,Last name test 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyProfile.veirfyUserIsOnMyProfileScreen()"
});
formatter.result({
  "duration": 55692629400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test 1",
      "offset": 23
    },
    {
      "val": "test 1",
      "offset": 41
    }
  ],
  "location": "MyProfile.updateLastAndFirstName(String,String)"
});
formatter.result({
  "duration": 4388087400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test 1",
      "offset": 45
    },
    {
      "val": "test 1",
      "offset": 63
    }
  ],
  "location": "MyProfile.verifyUserDetailsUpdated(String,String)"
});
formatter.result({
  "duration": 6815112900,
  "status": "passed"
});
});