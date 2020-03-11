package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchpage1 {
	public static void main(String[] args) {
		googlesearch();
		
	}
	
	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("jamini");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();
	}

}
