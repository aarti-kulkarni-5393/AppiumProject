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
formatter.before({
  "duration": 17951232500,
  "status": "passed"
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
  "duration": 12963646200,
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
  "duration": 2103784200,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "duration": 796561700,
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
  "duration": 60568812200,
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
  "line": 7,
  "name": "User invites existing user with new aircraft access",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-access",
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
  "name": "User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User submit details of additional user firstname \u003cfirstName\u003e ,lastname \u003cLastName\u003e,email\u003cEmail\u003e,airctaft\u003cAircraftTailNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Then User verifies user is succesfully invited[Email Verification]"
    }
  ],
  "line": 13,
  "name": "Invited user \u003cEmail\u003e is present under list of invited users for Aircraft \u003cAircraftTailNumber\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-access;",
  "rows": [
    {
      "cells": [
        "firstName",
        "LastName",
        "Email",
        "AircraftTailNumber"
      ],
      "line": 15,
      "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-access;;1"
    },
    {
      "cells": [
        "test",
        "test",
        "nihilentautomation@gmail.com",
        "FHA762OIW"
      ],
      "line": 16,
      "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-access;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 712500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User log out to verify invite user flow",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log out from the application",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 10331765000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User invites existing user with new aircraft access",
  "description": "",
  "id": "manage-additional-users;user-invites-existing-user-with-new-aircraft-access;;2",
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
  "name": "User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User submit details of additional user firstname test ,lastname test,emailnihilentautomation@gmail.com,airctaftFHA762OIW",
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
      "line": 12,
      "value": "#Then User verifies user is succesfully invited[Email Verification]"
    }
  ],
  "line": 13,
  "name": "Invited user nihilentautomation@gmail.com is present under list of invited users for Aircraft FHA762OIW",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentqa15@gmail.com",
      "offset": 53
    },
    {
      "val": "cirrus12",
      "offset": 86
    }
  ],
  "location": "Login.userIsLoggedIn(String,String)"
});
formatter.result({
  "duration": 94025586000,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 444299400,
  "status": "passed"
});
formatter.match({
  "location": "InviteUsers.userisOnManageUSerPage()"
});
formatter.result({
  "duration": 44264126400,
  "status": "passed"
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
      "val": "nihilentautomation@gmail.com",
      "offset": 74
    },
    {
      "val": "FHA762OIW",
      "offset": 111
    }
  ],
  "location": "InviteUsers.submitAdditionalUserDetails(String,String,String,String)"
});
formatter.result({
  "duration": 80300192500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentautomation@gmail.com",
      "offset": 13
    },
    {
      "val": "FHA762OIW",
      "offset": 94
    }
  ],
  "location": "InviteUsers.verfyUserIsList(String,String)"
});
formatter.result({
  "duration": 66505931200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "User verifies user got an access to invited aircraft",
  "description": "",
  "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User has access to \u003cAircraft tail Number\u003e aircraft",
  "keyword": "When "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft;",
  "rows": [
    {
      "cells": [
        "Aircraft tail Number"
      ],
      "line": 24,
      "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft;;1"
    },
    {
      "cells": [
        "FHA762OIW"
      ],
      "line": 25,
      "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 268300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User log out to verify invite user flow",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log out from the application",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 11935648400,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User verifies user got an access to invited aircraft",
  "description": "",
  "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User has access to FHA762OIW aircraft",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentautomation@gmail.com",
      "offset": 53
    },
    {
      "val": "cirrus001",
      "offset": 92
    }
  ],
  "location": "Login.userIsLoggedIn(String,String)"
});
formatter.result({
  "duration": 93924855300,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 275067100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FHA762OIW",
      "offset": 19
    }
  ],
  "location": "Dashboard.checkAccessToAircraft(String)"
});
formatter.result({
  "duration": 1856648400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "User deletes invited user for given aircraft",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User deletes invited user \u003cEmail\u003e access for aircarft \u003cAircraftTailNumber\u003e",
  "keyword": "When "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;",
  "rows": [
    {
      "cells": [
        "Email",
        "AircraftTailNumber"
      ],
      "line": 35,
      "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;1"
    },
    {
      "cells": [
        "nihilentautomation@gmail.com",
        "FHA762OIW"
      ],
      "line": 36,
      "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 487100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User log out to verify invite user flow",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log out from the application",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 9655016800,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User deletes invited user for given aircraft",
  "description": "",
  "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User is already logged in to application by username nihilentqa15@gmail.com ,Password cirrus12",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User is on Manage users screen",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "User deletes invited user nihilentautomation@gmail.com access for aircarft FHA762OIW",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentqa15@gmail.com",
      "offset": 53
    },
    {
      "val": "cirrus12",
      "offset": 86
    }
  ],
  "location": "Login.userIsLoggedIn(String,String)"
});
formatter.result({
  "duration": 92645212200,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 619825500,
  "status": "passed"
});
formatter.match({
  "location": "InviteUsers.userisOnManageUSerPage()"
});
formatter.result({
  "duration": 44423996000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentautomation@gmail.com",
      "offset": 26
    },
    {
      "val": "FHA762OIW",
      "offset": 75
    }
  ],
  "location": "InviteUsers.deleteUserFromList(String,String)"
});
formatter.result({
  "duration": 120017587000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 39,
  "name": "User verifies access is removed for invited aircraft",
  "description": "",
  "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 38,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 42,
      "value": "#When User has not access to \u003cAircraft tail Number\u003e aircraft"
    }
  ],
  "line": 43,
  "name": "",
  "description": "",
  "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft;",
  "rows": [
    {
      "cells": [
        "Aircraft tail Number"
      ],
      "line": 44,
      "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft;;1"
    },
    {
      "cells": [
        "FHA762OIW"
      ],
      "line": 45,
      "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 248700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User log out to verify invite user flow",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User log out from the application",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 10807432100,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User verifies access is removed for invited aircraft",
  "description": "",
  "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 38,
      "name": "@Inviteuser"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User is already logged in to application by username nihilentautomation@gmail.com ,Password cirrus001",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User is on My Hangar screen",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentautomation@gmail.com",
      "offset": 53
    },
    {
      "val": "cirrus001",
      "offset": 92
    }
  ],
  "location": "Login.userIsLoggedIn(String,String)"
});
formatter.result({
  "duration": 93047257400,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 198337300,
  "status": "passed"
});
});