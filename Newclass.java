package NewLearning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class Newclass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gadgetz.stagingzar.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://gadgetz.stagingzar.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[1]/div/ul/li")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys("sasiselvaraj1112@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.id("review")).sendKeys("Yasar@12345");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/form/div[3]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[2]/div[2]/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[3]/div/div[1]/div/div[2]/div/div/div/button")).click();
	    Thread.sleep(3000);
        String filepath ="C:\\Users\\Admin\\Downloads\\messi2-removebg-preview (1).png";
        StringSelection selection = new StringSelection (filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
        Robot robot = new Robot();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
	    
        driver.quit();
	}
	
}


		
		
    	  
		
	
		  //Actions act = new Actions(driver);
		 // act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform();//Mobile, Tablets & More 
		//  Thread.sleep(3000);
		//  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[1]/a/span")).click();//Mobile phones 
		//  Thread.sleep(3000);
		//  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		//  Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[2]/a/span")).click();//Tablets 
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		  //Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[3]/a/span")).click();//Wearables 
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		  //Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[4]/a/span")).click();//Cases & Covers 
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		  //Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[5]/a/span")).click();//Power bank 
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		  //Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[6]/a/span")).click();//E-Readers 
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[2]"))).build().perform(); 
		  //Thread.sleep(3000); 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/div/dl/dt[7]/a/span")).click();//Cables & Charger // 
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform();//Computers & Peripherals 
		  //Thread.sleep(3000);
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[1]/a/span")).click();//Laptops 
		  //Thread.sleep(3000);
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	      //Thread.sleep(5000); 
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[2]/div/dl/dt[2]/a/span")).click();//Monitors 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	      //Thread.sleep(3000); 
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[3]/a/span")).click();//Drives & Storage 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	      //Thread.sleep(3000); 
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[4]/a/span")).click();//Networking 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	     // Thread.sleep(3000); 
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[5]/a/span")).click();//Keyboards & Mice 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	      //Thread.sleep(3000); 
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[6]/a/span")).click();//PC Gaming 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().perform(); 
	      //Thread.sleep(3000);
	      //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[7]/a/span")).click();//Computer Speakers 
	      //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/a/span[2]"))).build().
		  //perform(); Thread.sleep(3000); driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[2]/div/dl/dt[8]/a/span")).click();//Hubs & Other Components // 
		  //Thread.sleep(6000);
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/a/span[2]"))).build().perform();//Other Electronics 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/div/dl/dt[1]/a/span")).click();//Cameras & their Accessories 
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/a/span[2]"))).build().perform();//Other Electronics 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/div/dl/dt[2]/a/span")).click();//Consoles & Gaming 
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/a/span[2]"))).build().perform();//Other Electronics 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/div/dl/dt[3]/a/span")).click();//Heaphones 
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/a/span[2]"))).build().perform();//Other Electronics 
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[3]/div/dl/dt[4]/a/span")).click();//Speakers 
		  //Thread.sleep(3000); 
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/a/span[2]"))).build(). perform();//Car & Vehicle Electronics
		  //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/div/dl/dt[1]/a/span")). click();//Dash Cameras
		  //Thread.sleep(3000);
		 // act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/a/span[2]"))).build(). perform();//Car & Vehicle Electronics
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/div/dl/dt[2]/a/span")). click();//In-Dash Video Devices
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/a/span[2]"))).build(). perform();//Car & Vehicle Electronics
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[4]/div/dl/dt[3]/a/span")). click();//Jump Starters
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/a/span[2]"))).build(). perform();//Smart Home Improvements
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/div/dl/dt[1]/a/span")). click();//Smart Home Speakers
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/a/span[2]"))).build(). perform();//Smart Home Improvements
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/div/dl/dt[2]/a/span")). click();//Media Streaming Devices
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/a/span[2]"))).build().  perform();//Smart Home Improvements
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/div/dl/dt[3]/a/span")). click();//Home Security
		  //Thread.sleep(3000);
		  //act.moveToElement(driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/a/span[2]"))).build().perform();//Smart Home Improvements
		  //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[5]/div/dl/dt[4]/a/span")). click();//Home Improvements
		  //Thread.sleep(3000);
		  //driver.navigate().to("https://gadgetz.stagingzar.com/"); Thread.sleep(6000);
		  //JavascriptExecutor jse = (JavascriptExecutor) driver;
		  //jse.executeScript("window.scroll(0,5000)"); Thread.sleep(300);
		   //driver.navigate().back(); Thread.sleep(3000); driver.navigate().forward();
			
			
		   //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[2]/div[2]/div[2]/ul/li[7]/a/span" )).click();// Change password 
		   //Thread.sleep(3000);
		   //driver.findElement(By.xpath("//*[@id=\"old_password\"]")).sendKeys( "Yasar@123"); 
		   //Thread.sleep(3000);
		   //driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("Yasar@12345"); 
		   //Thread.sleep(3000);
		   //driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).sendKeys( "Yasar@12345"); 
		   //Thread.sleep(3000); 
		   //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[3]/div/div/div[1]/div[4]/div/div/div/button/span")).click();// Updated password 
		   //Thread.sleep(3000); 
		   //driver.navigate().back();
		   //Thread.sleep(2000); 
		   //driver.findElement(By.xpath( "//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[2]/div[2]/div[2]/ul/li[2]/a/span")).click(); 
		   //Thread.sleep(2000); 
		   //driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/section/div/div/div[3]/div/div[1]/div/div[2]/div/div/div/button" )).click();
			 
			  
			                
		      
				
				  //TakesScreenshot ts=(TakesScreenshot) driver; File source =
				  //ts.getScreenshotAs(OutputType.FILE); File sourceFile = new
				  //File("C:\\Users\\Admin\\eclipse-workspace\\LearningNew\\snap\\pic.png");
				  //FileHandler.copy(source, sourceFile);
				 
		 
	//driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[1]/div/nav/h5")).click();
	//Thread.sleep(3000);
	//driver.quit();	
	
	


























