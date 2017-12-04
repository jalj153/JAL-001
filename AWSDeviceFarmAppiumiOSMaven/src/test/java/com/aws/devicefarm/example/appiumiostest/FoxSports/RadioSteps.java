package com.aws.devicefarm.example.appiumiostest.FoxSports;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSElement;

public class RadioSteps {
	static FoxSports foxSports = new FoxSports();
	
	//Method to select a live radio
	public void playRadio() {
		int contador = 0;
		List<IOSElement> playBtns = foxSports.driver.findElements(By.name("playBtn"));
		Boolean isPresent = playBtns.size() > 0;
		if(!isPresent) {
			System.err.println("None found");
			Tools.failTotal+=1;
		}
		if (isPresent) {
			for (IOSElement elem : playBtns) {
				elem = playBtns.get(contador);
				elem.click();
				contador++;
				
				Tools.waitTime(10000);
				if (elem == playBtns.get(playBtns.size() - 1)) {
					elem.click();
					Tools.successTotal+=1;
				}
			}
		}
	}
	
	//Method that verifies whether or not there are live broadcasts
	public void radioLive() {
		Boolean isPresent = foxSports.driver.findElements(By.id("EN VIVO")).size()>0;
		
		if(isPresent) {
			Boolean isVisible = foxSports.driver.findElement(By.id("EN VIVO")).isDisplayed();
			if(isVisible) {
				System.out.println("Yes there are live broadcasts");
				Tools.successTotal+=1;
			}else {
				System.out.println("No live broadcasts");
				Tools.failTotal+=1;
			}
		}
		
	}
	
}
