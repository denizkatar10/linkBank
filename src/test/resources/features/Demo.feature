Feature: Demo presentation
  Scenario: user does every step to transfer money
    Given user on the application page
    And user click the register
    And user enters ssn number as  "demo_ssn"
    And user enters firstname as "firstname"
    And user enters lastname as "lastname"
    And user provides address as "address"
    And user provides mobilephone as "mobilephone"
    And user provides a username as "demo_username"
    And user provides email id as "email"
    And user enter the password as "demo_password"
    And user confirms the new password "demo_password"
    When user clicks on register button
    Given Kullanici gmibank anasayfaya gider
    And kullanici insan figurune tiklar
    And kullanici sign_in sekmesine tiklar
    And kullanici gecerli username girer
    And kullanici gecerli password girer
    And sign_in ile giris yapar
    And Administration bolumune tiklar
    And userManagementa tiklar
    And admin activates the customer
    And user logs out
    Given Kullanici gmibank anasayfaya gider
    And Giris simgesine tiklar
    And Gecerli username ve password girer
    And Sign in butonuna tiklar
    And employee creates two new accounts
    And click My Operations
    And click Manage Customers
    And click Create a new Customer
    And write a customer SSN
    And click Search button
    And  user fills the required areas
    And user logs out
    And customer signs in
    And click My Operations
    And click Transfer Money
    Given user selects the first account as From dropdown
    And user selects the second account as To dropdown
    And user clicks on Balance textbox and enters "40" dollars and press tab
    And user enters "56" cents
    And user provides description as "Money Transfer"
    And user clicks Make Transfer button
    Then verify user transfers money validating the message an amount of the transaction


