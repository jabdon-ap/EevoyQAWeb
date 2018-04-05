package Onboarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "/Users/AppPartner/Documents/Drivers/chromedriver");
		String url = "http://eevoy-web-dev.s3-website-us-east-1.amazonaws.com/login";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement loginEmail = driver.findElement(By.name("email"));
		WebElement loginPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/form/button"));
		
		loginEmail.sendKeys("jabdon+101@apppartner.com");
		loginPassword.sendKeys("SuperBoise1");
		loginButton.click();
		driver.close();
	}

}
