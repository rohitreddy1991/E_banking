package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTRAVELS {

	public static void main(String[] args) throws Exception 
	{
		// driver initiation
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/admin-portal");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter user name and password
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@phptravels.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		
		//click on accounts
		driver.findElement(By.xpath("//ul[@id='social-sidebar-menu']/li[5]")).click();
		
		//click on Customers
		driver.findElement(By.xpath("//ul[@id='ACCOUNTS']/li[3]")).click();
		
		
		//click on ADD button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		//ADD customer details
		//first name
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Rohit");
		
		//last name
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Reddy");
		
		//Email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohitreddy741@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Cust@2478");
		
		//Mobile number
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9985688211");
		
		//Country
		driver.findElement(By.xpath("//div[@id='s2id_autogen1']/a/span[2]")).click();
		
		WebElement EB = driver.findElement(By.xpath("//div[@id='select2-drop']/div/input"));
		EB.sendKeys("India",Keys.DOWN,Keys.ENTER);
		
		//Address1
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Address1");
		
		//Address2
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Address2");
		
		
		//click on SUbmit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		

	}

}
