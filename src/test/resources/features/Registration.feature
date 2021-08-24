@Registration
  Feature: Register new user
    Background:
      Given user on the application page
      And user click the register
#      And user on the application page
#      And user click the register

    @TC_Successful_Registration
    Scenario Outline: User is on the application home page and tries to register as a new user
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
        | SSN         | firstname | lastname | address                       | mobilephone  | username | email              | firstpassword | secondpassword | message             |
        | 694-34-2345 | Mary      | Crox     | 123 Meadow St, Cary, NC 27513 | 919-456-7799 | marycrox | marycrox@gmail.com | Marycrox.     | Marycrox.      | Registration saved! |
#        |614-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513-7896|909-456-7799|marycrox.|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|
#        |624-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513|+1(239-456-7799)|marycrox.|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|
#
#
  @TC0102_SSN_invalid
  Scenario Outline: user enters invalid SSN number
    Given user clicks ssnTextBox
    When user enters ssn number as  "<SSN>" and presses enter
    Then user sees error message as ssnInvalid
    Examples:
      |SSN|
      |234342345|
      |scd-as-asss|
      |000-23-8765|
      |999-34-4563|
#
##
#  @TC0103_firstName_invalid
#  Scenario Outline: user enters invalid firstname
#    Given user clicks firstNameTextBox
#    When user enters firstname as "<firstname>" and presses enter
#    Then user sees error message as FirstNameInvalid
#    Examples:
#      |firstname|
#      |Mary123|
#
#  @TC0104_lastName_invalid
#  Scenario Outline: user enters invalid lastname
#    Given user clicks lastNameTextBox
#    When user enters lastname as "<lastname>" and presses enter
#    Then user sees error message as LastNameInvalid
#    Examples:
#      |lastname|
#      |Smith123|
#
#  @TC0105_address_invalid
#  Scenario Outline: user provides invalid address
#    Given user clicks addressTextBox
#      When user provides address as "<address>" and presses enter
#      Then user sees error message as addressInvalid
#      Examples:
#        |address|
#        |123 Meadow St, Cary, NC|
#        |123 Meadow St, Cary, NC 442405555|
#        |123 Meadow St, Cary, NC abc|

  @TC1003_mobilephone_invalid
    Scenario Outline: user provides invalid mobilephone
      Given user clicks mobilephoneTextBox
      When user provides mobilephone as "<mobilephone>" and presses enter
      Then user sees error message as  mobilephoneInvalid
      Examples:
      |mobilephone|
      |2194567799|
      |hfkgkhj|
      |hfkgkhj\/.|

  @TC0104_username_invalid
  Scenario Outline: user enters invalid username
    Given user clicks usernameTextBox
      When user provides a username as "<username>" and presses enter
      Then user sees error message as usernameInvalid
      Examples:
      |username|
      |123|
      |smith456/|

  @TC0105_email_invalid
  Scenario Outline: user enters invalid email id
    Given user clicks emailTextBox
      When user provides email id as "<email>" and presses enter
      Then user sees error message as emailInvalid
      Examples:
      |email|
      |smith@gmail|
      |smithgmail.com|

  @TC0109_email_at_least_5_char
  Scenario Outline: user enters email id that is less than five characters
    Given user clicks emailTextBox
      When user provides email id as "<email>" and presses enter
      Then user sees error message as emailAtLeastFiveChar
      Examples:
      |email|
      |yfj|

    @TC0201_ssn_required
    Scenario: user leaves ssn field empty
      Given user enters ssn number as  "<SSN>" and presses enter
      Then user sees error message as ssnEmpty

    @TC0202_firstName_required
    Scenario: user leaves firstName field empty
      Given user enters firstname as "<firstname>" and presses enter
      Then user sees error message as firstNameEmpty

    @TC0203_lastName_required
    Scenario: user leaves lastName field empty
      Given user enters lastname as "<lastname>" and presses enter
      Then user sees error message as lastNameEmpty

    @TC0204_address_required
    Scenario: user leaves address field empty
      Given user provides address as "<address>" and presses enter
      Then user sees error message as addressEmpty

    @TC0205_mobilephone_required
    Scenario: user leaves mobilephone field empty
      Given user provides mobilephone as "<mobilephone>" and presses enter
      Then user sees error message as mobilephoneEmpty

    @TC0206_username_required
    Scenario: user leaves username field empty
      Given user provides a username as "<username>" and presses enter
      Then user sees error message as usernameEmpty

    @TC0207_email_required
    Scenario: user leaves email field empty
      Given user provides email id as "<email>" and presses enter
      Then user sees error message as emailEmpty

    @TC0208_newPassword_required
    Scenario: user leaves firstpassword field empty
      Given user enter the password as "<firstpassword>"
      Then user sees error message as firstPasswordEmpty

    @TC0209_PasswordConfirmation_required
    Scenario: user leaves secondpassword field empty
      Given user confirms the new password "<secondpassword>"
      Then user sees error message as secondPasswordEmpty


    @TC0202_all_fields_are_required
      Scenario: user leaves all fields empty
      Given user clicks ssnTextBox and press enter
      Then user sees error message as "<EmptyErrorMessage>"
#      Examples:
#      |EmptyErrorMessage|
#      |Your SSN is required|
#      |Your First Name is required|
#      |Your Last Name is required |
#      |Your Address is required|
#      |Your Mobile Phone Number is required |
#      |Your username is required. |
#      |Your email is required.    |
#      |Your password is required. |
#      |Your confirmation password is required.|


#      Then user sees error message as ssnEmpty
#      Then user sees error message as firstNameEmpty
#      Then user sees error message as lastNameEmpty
#      Then user sees error message as addressEmpty
#      Then user sees error message as mobilephoneEmpty
#      Then user sees error message as usernameEmpty
#      Then user sees error message as emailEmpty
#      Then user sees error message as firstPassword
#      Then user sees error message as secondPassword


  @PasswordStrength_lowerCases
  Scenario: There should be at least 1 lowercase char for stronger password and see the level chart change accordingly
    Given user enter the password as just lower cases
    Then user sees the level chart change (should be two bars)

    @PasswordStrength_upperCases
    Scenario: There should be at least 1 uppercase char and see the level  chart change accordingly
      Given user enter the password as lower cases plus upper case
      Then user sees the level chart change (should be three bars)

    @PasswordStrength_specialChar
    Scenario: There should be at least 1 special char and see the level bar change accordingly
      Given user enter the password as lower cases plus upper case plus special char
      Then user sees the level chart change (should be four bars)

    @PasswordStrength_digits
    Scenario: There should be at least 1 digit  and see the level  chart change accordingly
      Given user enter the password as lower cases plus upper case plus special char plus digits
      Then user sees the level chart change (should be five bars)

    @PasswordLessThanSevenChar
    Scenario: There should be at least 7 chars for a stronger password
      Given user enter the password as lower cases + upper case + special char + digits (but less than seven char)
      Then user sees the level chart unchanged (should be just one bar)
