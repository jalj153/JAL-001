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
	public void enVivo_020(){//Mostrar programacion para Mas tarde y verificar que esten todos los elementos
		System.out.println("--enVivo_020-- Estoy buscando la programacion para mas tarde...");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.lookForProgrammingLater();
		
		Tools.takeScreenshot("Programacion en vivo para mas tarde");
		
		}
	
	public void enVivo_030(){//Mostrar programacion para manana y verificar que esten todos los elementos
		System.out.println("--enVivo_030-- Estoy buscando la programacion para manana");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.lookForProgrammingTomorrow();
		
		inLiveSteps.lookElementsOfProgramming();
		
		Tools.takeScreenshot("Programacion en vivo para mañana ");
	}
	
	public void enVivo_040(){
		//Buscar los proximos dias y verificar que esten todos los elementos
		System.out.println("--enVivo_040-- Estoy buscando la programacion para los proximos dias");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.getDate();
		
		inLiveSteps.lookDate();
		
		inLiveSteps.lookElementsOfProgramming();
		}
	
	public void enVivo_050(){//Buscar canal en vivo
		System.out.println("--enVivo_050-- Estoy buscando un canal en vivo");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.lookForLiveItems();
		
		inLiveSteps.playInLive(" enVivo_050");
		
		Tools.waitTime(15000);
		
		inLiveSteps.validarReproduccion();
		
		Tools.takeScreenshot("Canal en vivo");
		
		Tools.backToMenu(1);		
	}
	public void enVivo_060(){//Buscar y reproducir un show en vivo
		System.out.println("--enVivo_060-- Estoy buscando un show...");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.lookShow();
		
		Tools.waitTime(15000);
		
		inLiveSteps.validarReproduccion();
		
		Tools.takeScreenshot("Show");
		
		Tools.backToMenu(1);
	}
	
	public void enVivo_070(){//Reproducir el canal en fullscren
		System.out.println("--enVivo_070-- Voy a reproducir un en vivo en fullscreen.");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.lookForLiveItems();
		
		inLiveSteps.playInLive(" enVivo_070");
		
		Tools.waitTime(30000);
		
		inLiveSteps.validarReproduccion();
		
		inLiveSteps.tapVideo(" enVivo_070");//tap  en el video
		
		inLiveSteps.tapFullScreen(); //tap en full screen
		
		inLiveSteps.tapMoreEventsInLive();//Tap en mas eventos en vivo
		
		Tools.takeScreenshot("Full screen");
		
		inLiveSteps.searchAllEventsInLive();//Buscar todos los eventos en vivo
		
		Tools.backToMenu(1);
		
	}
	
	
	public void enVivo_080(){//Reproducir un evento programado que no va por un canal
		System.out.println("--enVivo_080-- Voy a buscar un evento programado que no va por un canal");
		
		inLiveSteps.tapInLive();
		
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.playAEventWhichIsntPresentInAChannel();
		
		Tools.takeScreenshot("Evento programado que no va por un canal");
		
		Tools.backToMenu(1);
	}
	
	
	public void enVivo_090(){
		System.out.println("--enVivo_090-- Voy a buscar un evento programado que va por un canal");
		
		inLiveSteps.tapInLive();
			
		Tools.takeScreenshot("Seccion en vivo");
		
		inLiveSteps.playAEventWhichIsPresentInAChannel();
		
		Tools.takeScreenshot("Evento programado que va por un canal");
		
		Tools.backToMenu(1);
	}
	
	
		
}
