@us_11
Feature:US_011 Date should be created on the time of account creation
  Background: Go to Manager New Customer Page, then click Create a New Customer
    Given user on the application page
    And click login button
    And manager enters username
    And manager enters password
    And click sign in button
    And click My Operations
    And click Manage Customers
    And click Create a new Customer

    Scenario: The date cannot be typed earlier, in the past, just at the time of creation a customer
      And clicks on the Create DateTextbox and type the "creation_date"
      Then Verify that Create Date is created successfully
      Then closes browser

    Scenario: TC_001-1 The date cannot be typed earlier, in the past, at the time of creation an account
      And clicks on the Create Datetextbox and type the "account_creation_date"
      And clicks on the Closed Datetextbox and type the "account_closed_date_before" before than the time of account creation
      Then Verify that Create Date and Closed Date not created successfully
      Then closes browser

    Scenario: TC_002-1 The date should be created as month, day, year, hour and minute
      And user clicks on My Operations
      And user clicks on Manage Accounts
      And clicks on +Create a new Account
      And clicks on the Create Date textbox and type date as month,day,year,hour and minute "18.08.2021 16:00"
      Then Then Verify that the date created succesfully
      Then closes browser

    Scenario: TC_002-2 The date should be created as month, day, year, hour and minute
      And user clicks on My Operations
      And user clicks on Manage Accounts
      And clicks on +Create a new Account
      And clicks on the Create Date textbox and type date as month,day,year "18.08.2021"
      Then Verify that the date not created succesfully
      Then closes browser


  Rule: User reachs to Manage Customer Page
    Background: Given user goes to application landing page and logs in with employee_account and lands on Create New Customer Page
      Given user goes to application landing page
      And user login with "employee" account
      And user clicks on My Operations
      And user clicks on Manage Customers
      And clicks on +Create a new Customer

    Scenario:TC_003 User can choose a user from the registration and it cannot be blank
      And enters a valid SSN "654-96-7412" and clicks on Search button
      Then verifies user information is displayed
      Then closes browser

    Scenario Outline:TC_004 User can select Zelle Enrolled optionally and save it
      And user selects Zelle Enrolled option checkbox "<checkbox>"
      And user clicks on Save button
      Then user verifies no error messge displayed since this section is optional
      Then closes browser

      Examples:
        | checkbox |
        | true     |
        | false    |