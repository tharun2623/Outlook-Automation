import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.timer.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OLX_Selenium {

	//OLX Automation
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.olx.in/en-in");
		driver.findElement(By.className("rui-apowA")).click();
		driver.findElement(By.className("rui-oAVsQ")).click();
		driver.findElement(By.className("rui-6OoLS")).sendKeys("9894927532");
//		driver.findElement(By.className("rui-Bz2UM")).click();
		
//		driver.findElement(By.id("email_input_field")).sendKeys("rtharunprasaath@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("tharun23");
//		driver.findElement(By.className("rui-apowA")).click();
		driver.quit();
		
	}
}
