@Registration
  @Regression
  Feature: Register new user
    Background: User is on the application home page and tries to register as a new user
      Given user on the application page
      Then user click the register

  @TC0101_RegisterNewUserUI
    @smokeTest
   Scenario Outline: Register new users for LINN Bank (positive scenario)
      Given user on the application page
      And user click the register
      And user enters ssn number as  "<SSN>"
      And user enters firstname as "<firstname>"
      And user enters lastname as "<lastname>"
      And user provides address as "<address>"
      And user provides mobilephone as "<mobilephone>"
      And user provides a username as "<username>"
      And user provides email id as "<email>"
      And user enter the password as "<firstpassword>"
      And user confirms the new password "<secondpassword>"
      When user clicks on register button
      Then user sees the success message as "<message>"
      Examples:
        |SSN|firstname|lastname|address|mobilephone|username|email|firstpassword|secondpassword|message|
        |294-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513|919-456-7799|marycrox|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|
        |514-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513-7896|909-456-7799|marycrox.|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|
        |524-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513|+1(239-456-7799)|marycrox.|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|


  @TC0102_SSN_invalid
  Scenario Outline: user enters invalid SSN number
    Given user clicks ssnTextBox
    And user enters ssn number as  "<SSN>"
    When user clicks registerTitle
    Then user sees error message as "<ssnInvalid>" ssnInvalid
    Examples:
      |SSN|ssnInvalid|
      |234342345|Your SSN is invalid|
      |scd-as-asss|Your SSN is invalid|
      |000-23-8765|Your SSN is invalid|
      |999-34-4563|Your SSN is invalid|
      |999-34-45\\|Your SSN is invalid|

  @TC0103_firstName_invalid
  Scenario Outline: user enters invalid firstname
    Given user clicks firstNameTextBox
    And user enters firstname as "<firstname>"
    When user clicks registerTitle
    Then user sees error message as "<FirstNameInvalid>" FirstNameInvalid
    Examples:
      |firstname|FirstNameInvalid|
      |Mary123|Your First Name is invalid|

  @TC0104_lastName_invalid
  Scenario Outline: user enters invalid lastname
    Given user clicks lastNameTextBox
    And user enters lastname as "<lastname>"
    When user clicks registerTitle
    Then user sees error message as "<LastNameInvalid>" LastNameInvalid
    Examples:
      |lastname|LastNameInvalid|
      |Smith123|Your Last Name is invalid|

  @TC0105_address_invalid
  Scenario Outline: user provides invalid address
    Given user clicks addressTextBox
      And user provides address as "<address>"
    When user clicks registerTitle
      Then user sees error message as "<addressInvalid>" addressInvalid
      Examples:
        |address|addressInvalid|
        |123 Meadow St, Cary, NC|Your Address is invalid|
        |123 Meadow St, Cary, NC 442405555|Your Address is invalid|
        |123 Meadow St, Cary, NC abc|Your Address is invalid|

  @TC1006_mobilephone_invalid
    Scenario Outline: user provides invalid mobilephone
      Given user clicks mobilephoneTextBox
    When user provides mobilephone as "<mobilephone>"
      Then user sees error message as "<mobilephoneInvalid>" mobilephoneInvalid
      Examples:
      |mobilephone|mobilephoneInvalid|
      |2194567799|Your mobile phone number is invalid|
      |hfkgkhj|Your mobile phone number is invalid|
      |hfkgkhj\/.|Your mobile phone number is invalid|

  @TC0107_username_invalid
  Scenario Outline: user enters invalid username
    Given user clicks usernameTextBox
      And user provides a username as "<username>"
    When user clicks registerTitle
      Then user sees error message as "<usernameInvalid>" usernameInvalid
      Examples:
      |username|usernameInvalid|
      |123|Your username is invalid|
      |smith456/|Your username is invalid|

  @TC0108_email_invalid
  Scenario Outline: user enters invalid email id
    Given user clicks emailTextBox
      And user provides email id as "<email>"
    When user clicks registerTitle
      Then user sees error message as "<emailInvalid>" emailInvalid
      Examples:
      |email|emailInvalid|
      |smith@gmail|This field is invalid|
      |smithgmail.com|This field is invalid|

  @TC0109_email_at_least_5_char
  Scenario Outline: user enters email id that is less than five characters
    Given user clicks emailTextBox
      And user provides email id as "<email>"
    When user clicks registerTitle
      Then user sees error message as "<emailAtLeastFiveChar>" emailAtLeastFiveChar
      Examples:
      |email|emailAtLeastFiveChar|
      |yfj|Your email is required to be at least 5 characters.|

    @TC0201_all_fields_are_required
      Scenario Outline: user leaves all fields empty
      Given user clicks ssnTextBox and press enter
      Then user sees error message as ssnEmpty
      Then user sees error message as firstNameEmpty
      Then user sees error message as lastNameEmpty
      Then user sees error message as addressEmpty
      Then user sees error message as mobilephoneEmpty
      Then user sees error message as usernameEmpty
      Then user sees error message as emailEmpty
      Then user sees error message as firstPassword
      Then user sees error message as secondPassword
      Examples:

