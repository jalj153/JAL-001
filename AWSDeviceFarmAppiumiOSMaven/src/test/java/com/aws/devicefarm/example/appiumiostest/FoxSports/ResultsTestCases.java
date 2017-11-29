package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class ResultsTestCases {
	static ResultsSteps step = new ResultsSteps();
	static ProfileSteps stepProfile = new ProfileSteps();
	int counter=1;
	//-------------------------Resultados (Favoritos)
	
	//Método que en la pestaña de favoritos, hace tap en una competencia y verifica los resultados
	public void results_010() {
		System.out.println("Results 010");
		step.tapResults();
		step.tapFavorite();
		Boolean isPresent = FoxSports.driver.findElements(By.name("AGREGAR")).size()>0;
		if(isPresent) {
			Boolean isVisible = FoxSports.driver.findElement(By.name("AGREGAR")).isDisplayed();
			if(isVisible) {
				stepProfile.iconProfile();
				stepProfile.tapFavorites();
				stepProfile.addFavorite();
				stepProfile.selectCompetition("Superliga Argentina de Fútbol");
				stepProfile.tapNext();
				stepProfile.tapFinalize();
				Tools.waitTime(1000);
				Tools.backToMenu();
			}	
		}else if(!isPresent) {
			System.out.println("Ya hay favoritos agregados");
		}
		
	}
	
	//Método que en la pestaña favoritos hace tap en un resultado
	public void results_020() {
		System.out.println("Results 020");
		step.tapResults();
		step.tapFavorite();
		Boolean isPresent = FoxSports.driver.findElements(By.name("AGREGAR")).size()>0;
		if(isPresent) {
			step.addFavorites();
		}else if(!isPresent) {
			Tools.scroll("up");
			Tools.tap();
		}
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en el resumen
	public void results_030() {
		System.out.println("Results 030");
		step.auxResultsFavorites();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();	
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en la línea de tiempo
	public void results_040() {
		System.out.println("Results 040");
		step.auxResultsFavorites();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en las estadísticas
	public void results_050() {
		System.out.println("Results 050");
		step.auxResultsFavorites();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en las alineaciones
	public void results_060(){
		System.out.println("Results 060");
		step.auxResultsFavorites();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en el historial
	public void results_070() {
		System.out.println("Results 070");
		step.auxResultsFavorites();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un  resultado y luego en la clasificación
	public void  results_080() {
		System.out.println("Results 080");
		step.auxResultsFavorites();
		step.tapAlignments();
		step.tapBackground();
		step.tapClasification();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	
	//----------------------Resultados (Todos)
	
	//Método que en la pestaña de todos hace un tap a un resultado
	public void results_090() {
		System.out.println("Results 090");
		step.tapResults();
		Tools.searchId("TODOS");
		//step.searchCompetition("LA LIGA");
		Tools.searchName("black_disclosure");
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado
	public void results_100() {
		
		System.out.println("Results 100");
		step.tapResults();
		Tools.searchId("TODOS");
		step.scrollUp();
		Tools.tap();
		Tools.backToMenu();
		
	}
	
	//Método que hace tap en un resultado y verifica el resumen
	public void results_110(){
		System.out.println("Results 110");
		step.auxResultsAll();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y verifica la línea de tiempo
	public void results_120() {
		System.out.println("Results 120");
		step.auxResultsAll();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y verifica las estadísticas
	public void resultss_130() {
		System.out.println("Results 130");
		step.auxResultsAll();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y verifica las alineaciones
	public void results_140() {
		System.out.println("Results 140");
		step.auxResultsAll();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y verifica el historial
	public void results_150() {
		System.out.println("Results 150");
		step.auxResultsAll();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y verifica la clasificación
	public void results_160() {
		System.out.println("Results 160");
		step.auxResultsAll();
		step.tapAlignments();
		step.tapBackground();
		step.tapClasification();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
}
