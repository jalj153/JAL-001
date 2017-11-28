package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.internal.Invoker;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.sun.jna.platform.FileUtils;






import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;


public class Tools {
	
	//String text;
	public static String aux;
	public static boolean verificador = false;
	public static boolean validar = false;
	static FoxSports principal = new FoxSports();
	LoginSteps loginSteps = new LoginSteps();
	public static String palabra;
	static boolean found = false;
	static int cont = 0;
	static String destDir;
	static DateFormat dateFormat;
	public static int totalBuenas= 0;
	public static int totalMalas=0;
	public static int totalTest=0;
	public static int porcentaje=1;
		
	// METODO PARA TIEMPO DE ESPERA
	public static  void waitTime(int time) {
		try {
			Thread.sleep(time);	
		} catch (InterruptedException e) {
			System.out.print("Tiempo de Espera Terminado");
		}
	}
	//metodo para Buscar los elementos por su id
	public void searchId(String id, String location){
		try{
		principal.driver.findElementById(id).click();
		totalBuenas += 1;
		}catch(Exception e){
			totalMalas += 1;
			System.err.println("          error"+" ******************************"+ location );
		}	
	}
	
	//Metodo para buscar texto
	public void searchText(String text){
		try{
			principal.driver.findElementByAndroidUIAutomator("new UiSelector().text(\""+text+"\")").click();
			totalBuenas += 1;
		}catch(Exception e){
			totalMalas += 1;
			System.err.println("          No se ha encontrado "+text+" ******************************");
		}
	}
	
	//Metodo para buscar los elementos por su xPath
	public void searchPath(String xPath){
		try{
			principal.driver.findElementByXPath(xPath).click();	
			totalBuenas += 1;
		}catch(Exception e){
			totalMalas += 1;
			System.err.println("          error"+" ******************************");
		}
	}
	
	//Metodo para mandar texto
	public void sendText(String id, String text){
		try{
			//principal.driver.findElementById(id).sendKeys(text);
			principal.driver.findElementByAndroidUIAutomator("new UiSelector().text(\""+id+"\")").sendKeys(text);
		}catch(Exception e){
			System.err.println("No se pudo mandar el texto a"+ " "+id);
		}
	}

   //Ocultar teclado
	public void ocultarTeclado(){
		principal.driver.hideKeyboard();
	}
	
	//Metodo para regresar
	public static void back(){
		principal.driver.pressKeyCode(AndroidKeyCode.BACK);
	}
	
		
	
	//Metodo para buscar algo regresando
	public void findBack(String text){
		while (verificador == false){
			try{
			principal.driver.findElementByAndroidUIAutomator("new UiSelector().text(\""+text+"\")").click();; 
				verificador = true;
			}catch(Exception e){
					back();
					verificador = false;
				}		
			}
			verificador = false;
	}
	
	public static  void backToMenu(int cont){
		while(cont > 0){
			back();
			cont--;
			waitTime(2000);
		}
		
		
	}
	
	
	//Metodo para verificar si existen o no los objetos
	public void findAndReport(String xpath, String error){
		try{
			principal.driver.findElementByXPath(xpath);
			totalBuenas += 1;
		}catch(Exception e){
			totalMalas += 1;
			System.err.println("          "+error+" ******************************");
		}
	}
	
