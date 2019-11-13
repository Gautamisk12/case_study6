package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Stepdefs {WebDriver driver;
@Given("user opens TestMe app")
public void user_opens_TestMe_app() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438DIRNP6_TRNG\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://localhost:8083/TestMeApp");
	   driver.manage().window().maximize();
}

@Given("user clicks signin button")
public void user_clicks_signin_button() {
    driver.findElement(By.linkText("SignIn")).click();
}

@Given("user enters username as {string} in username field")
public void user_enters_username_as_in_username_field(String username) {
	driver.findElement(By.name("userName")).sendKeys(username);
    
}

@Given("user enters password as {string} in Password field")
public void user_enters_password_as_in_Password_field(String Password) {
    driver.findElement(By.name("password")).sendKeys(Password);
}

@Given("user clicks the Login button")
public void user_clicks_the_Login_button() {
    driver.findElement(By.name("Login")).click();
}

@Given("validate the login success")
public void validate_the_login_success() {
   Assert.assertTrue(driver.getTitle().contains("Home"));
   driver.close();
}
   
}
