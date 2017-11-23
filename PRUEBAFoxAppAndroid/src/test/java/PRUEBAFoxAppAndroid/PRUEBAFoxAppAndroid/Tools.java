package PRUEBAFoxAppAndroid.PRUEBAFoxAppAndroid;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class Tools {
	FoxApp foxapp = new FoxApp();
	
//Method for let space in the console while writing 
	 	public void space() {
	 		for(int i=0; i<3; i++) {
	 			print("");				
	 		}				  		
	 	}
	 
//Wait with sleepThread
	 	public static void waitTime(int time) {			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				print("Tiempo de espera terminado");
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
				print("ES UNA SERIE");
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
					  print("Este contenido no se puede reproducir debido a la suscripcion");
					  waitTime(3000);
					  space();
					  waitTime(2000);
					  /*foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  print("Encontre boton atras"); */
					  findName("Btn-Back-Hero-Container","Boton atras");
					  
				  }else {
					  space();
					  System.out.println("Esperando por anuncio");		
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();				
					  waitTime(50000);					  
					  print("Terminó anuncio");  
					  
					  space();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  findName("Btn-Back-Hero-Container","Boton atras");
					  waitTime(2000);
					  findName("Btn-Back-Hero-Container","Boton atras");
					/*  foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Btn-Back-Hero-Container").click();
					  print("Encontre boton atras");	*/				  
				  }				
			}else {
				print("ES UNA PELICULA");
				space();
				findName("Btn-Back-Hero-Container","Boton atras");
				
			}			 
		}

//******************FINDERS**********************//
//Find by Name
		public void findName(String name, String nameSpanish) {
			print("___________________________________________________________________________________________");
			print("Buscando"+" "+nameSpanish);			
			try {								
				foxapp.driver.findElementByName(name).click();
				print("Se encontro"+" "+nameSpanish);
				if(name=="Button0") {
					print("-----------SECCION PERFIL----------");
				}else if(name=="Button1") {
					print("------------SECCION ON DEMAND----------");
				}else if(name=="Button2") {
					print("------------SECCION TV EN VIVO----------");
				}else if(name=="Button3") {
					print("------------SECCION DE BUSQUEDA----------");
				}else {					
				}
			}catch(Exception e) {
				print("No se encontro"+" "+nameSpanish);
			}			
		}
		
//Find by ID
		public void findId(String name, String nameSpanish) {
			print("Buscando"+" "+nameSpanish);
			try {				
				foxapp.driver.findElementById(name).click();
				print("Se encontro"+" "+nameSpanish);
			}catch(Exception e) {
				print("Se encontro"+" "+nameSpanish);
			}			
		}
		

		
//Method for write in Console
		public static void print(String print) {
			System.out.println(print);
		}
	
	

}
