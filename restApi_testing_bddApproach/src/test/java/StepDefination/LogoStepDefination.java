package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LogoStepDefination {
	WebDriver driver;
	@Given("i lunch chrome browser")
	public void i_lunch_chrome_browser() {
	   driver= new ChromeDriver();
	}

	@When("i open orange homepage")
	public void i_open_orange_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("i verify the logo on present page")
	public void i_verify_the_logo_on_present_page() {
	boolean logo = driver.findElement(By.xpath("(//*[@id=\"orangehrm-logo\"])/[1]")).isDisplayed();
    
	}

	@Then("closed browser")
	public void closed_browser() {
	    driver.close();
	}
    }
