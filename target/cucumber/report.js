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
  "duration": 6610398600,
  "error_message": "java.lang.NullPointerException\r\n\tat TestBase.Waits.waitForGivenTime(Waits.java:30)\r\n\tat stepDefinition.Login.verifyUserIsOnLoginPage(Login.java:149)\r\n\tat ✽.Given User is on sign in page(Login.feature:6)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "line": 7,
  "name": "User invites existing user with new aircraft accessn",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-accessn",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User submit details of additional user firstname \u003cfirstName\u003e ,lastname \u003cLastName\u003e,email\u003cEmail\u003e,airctaft\u003cAircraftTailNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then User verifies user is succesfully invited[Email Verification]"
    }
  ],
  "line": 11,
  "name": "Invited user \u003cEmail\u003e is present under list of invited users for Aircraft \u003cAircraftTailNumber\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-accessn;",
  "rows": [
    {
      "cells": [
        "firstName",
        "LastName",
        "Email",
        "AircraftTailNumber"
      ],
      "line": 13,
      "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-accessn;;1"
    },
    {
      "cells": [
        "test",
        "test",
        "testa8@gmail.com",
        "N105PG"
      ],
      "line": 14,
      "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-accessn;;2"
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
  "duration": 8152401800,
  "error_message": "java.lang.NullPointerException\r\n\tat TestBase.Waits.waitForGivenTime(Waits.java:30)\r\n\tat stepDefinition.Dashboard.verifyUserIsOnMyHangarScreen(Dashboard.java:53)\r\n\tat ✽.Given User is on My Hangar screen(Manage_additional_users.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "User invites existing user with new aircraft accessn",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-accessn;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User submit details of additional user firstname test ,lastname test,emailtesta8@gmail.com,airctaftN105PG",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then User verifies user is succesfully invited[Email Verification]"
    }
  ],
  "line": 11,
  "name": "Invited user testa8@gmail.com is present under list of invited users for Aircraft N105PG",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "InviteUsers.userisOnManageUSerPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 49
    },
    {
      "val": "test",
      "offset": 64
    },
    {
      "val": "testa8@gmail.com",
      "offset": 74
    },
    {
      "val": "N105PG",
      "offset": 99
    }
  ],
  "location": "InviteUsers.submitAdditionalUserDetails(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testa8@gmail.com",
      "offset": 13
    },
    {
      "val": "N105PG",
      "offset": 82
    }
  ],
  "location": "InviteUsers.verfyUserIsList(String,String)"
});
formatter.result({
  "status": "skipped"
});
});