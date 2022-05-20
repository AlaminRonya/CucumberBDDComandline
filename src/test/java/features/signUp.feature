Feature: test signup functionality
  Background: Check signup background
    Given Click on Sign up
  Scenario Outline: Check signup page is successfully with valid credentials
    And Fill up <Email> id, Full <name>, <password>
    Then Click Continue
    #asdfHp007
  Examples:
    |Email| name| password|
    |hprony12@gmail.com| hp| asdfHp007|
    |abc@gmail.com| abc| asdfHp007|

  Scenario: Check signup page is successfully with valid credentials
    Then Click fb