package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class ResultsSteps {
	static FoxSports foxSports = new FoxSports();
	static ProfileSteps stepProfile = new ProfileSteps();
	int counter2=1;
	
	//Method to tap in Results
	public void tapResults() {
		Tools.searchId("Resultados");
	}
	
	//Method to select All Competitions to add them to favorites
	public void allCompetences() {
		Tools.specificSearch("select", "(//XCUIElementTypeButton[@name=\"VER TODAS LAS COMPETENCIAS\"])[2]", 2);
	}
	
	//Method to make a summary tap
	public void tapSummary() {
		Tools.searchId(("RESUMEN"));
	}
	
	//Method to tap on a timeline
	public void tapTimeLine() {
		Tools.searchId("LÍNEA DE TIEMPO");	
	}
	
	//Método para hacer tap en estadísticas
	public void tapStats() {
		Tools.searchId("ESTADÍSTICAS");
	}
	
	//Method to tap in alignments
	public void tapAlignments() {
		Tools.searchId("ALINEACIONES");
	}
	
	//Method to tap in History
	public void tapBackground() {
		Tools.searchId("HISTORIAL");
	}
	
	//Method for tap classification
	public void tapClasification() {
		Tools.searchId("CLASIFICACIÓN");
	}
	
	//Method to tap in Favorites
	public void tapFavorite() {
		Tools.searchId("FAVORITOS");
	}
	
	//Method that seeks a competition
	public void searchCompetition(String comp) {
		Boolean isPresent = FoxSports.driver.findElements(By.id(comp)).size()>0;
		String source;
		String source2;
		
		while(!isPresent) {
			System.out.println("It is not present");
			Tools.scroll("up");
			source = foxSports.driver.getPageSource();
			isPresent = foxSports.driver.findElements(By.id(comp)).size()>0; 
		}
		if(isPresent) {
			System.out.println("Si está presente");
			Boolean isVisible = foxSports.driver.findElement(By.id(comp)).isDisplayed();
			System.out.println("It will be verified if it is visible");
			while(!isVisible) {
				Tools.scroll("up");
				source = foxSports.driver.getPageSource();
				isVisible =  foxSports.driver.findElement(By.id(comp)).isDisplayed();
				if(isVisible) {
					System.out.println("It is visible");
					break;
				}
				source2 = foxSports.driver.getPageSource();
				if(source.equals(source2)) {
					System.err.println("There is no competition with that name");
					Tools.failTotal+=1;
					break;
				}
				
			}
			if(isVisible) {
				Tools.searchId(comp);
			}	
		}
		
	}
	
	//Method that adds bookmarks if necessary.
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

	//Scrolling method
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
	
	//Method that enters favorites.
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
	
	//Method that enters all.
	public void auxResultsAll() {
		tapResults();
		Tools.searchId("TODOS");
		if(counter2<2) {
			scrollUp();
		}		
		Tools.tap();
		counter2+=1;
	}
}
