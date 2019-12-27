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
  "duration": 39242697800,
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
  "duration": 1854199000,
  "status": "passed"
});
formatter.match({
  "location": "Login.userSubmitDetails()"
});
formatter.result({
  "duration": 841016200,
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
  "duration": 62148021400,
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
        "testa2@gmail.com",
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
  "duration": 821846700,
  "status": "passed"
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
  "name": "User submit details of additional user firstname test ,lastname test,emailtesta2@gmail.com,airctaftN105PG",
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
  "name": "Invited user testa2@gmail.com is present under list of invited users for Aircraft N105PG",
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
  "duration": 11764853000,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not proxy command to remote server. Original error: Error: connect ECONNREFUSED 127.0.0.1:8203\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NLPULTP4603920\u0027, ip: \u0027192.168.43.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\aarti.kulkarni\\ecl..., appPackage: com.cirrusaircraft.connecte..., databaseEnabled: false, desired: {app: C:\\Users\\aarti.kulkarni\\ecl..., deviceName: Android Device, platformName: android}, deviceApiLevel: 26, deviceManufacturer: samsung, deviceModel: SM-G930F, deviceName: ce061606e4d9ce3e02, deviceScreenDensity: 480, deviceScreenSize: 1080x1920, deviceUDID: ce061606e4d9ce3e02, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3, platform: LINUX, platformName: Android, platformVersion: 8.0.0, statBarHeight: 72, takesScreenshot: true, viewportRect: {height: 1848, left: 0, top: 72, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 3ecee1bd-8919-4a17-8dd7-1758897ddcc0\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.ImageView[@resource-id\u003d\u0027com.cirrusaircraft.connectedapp.uat:id/bottom_sheet_hamburger\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat TestBase.TestBase.findMobileElement(TestBase.java:117)\r\n\tat stepDefinition.InviteUsers.navigateToInviteUserScreen(InviteUsers.java:46)\r\n\tat stepDefinition.InviteUsers.userisOnManageUSerPage(InviteUsers.java:154)\r\n\tat ✽.Given User is on Manage users screen(Manage_additional_users.feature:8)\r\n",
  "status": "failed"
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
      "val": "testa2@gmail.com",
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
      "val": "testa2@gmail.com",
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