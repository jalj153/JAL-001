package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class ResultsTestCases {
	static ResultsSteps step = new ResultsSteps();
	static ProfileSteps stepProfile = new ProfileSteps();
	int counter=1;
	
	//-------------------------Results (Favorites)
	
	//Method that in the favorites tab, tap on a competition and verify the results
	public void results_010() {
		Tools.takeSpace();
		System.out.println("---------Results 010----------");
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
			System.out.println("There are already added favorites");
		}
		
	}
	
	//Method that in the favorites tab tap on a result
	public void results_020() {
		Tools.takeSpace();
		System.out.println("----------Results 020----------");
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
	
	//Method that makes tap in a result and then in the summary
	public void results_030() {
		Tools.takeSpace();
		System.out.println("----------Results 030----------");
		step.auxResultsFavorites();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();	
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and then on the timeline
	public void results_040() {
		System.out.println("Results 040");
		step.auxResultsFavorites();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and then on statistics
	public void results_050() {
		Tools.takeSpace();
		System.out.println("----------Results 050----------");
		step.auxResultsFavorites();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and then on the alignments
	public void results_060(){
		Tools.takeSpace();
		System.out.println("----------Results 060----------");
		step.auxResultsFavorites();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and then on the history
	public void results_070() {
		Tools.takeSpace();
		System.out.println("----------Results 070----------");
		step.auxResultsFavorites();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that makes tap in a result and then in the classification
	public void  results_080() {
		Tools.takeSpace();
		System.out.println("----------Results 080----------");
		step.auxResultsFavorites();
		step.tapAlignments();
		step.tapBackground();
		step.tapClasification();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	
	//----------------------Results (All)
	
	//Method that in the tab of all makes a tap to a result
	public void results_090() {
		Tools.takeSpace();
		System.out.println("----------Results 090----------");
		step.tapResults();
		Tools.searchId("TODOS");
		//step.searchCompetition("LA LIGA");
		Tools.searchName("black_disclosure");
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result
	public void results_100() {
		Tools.takeSpace();
		System.out.println("----------Results 100----------");
		step.tapResults();
		Tools.searchId("TODOS");
		step.scrollUp();
		Tools.tap();
		Tools.backToMenu();
		
	}
	
	//Method that does tap on a result
	public void results_110(){
		Tools.takeSpace();
		System.out.println("----------Results 110----------");
		step.auxResultsAll();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and verifies the timeline
	public void results_120() {
		Tools.takeSpace();
		System.out.println("----------Results 120----------");
		step.auxResultsAll();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and checks the statistics
	public void resultss_130() {
		Tools.takeSpace();
		System.out.println("----------Results 130----------");
		step.auxResultsAll();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that tap on a result and verify the alignments
	public void results_140() {
		Tools.takeSpace();
		System.out.println("----------Results 140----------");
		step.auxResultsAll();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and check the history
	public void results_150() {
		Tools.takeSpace();
		System.out.println("----------Results 150----------");
		step.auxResultsAll();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Method that does tap on a result and verifies the classification
	public void results_160() {
		Tools.takeSpace();
		System.out.println("----------Results 160----------");
		step.auxResultsAll();
		step.tapAlignments();
		step.tapBackground();
		step.tapClasification();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
}
