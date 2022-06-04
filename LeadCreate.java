package week2.Day2;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
WebElement ele = driver.findElement(By.id("username"));
ele.sendKeys("DemoSalesManager");
//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ECIL");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mounika");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hyderabad");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QC");
driver.findElement(By.id("createLeadForm_description")).sendKeys("All is Well");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kmounika9618@gmail.com");
WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select city=new Select(dd);
city.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit Lead ");
driver.findElement(By.name("submitButton")).click();
System.out.println(driver.getTitle());
driver.close();
	}
}

