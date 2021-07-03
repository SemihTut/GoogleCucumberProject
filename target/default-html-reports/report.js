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
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:26)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.GoogleSearchStep.lambda$new$0(GoogleSearchStep.java:27)\r\n\tat ✽.a web browser is opened in google home page(file:///D:/WikipediaCucumberJVM/src/test/resources/google.feature:5)\r\n",
  "status": "failed"
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
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:30)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "results for \"book\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleSearchStep.\u003cinit\u003e(GoogleSearchStep.java:33)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});