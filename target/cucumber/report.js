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
  "duration": 38211012600,
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
  "duration": 1878350500,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "duration": 1272183600,
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
  "duration": 61297036900,
  "status": "passed"
});
formatter.uri("Manage_additional_users.feature");
formatter.feature({
  "line": 1,
  "name": "Manage Additional Users",
  "description": "",
  "id": "manage-additional-users",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "User deletes invited user for given aircraft",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User deletes invited user \u003cEmail\u003e access for aircarft \u003cAircraftTailNumber\u003e",
  "keyword": "When "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;",
  "rows": [
    {
      "cells": [
        "Email",
        "AircraftTailNumber"
      ],
      "line": 22,
      "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;1"
    },
    {
      "cells": [
        "testa18@gmail.com",
        "N105PG"
      ],
      "line": 23,
      "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;2"
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
  "duration": 801671500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User deletes invited user for given aircraft",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User deletes invited user testa18@gmail.com access for aircarft N105PG",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "InviteUsers.userisOnManageUSerPage()"
});
formatter.result({
  "duration": 55093397800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testa18@gmail.com",
      "offset": 26
    },
    {
      "val": "N105PG",
      "offset": 64
    }
  ],
  "location": "InviteUsers.deleteUserFromList(String,String)"
});
formatter.result({
  "duration": 102164233300,
  "error_message": "java.lang.AssertionError: user is deleted\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat stepDefinition.InviteUsers.deleteUserFromList(InviteUsers.java:352)\r\n\tat ✽.When User deletes invited user testa18@gmail.com access for aircarft N105PG(Manage_additional_users.feature:19)\r\n",
  "status": "failed"
});
});