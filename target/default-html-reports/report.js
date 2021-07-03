$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/google.feature");
formatter.feature({
  "name": "Google search",
  "description": "  As a web surfer, I want to search google, so I can learn new things",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"\u003csearching item\u003e\" is entered",
  "keyword": "When "
});
formatter.step({
  "name": "results for \"\u003csearching item\u003e\" are shown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "searching item"
      ]
    },
    {
      "cells": [
        "book"
      ]
    },
    {
      "cells": [
        "computer"
      ]
    },
    {
      "cells": [
        "selenium"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is opened in google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:27)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"book\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:31)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"book\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:34)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is opened in google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:27)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"computer\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:31)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"computer\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:34)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is opened in google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:27)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"selenium\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:31)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"selenium\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:34)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});