#
#  @TC0201_SSN_empty
#  Scenario Outline: user leaves SSN number empty
#    Given user clicks ssnTextBox
#    When user clicks registerTitle
#      Then user sees error message as "<ssnEmpty>" ssnEmpty
#      Examples:
#      |ssnEmpty|
#      |translation-not-found[Your SSN is required]|
#
#  @TC0202_firstname_empty
#  Scenario Outline: user leaves firstname empty
#    Given user clicks firstNameTextBox
#    When user clicks registerTitle
#      Then user sees error message as "<firstNameEmpty>" firstNameEmpty
#      Examples:
#      |firstNameEmpty|
#      |Your First Name is required|
#
#  @TC0203_lastname_empty
#  Scenario Outline: user leaves lastname empty
#    Given user clicks lastNameTextBox
#    When user clicks registerTitle
#    Then user sees error message as "<lastNameEmpty>" lastNameEmpty
#    Examples:
#      |lastNameEmpty|
#      |Your Last Name is required|
#@regression
#  @TC0204_address_empty
#  Scenario Outline: user leaves address empty
#    Given user clicks addressTextBox
#    When user clicks registerTitle
#    Then user sees error message as "<addressEmpty>" addressEmpty
#    Examples:
#      |addressEmpty|
#      |Your Address is required|
#
#  @TC0205_mobilephone_empty
#  Scenario Outline: user leaves mobilephone empty
#    Given user clicks mobilephoneTextBox
#    When user clicks registerTitle
#    Then user sees error message as "<mobilephoneEmpty>" mobilephoneEmpty
#    Examples:
#      |mobilephoneEmpty|
#      |Your Mobile Phone Number is required|
#
#  @TC0206_username_empty
#  Scenario Outline: user leaves username empty
#    Given user clicks usernameTextBox
#    When user clicks registerTitle
#    Then user sees error message as "<usernameEmpty>" usernameEmpty
#    Examples:
#      |usernameEmpty|
#      |Your username is required|
#
#  @TC0207_email_empty
#  Scenario Outline: user leaves email empty
#    Given user clicks emailTextBox
#    When user clicks registerTitle
#    Then user sees error message as "<emailEmpty>" emailEmpty
#    Examples:
#      |emailEmpty|
#      |Your email is required|

  @TC0208_RegisterErrorUI
  Scenario Outline: System should not allow anyone to register with invalid credentials
    Given user enters ssn number as  "<SSN>"
    And user enters firstname as "<firstname>"
    And user enters lastname as "<lastname>"
    And user provides address as "<address>"
    And user provides mobilephone as "<mobilephone>"
    And user provides a username as "<username>"
    And user provides email id as "<email>"
    And user enter the password as "<firstpassword>"
    And user confirms the new password "<secondpassword>"
    When user clicks on register button
    Then user sees the error message as "<errorMessage>" errorMessage_ssnExists
    Examples:
      |SSN|firstname|lastname|address|mobilephone|username|email|firstpassword|secondpassword|errorMessage|
      |156-45-7898|Mary|Crox|123 Meadow St, Cary, NC 27513|919-456-7799|marycrox|marycrox@gmail.com|Marycrox.|Marycrox.|translation-not-found[error.ssnexists]
