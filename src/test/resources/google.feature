Feature: Google search
  As a web surfer, I want to search google, so I can learn new things

  Background:
    Given a web browser is opened in google home page


  Scenario Outline:
    When the search phrase "<searching item>" is entered
    Then results for "<searching item>" are shown


    Examples:
      | searching item |
      | book           |
      | computer       |
      | selenium       |