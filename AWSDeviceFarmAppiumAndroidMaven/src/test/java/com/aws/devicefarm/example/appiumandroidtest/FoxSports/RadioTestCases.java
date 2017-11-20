package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class RadioTestCases {
RadioSteps radioSteps = new RadioSteps();
Tools tools = new Tools();
	
	public void radio(){
		Radio_010();
		Radio_020();
		Radio_030();
		Radio_040();
	}
	
	public void Radio_010(){ //Mostrar radios en vivo
		System.out.println("Voy a verificar si hay radios en vivo");
		radioSteps.tapRadio();
		radioSteps.searchRadiosInLive();
		
	}
	public void Radio_020(){//Mostrar programacion para manana
		System.out.println("Voy a verificar si hay transmision de radio para manana");
		radioSteps.tapRadio();
		radioSteps.searchRadioTomorrow();
	}
	public void Radio_030(){//Buscar programacion para proximos dias
		System.out.println("Voy a buscar programacion para los proximos dias");
		radioSteps.tapRadio();
		radioSteps.searchRadioForNextDays();
	}
	public void Radio_040(){//Play a una radio
		System.out.println("Voy a reproducir una radio");
		radioSteps.tapRadio();	
		radioSteps.tapInLiveRadio();
		radioSteps.playRadio();	
	}
}
