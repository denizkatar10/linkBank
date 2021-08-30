@customer_accounts
Feature: System should allow user to manage their account
  Scenario: TC01_user_should_see_all_account_types_and_balace_populated

    Given user on the home page
    Then click account dropdown
    Given user on the signin  page
    Given customer enters username
    Given customer enters password
    Given click sign in
    And click My Operations
    Then click My Accounts
    Then verify both of the account types
    Then verify both of the account balances


@transactions
Scenario: TC02_user_can_view_transaction

  Given click first view transaction button
  Then verify transaction elements
  Then click second view transaction button
  Then verify transaction elements