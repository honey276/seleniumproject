import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramTesting {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().version("80.0").setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
	driver.findElement(By.name("username")).sendKeys("jaminireddy");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("Mefashionista");
	driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
	driver.close();
}

}
