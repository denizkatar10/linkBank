@LoginCredential
  Feature: Login Page should or should not be accessible with credentials
    Background:
      Given user on the application page
      And click login button




    @TC02_cancel_option
    Scenario: There should be an option to cancel login
      Given cancel button is there

    @TC03_invalid_username
    Scenario: User cannot login with invalid username validating the error message
      Given customer enters random user name
      And customer enters password
      And click sign in button
      And error message as Failed to sign in

    @TC04_invalid_password
    Scenario: User cannot login with invalid password validating the error message
      Given customer enters username
      And customer enters random password
      And click sign in button
      And error message as Failed to sign in

    @TC05_invalid_username_and_password
    Scenario: User cannot login with invalid username and password validating the error message
      Given customer enters random user name
      And customer enters random password
      And click sign in button
      And error message as Failed to sign in

    @TC06_reset_password_option
    Scenario: User with invalid credentials should be given an option to reset their password
      Given did you for get your password is a option

    @TC07_registration_page_link
    Scenario: User should be given the option to navigate to registration page if they did not register yet
      Given register a new account link is a option

    @TC01_valid_credential
    Scenario: Login page should accessible with valid credentials
      Given customer enters username
      And customer enters password
      And click sign in button
      And check customer name is showing on the top corner
