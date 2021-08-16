@us_010
  Feature: US_010 Address of customer can be created
    Scenario: Go to Manager New Customer Page
      Given user on the application page
      And click login button
      And manager enters username
      And manager enters password
      And click sign in button
      And click My Operations
      And click Manage Customers
      And click Create a new Customer
  @TC01
    Scenario:TC_01 Address should be provided and cannot be blank
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
