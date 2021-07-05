$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/google.feature");
formatter.feature({
  "name": "Google search",
  "description": "  As a web surfer, I want to search google, so I can learn new things",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "\u003csearching item\u003e",
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
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:15)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "book",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"book\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:16)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"book\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:17)"
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
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:15)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "computer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"computer\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:16)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"computer\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:17)"
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
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:15)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "selenium",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the search phrase \"selenium\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:16)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"selenium\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:17)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/wikipedia.feature");
formatter.feature({
  "name": "Wikipedia search",
  "description": "  For a web surfer I want to search in wikipedia",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a web browser is opened in wikipedia home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the search phrase \"\u003cstring\u003e\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:16)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});