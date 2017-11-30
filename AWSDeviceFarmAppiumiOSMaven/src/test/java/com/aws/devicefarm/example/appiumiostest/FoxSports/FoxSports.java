package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSMobileCommandHelper;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FoxSports {
	static LoginTestCases login = new LoginTestCases();
	static ProfileTestCases profile = new ProfileTestCases();
	static ResultsTestCases results= new ResultsTestCases();
	static InLiveTestCases live= new InLiveTestCases();
	static RadioTestCases radio = new RadioTestCases();
	static NewsTestCases news = new NewsTestCases();
	static CompetitionsTestCases competitions = new CompetitionsTestCases();
	public static IOSDriver<IOSElement> driver;
	static Tools tools = new Tools();
	int foxTimeOut=7;
	
	@BeforeMethod(alwaysRun=true)
  public void beforeMethod() throws MalformedURLException{
		
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("app", "/Users/imac/Desktop/UI Test/Aplicaciones/FOXSportss.app");
		capabilities.setCapability("noReset", "false");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.7.1");
		

		URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new IOSDriver<IOSElement>(appiumURL, capabilities);
		driver.manage().timeouts().implicitlyWait(foxTimeOut, TimeUnit.SECONDS);
	  
  }
  
  @Test(alwaysRun=true) 
  public void f() throws MalformedURLException{
	  tools.searchId("Allow");
	  tools.searchId("OMITIR");
	  tools.searchId("OK");
	  
	  
	  ///////////Login
	  
	  login.login_020();
	 
	  ///////////Profile
	  
	 // profile.profile_010();
	  /*profile.profile_020();
	  profile.profile_030();
	  profile.profile_040();
	  profile.profile_050();
	  profile.profile_060();
	  profile.profile_070();
	  profile.profile_080();
	  */
	  
	  //////////Competitions
	  /*
	  competitions.competitions_010();
	  competitions.competitions_020();
	  competitions.competitions_030();
	  competitions.competitions_040();
	  competitions.competitions_050();
	  competitions.competitions_060();
	  competitions.competitions_070();
	  competitions.competitions_080();
	  competitions.competitions_090();
	  competitions.competitions_100();
	  competitions.competitions_110();
	  competitions.competitions_120();
	  competitions.competitions_130();
	  competitions.competitions_140();
	  competitions.competitions_150();
	  competitions.competitions_160();
	  */
	  ///////////////News
	  /*
	  news.news_010();
	  news.news_020();
	  */
	  ///////////////Radio
	   /*
	  radio.radio_010();
	  radio.radio_020();
	  radio.radio_030();
	  radio.radio_040();
	  */
	  //////////Results
	  /*
	  results.results_010();
	  results.results_020();
	  results.results_030();
	  results.results_040();
	  results.results_050();
	  results.results_060();
	  results.results_070();
	  results.results_080();
	  results.results_090();
	  results.results_100();
	  results.results_110();
	  results.results_120();
	  results.resultss_130();
	  results.results_140();
	  results.results_150();
	  results.results_160();
	  */
	  //////////In Live
	  /*
	  live.inLive_010();
	  live.inLive_020();
	  live.inLive_030();
	  live.inLive_040();
	  live.inLive_050();
	  live.inLive_060();
	  live.inLive_070();
	  live.inLive_080();
	  live.inLive_090();
  	  */
	  
	  tools.controlFails();
	  
  }

  
  @AfterMethod
  public void afterMethod() {
	driver.quit();
  }
}
