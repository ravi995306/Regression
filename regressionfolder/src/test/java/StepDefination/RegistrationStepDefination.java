package StepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefination {

	WebDriver driver;
	 @Given("^User is on home page$")
	    public void user_is_on_home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAMFoundation\\eclipse-workspace\\regressionfolder\\Driver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("http://www.denimforpeace.com/");
	    }

	    @When("^home logo display$")
	    public void home_logo_display() throws Throwable {
	    	String title= driver.getTitle();
	        Assert.assertEquals(title, "Denim For Peace");
	    }

	    @Then("^click on login link$")
	    public void click_on_login_link() throws Throwable {
	    	driver.findElement(By.xpath("//a[text()='login']")).click();
	    }

	    @Then("^click on continue button$")
	    public void click_on_continue_button() throws Throwable {
	    	driver.findElement(By.id("tdb2")).click();
	    }

	    @Then("^fill below details on registration page$")
	    public void fill_below_details_on_registration_page(DataTable regdata) throws Throwable {
	    	List<List<String>>	regvalues=regdata.raw();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(regvalues.get(0).get(0));
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(regvalues.get(0).get(1));
			driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(regvalues.get(0).get(2));
			driver.findElement(By.xpath("//input[@name='street_address']")).sendKeys(regvalues.get(0).get(3));
			driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(regvalues.get(0).get(4));
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(regvalues.get(0).get(5));
			driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(regvalues.get(0).get(6));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(regvalues.get(0).get(7));
			driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys(regvalues.get(0).get(8));
	    }

	    @Then("^click on continue button and register$")
	    public void click_on_continue_button_and_register() throws Throwable {
	    	driver.findElement(By.id("tdb1")).click();
	    }
//Classes from Login Page    
		@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_username_and_password(String username, String password) throws Throwable {
			driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(username);
	    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    }

		@Then("^Hover on men$")
	    public void hover_on_men() throws Throwable {
			Thread.sleep(5000);
	    	WebElement web=driver.findElement(By.xpath("//li[@class='drop-menu']/a[text()='Men']"));
	    	WebElement web2=driver.findElement(By.xpath("//div[@id='navmobmenu']//a[text()='Shorts']"));
	    	Actions act=new Actions(driver);
	    	act.moveToElement(web).moveToElement(web2).click().build().perform();
	        
	    }

	    @Then("^click on any cloth name$")
	    public void click_on_any_cloth_name() throws Throwable {
	    	Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[@id='Straight']/div[@class='col-sm-4 pbottspace']/div[@class='Prod-wrapper']/a[@class='prod_image'][1]")).click();
	    }
	    

	    @Then("^select the size$")
	    public void select_the_size() throws Throwable {
	        driver.findElement(By.xpath("//a[@id='11|14|17']")).click();
	    }

	    @And("^click on login button$")
	    public void click_on_login_button() throws Throwable {
	    	driver.findElement(By.xpath("//button[@id='tdb1']")).click();
	    	Thread.sleep(5000);
	    }

	    @And("^Click on shorts$")
	    public void click_on_shorts() throws Throwable {
	        
	    }

	    @And("^click on Add to Bag button$")
	    public void click_on_add_to_bag_button() throws Throwable {
	        driver.findElement(By.xpath("//button[@id='tdb1']")).click();
	    }
	    
	    //Verify filter option and Add to Cart
	    
	    @Then("^click on filter$")
	    public void click_on_filter() throws Throwable {
	        driver.findElement(By.xpath("//a[text()='Skinny                            ']")).click();
	        driver.findElement(By.xpath("//a[text()='Slim                            ']")).click();
	        driver.findElement(By.xpath("//a[text()='Straight                            ']")).click();
	    }

}
