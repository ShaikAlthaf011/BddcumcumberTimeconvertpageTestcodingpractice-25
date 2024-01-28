Feature: Time Convert Functionalities pageTest Application
  Background:
    Given Navigate to Time Convert Page Test

  Scenario: Convert Time Functionalities Input Hour Field
    When  Verify the convert second button
    Then  Verify the Expected String
    Then  Close the browser

  Scenario:  Convert Time Functionalities Empty minutes Field
    When  Verify the Enter Hour Input Field
    When  Verify the convert second button
    Then  Verify The Error message expected Text
    Then  Close the browser

  Scenario: Convert Time Functionalities Valid hours and Minutes
    When  Verify Enter the Hours
    Then  Verify Enter the Minutes
    When  Verify the convert second button
    Then  Verify Get the get Text Message
    Then  Close the browser

