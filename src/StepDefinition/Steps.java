package StepDefinition;		

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;	


public class Steps {				
    
	WebDriver driver;
    
    @Given("^Open the Chrome and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
    	driver=new ChromeDriver();
      
      driver.get("http://demo.guru99.com/v4");
      //System.out.println(1);
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       //System.out.println("This step enter the Username and Password on the login page.");
    	//Assert.fail();
    	driver.findElement(By.name("uid")).sendKeys("username12");
    	driver.findElement(By.name("password")).sendKeys("password12");
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    
    	driver.findElement(By.name("btnReset")).click();
       // System.out.println("This step click on the Reset button.");					
    }	
    
    @Given("Open chrome browser and launch the application$")
    public void open_chrome_and_launch_app() throws Throwable
    {System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/v4");
    	System.out.println("app launched");
    }
    
    @When("enter credentials and click on login$")
    public void login()throws Throwable{
    	driver.findElement(By.name("uid")).sendKeys("username12");
    	driver.findElement(By.name("password")).sendKeys("password12");
    }
    
    @Then("Login successful$")
    public void Login()throws Throwable{
    	driver.findElement(By.name("btnLogin")).click();
    }

}