package PRUEBAFoxAppAndroid.PRUEBAFoxAppAndroid;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;
import java.net.URL;
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





public class FoxApp {
//Instantiations
	public static AndroidDriver<AndroidElement> driver;	
	
	private static FoxApp foxapp = new FoxApp();
	public static Tools tool = new Tools();	
//Global variables
	public boolean encontrado = false ;
	
//Before method
  @BeforeMethod
  public void beforeMethod()throws MalformedURLException {	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//***********CAPABILITIES THAT MAY CHANGE FOR DIFFERENT DEVICES****************//		
		//capabilities.setCapability("deviceName", "BSL7N15B12001322");	
		capabilities.setCapability("deviceName", "BHG7N16302031342");	
		//capabilities.setCapability("youiEngineAppAddress", "10.157.234.113");
		capabilities.setCapability("youiEngineAppAddress", "10.157.234.100");
		
		//***********************APK'S UBICATION************************//
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
  }
  

  
//Principal execution  	
  @Test
  public void Test() {	  
	  Tools tool = new Tools();	  
//Instantiation  method to do tap on the screen	  
	  TouchAction touchAction = new TouchAction(driver);	
	  
//Get out log in because can't access to section login
	  start();
	  
//Execute method for do review in the section On Demand
	  onDemand(); 
	  
//Execute method for do review in the section Profile and their elements
//*******THIS SECTION Have many problems, required some information for continue their automation**************************************//
	 //profile();
	  
//Execute method for do review in section TV Live
// **********THIS SECTION also have many problems for automation, because, the names of their elements are all the same**************
	  //tvLive();
	  
//Final Message
	  tool.space();
	  tool.print("================================================");
	  tool.print("==================TEST TERMINADO================");
	  tool.print("================================================");
  }
  
  

//After Method 
  @AfterMethod
  public void afterMethod() {
	  Tools tool = new Tools();
	  tool.waitTime(15000);
	  driver.quit();	
  } 
  
	 
//********************************METHODS*****************************// 
  public static void centerTap() {
		 TouchAction touchAction = new TouchAction(foxapp.driver);
		 Dimension dimensions = foxapp.driver.manage().window().getSize();
		 int pointX = (dimensions.getWidth() / 2);
		 int startPointY = (dimensions.getHeight() / 2);
		 touchAction.press(pointX, startPointY).release().perform();		 
	 } 	 
  
//Scroll with className
  public void scroll(String scrollable, String objetoDeBusqueda){
		 try{
			 FoxApp.driver.findElementByAndroidUIAutomator(
				 "new UiScrollable(new UiSelector().className(\""+scrollable+"\"))"
				 + ".scrollIntoView(new UiSelector().text(\""+objetoDeBusqueda+"\"));").click();;
				 tool.print("Encontre el objeto"+" "+objetoDeBusqueda);
		 }catch (Exception e){
			 tool.print("No se encontro: "+" "+ objetoDeBusqueda);
		 }
  }
  
			
//Scroll with resourceId
  public void scrollWithResourceId(String scrollable, String ObjetoDeBusqueda){

	  	try{
	  		FoxApp.driver.findElementByAndroidUIAutomator(
			"new UiScrollable(new UiSelector().resourceId(\""+scrollable+"\"))"
			+ ".scrollIntoView(new UiSelector().text(\""+ObjetoDeBusqueda+"\"));");
		}catch (Exception e){
			tool.print("No se encontro: "+" "+ ObjetoDeBusqueda);
		}
  }
  
			
//Scroll with direction
  public static void scrollDireccion(String direccion) {

	  TouchAction touchAction = new TouchAction(foxapp.driver);
	  Dimension dimensions = foxapp.driver.manage().window().getSize();
	  int pointX = (dimensions.getWidth() / 2);
	  int startPointY = (dimensions.getHeight() / 2);
	  int endPointY;

		if (direccion.equals("abajo")) {
			endPointY = (int) (dimensions.getHeight() * -0.5);
			touchAction.press(pointX, startPointY).moveTo(0, -400).release().perform();
			tool.waitTime(700);
		} else if (direccion.equals("arriba")) {
			endPointY = (int) (dimensions.getHeight() * 0.5);
			touchAction.press(pointX, startPointY).moveTo(0, 400).release().perform();
			tool.waitTime(700);
		}
  }
				  
//Scroll down
  public void scrollConocidoAbajo() {
	  Tools tool = new Tools();
	  for (int i=0;i<8;i++) {
		  scrollDireccion("abajo");		  
	  }
	  
  }
  
  public void scrollBuscando() {
	  boolean visto = false;
	do {
		   visto = driver.findElementByName("View More").isDisplayed();
		  scrollDireccion("abajo");
		  tool.print("Es"+" "+visto);
	  }while(visto != true);
  }
  
  
//*****************************************PRINCIPAL METHODS************************************//
  
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
  
//Verification On Demand
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
	  tool.print("Escribiendo...");
	  tool.waitTime(1000);
	  driver.findElementByName("Search-Text").sendKeys("Ready Jet");		  
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
	  scrollConocidoAbajo();	  
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
// **********THIS SECTION also have many problems for automation, because, the names of their elements are all the same**************
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
  
  
  
	//Steps for get page source
	/* space();
	  	System.out.println("Obteniendo XML");
		waitTime(2000);
	    String xml= driver.getPageSource();
		System.out.println("Imprimiendo XML...");
		space();
		System.out.println(xml);
		waitTime(120000);
	 */
//Method for search any object for Text
  //((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiSelector().text(\""+Omitir+"\")").click();


}
