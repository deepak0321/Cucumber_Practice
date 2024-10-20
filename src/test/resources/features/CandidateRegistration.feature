Feature: Verify Candidate functionalities
  Background:
    Given user opens website
    When user enters username "Admin"
    And  user enters password "admin123"
    And  user clicks on login button
    Then verify user is successfully logged in

    Scenario: Verify user can create new Candidate
      When user clicks on Recruitment
      And  user clicks on add button
      And  user inputs FirstName "Deepak" and LastName "Raj"
      And  user selects JAA vacancy
      And  user inputs Email "deepak123@gmail.com"
      Then user uploads doc resume file "C:\Users\ADMIN\Downloads\SampleResume.docx"
      Then user clicks on save
      Then verify successfully saved message
      And  user search using name "Deepak"
      Then user click on search
      Then verify candidate record is displayed

