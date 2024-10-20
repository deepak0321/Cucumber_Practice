Feature: Verify User Management functionalities
  Background:
    Given user opens website
    When user enters username "Admin"
    And  user enters password "admin123"
    And  user clicks on login button
    Then verify user is successfully logged in

    Scenario: Verify Add and Delete Users
      When user click on admin link
      And  user clicks on add
      Then user selects ESS Role
      Then user selects employee name "D"
      And  user selects status Enable
      And  user inputs username "LeoDas"
      And  user inputs password and confirm password "Deepak@123"
      And  user clicks on save button
      Then Verify the success message is displayed
      Then search new user with username "LeoDas"
      Then search new user with role ESS
      Then search new user with employee name "D"
      Then search new user with status enable
      And  click on search button
      Then verify new user record is displayed
      Then click on delete icon
      Then click on yes delete
      Then  verify successfully deleted message is displayed

