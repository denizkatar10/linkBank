@invalid_email_id
  Feature: System should not allow to make updates with invalid credentials
    Scenario: TC01_email_id_cannot_contain_just_digits_or_chars_without_"@"_sign_or_"."_extension
      Given user on the home page
      Then click account dropdown
       Given user on the signin  page
      Given customer enters username
      Given customer enters password
      Given click sign in
      Then click email button
      Then

    //Scenario: TC02_email_id_cannot_contain_just_digits_or_chars_without_"@"_sign_or_"."_extension