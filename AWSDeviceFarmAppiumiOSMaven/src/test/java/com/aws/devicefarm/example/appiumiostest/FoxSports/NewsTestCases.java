package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class NewsTestCases {
	static NewsSteps step = new NewsSteps();
	
	//Method to filter the news according to the competences that there are
	public void news_010() {
		Tools.takeSpace();
		System.out.println("----------News_010----------");
		Tools.searchId("Noticias");
		step.searchCompetitions();
	}
	
	//Method that tap on any news and see your information
	public void news_020() {
		Tools.takeSpace();
		System.out.println("----------News_020----------");
		Tools.searchId("Noticias");
		step.searchNews();
		Tools.specificSearch("select", "\uF106 Volver al top", 1);
		//Tools.backToMenu();
		Tools.searchId("Back");
	}
}
