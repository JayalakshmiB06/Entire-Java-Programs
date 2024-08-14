package viva;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DDT 
{
	  WebDriver driver;
 @Parameters("browser")
  @Test (retryAnalyzer=viva.Retry_Logic.class)
  public void flipkart_login(String nameofbrowser) throws EncryptedDocumentException, IOException
  {
	  if(nameofbrowser.equals("Chrome"))
	  {
	  driver = new ChromeDriver();
	  }
	  
	  if(nameofbrowser.equals("Edge"))
	  {
	  driver = new EdgeDriver();
	  }
	  
	  if(nameofbrowser.equals("Firefox"))
	  {
	  driver = new FirefoxDriver();
	  }
	  
	  
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  FileInputStream f1 = new FileInputStream("C:\\Users\\jayaa\\eclipse-workspace\\Java_Viva\\testdata\\FB_test_data.xlsx");
	  Workbook w1 =  WorkbookFactory.create(f1);
	  String username = w1.getSheet("FB_Login").getRow(1).getCell(0).getStringCellValue();
	  String password = w1.getSheet("FB_Login").getRow(1).getCell(1).getStringCellValue();
	  
	  WebElement UN = driver.findElement(By.id("email"));
	  UN.sendKeys(username);
	  WebElement pwd = driver.findElement(By.id("pass"));
	  pwd.sendKeys(password);
	 WebElement login_button =  driver.findElement(By.name("login"));
	 login_button.click();
	 
	 WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder ='Search Facebook']"));
	 Assert.assertEquals(Searchbox.isEnabled(), true);
  
}
}