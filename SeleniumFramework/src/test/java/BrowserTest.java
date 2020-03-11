import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserTest {

 public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Jamini Reddy\\eclipse-workspace\\SeleniumFramework\\drivers\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.close();
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jamini Reddy\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
	 //WebDriver driver = new FirefoxDriver();
	 //driver.manage().window().maximize();
	 //driver.manage().deleteAllCookies();
	//driver.get("https://www.gmail.com/");
	//driver.findElement(By.id("identifierId")).sendKeys("ch.jaminireddy@gmail.com");
	//driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.name("password")).sendKeys("junnu@276");
	//driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
	//driver.close();
	//String Projectpath = System.getProperty("user.dir");
	//System.out.println("projectpath : " +Projectpath);
	//System.setProperty("webdriver.gecko.driver", Projectpath"+\\drivers\\geckodriver\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	//driver.close();
	
	
}
}