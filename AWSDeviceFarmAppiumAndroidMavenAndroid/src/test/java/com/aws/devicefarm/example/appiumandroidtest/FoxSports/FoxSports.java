package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

import java.io.File;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
		login.login_020(); //Iniciar sesión con usuario Invitado											
		enVivo.enVivo_010(); //Mostrar los canales que se encuentran en transmitiendo En Vivo
		enVivo.enVivo_020(); //Mostrar la Programacion de transmisiones En Vivo de "Más Tarde"
		enVivo.enVivo_030(); //Mostrar la Programacion de transmisiones En Vivo de "Mañana"
		enVivo.enVivo_040(); //Mostrar la Programacion de transmisiones En Vivo de los próximos días
		enVivo.enVivo_050(); //Reproducir un canal en vivo
		enVivo.enVivo_060(); //Reproducir un show en vivo
		enVivo.enVivo_070(); //Reproducir un canal o show en vivo en fullscreen y ver "MÁS EVENTOS EN VIVO"
		enVivo.enVivo_080(); //Reproducir un evento programado que no va por un canal
		enVivo.enVivo_090(); //Reproducir un evento programado que va por un canal
		miPerfil.miPerfil_010(); //Ir a mi Perfil
		miPerfil.miPerfil_020(); //Tap en Favoritos 
		miPerfil.miPerfil_030(); //Favoritos>Tap en Agregar Equipo>Tap en la Competencia>Tap en el equipo
		miPerfil.miPerfil_040(); //Favoritos>Tap en Agregar Equipo>Tap en la Competencia
		miPerfil.miPerfil_050(); //Tap en Centro De Ayuda y Verificar contenido de acuerdo al título
		miPerfil.miPerfil_060(); //Tap en ¿Que hay de nuevo? y Verificar contenido de acuerdo al título
		miPerfil.miPerfil_070(); //Tap en Politica de Privacidad y Verificar contenido de acuerdo al título
		miPerfil.miPerfil_080(); //Tap en Terminos y Condiciones y Verificar contenido de acuerdo al título
		noticias.noticia_010();  //Ir al picker para poder filtrar por competencias las noticias
		noticias.noticia_020();  //Tap en cualquier noticia
		resultsTestCases.Results_010(); //Tap en Favoritos>Tap en una competencia>Verificar los resultados
		resultsTestCases.Results_020(); //Tap en Favoritos>Tap en un resultado
		resultsTestCases.Results_030(); //Tap en Favoritos>Tap en un resultado>Tap en Resumen
		resultsTestCases.Results_040(); //Tap en Favoritos>Tap en un resultado>Tap en Linea de Tiempo
		resultsTestCases.Results_050(); //Tap en Favoritos>Tap en un resultado>Tap en Estadísticas
		resultsTestCases.Results_060(); //Tap en Favoritos>Tap en un resultado>Tap en Alineaciones
		resultsTestCases.Results_070(); //Tap en Favoritos>Tap en un resultado>Tap en Historial
		resultsTestCases.Results_080(); //Tap en Favoritos>Tap en un resultado>Tap en Clasificacion
		resultsTestCases.Results_090(); //Tap en Todos>Tap en una competencia>Verificar los resultados
		resultsTestCases.Results_100(); //Tap en Todos>Tap en un resultado
		resultsTestCases.Results_110(); //Tap en Todos>Tap en un resultado>Tap en Resumen
		resultsTestCases.Results_120(); //Tap en Todos>Tap en un resultado>Tap en Linea de Tiempo
		resultsTestCases.Results_130(); //Tap en Todos>Tap en un resultado>Tap en Estadísticas
		resultsTestCases.Results_140(); //Tap en Todos>Tap en un resultado>Tap en Alineaciones
		resultsTestCases.Results_150(); //Tap en Todos>Tap en un resultado>Tap en Historial
		resultsTestCases.Results_160(); //Tap en Todos>Tap en un resultado>Tap en Clasificacion
		radioTestCases.Radio_010(); //Mostrar las radios que se encuentran en transmitiendo En Vivo
		radioTestCases.Radio_020(); //Mostrar la Programacion de transmisiones En Vivo de "Mañana"
		radioTestCases.Radio_030(); //Mostrar la Programacion de transmisiones En Vivo de los próximos días 
		radioTestCases.Radio_040(); //Reproducir una radio en vivo
		competitionTestCases.Competitions_010(); //Mostrar todas las competencias disponibles 
		competitionTestCases.Competitions_020(); //Ir al search bar para realizar la busqueda de una competencia
		competitionTestCases.Competitions_030(); //Tap en una competencia y verificar contenido de tabs
		competitionTestCases.Competitions_040(); //Tap en una Competencia de fútbol>Tap en Resultados
		competitionTestCases.Competitions_050(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado
		competitionTestCases.Competitions_060(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado>Tap en Resumen
		competitionTestCases.Competitions_070(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado>Tap en Linea de Tiempo
		competitionTestCases.Competitions_080(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado>Tap en Estadísticas
		competitionTestCases.Competitions_090(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado>Tap en Alineaciones
		competitionTestCases.Competitions_100(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en un Resultado>Tap en Historial
		competitionTestCases.Competitions_110(); //Tap en una Competencia de fútbol>Tap en Resultados>Tap en Resultado>Tap en Clasificacion
		competitionTestCases.Competitions_120(); //Tap en una Competencia de fútbol>Tap en Noticias
		competitionTestCases.Competitions_130(); //Tap en una Competencia de fútbol>Tap en Posiciones
		competitionTestCases.Competitions_140(); //Tap en una Competencia de fútbol>Tap en Equipos
		competitionTestCases.Competitions_150(); //Tap en una Competencia de fútbol>Tap en Equipos>Tap en un Equipo
		competitionTestCases.Competitions_160(); //Tap en Competencias > Tap en una Competencia de fútbol>Tap en Estadisticas
		competitionTestCases.Competitions_170(); //Tap en una Competencia de motor>Tap en Resultados
		competitionTestCases.Competitions_180(); //Tap en una Competencia de motor>Tap en Resultados>Tap en un resultado (Verificar que funcione el ComboBox en la selección de un piloto)
		competitionTestCases.Competitions_190(); //Tap en una Competencia de motor>Tap en Noticias
		competitionTestCases.Competitions_200(); //Tap en una Competencia de motor>Tap en Posiciones
		competitionTestCases.Competitions_210(); //Tap en una Competencia de motor>Tap en Calendario
		competitionTestCases.Competitions_220(); //Tap en una Competencia de motor>Tap en Calendario>Tap en un piloto (Verificar que funcione el ComboBox en la selección de un piloto)
		competitionTestCases.Competitions_230(); ////Tap en una Competencia de motor>Tap en Pilotos
		competitionTestCases.Competitions_240(); //Tap en una Competencia de motor>Tap en Pilotos>Tap en un piloto (Verificar que funcione el ComboBox en la selección de un piloto)
		competitionTestCases.Competitions_250(); //Tap en una Competencia de Baseball>Tap en Posiciones
		competitionTestCases.Competitions_260(); //Tap en una Competencia de Baseball>Tap en Resultados
		competitionTestCases.Competitions_270(); //Tap en una Competencia de Baseball>Tap en Noticias
		Tools.resultadoTest();
		System.out.println("Test finalizado con exito");
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
