@invalid_email_id
  Feature: System should not allow to make updates with invalid credentials
    Scenario: TC01_email_id_cannot_contain_just_digits_or_chars_without_"@"_sign_or_"."_extension
      Given user on the home page
      Then click account dropdown
      Given user on the signin  page
      Given customer enters username
      Given customer enters password
      Given click sign in
      And click user dropdown
      Then customer click user info
      And click email button
      And user enters email id "<email>"
      Then verify system does not accept invalid email address

      Example:
        |email|
        |abc@gmailcom|
        |abcgmail.com|

  @language_options
Scenario: TC02 There should not be an option of any other language other than English or Turkish
    Given customer clicks language textbox
    Then customer sees English option
    Then customer sees Turkish options
