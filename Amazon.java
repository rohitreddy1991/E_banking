package Amazon;

import java.io.BufferedReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws Exception 
	{
		// browser initiation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Enabling mouse and keyboard interactions
		
		Actions action = new Actions(driver);
		
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		action.moveToElement(Category).perform();
		
		
		//Identify Elemnet
		WebElement Sub_Mobile_And_Computer=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(Sub_Mobile_And_Computer).build().perform();
		Thread.sleep(4000);
		
		WebElement AllMobiles = driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));
		action.click(AllMobiles).perform();
		
		
		//select MI
		driver.findElement(By.xpath("//div[@id='leftNav']/ul[4]/div/li[4]/span/span/div/label/input")).click();
		Thread.sleep(2000);
		
		WebElement MP= driver.findElement(By.xpath("//div[@class='s-result-list sg-row']"));
		
		List <WebElement> list = MP.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		int cou= list.size();
		System.out.println(cou);
		
		for (int i = 0; i < cou; i++) 
		{
			WebElement al = list.get(i);
			String la = al.getText();
			
			System.out.println(la);
			
			//tring[] result = la.split("\n", 2);
			
		//	System.out.println(result[0]);
			
		//	la.split('\n', 1)[0]
			
			
			
			
		}
		

	}

}
