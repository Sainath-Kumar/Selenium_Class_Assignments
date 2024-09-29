package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Tuna@321");

////input[contains(@name,'TextField')]
		//Thread.sleep(7000);
		//driver.close();

	}

}
