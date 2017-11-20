package PRUEBAFoxAppAndroid.PRUEBAFoxAppAndroid;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class Tools {
	FoxApp foxapp = new FoxApp();
	
	 public void space() {
		 for(int i=0; i<3; i++) {
			System.out.println("");				
		 }				  		
	 }
	 
//Wait with sleepThread
	 public static void waitTime(int time) {			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				System.out.println("Tiempo de espera terminado");
			}
		}
		
		
//Search content			
		public void searchContent(){
			boolean visible2 = false;
			boolean visible=false;
			boolean content=false;
			try {
				 
				 waitTime(2000);
			     visible2 = foxapp.driver.findElementByName("Select-Btn").isDisplayed();
			     
			     content = true;
			}catch(Exception e) {
				
				content= false;
			}
			if((visible2!=false)) {
				System.out.println("ES UNA SERIE");
				 space();
			     
				 findName("Select-Btn","Episodio ");
				  //driver.findElementByName("Placeholder-TryButton").click();
				  try {
					  
					  waitTime(2000);
				     visible = foxapp.driver.findElementByName("Placeholder-TryButton").isDisplayed();
				    
				     foxapp.encontrado = true;
				     
				  }catch(Exception e) {
					 
					  foxapp.encontrado = false;
				  }
				
				  if ((visible !=false)||(foxapp.encontrado !=false)) {
					  System.out.println("Este contenido no se puede reproducir");
					  waitTime(3000);
					  space();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  System.out.println("Encontre boton atras");  
					  
				  }else {
					  space();
					  System.out.println("Esperando por anuncio");
					 
					  //touchAction.press(250, 70).perform().release();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();				
					  waitTime(50000);					  
					  System.out.println("Encontre el video");  
					  
					  space();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);	 
					  foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  System.out.println("Encontre boton atras");					  
				  }
				
			}else {
				System.out.println("ES UNA PELICULA");
				space();
				foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
				System.out.println("Encontre boton atras");	
			}			 
		}
//Finders
		public void findName(String name, String nameSpanish) {
			System.out.println("Buscando"+" "+nameSpanish);
			try {				
				
				foxapp.driver.findElementByName(name).click();
				System.out.println("Se encontro"+" "+nameSpanish);
			}catch(Exception e) {
				System.out.println("No se encontro"+" "+nameSpanish);
			}
			
			
		}
		
		public void findId(String name, String nameSpanish) {
			try {				
				foxapp.driver.findElementById(name).click();
				System.out.println("Se encontro"+" "+nameSpanish);
			}catch(Exception e) {
				System.out.println("Se encontro"+" "+nameSpanish);
			}
			
			
		}
		
	

	

	
	

}
