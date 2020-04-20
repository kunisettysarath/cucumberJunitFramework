$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FirstFeature.feature");
formatter.feature({
  "line": 2,
  "name": "This is a sample test case",
  "description": "",
  "id": "this-is-a-sample-test-case",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@metaTag"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "just chceking in",
  "description": "",
  "id": "this-is-a-sample-test-case;just-chceking-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I want to open the crm website",
  "keyword": "Given "
});
formatter.match({
  "location": "testStep.openWebSite()"
});
