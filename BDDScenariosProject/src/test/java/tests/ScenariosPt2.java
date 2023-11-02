package tests;

import io.cucumber.java.en.*;

public class ScenariosPt2 {

	@Given("User navigates to {string}")
	public void Given_User_navigates_to_(String ppdsURL) {
		
		System.out.println(">> User navigated to PPDS " + ppdsURL);
		
	}
	
	@When("User enters valid token {string}")
	public void User_enters_valid_token_(String validToken) {
		System.out.println(">> User enters valid token " + validToken);
	}
	
	@Then("User enters invalid token {string}")
	public void User_enters_invalid_token_(String invalidToken) {
		System.out.println(">> User enters invalid token " + invalidToken);
	}
	
	@Then("User is not redirected to create profile page")
	public void User_is_not_redirected_to_create_profile_page () {
		System.out.println(">> User is not redirected to create profile page");
	}
	
	@And("User receives error message")
	public void User_receives_error_message () {
		System.out.println(">> User receives error message");
		int a = 9/0;
	}
	
	@Then("User is redirected to create profile page")
	public void User_is_redirected_to_create_profile_page () {
		System.out.println(">> User is redirected to create profile page");
	}
	
	@Then("User enters {string} in token field")
	public void User_enters_in_token_field (String token) {
		System.out.println(">> User enters in token field " + token);
		
	}
}
