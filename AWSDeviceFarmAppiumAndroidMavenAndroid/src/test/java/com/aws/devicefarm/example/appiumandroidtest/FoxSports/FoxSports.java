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
 * @author Elio Raymundo
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
		
		
		
		Tools.takeScreenshot();//Screenshot
		LoginTestCases login = new LoginTestCases();
		InLiveTestCases enVivo = new InLiveTestCases();
		ProfileTestCases miPerfil = new ProfileTestCases();
		NewsTestCases noticias = new NewsTestCases();
		ResultsTestCases resultsTestCases = new ResultsTestCases();
		RadioTestCases radioTestCases = new RadioTestCases();
		CompetitionsTestCases competitionTestCases = new CompetitionsTestCases();
		Tools.pestañasIniciales();//Este es para las ventanas emergentes que salen al inicio de la aplicacion
		//login.miPerfil();
		//enVivo.enVivo();
		//miPerfil.miPerfil();
		//noticias.noticias();
		//resultsTestCases.Resultados();
		//radioTestCases.radio();
		competitionTestCases.competitions();
		
		Tools.resultadoTest();
		System.out.println("Test finalizado con exito");
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
