package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;
import java.net.URL;

public class FoxSports {
	static LoginTestCases login = new LoginTestCases();
	static ResultsTestCases results= new ResultsTestCases();
	static InLiveTestCases live= new InLiveTestCases();
	static RadioTestCases radio = new RadioTestCases();
	static NewsTestCases news = new NewsTestCases();
	static CompetitionsTestCases competitions = new CompetitionsTestCases();
	public static IOSDriver<IOSElement> driver;
	static Tools tools = new Tools();

	@BeforeMethod(alwaysRun=true)
  public void beforeMethod() throws MalformedURLException{
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("app", "/Users/imac/Desktop/UI Test/Aplicaciones/FOXSports.app");
		capabilities.setCapability("noReset", "false");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.7.1");
		

		URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new IOSDriver<IOSElement>(appiumURL, capabilities);
	  
  }
  
  @Test(alwaysRun=true) 
  public void f() throws MalformedURLException{
	  tools.searchId("Allow");
	  tools.searchId("OMITIR");
	  tools.searchId("OK");
	  login.login_020();
	 // results.results_080();
	  //live.inLive_080();
	  //results.Resultados_010();
	 // radio.radio_030();
	 // news.news_020();
	  //competitions.competitions_160();
	  live.inLive_070();
  }
  
  @AfterMethod
  public void afterMethod() {
	driver.quit();
  }
}
