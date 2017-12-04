package PRUEBAFoxAppAndroid.PRUEBAFoxAppAndroid;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class Tools {
//Instantiation of the principal class
	FoxApp foxapp = new FoxApp();
	
//Global Variables
	public static int totalResults =0;
	public static int sumFound = 0;
	public static int sumNotFound= 0;
	public static int totalRight=0;
	
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
		
//Search content if is Serie or Movie and if is possible play it or not		
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
				  try {					  
					  waitTime(2000);
				      visible = foxapp.driver.findElementByName("Placeholder-TryButton").isDisplayed();				    
				      foxapp.encontrado = true;				     
				  }catch(Exception e) {					 
					  foxapp.encontrado = false;
				  }				
				  if ((visible !=false)||(foxapp.encontrado !=false)) {
					  System.err.println("Este contenido no se puede reproducir debido a la suscripcion");
					  waitTime(3000);
					  space();
					  waitTime(2000);	
					  findName("Btn-Back-Hero-Container","Boton atras");
					  
				  }else {
					  space();
					  System.out.println("Esperando por anuncio");		
//*****************This action also find back button but just function of this way when the video is played
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();		
//**********************************************************************************************************
					  
					  waitTime(50000);					  
					  print("Terminó anuncio");  
					  
					  space();
//*****************This action also find back button but just function of this way when the video is played
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
					  waitTime(2000);
					  foxapp.driver.findElementByName("Activity-Indicator-Container").click();
//**********************************************************************************************************
					  waitTime(2000);
					  findName("Btn-Back-Hero-Container","Boton atras");
					  waitTime(2000);
					  findName("Btn-Back-Hero-Container","Boton atras");
									  
				  }				
			}else {
				print("ES UNA PELICULA");
				 try {					  
					  waitTime(2000);
				      visible = foxapp.driver.findElementByName("Placeholder-TryButton").isDisplayed();				    
				      foxapp.encontrado = true;				     
				  }catch(Exception e) {					 
					  foxapp.encontrado = false;
				  }				
				  if ((visible !=false)||(foxapp.encontrado !=false)) {
					  System.err.println("Este contenido no se puede reproducir debido a la suscripcion");
					  waitTime(3000);
					  space();
					  waitTime(2000);					  
					  findName("Btn-Back-Hero-Container","Boton atras");
					  
				  }else {
					  waitTime(5000);
				  }	
				space();
				findName("Btn-Back-Hero-Container","Boton atras");
				
			}			 
		}

//*****************************************************FINDERS*******************************************************//
//Find by Name and this method write what section is
		public void findName(String name, String nameSpanish) {
			print("___________________________________________________________________________________________");
			print("Buscando"+" "+nameSpanish);			
			try {								
				foxapp.driver.findElementByName(name).click();
				print("Se encontro"+" "+nameSpanish);
				if(name=="Button0") {
					print("-----------SECCION PERFIL----------");
					sumFound += 1;
					
				}else if(name=="Button1") {
					print("------------SECCION ON DEMAND----------");
					sumFound  += 1;
				}else if(name=="Button2") {
					print("------------SECCION TV EN VIVO----------");
					sumFound  += 1;
				}else if(name=="Button3") {
					print("------------SECCION DE BUSQUEDA----------");
					sumFound  += 1;				
				}else {
					sumFound  += 1;					
				}
			}catch(Exception e) {
				System.err.println("No se encontro"+" "+nameSpanish);
				if(name=="Btn-Close") {
					sumNotFound+=0;
				}else {
					sumNotFound+= 1;
				}				
			}	
//Write what the total of tests that are alright
			totalResults = sumFound+ sumNotFound;
			totalRight = ((100/totalResults)*sumFound);
			
		}
		
//Find by ID
		public void findId(String name, String nameSpanish) {
			print("Buscando"+" "+nameSpanish);
			try {				
				foxapp.driver.findElementById(name).click();
				print("Se encontro"+" "+nameSpanish);
			}catch(Exception e) {
				System.err.println("No se encontro"+" "+nameSpanish);
			}			
		}
		

		
//Method for write in Console, for not use "System.out.print"
		public static void print(String print) {
			System.out.println(print);
		}
	
	

}
