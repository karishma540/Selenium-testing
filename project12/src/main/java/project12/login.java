package project12;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("uyser is in amazon page")
	public void uyser_is_in_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is in newtours application");
	}

	@When("user needs to select dropdown element and searches text")
	public void user_needs_to_select_dropdown_element_and_searches_text() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user needs to enter username and password");
	}

	@Then("user need to click on search button")
	public void user_need_to_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user needs to click on signon");
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to homepage");
	}


}
