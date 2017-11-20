package com.aws.devicefarm.example.appiumiostest.FoxSports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class InLiveSteps {
	
	static FoxSports foxSports = new FoxSports();
	
	//Método que verifica las transmisiones que hay en vivo, más tarde o mañana 
	public void checkLives(String id) {
		//Boolean isPresent=foxSports.driver.findElements(By.id(id)).size()>0;
		//try {
		Boolean isVisible=foxSports.driver.findElement(By.id(id)).isDisplayed();
		String source=null;
		String source2=null;
		while(isVisible) {
			if(isVisible) {
				source=foxSports.driver.getPageSource();
				System.out.println("Éstas son las transmisiones para "+id);
				Tools.scroll("abajo");
				source2=foxSports.driver.getPageSource();
				isVisible=foxSports.driver.findElement(By.id(id)).isDisplayed();
				if(source.equals(source2)) {
					break;
				}
			}	
		 }	
	}
	
	//Método que busca las transmisiones que estarán disponibles las fechas siguientes, calcula la fecha y verifica las trasmisiones que hay
	public void getDate() {
		String day;
		String month;
		String dateSearch;
		int counter=0;
		int dayNumber;
		Calendar c = Calendar.getInstance();
		DateFormat dateFormatDay= new SimpleDateFormat("dd");
		DateFormat dateFormatMonth= new SimpleDateFormat("MMM");		
		Date actualDate=c.getTime();
		day=dateFormatDay.format(actualDate);
		month=dateFormatMonth.format(actualDate).toUpperCase();	
		dayNumber=Integer.parseInt(day);

		if(dayNumber<30) {
			dayNumber+=2;
		}
		/*while(contador<3) {
			if(dayNumber<8) {
				day=Integer.toString(dayNumber);
				day="0"+day;
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchLives(dateSearch);
				this.checkLives(dateSearch);
			}else if(dayNumber>7 && dayNumber<30) {
				day=Integer.toString(dayNumber);
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchLives(dateSearch);
				this.checkLives(dateSearch);
			}else if(dayNumber==30 || dayNumber==31) {
				day=Integer.toString(dayNumber);
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchLives(dateSearch);
				this.checkLives(dateSearch);
			}
			contador+=1;
			dayNumber+=1;
		}*/
		while(counter<3) {
			if(dayNumber<8) {
				dayNumber+=2;
				day=Integer.toString(dayNumber);
				day="0"+day;
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchDay(dateSearch);
				this.checkLives(dateSearch);
			}else if(dayNumber>7 && dayNumber<30) {
				dayNumber+=2;
				day=Integer.toString(dayNumber);
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchDay(dateSearch);
				this.checkLives(dateSearch);
			}else if(dayNumber==30 || dayNumber==31) {
				day=Integer.toString(dayNumber);
				dateSearch=day+" "+month;
				System.out.println(dateSearch);
				this.searchDay(dateSearch);
				this.checkLives(dateSearch);
			}	
			counter+=1;
			dayNumber+=1;
		}
		
	}
	
	
	
	//Método que busca las fechas que manda el método "GetDate" por medio del parámetro que recibe
	public void searchDay(String date) {
		Boolean isPresent=foxSports.driver.findElements(By.id(date)).size()>0;
		String source;
		String source2;
		while(!isPresent) {		
				source=foxSports.driver.getPageSource();
				System.out.println("No se encuentra "+date);
				Tools.scroll("abajo");
				source2=foxSports.driver.getPageSource();
				isPresent=foxSports.driver.findElements(By.id(date)).size()>0;
				if(source.equals(source2)){
					break;
				}
		}
		if(isPresent) {

			System.out.println("Sí se encuentra "+date);
			Boolean isVisible=foxSports.driver.findElement(By.id(date)).isDisplayed();
			System.out.println("se verá si está presente "+date);
			while(!isVisible) {
				System.out.println("No está visible "+date);
				Tools.scroll("abajo");
				source=foxSports.driver.getPageSource();
				//isPresent=foxSports.driver.findElements(By.id(search)).size()>0;
				isVisible=foxSports.driver.findElement(By.id(date)).isDisplayed();
				if(isVisible){
					break;
				}
			}
		}
	}
	
	//Método que sirve para buscar algún show en vivo
	public void searchShowLive(String show) {
		Boolean isPresent=foxSports.driver.findElements(By.name(show)).size()>0;
		String source;
		
		while(isPresent) {			
			if(isPresent) {
			
				System.out.println("A presionar el show");
				Boolean isVisible2=foxSports.driver.findElement(By.name(show)).isDisplayed();
				source=foxSports.driver.getPageSource();
				isPresent=foxSports.driver.findElements(By.name(show)).size()>0;
				if(isVisible2) {
					System.out.println("Presionando show");
					Tools.searchName(show);
					break;
				}
			}
			Tools.scroll("abajo");
			source=foxSports.driver.getPageSource();
			isPresent=foxSports.driver.findElements(By.name(show)).size()>0;
			System.out.println("Está el show");
		}	
	}
	
	//Método para hacer la búsqueda de transmisiones
	public void searchLives(String search) {
		Boolean isPresent=foxSports.driver.findElements(By.id(search)).size()>0;
		String source;
		while(!isPresent) {		
				System.out.println("No se encuentra "+search);
				Tools.scroll("abajo");
				source=foxSports.driver.getPageSource();
				isPresent=foxSports.driver.findElements(By.id(search)).size()>0;
		}
		if(isPresent) {

			System.out.println("Sí se encuentra "+search);
			Boolean isVisible=foxSports.driver.findElement(By.id(search)).isDisplayed();
			System.out.println("se verá si está presente "+search);
			while(!isVisible) {
				System.out.println("No está visible "+search);
				Tools.scroll("abajo");
				source=foxSports.driver.getPageSource();
				//isPresent=foxSports.driver.findElements(By.id(search)).size()>0;
				isVisible=foxSports.driver.findElement(By.id(search)).isDisplayed();
				if(isVisible){
					break;
				}
			}
			if(isVisible){
				System.out.println("Se está presionando "+search);
				System.out.println("Sí hay transmisiones para"+" "+search);
			}
			
		}
	}
	
	//Método para hacer tap en una transmisión
	public void tapLive() {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 4);
		touchAction.press(pointX, startPointY).release().perform();
	}

	//Método para buscar y seleccionar una transmisión que sea por medio de un canal
	public void searchLiveInCanal(int selection) {
		String aux;
		int hourConvert;
		String hour;
		Calendar c=Calendar.getInstance();
		DateFormat dateFormatHour=new SimpleDateFormat("HH");
		Date actualHour=c.getTime();
		hour=dateFormatHour.format(actualHour);
		hourConvert=Integer.parseInt(hour);
		hourConvert+=1;
		hour=Integer.toString(hourConvert);
		hour=hour+":00";		
		System.out.println(hour);
		
		switch(selection) {
		case 1:
			aux=hour+" "+"| FOX Sports";
			this.searchLives(aux);
			Tools.searchId(aux);
			break;
		case 2:
			aux=hour+" "+"| FOX Sports 2";
			this.searchLives(aux);
			break;		
		case 3:
			aux=hour+" "+"| FOX Sports 3";
			this.searchLives(aux);
			break;		
		}
	}
	
	//Método que busca y selecciona una transmisión que no sea por medio de un canal
	public void searchLiveNoCanal() {
		int hourConvert;
		String hour;
		Calendar c=Calendar.getInstance();
		DateFormat dateFormatHour=new SimpleDateFormat("HH");
		Date actualHour=c.getTime();
		hour=dateFormatHour.format(actualHour);
		System.out.println(hour);
		hourConvert=Integer.parseInt(hour);
		hourConvert+=5;
		hour=Integer.toString(hourConvert);
		hour=hour+":00";		
		System.out.println(hour);
		
		this.searchLives(hour);
		Tools.searchId(hour);
		
	}
	
	//Método para buscar y presionar elementos de la pantalla de la transmisión en vivo
	
	public void searchButton(String id) {
		boolean verification = false;
		Boolean isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
			if (isPresent) {
				foxSports.driver.findElement(By.id(id)).click();
				verification=true;
			} else {
				System.out.println("No se ha encontrado el elemento: " + id);
				Tools.waitTime(1000);
				tapLive();
			}	
			
		}
	}
}
