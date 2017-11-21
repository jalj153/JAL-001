package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class CompetitionsTestCases {
	static CompetitionsSteps step = new CompetitionsSteps();
	static FoxSports foxSports = new FoxSports();
	static ResultsSteps stepResults = new ResultsSteps();
	
	
	//Muestra Competencias disponibles.
	public void competitions_010() {
		Tools.searchId("Competencias");
		step.verifyCompetitions1();
		step.verifyCompetitions2();
		Tools.backToMenu();
	}
	
	//Va al "search bar" y realiza la búsqueda de una competencia.
	public void competitions_020() {
		Tools.searchId("Competencias");
		step.searchCompetition("La Liga");
		Tools.backToMenu();
	}
	
	//Hace tap en una competencia y verifica el contenido de las tabs
	public void competitions_030() {
		Tools.searchId("Competencias");
		step.searchCompetition("UEFA Champions League");
		step.verifyTabsCompetition();
		//Tools.backToMenu();
		try {
			//foxSports.driver.findElement(By.xpath("//XCUIElementTypeSearchField[@name=\\\"Buscar Competencia\\\"]")).click();
			foxSports.driver.findElement(By.id("Clear text")).click();
		}catch(Exception e) {System.out.println("");}
		Tools.searchId("Cancel");
	}
	
	//Hace tap en una competencia de fútbol y hace tap en resultados
	public void competitions_040() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(3000);
	}
	
	//Hace tap en una competencia de fútbol, hace un tap en resultados y luego en un resultado
	public void competitions_050() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		step.verifyTabsResult();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol, luego aen un resultado y por último aresumen del partido
	public void competitions_060() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapSummary();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol, luego en un resultado y por último en línea de tiempo
	public void competitions_070() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapTimeLine();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);		
	}
	
	//Hace tap en una competencia de fútbol, luego en un resultado y por último en estadísticas
	public void competitions_080() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapStats();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol, luego en un resultado y por último en alineaciones
	public void competitions_090() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapAlignments();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol, luego en un resultado y por último en historial
	public void competitions_100() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapAlignments();
		stepResults.tapBackground();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol, luego en un resultado y por último en clasificaciones
	public void competitions_110() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		stepResults.tapAlignments();
		stepResults.tapBackground();
		stepResults.tapClasification();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol y luego en noticias
	public void competitions_120() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapNews();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Hace tap en una competencia de fútbol y luego en posiciones
	public void competitions_130() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapPosition();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Hace tap en una competencia de fútbol y luego en equipos
	public void competitions_140() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.backToMenu();
	}
	
	//Hace tap en una competencia de fútbol, luego en equipos y por último en un equipo.
	public void competitions_150() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.specificSearch("select", "Barcelona", 1);
		step.verifyTabsTeam();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Hace tap en una competencia de fútbol y luego en estadísticas
	public void competitions_160() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		step.tapStats();
		Tools.backToMenu();
		Tools.waitTime(10000);
	}
	
	
}
