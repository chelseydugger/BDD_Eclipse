package tests;

import io.cucumber.java.en.*;

public class Scenarios {
	
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println(">> User was navigated to login page");

	}

	@When("User enters username {string}")
	public void user_enters_username(String usernameText) {
		System.out.println(">> User enters valid username " + usernameText);

	}

	@When("Enter valid password {string}")
	public void enter_valid_password(String passwordText) {
		System.out.println(">> User enters valid password " + passwordText);

	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println(">> User clicks on Login button");

	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println(">> User is logged in successfully");

	}

	@When("User enters invalid username {string}")
	public void user_enters_invalid_username(String invalidUsernameText) {
		System.out.println(">> User enters invalid username " + invalidUsernameText);

	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPasswordText) {
		System.out.println(">> User enters invalid password " + invalidPasswordText);

	}

	@Then("User should get a warning message")
	public void user_should_get_a_warning_message() {
		System.out.println(">> User should get a warning message");
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String validUsernameText) {
		System.out.println(">> Enters valid username " + validUsernameText);
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String invalidPasswordText) {
		System.out.println(">> Enters invalid password " + invalidPasswordText);
	}

	@When("Enters valid password {string}")
	public void enters_valid_password(String validPasswordText) {
		System.out.println(">> Enters valid password " + validPasswordText);

	}

}
