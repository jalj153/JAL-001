package com.aws.devicefarm.example.appiumandroidtest.FoxSports;


public class InLiveTestCases {
	Tools tools = new Tools();
	InLiveSteps inLiveSteps = new InLiveSteps();
		
	public void enVivo_010(){ //Show the channels that are in transmitting Live
		System.out.println("--enVivo_010-- Estoy buscando los canales en vivo, verificando que contengan logo, nombre y su respectivo background.");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Verify the first channel
		inLiveSteps.checkChannel1(); 
		//Verify the second channel
		inLiveSteps.checkChannel2(); 
		//Verify the third channel
		inLiveSteps.checkChannel3();
		//Search Items in forLive
		inLiveSteps.lookForLiveItems();
		//Take screenshot
		Tools.takeScreenshot("Elementos de los canales en vivo");
		
	}
	public void enVivo_020(){//Show Live Broadcast "Later" Programming
		System.out.println("--enVivo_020-- Estoy buscando la programacion para mas tarde...");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//Take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Search for programming later
		inLiveSteps.lookForProgrammingLater();
		//Take screenshot
		Tools.takeScreenshot("Programacion en vivo para mas tarde");
		}
	
	public void enVivo_030(){//Mostrar programacion para manana y verificar que esten todos los elementos
		System.out.println("--enVivo_030-- Estoy buscando la programacion para manana");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//Take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Look for programming tomorrow
		inLiveSteps.lookForProgrammingTomorrow();
		//Look elements of programming
		inLiveSteps.lookElementsOfProgramming();
		//take screenshot
		Tools.takeScreenshot("Programacion en vivo para mañana ");
	}
	
	public void enVivo_040(){//Buscar los proximos dias y verificar que esten todos los elementos
		System.out.println("--enVivo_040-- Estoy buscando la programacion para los proximos dias");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//Take Screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Get date
		inLiveSteps.getDate();
		//Search date 
		inLiveSteps.lookDate();
		//Verify that elements are present 
		inLiveSteps.lookElementsOfProgramming();
		}
	
	public void enVivo_050(){//Buscar canal en vivo
		System.out.println("--enVivo_050-- Estoy buscando un canal en vivo");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//Take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Look for live items
		inLiveSteps.lookForLiveItems();
		//Tap in play button
		inLiveSteps.playInLive(" error ocurred in the method 'playInLive' that is present in enVivo_050");
		//Wait time(15 seconds)
		Tools.waitTime(15000);
		//validate reproduction
		inLiveSteps.validarReproduccion();
		//Take screenshot
		Tools.takeScreenshot("Canal en vivo");
		//Return to menu
		Tools.backToMenu(1);		
	}
	public void enVivo_060(){//Buscar y reproducir un show en vivo
		System.out.println("--enVivo_060-- Estoy buscando un show...");
		//Tap in to InLive section
		inLiveSteps.tapInLive();
		//Take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Search a show and tap in play button 
		inLiveSteps.lookShow();
		//Wait time 
		Tools.waitTime(15000);
		//Validate reproduction
		inLiveSteps.validarReproduccion();
		//Take screenshot
		Tools.takeScreenshot("Show");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void enVivo_070(){//Reproducir el canal en fullscren
		System.out.println("--enVivo_070-- Voy a reproducir un en vivo en fullscreen.");
		//Tap in to 
		inLiveSteps.tapInLive();
		//Take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Search for live items
		inLiveSteps.lookForLiveItems();
		//tap in play button
		inLiveSteps.playInLive(" error ocurred in the method 'playInLive' that is present in enVivo_070");
		//wait time
		Tools.waitTime(30000);
		//validate reproduction
		inLiveSteps.validarReproduccion();
		//Select a video
		inLiveSteps.tapVideo(" error ocurred in the method 'tapVideo' that is present in enVivo_070");
		//tap in full screen
		inLiveSteps.tapFullScreen(); 
		//tap in more events InLive
		inLiveSteps.tapMoreEventsInLive();//
		//take screenshot
		Tools.takeScreenshot("Full screen");
		//Search all events in live
		inLiveSteps.searchAllEventsInLive();
		//return to menu
		Tools.backToMenu(1);
	}
	
	
	public void enVivo_080(){//Reproducir un evento programado que no va por un canal
		System.out.println("--enVivo_080-- Voy a buscar un evento programado que no va por un canal");
		//Tap in to inLive section
		inLiveSteps.tapInLive();
		//take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//Select a event which is not present in a channel
		inLiveSteps.playAEventWhichIsntPresentInAChannel();
		//take screenshot
		Tools.takeScreenshot("Evento programado que no va por un canal");
		//return to menu
		Tools.backToMenu(1);
	}
	
	
	public void enVivo_090(){
		System.out.println("--enVivo_090-- Voy a buscar un evento programado que va por un canal");
		//tap in to InLive section
		inLiveSteps.tapInLive();
		//take screenshot
		Tools.takeScreenshot("Seccion en vivo");
		//select a event which is present in a channel
		inLiveSteps.playAEventWhichIsPresentInAChannel();
		//take screenshot
		Tools.takeScreenshot("Evento programado que va por un canal");
		//return to menu
		Tools.backToMenu(1);
	}
	
	
		
}
