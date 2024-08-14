package viva;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_prgm 
{
	@DataProvider(name = "FacebookloginDetails")
	public Object method1()
	{
		Object d1[][] = new Object[3][2];
		d1[0][0] = "zender1312@gmail.com";
		d1[0][1] = "Derivco@123";
		d1[1][0] = "jayabogavelly006@gmail.com";
		d1[1][1] = "Manifest@2024";
		d1[2][0] = "jayalucky210xyz@gmail.com";
		d1[2][1] = "Jaya@1998";
		return d1;
	}

	@Test(dataProvider = "FacebookloginDetails")
	public void Facebook_login(String UN, String pwd)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UN_textfield = driver.findElement(By.id("email"));
		UN_textfield.sendKeys(UN);
		
		WebElement pwd_textfield = driver.findElement(By.id("pass"));
		pwd_textfield.sendKeys(pwd);
		
		WebElement login_button =  driver.findElement(By.name("login"));
		 login_button.click();
		 
		 WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder ='Search Facebook']"));
		 Assert.assertEquals(Searchbox.isEnabled(), true);
	}
}
