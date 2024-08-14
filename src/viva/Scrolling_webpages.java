package viva;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolling_webpages 
{
@Test
public void scroll()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement edit_browser_history = driver.findElement(By.xpath("//a[.='About Us']"));
	Point p =edit_browser_history.getLocation();
	int X = p.getX();
	int Y = p.getY();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,"+Y+")");
	
}
}
