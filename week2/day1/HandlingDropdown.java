package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.className("decorativeSubmit"));
	Login.click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Leads")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Create Lead")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HYUNDAI");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Enid");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Blyton");
	Thread.sleep(1000);
	WebElement A =driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select obj=new Select(A);
	obj.selectByIndex(4);
	Thread.sleep(1000);
	WebElement B =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select obi=new Select(B);
	obi.selectByVisibleText("Automobile");	
	Thread.sleep(1000);
	WebElement C =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select obk=new Select(C);
	obk.selectByValue("OWN_CCORP");
	Thread.sleep(1000);
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Delete")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout")).click();
		
	//	driver.close();
	
	}

}
