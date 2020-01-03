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
  "duration": 31685386900,
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
  "duration": 1822582000,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "duration": 1221129800,
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
  "duration": 61907958200,
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
        "N105PG"
      ],
      "line": 25,
      "id": "manage-additional-users;user-verifies-user-got-an-access-to-invited-aircraft;;2"
    }
  ],
  "keyword": "Examples"
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
  "duration": 10849497200,
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
  "name": "User has access to N105PG aircraft",
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
  "duration": 64112392200,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 375458300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N105PG",
      "offset": 19
    }
  ],
  "location": "Dashboard.checkAccessToAircraft(String)"
});
formatter.result({
  "duration": 2325115200,
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
  "name": "User is already logged in to application by username conaircraftnhltestuser1@gmail.com ,Password cirrus005",
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
        "N105PG"
      ],
      "line": 36,
      "id": "manage-additional-users;user-deletes-invited-user-for-given-aircraft;;2"
    }
  ],
  "keyword": "Examples"
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
  "duration": 14534152800,
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
  "name": "User is already logged in to application by username conaircraftnhltestuser1@gmail.com ,Password cirrus005",
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
  "name": "User deletes invited user nihilentautomation@gmail.com access for aircarft N105PG",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
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
  "duration": 63564872600,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 481730000,
  "status": "passed"
});
formatter.match({
  "location": "InviteUsers.userisOnManageUSerPage()"
});
formatter.result({
  "duration": 44897186300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nihilentautomation@gmail.com",
      "offset": 26
    },
    {
      "val": "N105PG",
      "offset": 75
    }
  ],
  "location": "InviteUsers.deleteUserFromList(String,String)"
});
formatter.result({
  "duration": 122096354700,
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
        "N105PG"
      ],
      "line": 45,
      "id": "manage-additional-users;user-verifies-access-is-removed-for-invited-aircraft;;2"
    }
  ],
  "keyword": "Examples"
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
  "duration": 30444495900,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NLPULTP4603920\u0027, ip: \u0027172.16.6.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\aarti.kulkarni\\ecl..., appPackage: com.cirrusaircraft.connecte..., automationName: UiAutomator2, databaseEnabled: false, desired: {app: C:\\Users\\aarti.kulkarni\\ecl..., automationName: UiAutomator2, deviceName: Android Device, disableWindowAnimation: true, platformName: android, waitForIdleTimeout: 2000}, deviceApiLevel: 26, deviceManufacturer: samsung, deviceModel: SM-G930F, deviceName: ce061606e4d9ce3e02, deviceScreenDensity: 480, deviceScreenSize: 1080x1920, deviceUDID: ce061606e4d9ce3e02, disableWindowAnimation: true, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3, platform: LINUX, platformName: Android, platformVersion: 8.0.0, statBarHeight: 72, takesScreenshot: true, viewportRect: {height: 1848, left: 0, top: 72, width: 1080}, waitForIdleTimeout: 2000, warnings: {}, webStorageEnabled: false}\nSession ID: 1954be24-28f0-4886-9779-a9e18e0cd96e\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.ImageView[@resource-id\u003d\u0027com.cirrusaircraft.connectedapp.uat:id/bottom_sheet_hamburger\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat TestBase.TestBase.findMobileElement(TestBase.java:121)\r\n\tat stepDefinition.Dashboard.logout(Dashboard.java:79)\r\n\tat ✽.When User log out from the application(Manage_additional_users.feature:4)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "status": "skipped"
});
});