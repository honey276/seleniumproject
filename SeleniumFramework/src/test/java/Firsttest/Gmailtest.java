package Firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailtest {


	public static void main (String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jamini Reddy\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("ch.jaminireddy@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nnnjunnu@276");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.close();
		
	
	
		}
	}

