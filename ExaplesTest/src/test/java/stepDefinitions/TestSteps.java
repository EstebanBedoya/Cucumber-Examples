package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps{
	
	public static WebDriver driver;
	public static WebElement element; 
	public static Actions actions;
	public static WebDriverWait wait;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
	    actions = new Actions(driver);
	    wait = new WebDriverWait(driver, 10);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.minted.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/header/div/div/div[1]/div/div/div[1]/div/ul[2]/li[6]/a")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" to LogIn$")
	public void user_enters_and_to_LogIn(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div[5]/div[1]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div[5]/div[2]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div[5]/button[1]")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Ingreso exitoso");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/header/div/div/div[1]/div/div/div[1]/div/ul[2]/li[6]/a")));
		
		actions.moveToElement(element).perform();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/header/div/div/div[1]/div/div/div[1]/div/ul[2]/li[6]/div/div/div/div[2]/div/ul/li[8]/a")));
		
		actions.moveToElement(element2).click().perform();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("sesion cerrada");
	}
}
