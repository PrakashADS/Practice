package AutoPractice.practice;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

	public class AutoPractices {
	    public static WebDriver driver;
	    @Given("^user is on homepage$")
	    public void user_is_on_homepage() throws Throwable {     
	    //	System.setProperty("webdriver.firefox.driver","/Users/Documents/geckodriver");
	    	System.setProperty("webdriver.chrome.driver", "D:\\PRAKASH DOCS\\PRAKASH_Softwares\\chromedriver_win32\\chromedriver.exe");  
		    driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://demo.guru99.com/test/newtours/");
	        driver.manage().window().maximize();
	    }
	    
//	    @Then("^user enters username and Password$")
//	    public void user_enters_username_and_Password() throws Throwable {
//	    	Thread.sleep(3000);
//	    	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("blog.cucumber@gmail.com");
//	        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("Cucumber@blog");
//	        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();  
//	    }
	    
//	    @Then("^success message is displayed$")
//	    public void success_message_is_displayed() throws Throwable {
//	    	String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
//	    	String actual = driver.findElement(By.cssSelector(".info-account")).getText();
//	        Assert.assertEquals(exp_message, actual);
//	        driver.quit();  
//	    }      
	}

