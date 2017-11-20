package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class RadioTestCases {
	static FoxSports foxSports = new FoxSports();
	static RadioSteps step = new RadioSteps();
	static InLiveSteps stepLive = new InLiveSteps();
	static Tools tools = new Tools();
	
	
	public void radio_020() {
		Tools.searchId("Radio");
		stepLive.searchLives("MAÑANA");
		try {
			stepLive.checkLives("MAÑANA");
		}catch(Exception e) {System.out.println(" ");}
		Tools.backToMenu();
	}
	public void radio_030() {
		Tools.searchId("Radio");
		stepLive.getDate();
		Tools.backToMenu();
	}
	public void radio_040() {
		Tools.searchId("Radio");
		step.playRadio();
		Tools.backToMenu();
	}
	
	
	
	
}
