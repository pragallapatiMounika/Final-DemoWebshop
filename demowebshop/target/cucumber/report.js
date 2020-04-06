$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoshop.feature");
formatter.feature({
  "line": 2,
  "name": "Login for demoWebShop",
  "description": "I want to use this template for my feature files",
  "id": "login-for-demowebshop",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 40,
  "name": "Selecting the desired book",
  "description": "",
  "id": "login-for-demowebshop;selecting-the-desired-book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "User Is On My LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "User Fillup uid \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User Fillup pwd \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User click LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User clicks the books",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click Computing",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Click CompareList",
  "keyword": "Then "
});
formatter.match({
  "location": "books_stepdef.user_is_on_my_loginpage()"
});
formatter.result({
  "duration": 34238269678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " \u003cusername\u003e",
      "offset": 15
    }
  ],
  "location": "books_stepdef.user_fillup_uid(String)"
});
formatter.result({
  "duration": 3482317698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " \u003cpassword\u003e",
      "offset": 15
    }
  ],
  "location": "books_stepdef.user_fillup_pwd(String)"
});
formatter.result({
  "duration": 312830027,
  "status": "passed"
});
formatter.match({
  "location": "books_stepdef.user_click_loginbutton()"
});
formatter.result({
  "duration": 11352053129,
  "status": "passed"
});
formatter.match({
  "location": "books_stepdef.user_clicks_the_books()"
});
formatter.result({
  "duration": 2746544946,
  "status": "passed"
});
formatter.match({
  "location": "books_stepdef.click_computing()"
});
formatter.result({
  "duration": 9182992242,
  "status": "passed"
});
formatter.match({
  "location": "books_stepdef.click_comparelist()"
});
formatter.result({
  "duration": 2728700035,
  "status": "passed"
});
});