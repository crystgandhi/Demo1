package myexercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	
	 

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver	driver = new ChromeDriver();
		Dimension sizeOfWindow = driver.manage().window().getSize();
		System.out.println(sizeOfWindow);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dropdown")).click();
		//driver.get("https://the-internet.herokuapp.com/dropdown");
		
		List<WebElement> elements=driver.findElements(By.id("dropdown"));
		Select selectElement=new Select((WebElement) elements);
		
		selectElement.selectByIndex(2);
		
	}

}
