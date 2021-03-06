package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class NewsSteps {
	static FoxSports foxSports = new FoxSports();
	
	//Method that looks for competitions and verifies if you have news
	public void searchCompetitions() {
		int contador=0;
		int contador2 = 0;	
		Tools.searchPath("(//XCUIElementTypeStaticText[@name=\"TODAS LAS COMPETENCIAS\"])[2]");
		while(contador<5) {
			this.scrollNews("abajo");	
			Tools.searchId("Filtrar");	
			Tools.searchPath("//XCUIElementTypeImage[@name=\"black_arrow_down\"]");
			contador++;			
		}		
		//driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"TODAS LAS COMPETENCIAS\"])[2]")).click();
		//Tools.searchPath("(//XCUIElementTypeStaticText[@name=\"TODAS LAS COMPETENCIAS\"])[2]");
		while(contador2<5) {
			this.scrollNews("up");	
			Tools.waitTime(500);
			contador2++;					
		}
		Tools.searchId("Filtrar");	
	}
	
	//Scroll method to select in the "Picker Wheel"
	public static void scrollNews(String direction) {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / 2);
		int startPointY = ((dimensions.getHeight() /2)+100);
		int endPointY;

		if (direction.equals("abajo")) {
			endPointY = (int) (dimensions.getHeight() * -0.30);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		} else if (direction.equals("arriba")) {
			endPointY = (int) (dimensions.getHeight() * 0.30);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		}		
	}
	
	//Method that searches if there is news available at that moment
	public void searchNews(){
		Boolean isPresent=foxSports.driver.findElements(By.id("No hay noticias disponibles en este momento.")).size()>0;
		
		if(isPresent) {
			System.err.println("No news available at this time.");
			Tools.failTotal+=1;
		}else {
			System.out.println("Yes there are news available");
			Tools.waitTime(1000);
			foxSports.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]"
					+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
					+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
					+ "/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView"
					+ "/XCUIElementTypeCell[1]")).click();
			Tools.successTotal+=1;
			Tools.waitTime(10000);
			
		}
	}
}
