package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class CompetitionsTestCases {
	static CompetitionsSteps step = new CompetitionsSteps();
	static FoxSports foxSports = new FoxSports();
	static ResultsSteps stepResults = new ResultsSteps();
	public void competitions_010() {
		Tools.searchId("Competencias");
		step.verifyCompetitions();
		Tools.backToMenu();
	}
	public void competitions_020() {
		Tools.searchId("Competencias");
		step.searchCompetition("La Liga");
		Tools.backToMenu();
	}
	public void competitions_030() {
		Tools.searchId("Competencias");
		step.searchCompetition("UEFA Champions League");
		Tools.scroll("up");
		Tools.tap();
		step.verifyTabsCompetition();
		Tools.backToMenu();
	}
	public void competitions_040() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapResults();
		Tools.scrollChecker();
		Tools.backToMenu();
		Tools.waitTime(3000);
	}
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
	public void competitions_120() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapNews();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void competitions_130() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapPosition();
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void competitions_140() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.backToMenu();
	}
	public void competitions_150() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		Tools.searchId("Barcelona");
		step.verifyTabsTeam();
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	public void competitions_160() {
		Tools.searchId("Competencias");
		step.searchCategory();
		step.tapTeam();
		step.tapStats();
		Tools.backToMenu();
		Tools.waitTime(10000);
	}
	
}
