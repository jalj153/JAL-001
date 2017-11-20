package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class NewsTestCases {
	static NewsSteps step = new NewsSteps();
	
	public void news_010() {
		Tools.searchId("Noticias");
		step.searchCompetitions();
	}
	
	public void news_020() {
		Tools.searchId("Noticias");
		step.searchNews();
	}
}
g