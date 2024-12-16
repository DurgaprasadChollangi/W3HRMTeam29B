package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLogin {

	public static WebDriver driver;

	@Given("user open browser")
	public void user_open_browser() {

		driver=new ChromeDriver(); 

	}

	@And("user open the application")
	public void user_open_the_application() {

		driver.get("https://employee.w3softech.in/qa/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

		driver.findElement(By.id("email")).sendKeys("hr@w3softech.in");
		driver.findElement(By.id("password")).sendKeys("W3hr@123");

	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {

		driver.findElement(By.xpath("//div[@class='d-grid']/button")).click();
		
		 
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality() {

		System.out.println("login functionality successfully completed");

	}

	@And("user should naviagated into Search Hotel page")
	public void user_should_naviagated_into_DashBoard_page() {

		String Exp_title= driver.getTitle();
		String Act_tittle= "W3-Work Track        -     Dashboard";

		if(Exp_title.equals(Act_tittle)) {

			Assert.assertTrue(true);

			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
			Assert.assertTrue(false);
		}



	}



}
