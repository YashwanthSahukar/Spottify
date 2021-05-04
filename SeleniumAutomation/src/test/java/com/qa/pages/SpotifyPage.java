package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyPage {
	WebDriver driver;
	
	@FindBy(linkText="Download")
	WebElement SpotifyDownload;
	
	public WebElement getSpotifyDownload() {
		return SpotifyDownload;
		
	}
	
	@FindBy(xpath = "//*[@id=\"__next\"]/main/section[1]/div/div/button/div[1]")
	WebElement DownloadBtn;
	
	public WebElement getDownloadBtn() {
		return DownloadBtn;
		
	}
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[1]/header/div/nav/ul/li[6]/a")
	WebElement LoginLink;
	
	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	
	@FindBy(xpath = "//*[@id=\"login-username\"]")
	WebElement EmailIdTextField;
	
	public WebElement getEmailIdTextField() {
		return EmailIdTextField;
	}
	
	@FindBy(xpath="//*[@id=\"login-password\"]")
	WebElement PasswordTextField;
	
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement Loginbtn;
	
	public WebElement getLoginbtn() {
		return Loginbtn;
		
	}
	
	public SpotifyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
