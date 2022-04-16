package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.ForgottenPassPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {

		ForgottenPassPojo f = new ForgottenPassPojo();

		btnClick(f.getBtnforgotten());
		Thread.sleep(3000);

	}

	@When("User have to enter email or phoneno")
	public void user_have_to_enter_email_or_phoneno() {

		ForgottenPassPojo f = new ForgottenPassPojo();

		fill(f.getTxtSearchBox(), "7647645365356356");

	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		ForgottenPassPojo f = new ForgottenPassPojo();

		btnClick(f.getBtnSearchBox());

	}

	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {

		//1D map
		
		Map<String, String> mp = d.asMap(String.class, String.class);
		
		String email = mp.get("email");
		String pass = mp.get("Username");
		
		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);

	}

	

	@When("User have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
         //2D map
		
		List<Map<String, String>> mp = d.asMaps();
		
		String email = mp.get(2).get("Email");
		String pass = mp.get(0).get("password");
		
		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);

	}
	@When("User have to Click login button")
	public void user_have_to_Click_login_button() throws InterruptedException {

		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());

		Thread.sleep(3000);

	}

	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {

		loadUrl("https://en-gb.facebook.com/");

	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String pass) {

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);

	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {

		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());

		Thread.sleep(3000);

	}

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {

		loadUrl("https://en-gb.facebook.com/");

	}

	@When("User enter Invalid username and invalid password")
	public void user_enter_Invalid_username_and_invalid_password() {
		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "greens");
		fill(l.getTxtPass(), "greens123");

	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {

		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "greens");
		fill(l.getTxtPass(), "greens123");

	}

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {

		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());

		Thread.sleep(3000);

	}

	@Then("User should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("privacy_mutation_token")) {

			System.out.println("user is in invalid credentials page");

		} else {
			System.out.println("user is in invalid credentials page");

		}

	}

}
