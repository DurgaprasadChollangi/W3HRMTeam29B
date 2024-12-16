package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {
	
	public WebDriver driver;
	@Given("user open the Broswer")
	public void user_open_the_broswer() {
		driver=new ChromeDriver();
	    
	}

	@And("user open the Application")
	public void user_open_the_application() {
		driver.get("https://employee.w3softech.in/qa/employee");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("user enter the Employee Details")
	public void user_enter_the_employee_details() {
	
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[1]/div[2]/div/div/div/ul/li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[1]/div/div/div[2]/div/a[3]")).click();
		driver.findElement(By.id("name")).sendKeys("Durgaprasad Chollangi");
		driver.findElement(By.id("phone")).sendKeys("9381416191");
		
		WebElement ele1=driver.findElement(By.id("dob"));
		ele1.sendKeys("14/06/1999");
		
		driver.findElement(By.id("g_male")).click();
		
		driver.findElement(By.id("email")).sendKeys("durgaprasadchollangi50@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Durgaprasad@1999");
		
		driver.findElement(By.id("address")).sendKeys("venturu");
		
		WebElement ele11=driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div[1]/form/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/label/div"));
		 ele11.sendKeys("C:\\Users\\durga\\Pictures\\Screenshots");
		 
		 
		 WebElement ele2=driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div[1]/form/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/label/div"));
		 ele2.sendKeys("C:\\Users\\durga\\Pictures\\Screenshots");
		 
		 WebElement ele3=driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div[1]/form/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/div/label/div"));
		 ele3.sendKeys("C:\\Users\\durga\\Pictures\\Screenshots");
		 
		 
		 WebElement Ele5  = driver.findElement(By.id("branch_id"));
			Ele5.click();
			
			//intialize select class
			Select sc=new Select(Ele5);
			
			sc.selectByVisibleText("Hyderabad");
			
		WebElement Ele6=	driver.findElement(By.id("department_id"));
		Ele6.click();
		
		sc.selectByVisibleText("Software Tester");
		
		
		WebElement Ele7=driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div[2]/div/div[4]/div/select"));
		Ele7.click();
		
		sc.selectByVisibleText("Software Tester");
		
		
		WebElement ele8=driver.findElement(By.id("company_doj"));
		ele8.sendKeys("01/09/2022");
		
		
		driver.findElement(By.id("account_holder_name")).sendKeys("Durgaprasadchollangi");
		
		driver.findElement(By.id("account_number")).sendKeys("987654321");
		
		driver.findElement(By.id("bank_name")).sendKeys("Sbi");
		
		driver.findElement(By.id("bank_identifier_code")).sendKeys("Sbi00007888");
		
		driver.findElement(By.id("branch_location")).sendKeys("Kakinada");
		
		driver.findElement(By.id("tax_payer_id")).sendKeys("15879");
	
	}

	@And("user click the Create button")
	public void user_click_the_create_button() {
		
		driver.findElement(By.id("/html/body/section/div/div[2]/div/div[2]/button")).click();
	    
	}

	@Then("user should be successfully completed Employee Functionality")
	public void user_should_be_successfully_completed_employee_functionality() {
		
		System.out.println("Employee functionality successfully completed");
	    
	}

	@And("user should navigated to the manage Employee page")
	public void user_should_navigated_to_the_manage_employee_page() {
		
		String Exp_title= driver.getTitle();
		String Act_tittle= "        W3-Work Track        -     Manage Employee";

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


