package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InLiveTestCases {
	Tools tools = new Tools();
	InLiveSteps inLiveSteps = new InLiveSteps();
	
	public void enVivo(){
		enVivo_010();	
		enVivo_020();
		enVivo_030();
		enVivo_040();
		enVivo_050();
		enVivo_060();
		enVivo_070();
		enVivo_080();
		enVivo_090();
	}
	
	public void enVivo_010(){ //Mostrar los canales en vivo con su background, logo y nombre 
		System.out.print("--enVivo_010-- Estoy buscando los canales en vivo, verificando que contengan logo, nombre y su respectivo background.");
		inLiveSteps.tapInLive();
		inLiveSteps.checkChannel1(); //Verificacion del primer canal
		inLiveSteps.checkChannel2(); //Verificacion del segundo canal
		inLiveSteps.checkChannel3(); //verificacion del tercer canal
		//Buscar elementos en los canales en vivo
		inLiveSteps.lookForLiveItems();
		
	}
	public void enVivo_020(){//Mostrar programacion para Mas tarde y verificar que esten todos los elementos
		System.out.print("--enVivo_0210-- Estoy buscando la programacion para mas tarde...");
		inLiveSteps.tapInLive();
		inLiveSteps.lookForProgrammingLater();
		//inLiveSteps.lookElementsOfProgramming();
		
		}
	public void enVivo_030(){//Mostrar programacion para manana y verificar que esten todos los elementos
		System.out.print("--enVivo_030-- Estoy buscando la programacion para manana");
		inLiveSteps.tapInLive();
		inLiveSteps.lookForProgrammingTomorrow();
		inLiveSteps.lookElementsOfProgramming();
	}
	
	public void enVivo_040(){
		//Buscar los proximos dias y verificar que esten todos los elementos
		System.out.print("--enVivo_040-- Estoy buscando la programacion para los proximos dias");
		inLiveSteps.tapInLive();
		inLiveSteps.getDate();
		inLiveSteps.lookDate();
		inLiveSteps.lookElementsOfProgramming();
		}
	
	public void enVivo_050(){//Buscar canal en vivo
		System.out.print("--enVivo_050-- Estoy buscando un canal en vivo");
		inLiveSteps.tapInLive();
		inLiveSteps.lookForLiveItems();
		inLiveSteps.playInLive(" enVivo_050");
		tools.waitTime(15000);
		inLiveSteps.validarReproduccion();
		Tools.backToMenu(1);		
	}
	public void enVivo_060(){//Buscar y reproducir un show en vivo
		System.out.print("--enVivo_060-- Estoy buscando un show...");
		inLiveSteps.tapInLive();
		inLiveSteps.lookShow();
		tools.waitTime(15000);
		inLiveSteps.validarReproduccion();
		Tools.backToMenu(1);
	}
	
	public void enVivo_070(){//Reproducir el canal en fullscren
		System.out.print("--enVivo_070-- Voy a reproducir un en vivo en fullscreen.");
		inLiveSteps.tapInLive();
		inLiveSteps.lookForLiveItems();
		inLiveSteps.playInLive(" enVivo_070");
		tools.waitTime(30000);
		inLiveSteps.validarReproduccion();
		inLiveSteps.tapVideo(" enVivo_070");//tap  en el video
		inLiveSteps.tapFullScreen(); //tap en full screen
		inLiveSteps.tapMoreEventsInLive();//Tap en mas eventos en vivo
		inLiveSteps.searchAllEventsInLive();//Buscar todos los eventos en vivo
		Tools.backToMenu(1);
		
	}
	public void enVivo_080(){//Reproducir un evento programado que no va por un canal
		System.out.print("--enVivo_080-- Voy a buscar un evento programado que no va por un canal");
		inLiveSteps.playAEventWhichIsntPresentInAChannel();
		Tools.backToMenu(1);
	}
	public void enVivo_090(){
		System.out.print("--enVivo_090-- Voy a buscar un evento programado que va por un canal");
		inLiveSteps.playAEventWhichIsPresentInAChannel();
		Tools.backToMenu(1);
	}
	
		
}
