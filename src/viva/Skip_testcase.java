package viva;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Skip_testcase 
{
	WebDriver driver;
@Test
public void login()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement Gmail_link = driver.findElement(By.linkText("Gmail"));
	Gmail_link.click();
	WebElement Signin_button = driver.findElement(By.xpath("//a[.='Sign in']"));
	Signin_button.click();
	WebElement UN = driver.findElement(By.id("identifierId"));
	UN.sendKeys("jayalakshmibogavelly@gmail.com");
	driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	WebElement pwd = driver.findElement(By.name("Passwd"));
	pwd.sendKeys("Manifest@2024");
	WebElement Next_button =driver.findElement(By.xpath("//span[.='Next']"));
	Next_button.click();
	
	WebElement Compose_button = driver.findElement(By.xpath("//div[.='Compose']"));
	Assert.assertEquals(Compose_button.isDisplayed(), true);
}

@Test(dependsOnMethods = "login")
public void logout()
{
	
}
}
