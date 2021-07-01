$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 2,
  "name": "This feature is to test signin",
  "description": "",
  "id": "this-feature-is-to-test-signin",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am in a signin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionForSampleFeature.i_am_in_a_signin_page()"
});
formatter.result({
  "duration": 2370062600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "This Scenario covers positive signin testing",
  "description": "",
  "id": "this-feature-is-to-test-signin;this-scenario-covers-positive-signin-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Insert valid username in username text box",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Insert valid password in password text box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be in user homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionForSampleFeature.insert_valid_username_in_username_text_box()"
});
formatter.result({
  "duration": 176173700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionForSampleFeature.insert_valid_password_in_password_text_box()"
});
formatter.result({
  "duration": 133401900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionForSampleFeature.click_on_signin_button()"
});
formatter.result({
  "duration": 141681500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionForSampleFeature.user_should_be_in_user_homepage()"
});
formatter.result({
  "duration": 37361100,
  "status": "passed"
});
formatter.after({
  "duration": 363452400,
  "status": "passed"
});
});