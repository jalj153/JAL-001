package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import io.appium.java_client.android.AndroidElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RadioSteps {
	static FoxSports principal = new FoxSports();
	public static String fecha = "1";
	int validador;
	String aux1;
	int aux;
	Tools tools = new Tools();
	InLiveSteps inLiveSteps =new  InLiveSteps();
	int cont = 0;
	int cantidad = 0;
	String dateTime;
	DateFormat dateFormat = new SimpleDateFormat("dd MMM");
	Date date = new Date();
	int i = 0;
	Calendar calendar= Calendar.getInstance();
	
	public void tapRadio(){
		tools.searchText("Radio");
		
	}
	public void playRadio(){
		try{
		principal.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView").click();
		tools.waitTime(5000);
		Tools.backToMenu(1);
		}catch(Exception e){
			System.out.println("Al parecer no hay radios disponibles");
		}
	}
	public void searchRadiosInLive(){
		int contador = 0;		
		List<AndroidElement> listButtonPlay = principal.driver.findElementsByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/iv_play\"));");
		System.out.println("Se ha detectado -"+listButtonPlay.size()+"- radio(s) en Vivo");
		Boolean isPresent = listButtonPlay.size()>0;
		if(isPresent){
			try{
				for(AndroidElement elemento : listButtonPlay){
					elemento = listButtonPlay.get(contador);
					//elemento.click();
					contador++;
					if(elemento == listButtonPlay.get(listButtonPlay.size()-1)){
					principal.driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/iv_pause\");").click();
					}
				}
			} catch (Exception e){
				
			}
		}else{
			System.out.println("No hay ninguna Radio disponible");
		}	
	}
	
	public void getDate(){
		
		calendar.setTime(date);
		calendar.add(Calendar.DATE, cantidad);
		Date dateNext = calendar.getTime();
		dateTime = dateFormat.format(dateNext).toUpperCase();
	}
	public void searchRadioTomorrow(){
		getDate();
		for(i=0; i<=0; i++){
			if(i>0){
				cantidad = 1;				
			}
		if(i == 0){
			dateTime = "MAÑANA";
		} 
		try {
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().text(\""+dateTime+"\"));")
					.click();			
			System.out.println("Si se ha encontrado la fecha: "+dateTime);
		} catch(Exception e){
			System.out.println("No se ha encontrado la fecha: "+dateTime);
			}
		}
		
	}
	public void searchRadioForNextDays(){
		getDate();
		for( i=0; i<=5; i++){
			if(i>0){
				cantidad = 1;				
			}
			if(i == 0){
				dateTime = "HOY";
			}else if(i==1){
				dateTime = "MAÑANA";
			}
			calendar.add(Calendar.DATE, cantidad);
			Date dateNext = calendar.getTime();
			dateTime = dateFormat.format(dateNext).toUpperCase();
			try {
				principal.driver.findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().text(\""+dateTime+"\"));")
						.click();
				if (i==1 || i == 0){
					
				}else{
					System.out.println("Si se ha encontrado la fecha: "+dateTime);
				}
				
			} catch(Exception e){
				if (i==1 || i == 0){
					
				}else{
					System.out.println("No se ha encontrado la fecha: "+dateTime);
				}		
			}
		}		
	}

	public void tapInLiveRadio(){
		try{
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.support.v4.view.ViewPager\")).scrollIntoView(new UiSelector().text(\"EN VIVO\"));").click();
			tools.waitTime(3000);
		}catch(Exception e){
			
		}
		
	}
	
	
	
	
}
