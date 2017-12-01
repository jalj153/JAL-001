package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class RadioTestCases {
	static FoxSports foxSports = new FoxSports();
	static RadioSteps step = new RadioSteps();
	static InLiveSteps stepLive = new InLiveSteps();
	static Tools tools = new Tools();
	
	//Method that checks radios live
	public void radio_010() {
		Tools.takeSpace();
		System.out.println("----------Radio_010----------");
		Tools.searchId("Radio");
		try {
			step.radioLive();
		}catch(Exception e) {
			System.out.println(" ");
		}
		
	}
	
	//Method to show the "morning" programming
	public void radio_020() {
		Tools.takeSpace();
		System.out.println("----------Radio_020----------");
		Tools.searchId("Radio");
		stepLive.searchLives("MAÑANA");
		try {
			stepLive.checkLives("MAÑANA");
		}catch(Exception e) {System.out.println(" ");}
		//Tools.backToMenu();
	}
	
	//Method that shows the programming of the following days
	public void radio_030() {
		Tools.takeSpace();
		System.out.println("---------Radio_030----------");
		Tools.searchId("Radio");
		Tools.scrollDown();
		Tools.backToMenu();
	}
	
	//Play a radio that is broadcasting live.
	public void radio_040() {
		Tools.takeSpace();
		System.out.println("----------Radio_040----------");
		Tools.searchId("Radio");
		Tools.scrollUp();
		step.playRadio();
		Tools.backToMenu();
	}
	
	
	
	
}
