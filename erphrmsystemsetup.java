package NewLearning;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class erphrmsystemsetup{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\Driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://erp.stagingzar.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("c-s-bn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input")).click();
		driver.findElement(By.name("email")).sendKeys("norinco@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).click();
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,5000)");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click(); // HRM System//
		Thread.sleep(1000);
		
		
		
		 
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[11]/a")).click(); // HRM system Setup//
		Thread.sleep(1000);
		
		 
		
		  driver.findElement(By.xpath( "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();//Company name
		  Thread.sleep(1000); 
		  driver.findElement(By.name("name")).click();
		  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Techzar");    
		  driver.findElement(By.xpath( "//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  Thread.sleep(1000);

	    driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[2]")).click();//Deparment name
	 	Thread.sleep(1000);

		
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000); 
		  WebElement Department = driver.findElement(By.xpath("//*[@id=\"branch_id\"]")); 
		  Select select = new Select(Department); select.selectByVisibleText("Techzar");
		  Thread.sleep(1000); 
		  driver.findElement(By.id("name")).click();
		  driver.findElement(By.name("name")).sendKeys("Web Development");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click(); 
		  Thread.sleep(6000);
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[2]")).click();
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000);
		  
		  WebElement Department1 = driver.findElement(By.xpath("//*[@id=\"branch_id\"]")); 
		  Select select1 = new Select(Department1); 
		  select1.selectByVisibleText("Techzar");
		  Thread.sleep(1000); driver.findElement(By.id("name")).click();
		  driver.findElement(By.name("name")).sendKeys("Testing");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[3]")).click();//Designation name 
		
		
		
		   Thread.sleep(1000); driver.findElement(By.xpath(
		  "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("name")).sendKeys("Senior developer");
		  Thread.sleep(1000); driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  Thread.sleep(1000);
		                                                                                
		  
		  driver.findElement(By.xpath( "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000); 
		  WebElement Designation = driver.findElement(By.xpath("//*[@id=\"department_id\"]")); 
		  Select select2 = new Select(Designation); 
		  select2.selectByVisibleText("Testing");
		  driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("name")).sendKeys("Senior Tester");
		  Thread.sleep(1000); driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		  Thread.sleep(1000);
		 		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[4]")).click();//Leave type
		
		
		
		  Thread.sleep(1000); driver.findElement(By.xpath( "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Sick Leave");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"days\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("12");
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath( "//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		 
		                                                                                
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath( "/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Casual leave");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"days\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("12");
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath( "//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		 
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[5]")).click();//Document type
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Aadhaar");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("PAN Card");
		WebElement  DocumentType = driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[2]/select"));  
        Select dropdown = new Select ( DocumentType);
        dropdown.selectByVisibleText("Is Required"); 
	    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[6]")).click();//Payslip type
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Salary Payslip");
		WebElement uploadElement = driver.findElement(By.id("digital_signature"));
		uploadElement.sendKeys("C:\\Users\\Admin\\Downloads\\1727335709_1725262393.jpg");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Generic Payslip");
		WebElement uploadElement1 = driver.findElement(By.id("digital_signature"));
		uploadElement1.sendKeys("C:\\Users\\Admin\\Downloads\\1725432018.png");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		

	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[7]")).click();//Allowance type
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Special allowance");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Medical allowance");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[8]")).click();//Loan option
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Personal loan");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Car loan");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[9]")).click();//Deduction option
	    
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("House rent");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Fixed deposit");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[10]")).click();//Goal type
	    
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Career goals");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Personal development");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    

	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[11]")).click();//Training type 
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Soft skills training");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Coaching");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[12]")).click();// Award type
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Employee of the Month");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Teamwork Award");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[13]")).click();//Termination Type
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Layoff");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Dismissal");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse0 = (JavascriptExecutor) driver;
		jse0.executeScript("window.scroll(0,5000)");
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[14]")).click();//Job category
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("IT");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
		driver.findElement(By.id("title")).sendKeys("Marketing");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scroll(0,5000)");
		Thread.sleep(1000);
	    
	    
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[15]")).click();//Job stage
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("title")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("Technical Round");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse2.executeScript("window.scroll(0,5000)");
			Thread.sleep(1000);
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[16]")).click();// Performance Type
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Good");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
	    
	    Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Average");
		driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
	    Thread.sleep(1000);
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scroll(0,5000)");
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[17]")).click();// Competencies 
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Selenium");
		
		WebElement Competencies = driver.findElement(By.xpath("//*[@id=\"type\"]")); 
		  Select dropdwon1 = new Select(Competencies); dropdwon1.selectByVisibleText("Good");
		  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
		
		
		  Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Java");
			
			WebElement Competencies1 = driver.findElement(By.xpath("//*[@id=\"type\"]")); 
			  Select dropdwon2 = new Select(Competencies1); dropdwon2.selectByVisibleText("Average");
			  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
			
 		     
		 
		         // Assets Type
		
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				JavascriptExecutor jse4 = (JavascriptExecutor) driver;
				jse4.executeScript("window.scroll(0,5000)");
				Thread.sleep(1000);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[18]")).click(); 
		
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.id("name")).click();
				driver.findElement(By.id("name")).sendKeys("Laptop");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("Brand ");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div1\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div1\"]/div[1]/div/input")).sendKeys("Processor"); 		
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div2\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div2\"]/div[1]/div/input")).sendKeys("Operating System"); 		
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div3\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div3\"]/div[1]/div/input")).sendKeys("Memory"); 
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div4\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div4\"]/div[1]/div/input")).sendKeys("Storage");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div5\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div5\"]/div[1]/div/input")).sendKeys("Graphic Card");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div6\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div6\"]/div[1]/div/input")).sendKeys("Display");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div7\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div7\"]/div[1]/div/input")).sendKeys("Color");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div8\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div8\"]/div[1]/div/input")).sendKeys("Warranty");
				
	            Thread.sleep(1000);
				
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.id("name")).click();
				driver.findElement(By.id("name")).sendKeys("PC-Intel Celeron (Black)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("Brand ");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div1\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div1\"]/div[1]/div/input")).sendKeys("Processor"); 		
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div2\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div2\"]/div[1]/div/input")).sendKeys("Operating System"); 		
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div3\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div3\"]/div[1]/div/input")).sendKeys("Memory"); 
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div4\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div4\"]/div[1]/div/input")).sendKeys("Storage");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div5\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div5\"]/div[1]/div/input")).sendKeys("Keyboard ");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div6\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div6\"]/div[1]/div/input")).sendKeys("Display");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div7\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div7\"]/div[1]/div/input")).sendKeys("WiFi Wireless LAN Adapters");
				driver.findElement(By.id("add_asset_property_btn")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div8\"]/div[1]/div/input")).click();
				driver.findElement(By.xpath("//*[@id=\"asset_property_div8\"]/div[1]/div/input")).sendKeys("Camera / Microphone ");
				Thread.sleep(1000);
				 
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				
				
				// Manage Workshifts
				
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					JavascriptExecutor jse5 = (JavascriptExecutor) driver;
					jse5.executeScript("window.scroll(0,5000)");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"useradd-sidenav\"]/a[19]")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
					driver.findElement(By.id("name")).click();
					driver.findElement(By.id("name")).sendKeys("Day Shift");// Work shift Name
					Thread.sleep(1000);
					  driver.findElement(By.id("start_date")).click();  
					  Thread.sleep(1000);
					  driver.findElement(By.id("start_date")).sendKeys("2024");
					  Thread.sleep(1000);                    
					  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);// Start Date 
					  Thread.sleep(1000);
					  driver.findElement(By.id("start_date")).sendKeys("10");
					  Thread.sleep(1000);
					  driver.findElement(By.id("start_date")).sendKeys("01");
					
					  Thread.sleep(1000);
					  driver.findElement(By.id("end_date")).click();  
					  Thread.sleep(1000);
					  driver.findElement(By.id("end_date")).sendKeys("2024");
					  Thread.sleep(1000);                    
					  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);// End Date 
					  Thread.sleep(1000);
					  driver.findElement(By.id("end_date")).sendKeys("10");
					  Thread.sleep(1000);
					  driver.findElement(By.id("end_date")).sendKeys("31");
				
					  driver.findElement(By.id("scheduled_shift")).click();  // Choose a working shift type
					  Thread.sleep(1000); 
					  driver.findElement(By.id("regular_shift")).click();
					  Thread.sleep(1000);
					  
					  Thread.sleep(1000);
					  driver.findElement(By.id("start_time")).click();// Start Time 
					  driver.findElement(By.id("start_time")).sendKeys("09:30AM");
						
						
					  Thread.sleep(1000);
					  driver.findElement(By.id("end_time")).click();// End Time
					  driver.findElement(By.id("end_time")).sendKeys("06:30PM");
						
					  //Select Weekend Day
					  driver.findElement(By.id("is_sunday_off")).click();
					  Thread.sleep(1000);
					  driver.findElement(By.id("is_saturday_off")).click();
					  
					  // Break Time 
					  driver.findElement(By.id("break_time_input")).click();
					  driver.findElement(By.id("break_time_input")).sendKeys("90");
					  
					  // Description
					  driver.findElement(By.id("description")).click();
					  driver.findElement(By.id("description")).sendKeys("Regular Shit");
					  
					  // Create button
					  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
					  
					  
					  
					  
					  
				
				
				//Employment Status
					  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						JavascriptExecutor jse6 = (JavascriptExecutor) driver;
						jse6.executeScript("window.scroll(0,5000)");
						Thread.sleep(1000);
				
				
				
				
				
				
				
				
				
				
				//Social Links
				
				
				
				
				
				
				
			
				
				
				
				// Employee Setup
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[2]")).click(); // HRM System//
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")).click();
				
			    //Personal Detail
				driver.findElement(By.id("name")).click();
				driver.findElement(By.id("name")).sendKeys("Adams");
				Thread.sleep(1000);
				driver.findElement(By.id("phone")).click();
				driver.findElement(By.id("phone")).sendKeys("9632587410");
				Thread.sleep(1000);
				driver.findElement(By.id("dob")).click();
				driver.findElement(By.id("dob")).sendKeys("2000-08-15");
				Thread.sleep(1000);
				driver.findElement(By.id("g_female")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("g_male")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("email")).click();
				driver.findElement(By.id("email")).sendKeys("adams123@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).click();
				driver.findElement(By.id("password")).sendKeys("12345678");
				Thread.sleep(1000);
				driver.findElement(By.id("address")).click();
				driver.findElement(By.id("address")).sendKeys("New Address");
				Thread.sleep(1000);
				driver.findElement(By.id("emergency_contact")).click();
				driver.findElement(By.id("emergency_contact")).sendKeys("9632587410");
				Thread.sleep(1000);
				
				WebElement uploadElement0 = driver.findElement(By.id(""));
				uploadElement0.sendKeys("C:\\Users\\Admin\\Downloads\\1727335709_1725262393.jpg");
				
				
				WebElement uploadElement01 = driver.findElement(By.id(""));
				uploadElement01.sendKeys("C:\\Users\\Admin\\Downloads\\1725432018.png");
				Thread.sleep(1000);
				
				
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div")).click();// select company
				  Thread.sleep(1000); 
				  WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/input"));
				  inputField.sendKeys("Techzar");
				  inputField.sendKeys(Keys.ENTER);
				  
				  
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div/div")).click();// select Department
				  Thread.sleep(1000); 
				  WebElement inputField1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div[2]/input"));
				  inputField1.sendKeys("Web development");
				  inputField1.sendKeys(Keys.ENTER);
				  
				  
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div[1]/div/div")).click();// select Designation
				  Thread.sleep(1000); 
				  WebElement inputField2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div[4]/div/div/div[2]/input"));
				  inputField2.sendKeys("Senior developer");
				  inputField2.sendKeys(Keys.ENTER);
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("company_doj")).click();  // Company Date Of Joining
				  Thread.sleep(1000);
				  driver.findElement(By.id("company_doj")).sendKeys("2024");
				  Thread.sleep(1000);
				  driver.findElement(By.id("company_doj")).sendKeys(Keys.TAB);
				  Thread.sleep(1000);
				  driver.findElement(By.id("company_doj")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.id("company_doj")).sendKeys("01");
				  
				  //Select Employment status
				  
				  
				  
				  
				  
				  
				  
				  //Social Platform  // URL
				  
				  
				  
				  
				  
				  
				  
				  // Bank Account details
				  Thread.sleep(1000);
				  driver.findElement(By.id("account_holder_name")).click(); 
				  driver.findElement(By.id("account_holder_name")).sendKeys("Adams");
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("account_number")).click();
				  driver.findElement(By.id("account_number")).sendKeys("69854712010");
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					JavascriptExecutor jse05= (JavascriptExecutor) driver;
					jse05.executeScript("window.scroll(0,5000)");
					Thread.sleep(1000);
				  
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("bank_name")).click();
				  driver.findElement(By.id("bank_name")).sendKeys("ABCD Bank");
				  
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("bank_identifier_code")).click();
				  driver.findElement(By.id("bank_identifier_code")).sendKeys("HBUKGB4B - HBUK ");
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("branch_location")).click();
				  driver.findElement(By.id("branch_location")).sendKeys("New location");
				
				  Thread.sleep(1000);
				  driver.findElement(By.id("tax_payer_id")).click();
				  driver.findElement(By.id("tax_payer_id")).sendKeys("123456789");
				  
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[3]/button")).click();
				 
				  
				  
				  
				  
				  // Payroll Setup
				  
				  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
				  driver.findElement(By.xpath(" /html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[1]/a")).click();
			
				  // Employee salary  
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr/td[6]/div/a")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/a")).click(); 
				  Thread.sleep(1000);
				  driver.findElement(By.id("salary_type")).click();
				  driver.findElement(By.id("salary_type")).sendKeys("Salary Payslip");
				  Thread.sleep(1000);
				  driver.findElement(By.id("salary")).click();
				  driver.findElement(By.id("salary")).sendKeys("10000");
				  Thread.sleep(1000);
				  driver.findElement(By.id("account")).click();
				  driver.findElement(By.id("account")).sendKeys("Axis Bank");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				  // Allowance setup 
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/a")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.id("allowance_option")).click();
				  driver.findElement(By.id("allowance_option")).sendKeys("Medical allowance");
				  Thread.sleep(1000);
				  driver.findElement(By.id("type")).click();
				  driver.findElement(By.id("type")).sendKeys("Percentage");
				  Thread.sleep(1000);
				  driver.findElement(By.id("title")).click();
				  driver.findElement(By.id("title")).sendKeys("New allowance");
				  Thread.sleep(1000);
				  driver.findElement(By.id("amount")).click();
				  driver.findElement(By.id("amount")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				//Commission setup 
				  
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/a")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.id("title")).click();
				  driver.findElement(By.id("title")).sendKeys("Profit commission");
				  Thread.sleep(1000);
				  driver.findElement(By.id("type")).click();
				  driver.findElement(By.id("type")).sendKeys("Percentage");
				  Thread.sleep(1000);
				  driver.findElement(By.id("amount")).click();
				  driver.findElement(By.id("amount")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				  
				  
				  //Loan setup 
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[4]/div/div[1]/div/div[2]/a")).click(); 
				  Thread.sleep(1000);
				  driver.findElement(By.id("title")).click();
				  driver.findElement(By.id("title")).sendKeys("New Loan");
				  Thread.sleep(1000);
				  driver.findElement(By.id("type")).click();
				  driver.findElement(By.id("type")).sendKeys("Percentage");
				  Thread.sleep(1000);
				  driver.findElement(By.id("loan_option")).click();
				  driver.findElement(By.id("loan_option")).sendKeys("Car loan");
				  Thread.sleep(1000);
				  driver.findElement(By.id("amount")).click();
				  driver.findElement(By.id("amount")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.id("reason")).click();
				  driver.findElement(By.id("reason")).sendKeys("New Test");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					JavascriptExecutor jse06= (JavascriptExecutor) driver;
					jse06.executeScript("window.scroll(0,5000)");
					Thread.sleep(1000);
				  
				  
				  
				  
				//Saturation Deduction 
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[5]/div/div[1]/div/div[2]/a")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.id("deduction_option")).click();
				  driver.findElement(By.id("deduction_option")).sendKeys("PF");
				  Thread.sleep(1000);
				  driver.findElement(By.id("type")).click();
				  driver.findElement(By.id("type")).sendKeys("Fixed");
				  Thread.sleep(1000);
				  driver.findElement(By.id("title")).click();
				  driver.findElement(By.id("title")).sendKeys("New Deduction");
				  Thread.sleep(1000);
				  driver.findElement(By.id("amount")).click();
				  driver.findElement(By.id("amount")).sendKeys("100");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  

				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					JavascriptExecutor jse7= (JavascriptExecutor) driver;
					jse7.executeScript("window.scroll(0,5000)");
					Thread.sleep(1000);
				  
				  
				  
				//Other payment 
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[6]/div/div[1]/div/div[2]/a")).click(); 
				  Thread.sleep(1000);
				  driver.findElement(By.id("title")).click();
				  driver.findElement(By.id("title")).sendKeys("Commission");
				  Thread.sleep(1000);
				  driver.findElement(By.id("type")).click();
				  driver.findElement(By.id("type")).sendKeys("Fixed");
				  Thread.sleep(1000);
				  driver.findElement(By.id("amount")).click();
				  driver.findElement(By.id("amount")).sendKeys("100");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				  
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					JavascriptExecutor jse8= (JavascriptExecutor) driver;
					jse8.executeScript("window.scroll(0,5000)");
					Thread.sleep(1000);
				  
				  //Set overtime 
					Thread.sleep(1000);
				    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[7]/div/div[1]/div/div[2]/a")).click(); 
				    Thread.sleep(1000);
				    driver.findElement(By.id("rate")).click();
				    driver.findElement(By.id("rate")).sendKeys("100");
				    Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				 
				  // Leave management setup
					
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/ul/li[2]/a")).click();// Attendance
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();// Mark Attendance
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"attendanceemployee_filter\"]/div/div[2]/div/div/a[3]")).click();// Click Import button
				Thread.sleep(1000);
				WebElement uploadElement10 = driver.findElement(By.id("file"));
				uploadElement10.sendKeys("C:\\Users\\Admin\\Downloads\\sample_attendance (35).csv");// Choose attendance file as we want
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				
					
				// Create attendance 
				  
			    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[1]/div/div[1]/div/div")).click();// Select employee
				Thread.sleep(1000); 
				WebElement inputField3 = driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/input")); 
				inputField3.sendKeys("JonahBenton");
				inputField3.sendKeys(Keys.ENTER);
				
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[1]/div/div[1]/div/div[1]/div/div/button")).sendKeys(Keys.TAB);
				Thread.sleep(1000);
				WebElement dateField = driver.switchTo().activeElement();
				dateField.sendKeys("2024-10-01");
				
				Thread.sleep(1000);
				driver.findElement(By.id("clock_in")).click();
				driver.findElement(By.id("clock_in")).sendKeys("09:00AM");
				
				
				Thread.sleep(1000);
				driver.findElement(By.id("clock_out")).click();
				driver.findElement(By.id("clock_out")).sendKeys("06:00PM");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/input")).click();
				  
				
				// Payroll Setup - For payslip 
		
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"payslip_form\"]/div/div[3]/button")).click();// Generate payslip
				
				driver.findElement(By.xpath("//*[@id=\"pc-dt-render-column-cells\"]/tbody/tr/td[7]/a[1]")).click();//Click payslip
				  
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/div/div/div[1]/a[1]")).click();//Download the payslip
				Thread.sleep(3000);  
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[1]/button")).click();//Close payslip form
				
				  
				//Leave Management - For manage Leave
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[3]/ul/li[1]/a")).click();//click manage
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				Thread.sleep(1000);
			 	WebElement createleave = driver.findElement(By.id("employee_id")); 
			    Select select10 = new Select(createleave); 
			    select10.selectByVisibleText("AkeemHyde");
			    Thread.sleep(1000);  
			    WebElement createleave1 = driver.findElement(By.id("leave_type_id")); 
			    Select select20 = new Select(createleave1); 
			    select20.selectByVisibleText("Sick Leave (0/12)");  
			    Thread.sleep(1000); 
			    driver.findElement(By.id("start_date")).click();  // start date
				  Thread.sleep(1000);
				  driver.findElement(By.id("start_date")).sendKeys("2024");
				  Thread.sleep(1000);
				  driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
				  Thread.sleep(1000);
				  driver.findElement(By.id("start_date")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.id("start_date")).sendKeys("26");
			   
			    Thread.sleep(1000);
			    driver.findElement(By.id("end_date")).click();  //  End date
				  Thread.sleep(1000);
				  driver.findElement(By.id("end_date")).sendKeys("2024");
				  Thread.sleep(1000);
				  driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
				  Thread.sleep(1000);
				  driver.findElement(By.id("end_date")).sendKeys("10");
				  Thread.sleep(1000);
				  driver.findElement(By.id("end_date")).sendKeys("27");
			 
			    
                Thread.sleep(1000);
                driver.findElement(By.id("leave_reason")).click();
                driver.findElement(By.id("leave_reason")).sendKeys("Fever");
                Thread.sleep(1000);
                driver.findElement(By.id("remark")).click();
                driver.findElement(By.id("remark")).sendKeys("Fever");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/div[2]/a")).click();//Leave action
                Thread.sleep(1000);
                driver.findElement(By.id("company_approval_btn")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/div[2]/a")).click(); 
                Thread.sleep(1000);
                driver.findElement(By.id("company_reject_btn")).click();
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr/td[10]/div[2]/a")).click();
                Thread.sleep(1000);
                driver.findElement(By.id("company_approval_btn")).click();
                
                
			    //Performance Setup 
                driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/a")).click();
               // Create  Indicator                       
                driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[1]/a")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
                Thread.sleep(1000);
                WebElement indicator1 = driver.findElement(By.id("branch")); 
			    Select select30 = new Select(indicator1 ); 
			    select30.selectByVisibleText("Techzar");  
			    Thread.sleep(1000);
                WebElement indicator2 = driver.findElement(By.id("department")); 
			    Select select31 = new Select(indicator2 ); 
			    select31.selectByVisibleText("Testing");  
			    Thread.sleep(1000);  
			    WebElement indicator3 = driver.findElement(By.id("designation_id")); 
			    Select select32 = new Select(indicator3 ); 
			    select32.selectByVisibleText("Senior Tester");  
			    Thread.sleep(1000); 
			    driver.findElement(By.xpath("//*[@id=\"demo1\"]/label[2]")).click();
			    Thread.sleep(1000);   
			    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
			  
			    // Create Appraisal
			    driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[2]/a")).click();
			    driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
			    Thread.sleep(1000);
                WebElement appraisal1 = driver.findElement(By.id("branch")); 
			    Select select40= new Select(appraisal1 ); 
			    select40.selectByVisibleText("Techzar");  
			    Thread.sleep(1000);
                WebElement appraisal2 = driver.findElement(By.id("employee")); 
			    Select select41 = new Select(appraisal2); 
			    select41.selectByVisibleText("adams");    
			    Thread.sleep(1000);
			    driver.findElement(By.id("appraisal_date")).click();
			    driver.findElement(By.id("appraisal_date")).sendKeys("December");
			    driver.findElement(By.id("appraisal_date")).sendKeys(Keys.TAB);
			    driver.findElement(By.id("appraisal_date")).sendKeys("2024");
			    Thread.sleep(1000);
				driver.findElement(By.id("remark")).click(); 
				driver.findElement(By.id("remark")).sendKeys("New Appraisal");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"demo1\"]/label[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				
				// Create Goal Tracking
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[4]/ul/li[3]/a")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				Thread.sleep(1000);
				WebElement Goaltracking1 = driver.findElement(By.id("branch")); 
				Select select50= new Select(Goaltracking1); 
				select50.selectByVisibleText("Techzar");  
				Thread.sleep(1000);
				WebElement Goaltracking2 = driver.findElement(By.id("goal_type")); 
				Select select51= new Select(Goaltracking2); 
				select51.selectByVisibleText("Career goals");  
				Thread.sleep(1000); 
			    driver.findElement(By.id("start_date")).click();  // start date
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("2024");
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("11");
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("04");
			   
			    Thread.sleep(1000);
			    driver.findElement(By.id("end_date")).click();  //  End date
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("2024");
				Thread.sleep(1000);
			    driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("11");
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("06");  
				Thread.sleep(1000);
				driver.findElement(By.id("subject")).click();
				driver.findElement(By.id("subject")).sendKeys("New Try");
				Thread.sleep(1000);
				driver.findElement(By.id("target_achievement")).click();
				driver.findElement(By.id("target_achievement")).sendKeys("Goning Good");
				Thread.sleep(1000);
				driver.findElement(By.id("description")).click();
				driver.findElement(By.id("description")).sendKeys("New Goal Tracking");
				Thread.sleep(1000);
				WebElement Goaltracking3 = driver.findElement(By.id("status")); 
				Select select52= new Select(Goaltracking3); 
				select52.selectByVisibleText("In Progress");  
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"demo1\"]/label[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div/div[2]/button")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div/div[2]/table/tbody/tr/td[9]/div[1]/a/i")).click();
				Thread.sleep(1000);
			    WebElement slider = driver.findElement(By.id("myRange"));
			    int desiredValue = 25;
			    JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));", slider, desiredValue);
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
			       
				//Training setup
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
				// Create Trainer
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/ul/li[2]/a")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				Thread.sleep(1000);
				WebElement trainer1 = driver.findElement(By.id("branch"));
				Select select60 = new Select(trainer1);
				select60.selectByVisibleText("Techzar");
				Thread.sleep(1000);
				driver.findElement(By.id("firstname")).click();
				driver.findElement(By.id("firstname")).sendKeys("Vencent");
				Thread.sleep(1000);
				driver.findElement(By.id("lastname")).click();
				driver.findElement(By.id("lastname")).sendKeys("Jhon");
				Thread.sleep(1000);
				driver.findElement(By.id("contact")).click();
				driver.findElement(By.id("contact")).sendKeys("9874561230");
				Thread.sleep(1000);
				driver.findElement(By.id("email")).click();
				driver.findElement(By.id("email")).sendKeys("vencentjhon@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.id("expertise")).click();
				driver.findElement(By.id("expertise")).sendKeys("Good Trainer");
				Thread.sleep(1000);
				driver.findElement(By.id("address")).click();
				driver.findElement(By.id("address")).sendKeys("New address");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				  
				// Create Training List  
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/ul/li[1]/a")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a")).click();
				WebElement listtrainer1 = driver.findElement(By.id("branch"));
				Select select70 = new Select(listtrainer1);
				select70.selectByVisibleText("Techzar"); 
				Thread.sleep(1000);
				WebElement listtrainer2 = driver.findElement(By.id("trainer_option"));
				Select select71 = new Select(listtrainer2);
				select71.selectByVisibleText("Internal"); 
				Thread.sleep(1000);
				WebElement listtrainer3 = driver.findElement(By.id("training_type"));
				Select select72 = new Select(listtrainer3);
				select72.selectByVisibleText("Soft skills training");   
				Thread.sleep(1000);
				WebElement listtrainer4 = driver.findElement(By.id("trainer"));
				Select select73 = new Select(listtrainer4);
				select73.selectByVisibleText("Vencent");   
				Thread.sleep(1000);
				driver.findElement(By.id("training_cost")).click();
				driver.findElement(By.id("training_cost")).sendKeys("1000");
				Thread.sleep(1000);
				WebElement employee1 = driver.findElement(By.id("employee"));
				Select select80 = new Select(employee1);
				select80.selectByVisibleText("adams");
				Thread.sleep(1000); 
			    driver.findElement(By.id("start_date")).click();  // start date
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("2024");
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys(Keys.TAB);
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("11");
				Thread.sleep(1000);
				driver.findElement(By.id("start_date")).sendKeys("04");
			   
			    Thread.sleep(1000);
			    driver.findElement(By.id("end_date")).click();  //  End date
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("2024");
				Thread.sleep(1000);
			    driver.findElement(By.id("end_date")).sendKeys(Keys.TAB);
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("11");
				Thread.sleep(1000);
				driver.findElement(By.id("end_date")).sendKeys("06"); 
				Thread.sleep(1000);
				driver.findElement(By.id("description")).click();
				driver.findElement(By.id("description")).sendKeys("new training list");
				driver.findElement(By.xpath("//*[@id=\"commonModal\"]/div/div/div[2]/form/div[2]/button")).click();
				
				
				
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
	}
}
