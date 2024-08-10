package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://demo.opencart.com/");
       driver.manage().window().maximize();
      // System.out.println(driver.getCurrentUrl());
       //System.out.println(driver.getPageSource());
      System.out.println(driver.getWindowHandle());
       //driver.getWindowHandles()
       // using id
      // driver.findElement(By.id("email")).sendKeys("abc@,ocm");
      // using name
      //driver.findElement(By.name("email")).sendKeys("xyz@.com");
       // using linktext
    //   driver.findElement(By.linkText("Forgotten password?")).click();
       //using partial link text
       //driver.findElement(By.partialLinkText("Forgotten")).click();
       //using class name
     List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
     System.out.println(headerlinks.size());
     
     //Using tag name
     List<WebElement> imagelinks=driver.findElements(By.tagName("img"));
     System.out.println(imagelinks.size());
	}

}
