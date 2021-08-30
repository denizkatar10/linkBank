Feature: End to End
  Scenario: Registration
    Given user on the application page
    And user click the register

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
#        |614-34-2366|Martt|Croxx|123 Meadow St, Cary, NC 27513-7896|909-456-7799|marycrox..|marycroxx@gmail.com|Marycrox..|Marycrox..|Registration saved!|
#        |624-34-2345|Mary|Crox|123 Meadow St, Cary, NC 27513|+1(239-456-7799)|marycrox.|marycrox@gmail.com|Marycrox.|Marycrox.|Registration saved!|

