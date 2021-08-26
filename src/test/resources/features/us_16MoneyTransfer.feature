@us16MoneyTransfer
Feature: Money transfer should be available

  Background:
    Given user on the home page
    And click login button
    And customer enters username
    And customer enters password
    And click sign in
    And click My Operations
    And click Transfer Money

  @TC01
  Scenario: customer makes a Money Transfer validating success message
    Given user selects the first account as From dropdown
#    And user selects the second account as To dropdown
#    And user clicks on Balance textbox and enters "4651" dollars and press tab
#    And user enters "56" cents
#    And user provides description as "Money Transfer"
#    And user clicks Make Transfer button
#    Then verify user transfers money validating the message an amount of the transaction
#    Then closes browser

  @TC02
  Scenario: User should have at least 2 accounts or more to make money transfer with own and others
    Given click From dropdown
    Then verify that user has at least two accounts or more to make money transfer with own and others

  @TC03
  Scenario: All fields should be required
    Given user clicks Make Transfer button
    Then user sees that all fields should be filled validating error messages





