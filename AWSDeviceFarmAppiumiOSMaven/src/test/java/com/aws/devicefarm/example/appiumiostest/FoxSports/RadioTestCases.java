package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class RadioTestCases {
	static FoxSports foxSports = new FoxSports();
	static RadioSteps step = new RadioSteps();
	static InLiveSteps stepLive = new InLiveSteps();
	static Tools tools = new Tools();
	
	//Método que verifica las radios en vivo
	public void radio_010() {
		Tools.searchId("Radio");
		try {
			step.radioLive();
		}catch(Exception e) {
			System.out.println(" ");
		}
		
	}
	
	//Método para mostrar la programación de "mañana"
	public void radio_020() {
		Tools.searchId("Radio");
		stepLive.searchLives("MAÑANA");
		try {
			stepLive.checkLives("MAÑANA");
		}catch(Exception e) {System.out.println(" ");}
		//Tools.backToMenu();
	}
	
	//Método que muestra la programación de los siguientes días
	public void radio_030() {
		System.out.println("Radio_030");
		Tools.searchId("Radio");
		Tools.scrollDown();
		Tools.backToMenu();
	}
	
	//Reproduce una radio que esté transmitiendo en vivo.
	public void radio_040() {
		Tools.searchId("Radio");
		Tools.scrollUp();
		step.playRadio();
		Tools.backToMenu();
	}
	
	
	
	
}
