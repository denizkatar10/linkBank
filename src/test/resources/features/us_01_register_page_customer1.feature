
@Registration
Feature: System should allow any user to register with valid credentials validating the success message
  Background: User is on the application home page
    Given user click the user icon
    Then user click the register

    @TC001_SSN_Valid
    Scenario Outline: User enter SSN number
      Given click ssnTextBox
      And enter ssn number "<SSN Number>"
      And enter first name "<firstname>"
      And enter last name "<lastname>"
      And enter address "<address>"
      And enter Phone number "<phone>"
      And enter username "<username>"
      And enter email "<email>"
      And enter new password "<password>"
      And enter password confirmation "<password confirmation>"

      Then verify user enter "<SSN Number>" successfully
      Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |234-34-2345|Mary       |Crox       |123 Meadow St|919-456-7799   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |


  @TC002_SSN_invalid
  Scenario Outline: User enter SSN number
    Given click ssnTextBox
    And enter ssn number "<SSN Number>"
    Then verify system does not accept invalid "<SSN Number>"
      Examples:
        |SSN Number |firstname  |lastname   |address      |phone          |username     |email                    |password   |password confirmation|
        |234452345  |Mary       |Crox       |123 Meadow St|919-456-7791   |marycroxx    |marycroxx@gmail.com      |Marycrox.  |Marycrox.            |
        |scd-as-asss|Mary       |Crox       |123 Meadow St|919-456-7792   |marycroxxx   |marycroxxx@gmail.com     |Marycrox.  |Marycrox.            |
        |000-23-8765|Mary       |Crox       |123 Meadow St|919-456-7793   |marycroxxxx  |marycroxxxx@gmail.com    |Marycrox.  |Marycrox.            |
        |999-34-4563|Mary       |Crox       |123 Meadow St|919-456-7794   |marycroxxxxx |marycroxxxxx@gmail.com   |Marycrox.  |Marycrox.            |


  @TC003_firstName_Valid
  Scenario Outline: enter first name "<firstname>"
    Given click firstNameTextBox
    And enter first name "<firstname>"
    Then verify user enter "<firstname>" successfully
    Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |234-03-2347|Mary       |Crox       |123 Meadow St|119-456-7793   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |


  @TC004_lastName_Valid
  Scenario Outline: enter last name "<lastname>"
    Given click lastNameTextBox
    And enter first name "<firstname>"
    Then verify user enter "<firstname>" successfully
    Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |334-03-2347|Mary       |Crox       |123 Meadow St|119-456-7799   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |


  @TC004_address_Valid
  Scenario Outline: enter address "<address>"
    Given click addressTextBox
    And enter address "<address>"
    Then verify user enter "<address>" successfully
    Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |434-03-2347|Mary       |Crox       |123 Meadow St|219-456-7799   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |

  @TC005_phone_number_Valid
  Scenario Outline: enter Phone number "<phone>"
    Given click mobilephoneTextBox
    And enter Phone number "<phone>"
    Then verify user enter "<phone>" successfully
    Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |434-03-2347|Mary       |Crox       |123 Meadow St|219-456-7799   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |


