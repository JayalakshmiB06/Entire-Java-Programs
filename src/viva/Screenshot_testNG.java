package viva;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot_testNG 
{
@Test
public void screenshot() throws IOException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	TakesScreenshot s1 = (TakesScreenshot) driver;
	File Source = s1.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\jayaa\\Desktop\\Screenshot\\amazon"+" "+getDateandtime()+".png");
	FileHandler.copy(Source, Destination);
}
public static String getDateandtime()
{
	DateFormat dateformat = new SimpleDateFormat("dd_MM_YYYY_HH_mm_ss");
	Date date = new Date();
	return dateformat.format(date);
	
}
}
