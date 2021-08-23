@user_settings
  Feature: User info segment (user settings) should be editable on Homepage
    Background: There should be user info being populated when navigating to user info "firstname, lastname, email and language"
      Given user on the home page
      Then click account dropdown
      Given user on the signin  page
      Given customer enters username
      Given customer enters password
      Given click sign in
      And click user dropdown
      And customer click user info

    @user_info_populated
    Scenario Outline:
      Then customer sees user settings page populated with info "<firstName>", "<lastName>", "<email>" and "<language>"
      Examples:
        |firstName|lastName|email|language|
        |Deniz|Csutomer|admin3@gmail.com|English|


    @language_options
    Scenario: There should be 2 languages available "English and Turkish"
      Given customer clicks language textbox
      And customer sees English option
      And customer sees Turkish options
      Then customer selects Turkish language
      And customer clicks Save button
      Then customer sees settings saved message

      @firstNameEditable
    Scenario Outline: There should be an option to update firstname
      Given customer clicks firstName textbox, clears it, and types another "<firstName>"
      And customer clicks Save button
      Then customer sees settings saved message
        Examples:
        |firstName|
        |Mary    |

    @lastNameEditable
    Scenario Outline: There should be an option to update lastname
      Given customer clicks lastName textbox, clears it, and types another "<lastName>"
      And customer clicks Save button
      Then customer sees settings saved message
      Examples:
        | lastName |
        | Bernar   |

      @emailEditable
    Scenario Outline: There should be an option to update email id adding "@" sign and "." extension
      Given customer clicks email textbox, clears it, and types another "<email>"
      And customer clicks Save button
      Then customer sees settings saved message
        Examples:
        |email|
        |aorazym@gmail.com|