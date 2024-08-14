package viva;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1Dimensional 
{
	@DataProvider(name = "serach_deatils")
	public Object Google()
	{
		return new Object[][] {{"Nirmala Sitharaman"}, {"Finance Minister"},{"Budget 202"}};
	}

	
	
	@Test(dataProvider = "serach_deatils")
	public void Google_Search(String s)
	{
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   WebElement Searchbox = driver.findElement(By.id("APjFqb"));
	   Searchbox.sendKeys(s);
	   Searchbox.sendKeys(Keys.ENTER);
	   
	   WebElement Search_erase = driver.findElement(By.xpath("//div[@class='BKRPef']"));
	   Assert.assertEquals(Search_erase.isDisplayed(), true);
	}
}
