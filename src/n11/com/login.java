package n11.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.n11.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		Thread.sleep(2000);
		/*driver.findElement(By.cssSelector("span.btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/div[2]/div[2]/div/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#email")).sendKeys("mehmetbaytekin36@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#password")).sendKeys("123456Mb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginButton']")).click();
		*/
		driver.findElement(By.xpath("//*[@id=\'userKvkkModal\']/div/div[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchData")).sendKeys("bilgisayar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentListing']/div/div/div[2]/div[4]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='p-394841172']/div[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentProDetail']/div/div[3]/div[2]/div[3]/div[3]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'userKvkkModal\']/div/div[2]/span")).click();
		Thread.sleep(1000);
		driver.navigate().back();// bir önceki sayfaya geri döner
		driver.findElement(By.xpath("/html/body/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='contentProDetail']/div/div[3]/div[2]/div[3]/div[3]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='header']/div/div/div[2]/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='newCheckout']/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]")).click();
		Thread.sleep(1000);
		driver.quit();

		
	}

}
