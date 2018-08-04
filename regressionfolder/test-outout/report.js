$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AAMFoundation/eclipse-workspace/regressionfolder/src/test/java/Features/Login.Feature");
formatter.feature({
  "line": 1,
  "name": "login and product search",
  "description": "",
  "id": "login-and-product-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Product search and add to cart",
  "description": "",
  "id": "login-and-product-search;product-search-and-add-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Hover on men",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on shorts",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on any cloth name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "select the size",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on Add to Bag button",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-and-product-search;product-search-and-add-to-cart;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-and-product-search;product-search-and-add-to-cart;;1"
    },
    {
      "cells": [
        "peter.doran@yopmail.com",
        "Tester@123"
      ],
      "line": 18,
      "id": "login-and-product-search;product-search-and-add-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Product search and add to cart",
  "description": "",
  "id": "login-and-product-search;product-search-and-add-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter \"peter.doran@yopmail.com\" and \"Tester@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Hover on men",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on shorts",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on any cloth name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "select the size",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 32272427920,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefination.click_on_login_link()"
});
formatter.result({
  "duration": 3826375908,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "peter.doran@yopmail.com",
      "offset": 7
    },
    {
      "val": "Tester@123",
      "offset": 37
    }
  ],
  "location": "RegistrationStepDefination.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 1422313660,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 5003019239,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefination.LoginStepDefination.click_on_login_button(LoginStepDefination.java:45)\r\n\tat ✽.And click on login button(C:/Users/AAMFoundation/eclipse-workspace/regressionfolder/src/test/java/Features/Login.Feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.hover_on_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.click_on_shorts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.click_on_any_cloth_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.select_the_size()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.click_on_add_to_bag_button()"
});
formatter.result({
  "status": "skipped"
});
});