package myexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveOver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");
	//	driver.manage().window().maximize();
		
		WebElement more=driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		Actions mouseMoveOver=new Actions(driver);
		
		mouseMoveOver.moveToElement(more).build().perform();
		
		
		

	}

}
