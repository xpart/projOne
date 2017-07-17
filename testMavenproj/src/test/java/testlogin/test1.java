package testlogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void openApp(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}
