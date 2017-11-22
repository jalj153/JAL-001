package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobilePlatform;

/**
 * @authores Fredy García and Elio Raymundo
 *
 */
 @Test public class FoxSports {
	public static AndroidDriver<AndroidElement> driver;	
	int foxTimeOut=7;
	Tools tools = new Tools();
 	
	/**
	 * @throws Exception
	 */
	@BeforeMethod(alwaysRun = true)
	private void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// NOMBRE DE LA PLATAFORMA
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		// VERSION DE LA PLATAFORMA
		capabilities.setCapability("platformVersion", tools.readProperty("platform.android.version"));
		// NOMBRE DEL DISPOSITIVO
		capabilities.setCapability("deviceName", tools.readProperty("device.android.name"));
		// DIRECCION DE LA APP
		capabilities.setCapability("app", new File(tools.readProperty("app.android.path")).getAbsolutePath());
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(foxTimeOut, TimeUnit.SECONDS);
	}

	public static void Iniciar() {
		
		//waitTime(5000);
		try {
			//REALIZAR SCREENSHOT
			Tools.takeScreenshot();//("Botón Omitir");
			// TAP EN BOTON OMITIR
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Omitir\")").click();
		} catch (Exception e) {
			System.out.println("NO SE ENCUENTRA EL BOTON OMITIR");
		}
				
		try {
			//REALIZAR SCREENSHOT
			Tools.takeScreenshot();//("Permiso de Acceso a Llamadas Telefonicas");
			// TAP EN ALERTA DE PERMISO DE LLAMADAS TELEFONICAS
			driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}

		try {
			// REALIZAR SCREENSHOT
			Tools.takeScreenshot();//("Permiso de Acceso a Calendario");
			// TAP EN ALERTA DE PERMISO DE ACCESO A CALENDARIO
			driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}

		// REALIZAR SCREENSHOT
		Tools.takeScreenshot();//("Inicio de la Aplicacion");
		
		
	
		LoginTestCases login = new LoginTestCases();
		InLiveTestCases enVivo = new InLiveTestCases();
		ProfileTestCases miPerfil = new ProfileTestCases();
		NewsTestCases noticias = new NewsTestCases();
		ResultsTestCases resultsTestCases = new ResultsTestCases();
		RadioTestCases radioTestCases = new RadioTestCases();
		CompetitionsTestCases competitionTestCases = new CompetitionsTestCases();
		login.miPerfil();
		//enVivo.enVivo();
		//miPerfil.miPerfil();
		//noticias.noticias();
		//resultsTestCases.Resultados();
		//radioTestCases.radio();
		//competitionTestCases.competitions();
		System.out.println("Test finalizado con exito");
	}
	
	public static void scroll(String direccion) {
		
		TouchAction touchAction = new TouchAction(driver);
		Dimension dimensions = driver.manage().window().getSize();
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


	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
