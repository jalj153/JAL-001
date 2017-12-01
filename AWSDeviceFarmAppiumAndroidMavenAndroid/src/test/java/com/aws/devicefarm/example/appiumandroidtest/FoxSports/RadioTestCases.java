package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class RadioTestCases {
RadioSteps radioSteps = new RadioSteps();
Tools tools = new Tools();
	

	
	public void Radio_010(){ //Show the radios that are in transmitting Live

		System.out.println("--Radio_010-- Voy a verificar si hay radios en vivo");
		//Tap in to radio section
		radioSteps.tapRadio();
		//take screenshot
		Tools.takeScreenshot("Seccion Radio");
		//search radios in live
		radioSteps.searchRadiosInLive();
	}
	
	
	public void Radio_020(){//Show Live Broadcast Schedule of "Tomorrow"

		System.out.println("--Radio_020-- Voy a verificar si hay transmision de radio para manana");
		//Tap in to radio section
		radioSteps.tapRadio();
		//take screenshot
		Tools.takeScreenshot("Seccion Radio");
		//Search radio for tomorrow
		radioSteps.searchRadioTomorrow();
		//take screenshot
		Tools.takeScreenshot("Programacion radio para mañana");
	}
	
	
	public void Radio_030(){//Buscar programacion para proximos dias
		System.out.println("--Radio_030-- Voy a buscar programacion para los proximos dias");
	
		radioSteps.tapRadio();
		
		Tools.takeScreenshot("Seccion Radio");
		
		radioSteps.searchRadioForNextDays();
		
		Tools.takeScreenshot("Programacion de radio proximos dias");
	}
	
	public void Radio_040(){//Play a una radio
		System.out.println("--Radio_040-- Voy a reproducir una radio");
	
		radioSteps.tapRadio();	
		
		Tools.takeScreenshot("Seccion Radio");
		
		radioSteps.tapInLiveRadio();
		
		Tools.takeScreenshot("Play radio");
		
		radioSteps.playRadio();	
		
		
	}
	
}
