package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class NewsTestCases {
	static NewsSteps step = new NewsSteps();
	
	//Método para filtrar las noticias conforme las competencias que hay
	public void news_010() {
		Tools.searchId("Noticias");
		step.searchCompetitions();
	}
	
	//Método que hace tap en cualquier noticia y ve su información
	public void news_020() {
		Tools.searchId("Noticias");
		step.searchNews();
		Tools.specificSearch("select", "\uF106 Volver al top", 1);
		//Tools.backToMenu();
		Tools.searchId("Back");
	}
}
