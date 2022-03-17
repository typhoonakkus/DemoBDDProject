package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.DriverManager;
import Utility.SelectDropDown;
import Utility.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login  extends DriverManager {
	
	@Given("write username {string}")
    public void write_username(String text) {        
        
        webDriver.get().findElement(By.id("username")).sendKeys(text);

    }
    @And("write password {string}")
    public void write_password(String text)  {
       
        webDriver.get().findElement(By.id("password")).sendKeys(text);
      

    }

    @When("clicks on login btn")
    public void clicks_on_login_btn() throws InterruptedException {    	
    	webDriver.get().findElement(By.id("login")).click();    	
    }  

    @Then("user is navigate to the home page")
    public void user_is_navigate_to_the_home_page() {     
                 
    	WebElement menu= webDriver.get().findElement(By.id("menuBtn"));
    	//SelectDropDown.selectFromDropDown(menu, "Demo");
    	
    }

}
