package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ResultsTestCases {
	static ResultsSteps step = new ResultsSteps();
	static ProfileSteps stepProfile = new ProfileSteps();
	//-------------------------Resultados (Favoritos)
	
	//Método que en la pestaña de favoritos, hace tap en una competencia y verifica los resultados
	public void results_010() {
		step.tapResults();
		step.tapFavorite();
		stepProfile.iconProfile();
		stepProfile.tapFavorites();
		stepProfile.addFavorite();
		stepProfile.selectCompetition("Superliga Argentina de Fútbol");
		stepProfile.tapNext();
		stepProfile.tapFinalize();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.waitTime(1000);
		Tools.backToMenu();
	}
	
	//Método que en la pestaña favoritos hace tap en un resultado
	public void results_020() {
		step.tapResults();
		step.tapFavorite();
		stepProfile.addFavorite();
		Tools.waitTime(3000);
		step.allCompetences();
		Tools.waitTime(3000);
		stepProfile.selectCompetition("La Liga");
		stepProfile.tapNext();
		stepProfile.tapFinalize();
		Tools.waitTime(1000);
		Tools.scroll("up");
		Tools.tap();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en el resumen
	public void results_030() {
		this.results_020();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();	
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en la línea de tiempo
	public void results_040() {
		this.results_020();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en las estadísticas
	public void results_050() {
		this.results_020();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en las alineaciones
	public void results_060(){
		this.results_020();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un resultado y luego en el historial
	public void results_070() {
		this.results_020();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	
	//Método que hace tap en un  resultado y luego en la clasificación
	public void  results_080() {
		this.results_020();
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
		step.tapResults();
		step.searchCompetition("LA LIGA");
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void results_100() {
		step.tapResults();
		Tools.scroll("up");
		Tools.tap();
		Tools.backToMenu();
	}
	public void results_110(){
		this.results_100();
		step.tapSummary();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void results_120() {
		this.results_100();
		step.tapTimeLine();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void resultss_130() {
		this.results_100();
		step.tapStats();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void results_140() {
		this.results_100();
		step.tapAlignments();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void results_150() {
		this.results_100();
		step.tapAlignments();
		step.tapBackground();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
	public void results_0160() {
		this.results_100();
		step.tapAlignments();
		step.tapBackground();
		step.tapClasification();
		Tools.waitTime(1000);
		Tools.scrollChecker();
		Tools.backToMenu();
	}
}
