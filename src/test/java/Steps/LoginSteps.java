package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
	@When("product add to card")
	public void product_add_to_card() {
	 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

	@When("cheakout")
	public void cheakout() {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	   
	}

}
