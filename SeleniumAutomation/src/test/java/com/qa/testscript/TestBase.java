package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.qa.pages.SpotifyPage;

public class TestBase {

	WebDriver driver;
	SpotifyPage Spotit;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Driver Executables\\chromedriver.exe");
		driver= new ChromeDriver();
		 Spotit=new SpotifyPage(driver);
		driver.get("https://www.spotify.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
