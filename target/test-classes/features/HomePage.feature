@wip
Feature: Mail Travel page functionality and a booking holiday for India
  User story: As a user i go to mail travel home page and confirms the title
  i should be able to book holidays choosing destination as India and Shimla Extension.


  Scenario:Home page title verification
    When user navigates to mail travel home page
    And user should see tile as  "Home Page | Mail Travel"
    Then user clicks on  Accept All cookies


  Scenario: User look for the search bar to type the destination
    When user click on the search bar
    And user types "India and Shimla Extension" in the search box
    Then user clicks on india and Shimla Extension in drop down

  Scenario: User clicks on Book Online button
    When user clicks on book online button

  Scenario: User scrolls the bottom of the page and book holidays for two adults and note the departure airport
    When user scrolls the bottom of the page
    And user selects the first available date to book
    And user selects "2" adults
    And user makes the note of Departure Airport
    Then user clicks on book online button2

  Scenario: User expands the Date, Departure & Passengers section
    When user clicks on the  Date, Departure & Passengers section
    Then user verifies the details given
    And user clicks on the accomodation section
    And user selects "1" in number required drop down
    Then user clicks on SELECT YOUR ROOMS AND CONTINUE

  Scenario: User fills out the personal detail form and select email in where did you hear about us
    When user fills the personal detail in the form
    And user selects email from the drop down in where did you hear about us
    Then user clicks on Continue button

  Scenario: User verifies Confirm Details + Book page and Book Now buttons are Enabled
    When user verifies Confirm Details + Book page is enabled
    And user verifies Book Now button is enabled










