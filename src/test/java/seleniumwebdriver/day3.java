package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new FirefoxDriver();menu_Flights
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li"));
		System.out.println(elements.size());
		
		for(WebElement element:elements)
		{
			System.out.println(element.getText().equals("Flights"));
		}
		

	}

}
