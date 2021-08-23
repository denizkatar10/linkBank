@CustomerApi
  Feature: All customer info should be verified with API


    Background: set customer info to accurate response
      Given user sets all customer info to response "https://www.gmibank.com/api/tp-customers?size=2000"


      Scenario: Get all Api data and validate data
        Given Deserialize all customer info to Java
        And All customer info should be saved to correspondent files
        Then validate customers info


