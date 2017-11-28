package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class ResultsSteps {
	static FoxSports foxSports = new FoxSports();
	static ProfileSteps stepProfile = new ProfileSteps();
	int counter=1;
	//Método para hacer tap en Resultados
	public void tapResults() {
		Tools.searchId("Resultados");
	}
	
	//Método para seleccionar Todas las Competencias para agregarlas a favoritos
	public void allCompetences() {
		Tools.specificSearch("select", "(//XCUIElementTypeButton[@name=\"VER TODAS LAS COMPETENCIAS\"])[2]", 2);
	}
	
	//Método para hacer tap en resúmen
	public void tapSummary() {
		Tools.searchId(("RESUMEN"));
	}
	
	//Método para hacer tap en una línea de tiempo
	public void tapTimeLine() {
		Tools.searchId("LÍNEA DE TIEMPO");	
	}
	
	//Método para hacer tap en estadísticas
	public void tapStats() {
		Tools.searchId("ESTADÍSTICAS");
	}
	
	//Método para hacer tap en alineaciones
	public void tapAlignments() {
		Tools.searchId("ALINEACIONES");
	}
	
	//Método para hacer tap en Historial
	public void tapBackground() {
		Tools.searchId("HISTORIAL");
	}
	
	//Método para hacer tap en clasificación
	public void tapClasification() {
		Tools.searchId("CLASIFICACIÓN");
	}
	
	//Método para hacer tap en Favoritos
	public void tapFavorite() {
		Tools.searchId("FAVORITOS");
	}
	
	//Método que busca una competencia
	public void searchCompetition(String comp) {
		Boolean isPresent = FoxSports.driver.findElements(By.id(comp)).size()>0;
		String source;
		
		while(!isPresent) {
			System.out.println("No se encuentra presente");
			Tools.scroll("up");
			source = foxSports.driver.getPageSource();
			isPresent = foxSports.driver.findElements(By.id(comp)).size()>0; 
		}
		if(isPresent) {
			System.out.println("Si está presente");
			Boolean isVisible = foxSports.driver.findElement(By.id(comp)).isDisplayed();
			System.out.println("se verificará si está visible");
			while(!isVisible) {
				Tools.scroll("up");
				source = foxSports.driver.getPageSource();
				isVisible =  foxSports.driver.findElement(By.id(comp)).isDisplayed();
				if(isVisible) {
					System.out.println("Sí está visible");
					break;
				}
			}
			if(isVisible) {
				Tools.searchId(comp);
			}	
		}
		
	}
	
	//Método que agrega favoritos si es necesario.
	public void addFavorites() {
		int counter = 1;
		stepProfile.addFavorite();
		Tools.waitTime(3000);
		allCompetences();
		Tools.waitTime(3000);
		stepProfile.selectCompetition("La Liga");
		stepProfile.tapNext();
		stepProfile.tapFinalize();
		if(counter==1) {
			Tools.scroll("up");
		}
		Tools.waitTime(1000);
		Tools.tap();
		Tools.backToMenu();
		counter+=1;
	}

	//Método que hace scroll hacia arriba
	public void scrollUp() {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();
		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		startPointY=(startPointY/2);
		int endPointY;
		
		endPointY = (int) (dimensions.getHeight() * 0.8);
		touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();

	}
	
	//Método que ingresa a favoritos. 
	public void auxResultsFavorites() {
		tapResults();
		tapFavorite();
		Boolean isPresent = FoxSports.driver.findElements(By.name("AGREGAR")).size()>0;
		if(isPresent) {
			addFavorites();
		}else if(!isPresent) {
			//Tools.scroll("up");
			Tools.tap();
		}
	}
	
	//Método que ingresa a todos
	public void auxResultsAll() {
		tapResults();
		Tools.searchId("TODOS");
		if(counter<2) {
			scrollUp();
		}		
		Tools.tap();
		counter+=1;
	}
}
