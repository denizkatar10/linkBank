@Registration
Feature: System should allow any user to register with valid credentials validating the success message
  Background: User is on the application home page
    Given user click the user icon
    Then user click the register


    @TC004_firstName_invalid
    Scenario Outline: enter first name "<firstname>"
      Given click firstNameTextBox
      And enter first name "<firstname>"
      Then verify system does not accept invalid "<firstname>"
      Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |234-13-2347|Mary49       |Crox       |123 Meadow St|219-456-7794   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |

    @TC006_lastName_invalid
    Scenario Outline: enter last name "<lastname>"
      Given click lastNameTextBox
      And enter last name "<lastname>"
      Then verify system does not accept invalid "<lastname>"
      Examples:
      |SSN Number |firstname  |lastname   |address      |phone          |username     |email                |password   |password confirmation|
      |434-13-2347|Mary49       |Crox       |123 Meadow St|219-456-7799   |marycrox     |marycrox@gmail.com   |Marycrox.  |Marycrox.            |

