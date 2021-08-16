@new_customer_search
  Feature: User can search for a new applicant by their SSN and see all their registration info populated
    Scenario: TC01_manager_should_search_new_applicant_information_with_their_ssn
      Given user on the application page
      And click login button
      And manager enters username
      And manager enters password
      And click sign in button
      And click My Operations
      And click Manage Customers
      And click Create a new Customer
      And write a customer SSN
      And click Search button
      Then check green success popup

