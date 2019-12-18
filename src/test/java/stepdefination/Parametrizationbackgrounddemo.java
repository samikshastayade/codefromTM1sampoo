package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parametrizationbackgrounddemo {
	
	WebDriver driver;
	
	@Given("application is launched")
	public void application_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Given("DemoWebShop is displayed")
	public void demowebshop_is_displayed1() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("user clicks on register")
	public void user_clicks_on_register1() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("user enetrs valid credentials for registration")
	public void user_enetrs_valid_credentials_for_registration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("pooboo");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("cucks");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pooboo@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123abc");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("123abc");
	}

	@Then("user clicks on register")
	public void user_clicks_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	}

	@Then("user clicks on Logoout")
	public void user_clicks_on_Logoout() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@Then("user closes the window")
	public void user_closes_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.close();
	}

	@Given("Demowebshop is displayed")
	public void demowebshop_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("duplicate");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();;
	}

	@When("user provides valid username {string}")
	public void user_provides_valid_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string1);
	}

	@When("valid password in respective field {string}")
	public void valid_password_in_respective_field(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string2);
	}

	@Then("user clicks on login button for validation")
	public void user_clicks_on_login_button_for_validation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}



}
