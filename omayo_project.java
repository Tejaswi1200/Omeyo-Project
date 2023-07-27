package omego_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class omayo_project {

	public static void main(String[] args) throws InterruptedException {
		Select s;
		System.setProperty("webdriver.chrome.driver", "D:\\Edubridge\\Automation Testing\\Browser Extension\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//URL
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		
		//Blogs
		driver.findElement(By.xpath("//*[@id=\"blogsmenu\"]")).click();
		
		//Link
		driver.findElement(By.xpath("//*[@id=\"link1\"]")).click();
		driver.navigate().back();
		
		//MultiSelection Blog
		driver.findElement(By.xpath("//*[@id=\"multiselect1\"]/option[2]")).click();
		Thread.sleep(2000);
		
		//DropDown
		s=new Select(driver.findElement(By.xpath("//*[@id=\"drop1\"]")));
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		//selenium 143
		driver.findElement(By.id("link2")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//selenium 143 -2
		driver.findElement(By.xpath("//*[@id=\"link2\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Text box with preloaded text
		System.out.println(driver.findElement(By.xpath("//*[@id=\"textbox1\"]")).getText());
		
		//Open in new window link
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[8]/div[1]/a")).click();
		Thread.sleep(2000);
		
		String MainWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> sl = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> il=sl.iterator();
		Thread.sleep(2000);
		while(il.hasNext())
		{
			String ChildWindow = il.next();
			Thread.sleep(2000);
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
				

				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		//click on Enabled button
		driver.findElement(By.xpath("//*[@id=\"but2\"]")).click();
		Thread.sleep(2000);
		
		//Buttons with same name attribute
		//submit
		driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[2]")).click();
		Thread.sleep(2000);
		
		//Register
//		driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[3]")).click();
//		Thread.sleep(2000);
		
		//Display for time and Disaapear
		driver.findElement(By.xpath("//*[@id=\"alert2\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Open POPUp window
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[17]/div[1]/p/a")).click();
		Thread.sleep(2000);
		
		String MainWindow1 = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> sl1 = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> il1=sl1.iterator();
		Thread.sleep(2000);
		while(il1.hasNext())
		{
			String ChildWindow = il1.next();
			Thread.sleep(2000);
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
				

				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		//Timer enable Button
		driver.findElement(By.id("alert2")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Disable Enable Button
		driver.findElement(By.xpath("//*[@id=\"myBtn\"]")).click();
		
		//Tryit
		driver.findElement(By.xpath("//*[@id=\"HTML44\"]/div[1]/button[2]")).click();
		
		//Button x
		driver.findElement(By.xpath("//*[@id=\"button9\"]")).click();
		
		//Button y
		driver.findElement(By.xpath("//*[@id=\"button9\"]")).click();
		
		//double click
		Actions a = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		a. doubleClick (link).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Check this
		driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dte\"]")).click();
		Thread.sleep(2000);
		
		//Page One
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Home
		driver.findElement(By.xpath("//*[@id=\"blog-pager\"]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Subscribe to :Posts
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a")).click();
        Thread.sleep(2000);
		
        String MainWindow2 = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Set<String> sl2 = driver.getWindowHandles();
		Thread.sleep(2000);
		Iterator<String> il2=sl2.iterator();
		Thread.sleep(2000);
		while(il2.hasNext())
		{
			String ChildWindow = il2.next();
			Thread.sleep(2000);
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
				

				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		
		//text
		driver.findElement(By.id("ta1")).sendKeys("Welcome to omeyo selenium project");
		Thread.sleep(2000);
		
		//text2
		//clear
		driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).clear();
		Thread.sleep(2000);
		//enter new text
		driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).sendKeys("Omayo Blogspots");
		Thread.sleep(2000);
		
		//Html Form
		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys("samwi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys("Sam@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/button")).click();
		
		//Iframe
//		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[6]/div[1]/iframe[1]")));
//		Actions a1= new Actions(driver);
//			
//		WebElement src=driver.findElement(By.id("iframe1"));  //src - source
//		WebElement des=driver.findElement(By.id("iframe2"));  //dec - destination
//		Thread.sleep(5000);
//		
//		a.dragAndDrop(src, des).perform();
//		Thread.sleep(5000);
		
		//Simple Login Page
		//Username
		driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("Samwi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[2]")).sendKeys("Samwi@1200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		//Search this Blog
		driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input")).sendKeys("Books");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).click();
		Thread.sleep(2000);
		
		//Radio button(male/female)
		driver.findElement(By.xpath("//*[@id=\"radio1\"]")).click();
		Thread.sleep(2000);
		
		//Alert demo
		driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//uncheck box
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Thread.sleep(2000);
		
		//check box
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		Thread.sleep(2000);
		
		
		//Get Prompt
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		//alert message
		driver.switchTo().alert().sendKeys("Samwi");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//locate using name attribute
		driver.findElement(By.name("textboxn")).sendKeys("Omayo.blogspot");
		
		//Other sites to practice
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[2]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[3]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[4]/a")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[5]/a")).click();
		driver.navigate().back();
		
		//same id
//		driver.findElement(By.xpath("//*[@id=\"sa\"]")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		//locate using class
		driver.findElement(By.className("classone")).sendKeys("Blogs");
		
		
		//alert message
		driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//select vehicle
		driver.findElement(By.xpath("//*[@id=\"HTML32\"]/div[1]/input[3]")).click();
		
		//Multiple values
		driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
		
		//Blogger
		driver.findElement(By.xpath("//*[@id=\"Attribution1\"]/div[1]/a")).click();
		 Thread.sleep(2000);
			
		 String MainWindow3 = driver.getWindowHandle();
			Thread.sleep(2000);
			
			Set<String> sl3 = driver.getWindowHandles();
			Thread.sleep(2000);
			Iterator<String> il3=sl3.iterator();
			Thread.sleep(2000);
			while(il3.hasNext())
			{
				String ChildWindow = il3.next();
				Thread.sleep(2000);
				
				if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
					driver.switchTo().window(ChildWindow);
					
					JavascriptExecutor js=(JavascriptExecutor)driver;
					
					js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
					

					driver.close();
				}
			}
			driver.switchTo().window(MainWindow);
		
	driver.close();

	}

}
