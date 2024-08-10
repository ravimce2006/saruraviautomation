package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class da1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is ravis first file
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title=driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(title);
		
		if(title.equals("Your Store"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test Failed");
		}

		//driver.close();
	}

}
