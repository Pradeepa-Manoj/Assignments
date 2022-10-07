package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	
   @Test
	public void runCreateLead() throws IOException, InterruptedException{
				
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestUnniComp");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Unni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");		
		driver.findElement(By.name("submitButton")).click();
		
}
}






