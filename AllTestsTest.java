

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AllTestsTest {
 
 WebDriver driver = new FirefoxDriver();
 int sec = 7;
 @Test
 public void test() {
	 
  driver.manage().window().maximize();
  System.out.println("Window is maximised");
  
  driver.get("https://prorm.crm4.dynamics.com/");
  System.out.println("CRM Site is Open");
  
  
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	
	         // username input
			 WebElement username = driver.findElement(By.id("cred_userid_inputtext"));

	         username.clear();
	         username.sendKeys("Anatolii.Saprykin@promx.net");
	         username.sendKeys(Keys.ENTER);
	         
	         System.out.println("Username inputted");
	         		
	         // working tile	         
	         WebElement workTile = driver.findElement(By.id("aad_account_tile"));
	         workTile.click();
	         
	         System.out.println("waiting " + sec + " seconds");	         
	         driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	         
	         // Enter pass	         
	         WebElement passW = driver.findElement(By.id("passwordInput"));
	         passW.clear();
	         //passW.sendKeys(Keys.ENTER);//changed here
	         passW.sendKeys("85412547698sS");
	         
	         System.out.println("Pass is inputted");
	         
	         // click Enter	         
	         WebElement enterButton = driver.findElement(By.id("submitButton"));
	         enterButton.sendKeys(Keys.ENTER);
	         
	         System.out.println("waiting " + sec*2 + " seconds");  
	         driver.manage().timeouts().implicitlyWait(sec*2,TimeUnit.SECONDS);
	         
	         
	         // open Project Service
	         WebElement pC = driver.findElement(By.id("TabHome"));	
	         pC.click();
	         
	         System.out.println("waiting " + sec + " seconds");
	         driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	         
	         pC.click();
	         
	         System.out.println("waiting " + sec + " seconds");
	         driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	         
	         pC.click();
	         pC.click();
	         
	         System.out.println("waiting " + sec*2 + " seconds");
	         driver.manage().timeouts().implicitlyWait(sec*2,TimeUnit.SECONDS);
	         
	         System.out.println("PrService  is opened");
	         
	       //  WebElement proRM = driver.findElement(By.cssSelector("proRM"));
	       //  proRM.click();
	         
	         WebElement OpenPS = driver
	        		 .findElement(By.cssSelector("css=#prorm_tracking > span.nav-rowLabel"));
	         OpenPS.click();
	         
	         Actions builder = new Actions(driver);
	         Action doubleClick = builder.doubleClick(OpenPS).build();
	         doubleClick.perform();
	         
	         
 // driver.quit();
  System.out.print(" " + "End of Test");
 }

}