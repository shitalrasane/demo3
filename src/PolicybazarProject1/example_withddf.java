package PolicybazarProject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.interactions.Actions;

public class example_withddf {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.policybazaar.com");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//get data from excel
		
	FileInputStream file=new FileInputStream("C:\\Users\\Shital\\Downloads\\poi-bin-5.2.3-20220909 (1)(2)\\poi-bin-5.2.3\\28jan.xlsx");
   Sheet sh=WorkbookFactory.create(file).getSheet("PB");
   
   String c1=sh.getRow(0).getCell(0).getStringCellValue();
System.out.println(c1);
driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys(c1);
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
String c2=sh.getRow(0).getCell(1).getStringCellValue();

driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(c2);
Thread.sleep(2000);
	//click on sin in btn
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	Thread.sleep(1000);
	WebElement myacc=driver.findElement(By.xpath("//div[text()='My Account']"));
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	act.moveToElement(myacc).perform();
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	
	}
}
