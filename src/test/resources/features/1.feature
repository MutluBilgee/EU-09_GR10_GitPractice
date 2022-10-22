@AGIL-275
Feature:
  Scenario: Verify that Helpdesk User can display "Event Calendar" (AGIL-261-1)

    Given the user logged in as "helpdesk"
    When The helpdesk user navigates to Services tab
    Then The helpdesk user clicks to Meeting Room Booking Calendar View link
    And "Event Calendar" title should display top of the calendar.


#Efe

