package com.qa.testscript;

import org.testng.annotations.Test;

public class SpotifyScript extends TestBase {
	
	@Test
	public  void SpotiyAccount() {
		
		
		Spotit.getSpotifyDownload().click();
		Spotit.getDownloadBtn().click();
		
		Spotit.getLoginLink().click();
		Spotit.getEmailIdTextField().sendKeys("smith@test.com");
		Spotit.getPasswordTextField().sendKeys("Smith");
		Spotit.getLoginbtn().click();
		
		
	}

}