	//Metodo para hacer scroll hasta encontrar algo
	public void findWithScroll(String scrollable, String ObjetoDeBusqueda){
		try{
		principal.driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\""+scrollable+"\")).scrollIntoView(new UiSelector().resourceId(\""+ObjetoDeBusqueda+"\"));");
			totalBuenas +=1;
		}catch (Exception e){
			totalMalas+=1;
			System.err.println("          Elemento no encontrado ******************************");
		}
		}
	
	public void getText(){
		palabra = principal.driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/competition_list\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/epg_time\"));").getText();
	}
	
	//Metodo para hacer scroll con el nombre de la clase
		public void scroll(String scrollable, String ObjetoDeBusqueda){
			try{
				principal.driver.findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().className(\""+scrollable+"\")).scrollIntoView(new UiSelector().text(\""+ObjetoDeBusqueda+"\"));").click();
				totalBuenas +=1;
			}catch (Exception e){
				totalMalas +=1;
					System.err.println("          No se encontro: "+" "+ ObjetoDeBusqueda+" ******************************");
				}
		}
		
	//Scroll con resourceId
		public void scrollWithResourceId(String scrollable, String ObjetoDeBusqueda){
			try{
				principal.driver.findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().resourceId(\""+scrollable+"\")).scrollIntoView(new UiSelector().text(\""+ObjetoDeBusqueda+"\"));");
				totalBuenas +=1;
			}catch (Exception e){
				totalMalas+=1;
					System.err.println("          No se encontro: "+" "+ ObjetoDeBusqueda+" ******************************");
				}
		}
		
	
	
	//Metodo para comprobar la hora, nombre y tipo del evento
	public void findHourNameType(String Hour, String Name, String Type){
		try{
			principal.driver.findElementById(Hour); //Verificar la hora
			totalBuenas += 1;
		}catch(Exception e){
			System.err.println("          No se encontro la hora ******************************");
			totalMalas += 1;
		}
		try{
			principal.driver.findElementById(Name);//Verificar el nombre del evento
			totalBuenas += 1;
		}catch(Exception e){
			totalMalas += 1;
			System.err.println("          El evento no tiene nombre ******************************");
		}
		try{
			principal.driver.findElementById(Type);//Verificar el tipo del evento
			totalBuenas += 1;
		}catch(Exception e){
			System.err.println("          No se encuentra el tipo del evento ******************************");
			totalMalas += 1;
		}
		try{
			searchId("com.fic.foxsports:id/epg_scheduleButton", ""); //Buscar el boton de alertas
			totalBuenas += 1;
		}catch(Exception e){
			System.err.println("          No se encuentra el boton de recordatorio ******************************");
			totalMalas += 1;
		}
	}
	
	public void searchElementsOfLogin(String xpath){
		try{
			principal.driver.findElementByXPath(xpath);
			}catch(Exception e){
				System.err.println("          No has iniciado sesion ******************************");				
			}
	}
	
	// METODO PARA LEER EL ARCHIVO DE CONFIGURACION
	public static String readProperty(String property) {
		Properties prop;
		String value = null;
		try {
			prop = new Properties();
			prop.load(new FileInputStream(new File("config.properties")));
			value = prop.getProperty(property);
			if (value == null || value.isEmpty()) {
				throw new Exception("Value not set or empty");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void takeScreenshot(){
		destDir = "screenshots";
		File scrFile = ((TakesScreenshot)principal.driver).getScreenshotAs(OutputType.FILE);
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		new File(destDir).mkdirs();
		String destFile = dateFormat.format(new Date()) + ".png";
		try {
			   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			  } catch (IOException e) {
			   e.printStackTrace();
			  }
		
	}
	
	
	public  void scroll(String direccion) {
		
		TouchAction touchAction = new TouchAction(principal.driver);
		Dimension dimensions = principal.driver.manage().window().getSize();
		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		int endPointY;
		if (direccion.equals("abajo")) {
		endPointY = (int) (dimensions.getHeight() * -0.5);
		touchAction.press(pointX, startPointY).moveTo(0, -50).release().perform();		
		} else if (direccion.equals("arriba")) {
		endPointY = (int) (dimensions.getHeight() * 0.5);
		touchAction.press(pointX, startPointY).moveTo(0, 50).release().perform();
			}	
		}
	
	public static void pestañasIniciales(){

		try {
			//REALIZAR SCREENSHOT
			takeScreenshot();//("Botón Omitir");
			// TAP EN BOTON OMITIR
			principal.driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Omitir\")").click();
		} catch (Exception e) {
			System.out.println("NO SE ENCUENTRA EL BOTON OMITIR");
		}
				
		try {
			//REALIZAR SCREENSHOT
			takeScreenshot();//("Permiso de Acceso a Llamadas Telefonicas");
			// TAP EN ALERTA DE PERMISO DE LLAMADAS TELEFONICAS
			principal.driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}

		try {
			// REALIZAR SCREENSHOT
			takeScreenshot();//("Permiso de Acceso a Calendario");
			// TAP EN ALERTA DE PERMISO DE ACCESO A CALENDARIO
			principal.driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}

		
	}
	
	
	public static void resultadoTest(){
		totalTest =(totalBuenas + totalMalas);
		if(totalTest == 0){
			System.out.println("No se realizo ningun test");
		}else{
			porcentaje = ((totalBuenas * 100)/totalTest);
			System.err.println("El test finalizo con un "+ porcentaje+ "% de efectividad");
		}
		
		}
	
}
