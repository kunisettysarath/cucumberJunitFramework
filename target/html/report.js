$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/FIrstFeatureFile.feature");
formatter.feature({
  "line": 1,
  "name": "This is a sample test case",
  "description": "",
  "id": "this-is-a-sample-test-case",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "just chceking in",
  "description": "",
  "id": "this-is-a-sample-test-case;just-chceking-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to open the crm website",
  "keyword": "Given "
});
formatter.match({
  "location": "testStep.openWebSite()"
});
formatter.result({
  "duration": 145451800,
  "status": "passed"
});
formatter.after({
  "duration": 3579200,
  "status": "passed"
});
});