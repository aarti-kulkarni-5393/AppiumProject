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
  "duration": 20468398500,
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
  "duration": 77109419100,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyUserIsOnMyHangarScreen()"
});
formatter.result({
  "duration": 497478800,
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
  "duration": 4301389800,
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
  "duration": 50157436800,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.refreshDashboard()"
});
formatter.result({
  "duration": 17422646600,
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
  "duration": 469900,
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
  "duration": 44605930900,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.logout()"
});
formatter.result({
  "duration": 35105107300,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NLPULTP4603920\u0027, ip: \u0027192.168.43.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\aarti.kulkarni\\ecl..., appPackage: com.cirrusaircraft.connecte..., automationName: UiAutomator2, databaseEnabled: false, desired: {app: C:\\Users\\aarti.kulkarni\\ecl..., automationName: UiAutomator2, deviceName: Android Device, disableWindowAnimation: true, platformName: android, waitForIdleTimeout: 2000}, deviceApiLevel: 26, deviceManufacturer: samsung, deviceModel: SM-G930F, deviceName: ce061606e4d9ce3e02, deviceScreenDensity: 480, deviceScreenSize: 1080x1920, deviceUDID: ce061606e4d9ce3e02, disableWindowAnimation: true, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3, platform: LINUX, platformName: Android, platformVersion: 8.0.0, statBarHeight: 72, takesScreenshot: true, viewportRect: {height: 1848, left: 0, top: 72, width: 1080}, waitForIdleTimeout: 2000, warnings: {}, webStorageEnabled: false}\nSession ID: cd1a8970-d965-47d7-a3a5-311af528a65d\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.EditText[@resource-id\u003d\u0027loginPage:loginForm:username\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat TestBase.TestBase.findMobileElement(TestBase.java:119)\r\n\tat stepDefinition.Dashboard.logout(Dashboard.java:99)\r\n\tat ✽.When User log out from the application(Logout.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 504900,
  "status": "passed"
});
});