package com.mcp.step_defs;

import com.mcp.pages.LoginPage;
import com.mcp.utilities.ConfigReader;
import io.cucumber.java.en.*;

public class mcp_steps {

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {
        loginPage.login(ConfigReader.get("help_desk_username"), ConfigReader.get("help_desk_password"));

    }
    @When("The helpdesk user navigates to Services tab")
    public void the_helpdesk_user_navigates_to_services_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The helpdesk user clicks to Meeting Room Booking Calendar View link")
    public void the_helpdesk_user_clicks_to_meeting_room_booking_calendar_view_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} title should display top of the calendar.")
    public void title_should_display_top_of_the_calendar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
