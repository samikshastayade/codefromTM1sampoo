package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoAssignment {
	
	WebDriver driver;

	@Given("DemoWebshop website is launched")
	public void demowebshop_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("April");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Aniston");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("april.aniston@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("abc123!");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("abc123!");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Given("user clicks on registration button")
	public void user_clicks_on_registration_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click(); 
	}
		//driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("april.aniston@gamil.com");
		//driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("abc123!");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
	@When("user provides the registered valid username {string}")
	public void user_provides_the_registered_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string );
	}

	@When("valid password in respective feild {string}")
	public void valid_password_in_respective_feild(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string);
	}

	@Then("user clicks on login button for login validation")
	public void user_clicks_on_login_button_for_login_validation() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}



	@When("user provides proper data")
	public void user_provides_proper_data() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("jewelry");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img")).click();
		
		
		
	}

	@Then("clicks on register button for registration")
	public void clicks_on_register_button_for_registration() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
	}

	@Given("registered user clicks on logIn button")
	public void registered_user_clicks_on_logIn_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Then("user provides valid data for logIn")
	public void user_provides_valid_data_for_logIn() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("user clicks on logIn button for logIn validation")
	public void user_clicks_on_logIn_button_for_logIn_validation() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
	}

	@Given("loggedIn user enter the product he want to search")
	public void loggedin_user_enter_the_product_he_want_to_search() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Then("user waits for the results to be displayed")
	public void user_waits_for_the_results_to_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Given("User selects the desired product from the searched item")
	public void user_selects_the_desired_product_from_the_searched_item() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
	}

	@Then("user adds the desired product to the cart")
	public void user_adds_the_desired_product_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("user clicks on okay button")
	public void user_clicks_on_okay_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Then("the desired product gets added to the cart")
	public void the_desired_product_gets_added_to_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

}
