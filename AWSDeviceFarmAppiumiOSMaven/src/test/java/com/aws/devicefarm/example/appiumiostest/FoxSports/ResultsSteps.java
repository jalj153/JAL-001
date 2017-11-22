package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class ResultsSteps {
	static FoxSports foxSports = new FoxSports();
	
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
}
