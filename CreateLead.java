package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ECIL");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mounika");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ega");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("employee");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Want to join");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kmounika9618@gmail.com");
		 WebElement ele = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select down = new Select(ele);
		 down.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 System.out.println(ele);
		 driver.close();
	}
	}

