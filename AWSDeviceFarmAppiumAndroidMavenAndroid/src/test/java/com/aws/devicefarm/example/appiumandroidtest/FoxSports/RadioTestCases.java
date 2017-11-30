package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class RadioTestCases {
RadioSteps radioSteps = new RadioSteps();
Tools tools = new Tools();
	

	
	public void Radio_010(){ //Mostrar radios en vivo
		System.out.println("--Radio_010-- Voy a verificar si hay radios en vivo");
		radioSteps.tapRadio();
		tools.takeScreenshot("Seccion Radio");
		radioSteps.searchRadiosInLive();
		
	}
	public void Radio_020(){//Mostrar programacion para manana
		System.out.println("--Radio_020-- Voy a verificar si hay transmision de radio para manana");
		radioSteps.tapRadio();
		tools.takeScreenshot("Seccion Radio");
		radioSteps.searchRadioTomorrow();
		tools.takeScreenshot("Programacion radio para mañana");
	}
	public void Radio_030(){//Buscar programacion para proximos dias
		System.out.println("--Radio_030-- Voy a buscar programacion para los proximos dias");
		radioSteps.tapRadio();
		tools.takeScreenshot("Seccion Radio");
		radioSteps.searchRadioForNextDays();
		tools.takeScreenshot("Programacion de radio proximos dias");
	}
	public void Radio_040(){//Play a una radio
		System.out.println("--Radio_040-- Voy a reproducir una radio");
		radioSteps.tapRadio();	
		tools.takeScreenshot("Seccion Radio");
		radioSteps.tapInLiveRadio();
		tools.takeScreenshot("Play radio");
		radioSteps.playRadio();	
		
	}
}
