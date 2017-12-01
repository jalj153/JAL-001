package com.aws.devicefarm.example.appiumiostest.FoxSports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

public class InLiveTestCases {
	static FoxSports foxSports = new FoxSports();
	static InLiveSteps step = new InLiveSteps();
	static Tools tools = new Tools();
	
	
	//Method that verifies live channels there
	public void inLive_010() {
		Tools.takeSpace();
		System.out.println("----------InLive_010----------");
		Tools.searchId("En Vivo");
		Tools.waitTime(3000);
		try {
			step.checkLives("EN VIVO");
		}catch(Exception e) {System.out.println("No hay transmisiones en vivo");}
	
	}
	
	//Method that shows the live broadcasts of later
	public void inLive_020() {
		Tools.takeSpace();
		System.out.println("----------InLive_020----------");
		Tools.searchId("En Vivo");
		//Tools.specificSearch("seleccionar", "MÁS TARDE", 1);
		step.searchLives("MÁS TARDE");
		try {
			step.checkLives("MÁS TARDE");
		}catch(Exception e) {System.out.println("No hay transmisiones "+" "+"MÁS TARDE");}
	}
	
	//Method that shows the live broadcasts of tomorrow
	public void inLive_030() {
		Tools.takeSpace();
		System.out.println("----------InLive_030----------");
		Tools.searchId("En Vivo");
		//Tools.specificSearch("ninguna", "Mañana", 1);
		step.searchLives("MAÑANA");
		try {
			step.checkLives("MAÑANA");
		}catch(Exception e) {System.out.println(" ");}
	}
	
	//Method that shows the live broadcasts of the next days.
	public void inLive_040() {
		Tools.takeSpace();
		System.out.println("----------InLive_040----------");
		Tools.searchId("En Vivo");
		//step.getDate();
		Tools.scrollDown();
	}
	
	//Method that plays a live channel
	public void inLive_050() {
		Tools.takeSpace();
		System.out.println("----------InLive_050----------");
		Tools.searchId("En Vivo");
		Tools.searchId("EN VIVO");
		Tools.backToMenu();
	}
	
	//Method that plays a live show
	public void inLive_060() {
		Tools.takeSpace();
		System.out.println("----------InLive_060----------");
		Tools.searchId("En Vivo");
		//Tools.specificSearch("seleccionar", "SHOW", 1);
		step.searchShowLive("SHOW");
		Tools.backToMenu();
		Tools.waitTime(5000);
	}
	
	//Method that puts the video in fullscreen, (Do not click on "More live events")
	public void inLive_070() {
		Tools.takeSpace();
		System.out.println("----------InLive_070----------");
		Tools.searchId("En Vivo");
		Tools.searchId("EN VIVO");
		Tools.waitTime(3000);
		step.searchButton("Minimize");
		//step.searchButton("MÁS EVENTOS EN VIVO");
		step.searchButton("arrowSubmenu");
		//Tools.backToMenu();
		step.searchButton("navBar back");
		Tools.waitTime(10000);	
	}
	
	//Plays a scheduled event that does not go through a channel
	public void inLive_080() {
		Tools.takeSpace();
		System.out.println("----------InLive_080----------");
		Tools.searchId("En Vivo");
		step.searchLiveNoCanal();
		Tools.backToMenu();
		Tools.waitTime(3000);
	}
	
	//Plays a scheduled event that goes through a channel
	public void inLive_090() {
		Tools.takeSpace();
		System.out.println("----------InLive_090----------");
		Tools.searchId("En Vivo");
		//step.searchLiveInCanal(1);
		//Tools.waitTime(10000);		
		step.searchLiveInCanal(1);
		Tools.backToMenu();
	}
	
}
