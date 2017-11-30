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
		LoginTestCases login = new LoginTestCases();
		InLiveTestCases enVivo = new InLiveTestCases();
		ProfileTestCases miPerfil = new ProfileTestCases();
		NewsTestCases noticias = new NewsTestCases();
		ResultsTestCases resultsTestCases = new ResultsTestCases();
		RadioTestCases radioTestCases = new RadioTestCases();
		CompetitionsTestCases competitionTestCases = new CompetitionsTestCases();
		Tools.pestañasIniciales();//Este es para las ventanas emergentes que salen al inicio de la aplicacion
	
		Tools.takeScreenshot("Inicio de la aplicacion");//Screenshot
		login.login_020();
		enVivo.enVivo_010();
		enVivo.enVivo_020();
		enVivo.enVivo_030();
		enVivo.enVivo_040();
		enVivo.enVivo_050();
		enVivo.enVivo_060();
		enVivo.enVivo_070();
		enVivo.enVivo_080();
		enVivo.enVivo_090();
		miPerfil.miPerfil_020();
		miPerfil.miPerfil_030();
		miPerfil.miPerfil_040();
		miPerfil.miPerfil_050();
		miPerfil.miPerfil_060();
		miPerfil.miPerfil_070();
		miPerfil.miPerfil_080();
		noticias.noticia_010();
		noticias.noticia_020();
		resultsTestCases.Results_010();
		resultsTestCases.Results_020();
		resultsTestCases.Results_030();
		resultsTestCases.Results_040();
		resultsTestCases.Results_050();
		resultsTestCases.Results_060();
		resultsTestCases.Results_070();
		resultsTestCases.Results_080();
		resultsTestCases.Results_090();
		resultsTestCases.Results_100();
		resultsTestCases.Results_110();
		resultsTestCases.Results_120();
		resultsTestCases.Results_130();
		resultsTestCases.Results_140();
		resultsTestCases.Results_150();
		resultsTestCases.Results_160();
		radioTestCases.Radio_010();
		radioTestCases.Radio_020();
		radioTestCases.Radio_030();
		radioTestCases.Radio_040();
		competitionTestCases.Competitions_010();
		competitionTestCases.Competitions_020();
		competitionTestCases.Competitions_030();
		competitionTestCases.Competitions_040();
		competitionTestCases.Competitions_050();
		competitionTestCases.Competitions_060();
		competitionTestCases.Competitions_070();
		competitionTestCases.Competitions_080();
		competitionTestCases.Competitions_090();
		competitionTestCases.Competitions_100();
		competitionTestCases.Competitions_110();
		competitionTestCases.Competitions_120();
		competitionTestCases.Competitions_130();
		competitionTestCases.Competitions_140();
		competitionTestCases.Competitions_150();
		competitionTestCases.Competitions_160();
		competitionTestCases.Competitions_170();
		competitionTestCases.Competitions_180();
		competitionTestCases.Competitions_190();
		competitionTestCases.Competitions_200();
		competitionTestCases.Competitions_210();
		competitionTestCases.Competitions_220();
		competitionTestCases.Competitions_230();
		competitionTestCases.Competitions_240();
		competitionTestCases.Competitions_250();
		competitionTestCases.Competitions_260();
		competitionTestCases.Competitions_270();
			
		Tools.resultadoTest();
		System.out.println("Test finalizado con exito");
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
