package PRUEBAFoxAppAndroid.PRUEBAFoxAppAndroid;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.annotation.RegEx;

import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/*
 * @programmer  Jair Quiñonez 
 */


public class FoxApp {
//Instantiations
	public static AndroidDriver<AndroidElement> driver;		
	private static FoxApp foxapp = new FoxApp();
	public static Tools tool = new Tools();	
//Global variables
	public boolean encontrado = false ;
	public int porcentaje = 0;
	
	
//Before method
  @BeforeMethod
  public void beforeMethod()throws MalformedURLException {	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//**************************CAPABILITIES THAT MAY CHANGE FOR DIFFERENT DEVICES**********************************//		
//capabilities.setCapability("deviceName", "BSL7N15B12001322");	
		capabilities.setCapability("deviceName", "BHG7N16302031342");	
//capabilities.setCapability("youiEngineAppAddress", "10.157.234.113");
		capabilities.setCapability("youiEngineAppAddress", "10.157.234.149");
		
//***********************************APK'S UBICATION********************************************//
		capabilities.setCapability("app", "C:\\Users\\Test01\\Desktop\\Archivos de Automatizacion\\APK\\fox-debug.apk");
//capabilities.setCapability("app", "C:\\Users\\Test01\\Desktop\\Archivos de Automatizacion\\APK\\FOX APP 6.1 PROD 20171108.apk")
		
		
//*********************GENERAL CAPABILITIES**************************//	
		capabilities.setCapability("platformName", "Android");			
		capabilities.setCapability("automationName", "YouiEngine");
		capabilities.setCapability("appiumVersion", "1.7.1");
		capabilities.setCapability("name", "appium-youiengine-driver");		
		capabilities.setCapability("noReset", "false");
		URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(appiumURL, capabilities);		
//Start Message
		tool.print("================================================");
		tool.print("========TEST WILL START WITHOUT LOGIN===========");
		tool.print("================================================");
		tool.space();
  }
  

  
//**************************************************Principal execution*******************************************************
  @Test
  public void Test() {	  
	  Tools tool = new Tools();	  
//Instantiation  method to do tap on the screen	  
	  TouchAction touchAction = new TouchAction(driver);	
	  
//Get out log in because can't access to section login
	  start();
	  
//Execute method for do review in the section On Demand
	  onDemand(); 
	  
//Execute method for do review in section TV Live
// **********THIS SECTION have many problems for automation, because, the names of their elements are all the same************//
	  tvLive();	
		 
//Execute method for do review in the section Profile and their elements
//*******THIS SECTION also Have many problems, required some information for continue their automation*******************************//
	 //profile();	 
	  
//Final Message
	  tool.space();
	  tool.print("================================================");
	  tool.print("=================TEST FINISHED=================");
	  tool.print("================================================");
	  System.err.println("THE TEST HAD A"+" "+tool.totalRight+"%"+" "+"OF SUCCESSFULLY");	  
  }
  
  

//After Method 
  @AfterMethod
  public void afterMethod() {
	  Tools tool = new Tools();
	  tool.waitTime(000);
	  driver.quit();	
  }
  
	 
//**********************************************METHODS***********************************************************// 
  
//Method for do tap in the center of the screen  
  public static void centerTap() {
		 TouchAction touchAction = new TouchAction(foxapp.driver);
		 Dimension dimensions = foxapp.driver.manage().window().getSize();
		 int pointX = (dimensions.getWidth() / 2);
		 int startPointY = (dimensions.getHeight() / 2);
		 touchAction.press(pointX, startPointY).release().perform();		 
  } 	   
			
//Scroll that i decide their direction (down or up)
  public static void scrollDirection(String direction) {
	  TouchAction touchAction = new TouchAction(foxapp.driver);
	  Dimension dimensions = foxapp.driver.manage().window().getSize();
	  int pointX = (dimensions.getWidth() / 2);
	  int startPointY = (dimensions.getHeight() / 2);
	  int endPointY;

		if (direction.equals("down")) {
			endPointY = (int) (dimensions.getHeight() * -0.5);
			touchAction.press(pointX, startPointY).moveTo(0, -400).release().perform();
			tool.waitTime(700);
		} else if (direction.equals("up")) {
			endPointY = (int) (dimensions.getHeight() * 0.5);
			touchAction.press(pointX, startPointY).moveTo(0, 400).release().perform();
			tool.waitTime(700);
		}
  }
				  
//Scroll that do an amount of scrolls down
  public void scrollDown() {
	  Tools tool = new Tools();
	  for (int i=0;i<8;i++) {
		  scrollDirection("down");		  
	  }	  
  }
  


  
  
//*****************************************************PRINCIPAL METHODS**************************************************//
  
//Method for get out login
  public void start() {	  
	  tool.waitTime(18000);	 
	  tool.print("-----------BIENVENIDO A FOX-----------");	
	  tool.waitTime(2000);
	  tool.findName("Btn-Close","Boton cerrar");	
	  tool.waitTime(5000);	  
	   
//First Verification for Chromecast
	  tool.space();
	  tool.print("-----------BIENVENIDO A FOX APP-----------");		
	  tool.waitTime(2000);	  
	  tool.findId("8","Boton cerrar Bienvenido a Fox por ID");	
	  
	  tool.space();
	  tool.waitTime(5000);
	  tool.print("(Este boton se habilita al estar activo Chromecast)");
	  tool.findName("Btn-Close","Boton cerrar Bienvenido a Fox por Name");
	  tool.waitTime(4000); 
  }
// Instantiation for read input 
  Scanner scanner = new Scanner(System.in);
  
  
//Do review in On Demand section
  public void onDemand() {

	  // Find series
	  tool.space();	 	   
	  tool.waitTime(2000);
	  tool.findName("Button3","Boton buscar");	  	  
	  tool.waitTime(3000);
	  
	  tool.space();	  
	  tool.waitTime(2000);
	  tool.findName("Search-Text","");	  
	  	  
	  
	  tool.waitTime(1000);
	  
	  String texto;
//Serie's name	  
	  texto= ("Splash y Bubbles");
//tool.print("Escribe la serie a buscar:");	  
//texto = scanner.nextLine();
	  tool.print("Escribiendo..."+" "+texto);	  
	  tool.waitTime(1000);
	  driver.findElementByName("Search-Text").sendKeys(texto);		  
	  tool.waitTime(3000);
	  
	  tool.space();	  
	  tool.waitTime(1000);	  
	  driver.pressKeyCode(66);  
	  tool.waitTime(2000);
	  

	  tool.waitTime(2000);
	  tool.findName("ImageNode","Contenido");	  
	  tool.waitTime(10000);	  
	
	  
	  tool.space();
	  tool.searchContent();
	  tool.waitTime(2000);
	  
	  
	  tool.space();
	  tool.waitTime(13000);
	  tool.findName("Button1","Boton On Demand");	   
	  tool.waitTime(1000);	  
	  
	  
	  tool.space();	 
	  tool.waitTime(2000);
	  tool.print("Haciendo Scroll hacia abajo...");
	  scrollDown();	  
	  tool.waitTime(3000);
	  
	  
	  tool.space();	
	  tool.waitTime(2000);
	  tool.findName("ImageNode","Contenido");	
	  tool.waitTime(10000);
	  
	  
	  tool.space();	  
	  tool.searchContent();
	  tool.waitTime(10000); 	  
  }
  

//Have many problems, required some information for continue their automation
  public void profile() {	
	  tool.space();  
	  tool.findName("Button0","Boton de perfil");
	  tool.waitTime(4000);
	  
	  tool.space();


	  tool.waitTime(10000);	  
  }
  
  
//Review in TV EN VIVO section
// **********THIS SECTION also have many problems for automation, because, the names of their elements are all the same************//
  public void tvLive() {
	  boolean visible = false;
	  tool.space();
	  tool.waitTime(3000);
	  tool.findName("Button2", "Seccion de Tv En Vivo");
	  
	  tool.space();
	  tool.waitTime(5000);
	  tool.findName("ImageNode", "Pilar de colecciones");
	  
	  tool.space();
	  tool.waitTime(5000);
	  tool.findName("ImageNode", "una Coleccion");
	  
	  tool.space();
	  tool.waitTime(7000);
	  tool.findName("ImageNode", "contenido");
	  
	  tool.space();
	  tool.waitTime(6000);
	  tool.searchContent();

	  tool.space();
	  tool.waitTime(4000);
	  tool.findName("Btn-Back", "Boton atras");
	  
	  tool.space();
	  tool.waitTime(7000);
	  tool.findName("Btn-Back", "Boton atras");
  }
  
  
  
  
//*******************************Methods that may serve in the future***********************************//
  
//Steps for get page source from any page on the screen
	/* space();
	  	System.out.println("Obteniendo XML");
		waitTime(2000);
	    String xml= driver.getPageSource();
		System.out.println("Imprimiendo XML...");
		space();
		System.out.println(xml);
		waitTime(120000);
	 */
  



}
