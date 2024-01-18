package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	public static  WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.saucedemo.com/");
	}

	@When("user enter valid login id and password and click on login button")
	public void user_enter_valid_login_id_and_password_and_click_on_login_button() {
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.name("login-button")).click();
	}
	@Then("user is on home page and validate home page url")
	public void user_is_on_home_page_and_validate_home_page_url() {
	   String actUrl=driver.getCurrentUrl();
	   boolean a=actUrl.contains("inventory");
	   Assert.assertEquals(a, true);
	}
}
