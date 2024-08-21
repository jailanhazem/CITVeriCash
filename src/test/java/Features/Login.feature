Feature: Facebook Login and Logout
  Scenario: User login,logout and verify sentence
    When user enter email and pass
    And Click on login Btn
    And Click profile button
    And click the logout button
    Then check "Facebook helps you connect and share with the people in your life." message






