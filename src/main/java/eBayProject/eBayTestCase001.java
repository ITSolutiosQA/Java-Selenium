package eBayProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eBayTestCase001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id'userid']")).sendKeys("kadir9539@gmail.com");
		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Bismillah@1");
		driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
		
		
		//kadir9539@gmail.com
		//Bismillah@1
		

		
		//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]
		//driver.findElement(By.xpath("//a[@title='My eBay']")).click();

	}

}


