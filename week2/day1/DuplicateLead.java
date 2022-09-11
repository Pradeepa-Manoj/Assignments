package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeepa");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoj");
//driver.findElement(By.name("submitButton")).click();
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Unni");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a test description");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
WebElement sel=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select country=new Select(sel);
country.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
//String title=driver.getTitle();
driver.findElement(By.linkText("Duplicate Lead")).click();
WebElement comptext=driver.findElement(By.id("createLeadForm_companyName"));
comptext.clear();
comptext.sendKeys("New Company 1234");
WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
firstName.clear();
firstName.sendKeys("Pradeepa 1234");
driver.findElement(By.className("smallSubmit")).click();
String title=driver.getTitle();
System.out.println(title);
	}

}
