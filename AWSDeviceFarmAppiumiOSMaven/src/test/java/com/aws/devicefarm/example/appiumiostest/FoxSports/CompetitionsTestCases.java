package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class CompetitionsTestCases {
	static CompetitionsSteps step = new CompetitionsSteps();
	static FoxSports foxSports = new FoxSports();
	static ResultsSteps stepResults = new ResultsSteps();
	
	
	//Shows Competencies available.
	public void competitions_010() {
		Tools.takeSpace();
		System.out.println("---------Competitions_010----------");
		Tools.searchId("Competencias");
		step.verifyCompetitions1();
		step.verifyCompetitions2();
		Tools.backToMenu();
	}
	
	//Go to the "search bar" and search for a competition.
	public void competitions_020() {
		Tools.takeSpace();
		System.out.println("----------Competitions_020----------");
		Tools.searchId("Competencias");
		step.searchCompetition("La Liga");
		Tools.backToMenu();
	}
	
	//Tap into a competition and verify the contents of the tabs
	public void competitions_030() {
		Tools.takeSpace();
		System.out.println("----------Competitions_030----------");
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
	
	//Tap on a soccer contest and tap on results
	public void competitions_040() {
		Tools.takeSpace();
		System.out.println("----------Competitions_040----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(3000);
	}
	
	//Tap into a soccer competition, tap on results and then on a result	
	public void competitions_050() {
		Tools.takeSpace();
		System.out.println("----------Competitions_050----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		step.verifyTabsResult();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Tap in a soccer competition, then a result and finally a summary of the match
	public void competitions_060() {
		Tools.takeSpace();
		System.out.println("----------Competitions_060----------");
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
	
	//Tap in a soccer competition, then in a result and finally in a timeline
	public void competitions_070() {
		Tools.takeSpace();
		System.out.println("----------Competitions_070----------");
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
	
	//Tap in a soccer competition, then in a result and finally in statistics
	public void competitions_080() {
		Tools.takeSpace();
		System.out.println("----------Competitions_080----------");
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
	
	//Tap in a soccer competition, then in a result and finally in alignments
	public void competitions_090() {
		Tools.takeSpace();
		System.out.println("----------Competitions_090----------");
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
	
	//Tap in a soccer competition, then in a result and finally in history
	public void competitions_100() {
		Tools.takeSpace();
		System.out.println("----------Competitions_100----------");
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
	
	//Tap in a soccer competition, then in a result and finally in classifications
	public void competitions_110() {
		Tools.takeSpace();
		System.out.println("----------Competitions_110----------");
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
	
	//Tap in a soccer competition and then in news
	public void competitions_120() {
		Tools.takeSpace();
		System.out.println("----------Competitions_120----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapNews();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Tap in a soccer competition and then in positions
	public void competitions_130() {
		Tools.takeSpace();
		System.out.println("----------Competitions_130----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapPosition();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Tap in a soccer competition and then in teams
	public void competitions_140() {
		Tools.takeSpace();
		System.out.println("----------Competitions_140----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.backToMenu();
	}
	
	//Tap in a football competition, then in teams and finally in a team.
	public void competitions_150() {
		Tools.takeSpace();
		System.out.println("----------Competitions_150----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.specificSearch("select", "Barcelona", 1);
		step.verifyTabsTeam();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Tap in a soccer competition and then in statistics
	public void competitions_160() {
		Tools.takeSpace();
		System.out.println("----------Competitions_160----------");
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		step.tapStats();
		Tools.backToMenu();
		Tools.waitTime(10000);
	}
	
	
}
