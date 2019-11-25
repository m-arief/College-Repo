$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("rsdioButton.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 4,
  "name": "Echo Website",
  "description": "",
  "id": "echo-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@radio"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Count all Radio button",
  "description": "",
  "id": "echo-website;count-all-radio-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@CountButton"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Launch the Browser and maximize the Window",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the url and validate",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "count all the radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browsr",
  "keyword": "And "
});
formatter.match({
  "location": "countRadioButton.launch_the_Browser_and_maximize_the_Window()"
});
formatter.result({
  "duration": 4364733803,
  "status": "passed"
});
formatter.match({
  "location": "countRadioButton.enter_the_url_and_validate()"
});
formatter.result({
  "duration": 5084997853,
  "status": "passed"
});
formatter.match({
  "location": "countRadioButton.count_all_the_radio_button()"
});
formatter.result({
  "duration": 3060467425,
  "status": "passed"
});
formatter.match({
  "location": "countRadioButton.close_the_browsr()"
});
formatter.result({
  "duration": 373508011,
  "status": "passed"
});
});