@managerUI
Feature: Manager searches by ssn, adds address, user, account, and zelle enrollment
  Background: user on the application page
    And click login button
    And manager enters username
    And manager enters password
    And click sign in button
    And click My Operations
    And click Manage Customers
    And click Create a new Customer

    @new_customer_search_by_ssn
  Scenario: TC01_manager_should_search_new_applicant_information_with_their_ssn
    Given write a customer SSN
    And click Search button
    Then check green success popup

  @TC01
  Scenario:Address should be provided and cannot be blank
    Given click save button
    And verify address box require message
    And send a address to address box

  @TC02
  Scenario:TC_02 City should be provided and cannot be blank
    Given click save button
    And verify city box require message
    And send a city name to city box


  @TC03
  Scenario:TC_03 Country should be provided and cannot be blank
    Given select county from dropdown

  @TC_04
  Scenario: TC_04 State should be provided and cannot be blank
    Given send state name to state box