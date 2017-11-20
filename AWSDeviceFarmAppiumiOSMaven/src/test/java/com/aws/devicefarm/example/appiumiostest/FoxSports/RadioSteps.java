package com.aws.devicefarm.example.appiumiostest.FoxSports;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSElement;

public class RadioSteps {
	static FoxSports foxSports = new FoxSports();
	//Método para seleccionar una radio en vivo
	public void playRadio() {
		int contador = 0;
		List<IOSElement> playBtns = foxSports.driver.findElements(By.name("playBtn"));
		Boolean isPresent = playBtns.size() > 0;
		if (isPresent) {
			for (IOSElement elem : playBtns) {
				elem = playBtns.get(contador);
				elem.click();
				contador++;
				
				Tools.waitTime(10000);
				if (elem == playBtns.get(playBtns.size() - 1)) {
					elem.click();
				}
			}
		}
	}
}
