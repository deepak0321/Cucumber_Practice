Feature: Verify Authentication functionalities

    Scenario: Verify Log in and Log Out
      Given user opens website
      When user enters username "Admin"
      And  user enters password "admin123"
      And  user clicks on login button
      Then verify user is successfully logged in
      When  user clicks on user dropdown menu
      And   user clicks on log out
      Then  verify user is successfully logged out

