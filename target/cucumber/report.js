$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("App_Menu.feature");
formatter.feature({
  "line": 1,
  "name": "App_Menu",
  "description": "",
  "id": "app-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24733032700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is logged into application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is already logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.userLoggedIn()"
});
formatter.result({
  "duration": 78391262100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "App menus should be in given sequence",
  "description": "",
  "id": "app-menu;app-menus-should-be-in-given-sequence",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Appmenu"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User open App Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "App menus should be in sequence",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Username \"TEST 1 TEST 1\" should be displayed with profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User verifies Mobile Application Support Number is 1.218.788.3000",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User verifies Application Support Number is 1.218.788.3000",
  "keyword": "And "
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 484482000,
  "status": "passed"
});
formatter.match({
  "location": "AppMenu.user_open_app_menu()"
});
formatter.result({
  "duration": 2397152100,
  "status": "passed"
});
formatter.match({
  "location": "AppMenu.verifyAppMenuSequence()"
});
formatter.result({
  "duration": 1132601400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST 1 TEST 1",
      "offset": 10
    }
  ],
  "location": "AppMenu.verifyUsernameDisplayedOnAppMenu(String)"
});
formatter.result({
  "duration": 1591782100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.218.788.3000",
      "offset": 51
    }
  ],
  "location": "AppMenu.verifyMobileApplicationSupport(String)"
});
formatter.result({
  "duration": 675852800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.218.788.3000",
      "offset": 44
    }
  ],
  "location": "AppMenu.verifyApplicationSupportNumber(String)"
});
formatter.result({
  "duration": 1127316200,
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
formatter.before({
  "duration": 1417300,
  "status": "passed"
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
  "duration": 1296931000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should be able to update profile picture",
  "description": "",
  "id": "myprofile;user-should-be-able-to-update-profile-picture",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@MyProfile"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on My profile page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User remove profile picture",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "profile picture should be removed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyProfile.veirfyUserIsOnMyProfileScreen()"
});
formatter.result({
  "duration": 44367572500,
  "status": "passed"
});
formatter.match({
  "location": "MyProfile.removeProfilePicture()"
});
formatter.result({
  "duration": 4443019300,
  "status": "passed"
});
formatter.match({
  "location": "MyProfile.verifyRemoveProfile()"
});
formatter.result({
  "duration": 51061566700,
  "status": "passed"
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
formatter.step({
  "line": 30,
  "name": "Username \"TEST 1 TEST 1\" should be displayed with profile picture",
  "keyword": "And "
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
formatter.before({
  "duration": 1629300,
  "status": "passed"
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
  "duration": 1285901800,
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
formatter.step({
  "line": 30,
  "name": "Username \"TEST 1 TEST 1\" should be displayed with profile picture",
  "keyword": "And "
});
formatter.match({
  "location": "MyProfile.veirfyUserIsOnMyProfileScreen()"
});
formatter.result({
  "duration": 44133464400,
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
  "duration": 4111961100,
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
  "duration": 7397549000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST 1 TEST 1",
      "offset": 10
    }
  ],
  "location": "AppMenu.verifyUsernameDisplayedOnAppMenu(String)"
});
formatter.result({
  "duration": 30535683800,
  "status": "passed"
});
formatter.uri("Myhangar.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Aircraft details on My Hanagr page",
  "description": "",
  "id": "verify-aircraft-details-on-my-hanagr-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Background:logged in application"
    }
  ],
  "line": 6,
  "name": "User see all assigned aircraft on my hangar screen",
  "description": "",
  "id": "verify-aircraft-details-on-my-hanagr-page;user-see-all-assigned-aircraft-on-my-hangar-screen",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@MyHangar"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User has access to \u003cAircraft tail Number\u003e aircraft",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Aircraft module number is \u003cAircraft Model Number\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see Locaton of aircraft is \u003cLocation\u003e",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#And User should see Last updated date and time is \u003cLastUpdatedDateTime\u003e"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "id": "verify-aircraft-details-on-my-hanagr-page;user-see-all-assigned-aircraft-on-my-hangar-screen;",
  "rows": [
    {
      "cells": [
        "Aircraft tail Number",
        "Aircraft Model Number",
        "Location",
        "LastUpdatedDateTime"
      ],
      "line": 14,
      "id": "verify-aircraft-details-on-my-hanagr-page;user-see-all-assigned-aircraft-on-my-hangar-screen;;1"
    },
    {
      "cells": [
        "FHY374DH",
        "SR22",
        "Delha Shores Airport",
        "12"
      ],
      "line": 15,
      "id": "verify-aircraft-details-on-my-hanagr-page;user-see-all-assigned-aircraft-on-my-hangar-screen;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1427100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User see all assigned aircraft on my hangar screen",
  "description": "",
  "id": "verify-aircraft-details-on-my-hanagr-page;user-see-all-assigned-aircraft-on-my-hangar-screen;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@MyHangar"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User has access to FHY374DH aircraft",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Aircraft module number is SR22",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see Locaton of aircraft is Delha Shores Airport",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 1843449100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FHY374DH",
      "offset": 19
    }
  ],
  "location": "Dashboard.checkAccessToAircraft(String)"
});
formatter.result({
  "duration": 9315406200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SR22",
      "offset": 26
    }
  ],
  "location": "Dashboard.verifyModelNumber(String)"
});
formatter.result({
  "duration": 682807100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Delha Shores Airport",
      "offset": 39
    }
  ],
  "location": "Dashboard.verifyLocationOnMyHangar(String)"
});
formatter.result({
  "duration": 394323800,
  "status": "passed"
});
});