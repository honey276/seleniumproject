import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jamini Reddy\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("ch.jaminireddy@gmail.com");
		driver.findElement(By.cssSelector("#next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("junnu@276");
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
		driver.close();

}
}
