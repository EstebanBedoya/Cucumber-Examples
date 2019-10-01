package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public WebDriver driver;
	
	@Given("^que me encuetro en la pagina \"([^\"]*)\"$")
	public void que_me_encuetro_en_la_pagina(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new FirefoxDriver();
	    
	    driver.get(arg1);
	}

	@When("^ingrso la palabra \"([^\"]*)\" en el buscador$")
	public void ingrso_la_palabra_en_el_buscador(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^le doy enter$")
	public void le_doy_enter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).submit();
	}

	@Then("^se efectua la busqueda$")
	public void se_efectua_la_busqueda() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("todo ok");
	}
}
