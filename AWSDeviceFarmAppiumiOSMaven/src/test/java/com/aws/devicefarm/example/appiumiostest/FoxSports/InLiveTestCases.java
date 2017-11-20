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
	
	public void inLive() {
		Tools.searchId("En Vivo");
		Tools.waitTime(3000);
		try {
			step.checkLives("EN VIVO");
		}catch(Exception e) {System.out.println("No hay transmisiones en vivo");}
	
	}
	
	public void inLive_020() {
		Tools.searchId("En Vivo");
		//Tools.specificSearch("seleccionar", "MÁS TARDE", 1);
		step.searchLives("MÁS TARDE");
		try {
			step.checkLives("MÁS TARDE");
		}catch(Exception e) {System.out.println("No hay transmisiones "+" "+"MÁS TARDE");}
	}
	public void inLive_030() {
		Tools.searchId("En Vivo");
		//Tools.specificSearch("ninguna", "Mañana", 1);
		step.searchLives("MAÑANA");
		try {
			step.checkLives("MAÑANA");
		}catch(Exception e) {System.out.println(" ");}
	}
	
	public void inLive_040() {
		Tools.searchId("En Vivo");
		step.getDate();
	}
	public void inLive_050() {
		Tools.searchId("En Vivo");
		Tools.searchId("EN VIVO");
		Tools.backToMenu();
	}
	public void inLive_060() {
		Tools.searchId("En Vivo");
		//Tools.specificSearch("seleccionar", "SHOW", 1);
		step.searchShowLive("SHOW");
		Tools.backToMenu();
		Tools.waitTime(5000);
		
	}
	public void inLive_070() {
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
	public void inLive_080() {
		Tools.searchId("En Vivo");
		step.searchLiveNoCanal();
		Tools.backToMenu();
		Tools.waitTime(3000);
	}
	public void inLive_090() {
		Tools.searchId("En Vivo");
		//step.searchLiveInCanal(1);
		//Tools.waitTime(10000);		
		step.searchLiveInCanal(1);
		Tools.backToMenu();
	}
	
}
