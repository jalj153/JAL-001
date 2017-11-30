package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import io.appium.java_client.TouchAction;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InLiveSteps {
	
	public static String fecha = "1";
	Tools tools = new Tools();
	FoxSports principal = new FoxSports();
	String cadenaSinSeparar;
	boolean verificador;
	int contador;
	int i;
	public void tapInLive(){ //tap en vivo
		tools.findBack("En Vivo");
	}
	
	public void checkChannel1(){//Verificar el primer en vivo
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout", "No se encuentra el primer en vivo");
	}
	public void checkChannel2(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout", "No se encontro el segundo canal");
	}
	public void checkChannel3(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout", "No se encontro el tercer canal");
	}
	public void lookForLiveItems(){//Verificar si el en vivo tiene texto, logo y background
		tools.findWithScroll("com.fic.foxsports:id/HomeViewPager", "com.fic.foxsports:id/live_video_title"); //Texto
		tools.findWithScroll("com.fic.foxsports:id/HomeViewPager", "com.fic.foxsports:id/overthumb_channelLogo"); //Logo
		tools.findWithScroll("com.fic.foxsports:id/HomeViewPager", "com.fic.foxsports:id/clipItemImage"); //Background
	}
	public void lookForProgrammingLater(){
		tools.scrollWithResourceId("com.fic.foxsports:id/HomeViewPager", "Más tarde");
	}
	public void lookElementsOfProgramming(){
		tools.findHourNameType("com.fic.foxsports:id/epg_time", "com.fic.foxsports:id/epg_event", "com.fic.foxsports:id/epg_tag");
	}
	public void lookForProgrammingTomorrow(){
		tools.scrollWithResourceId("com.fic.foxsports:id/HomeViewPager", "MAÑANA");
	}
	public void getDate(){
		String date;
		String aux1;
		Date dia = new Date();
		Date month = new Date();
		DateFormat formatDay = new SimpleDateFormat("dd");
		DateFormat formatMonth  = new SimpleDateFormat("MMM");
		date = formatDay.format(dia);
		aux1 = formatMonth.format(month).toUpperCase();
		int aux;
		
		aux = Integer.parseInt(date);
		if(aux <8){
			aux+=2;
			fecha = String.valueOf("0"+aux+" "+ aux1);
		}else if(aux == 30 || aux == 31){
			fecha =String.valueOf("MAÑANA");
		}else{
			aux+=2;
			fecha = String.valueOf(aux+" "+ aux1);
		}		
	}
	public void lookDate(){
		tools.scrollWithResourceId("com.fic.foxsports:id/HomeViewPager",fecha);
	}
	public void lookInLive(){
		tools.scrollWithResourceId("com.fic.foxsports:id/HomeViewPager", "EN VIVO");
	}
	public void playInLive(String location){
		tools.searchId("com.fic.foxsports:id/overthumb_IconPlay", location);
	}
	
	public void lookShow(){
		tools.scroll("android.support.v4.view.ViewPager", "Show");
	}
	
	public void tapVideo(String location){
		tools.waitTime(5000);
		tools.searchId("com.fic.foxsports:id/player_view", location);
	}
	public void tapFullScreen(){
		try{
			principal.driver.findElementById("com.fic.foxsports:id/exo_landscape").click();	
		}catch(Exception e){
			System.out.print("");
		}
		
		
	}
	public void tapMoreEventsInLive(){
		try{
			principal.driver.findElementById("com.fic.foxsports:id/livecamera_grid_title").click();	
		}catch(Exception e){
			System.out.print("");
		}
	}
	public void searchAllEventsInLive(){
		try{
			principal.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout");
			tools.totalBuenas +=1;
			tools.waitTime(3000);
			Tools.backToMenu(1);
		}catch(Exception e){
			tools.totalMalas +=1;
			System.out.print("Al parecer no se pudo reproducir en fullscreen");
		}
	
	}
	
	public void scroll(){
		cadenaSinSeparar = principal.driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/competition_list\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/epg_time\"));").getText(); 
	
			}
	
	public void validar(){//this method verify if the method playAEventWhichIsntPresentInAChannel is true or false.
		if (verificador == false){
			if (contador == 1){
				tools.searchText(cadenaSinSeparar);
				tools.waitTime(25000);
			}else{
				tools.scroll("abajo");
				playAEventWhichIsPresentInAChannel();
			}
			
		}else{
			if (contador == 1){
				tools.scroll("abajo");
				playAEventWhichIsntPresentInAChannel();
			}else{
				tools.searchText(cadenaSinSeparar);
				tools.waitTime(25000);
			}
			
		}
		
	}
	
	public void playAEventWhichIsntPresentInAChannel(){//	
		contador =1;
		scroll();
		String[] cadenaSeparada;
		cadenaSeparada = cadenaSinSeparar.split(" ");
		for (i=0; i< cadenaSeparada.length; i++){
			if(cadenaSeparada[i].equals("|")){
				verificador = true;
				i=10;
			}else{
				verificador = false;
			}	
		}
		validar();
	}
	
	public void playAEventWhichIsPresentInAChannel(){
		contador = 2;
		scroll();
		String[] cadenaSeparada;
		cadenaSeparada = cadenaSinSeparar.split(" ");
		for (i=0; i< cadenaSeparada.length; i++){
			if(cadenaSeparada[i].equals("|")){
				verificador = true;
				i=10;
			}else{
				verificador = false;
			}	
		}
		validar();
	}
	public void validarReproduccion(){
		try{
			principal.driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Ingresar\")");
			System.out.println("-----------------No has iniciado sesion-----------------------------------");
			tools.totalMalas += 1;
		}catch(Exception e){
			tools.totalBuenas += 1;
		}
			
	}
	
}
