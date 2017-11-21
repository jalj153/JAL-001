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
	private static FoxSports principal = new FoxSports();
	int foxTimeOut=7;
	static String destDir;
	static DateFormat dateFormat;
 	
	/**
	 * @throws Exception
	 */
	@BeforeMethod(alwaysRun = true)
	private void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// NOMBRE DE LA PLATAFORMA
		capabilities.setCapability("platformName", MobilePlatform.ANDROID);
		// VERSION DE LA PLATAFORMA
		capabilities.setCapability("platformVersion", FoxSports.readProperty("platform.android.version"));
		// NOMBRE DEL DISPOSITIVO
		capabilities.setCapability("deviceName", FoxSports.readProperty("device.android.name"));
		// DIRECCION DE LA APP
		capabilities.setCapability("app", new File(FoxSports.readProperty("app.android.path")).getAbsolutePath());
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(foxTimeOut, TimeUnit.SECONDS);
	}

	public static void Iniciar() {
		
		//waitTime(5000);
		try {
			//REALIZAR SCREENSHOT
			takeScreenshot();//("Botón Omitir");
			// TAP EN BOTON OMITIR
			driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Omitir\")").click();
		} catch (Exception e) {
			System.out.println("NO SE ENCUENTRA EL BOTON OMITIR");
		}
				
		try {
			//REALIZAR SCREENSHOT
			takeScreenshot();//("Permiso de Acceso a Llamadas Telefonicas");
			// TAP EN ALERTA DE PERMISO DE LLAMADAS TELEFONICAS
			driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}
		//waitTime(3000);

		try {
			// REALIZAR SCREENSHOT
			//takeScreenshot("Permiso de Acceso a Calendario");
			// TAP EN ALERTA DE PERMISO DE ACCESO A CALENDARIO
			driver.findElementByAndroidUIAutomator(
					"new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")").click();
		} catch (Exception e) {
			System.out.println("NO REQUIERE PERMISOS");
		}
		//waitTime(3000);

		// REALIZAR SCREENSHOT
		//takeScreenshot("Inicio de la Aplicacion");
		
		
	
		LoginTestCases login = new LoginTestCases();
		InLiveTestCases enVivo = new InLiveTestCases();
		ProfileTestCases miPerfil = new ProfileTestCases();
		NewsTestCases noticias = new NewsTestCases();
		ResultsTestCases resultsTestCases = new ResultsTestCases();
		RadioTestCases radioTestCases = new RadioTestCases();
		CompetitionsTestCases competitionTestCases = new CompetitionsTestCases();
		login.miPerfil();
		enVivo.enVivo();
		miPerfil.miPerfil();
		noticias.noticias();
		resultsTestCases.Resultados();
		radioTestCases.radio();
		competitionTestCases.competitions();
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

	public static void Radio() {
		int contador = 0;		
		List<AndroidElement> listButtonPlay = driver.findElementsByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/iv_play\"));");
		System.out.println("Se ha detectado -"+listButtonPlay.size()+"- radio(s) en Vivo");
		Boolean isPresent = listButtonPlay.size()>0;
		if(isPresent){
			try{
				for(AndroidElement elemento : listButtonPlay){
					elemento = listButtonPlay.get(contador);
					elemento.click();
					contador++;
					if(elemento == listButtonPlay.get(listButtonPlay.size()-1)){
					driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/iv_pause\");").click();
					}
				}
			} catch (Exception e){
				System.out.println("Ha ocurrido un error");
			}
		}else{
			System.out.println("No hay ninguna Radio disponible");
		}
		
	//	waitTime(10000);
		
		// OBTENER FECHA
		int cantidad = 0;
		String dateTime;
		DateFormat dateFormat = new SimpleDateFormat("dd MMM");
		Date date = new Date();
		Calendar calendar= Calendar.getInstance();
		calendar.setTime(date);
		for(int i=0; i<=10; i++){
			if(i>0){
				cantidad = 1;				
			}
		
		calendar.add(Calendar.DATE, cantidad);
		Date dateNext = calendar.getTime();
		dateTime = dateFormat.format(dateNext).toUpperCase();
		
		
		if(i == 0){
			dateTime = "HOY";
		} else if(i == 1){
			dateTime = "MAÑANA";
		}

		try {
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().text(\""+dateTime+"\"));")
					.click();			
			System.out.println("Si se ha encontrado la fecha: "+dateTime);
		} catch(Exception e){
			System.out.println("No se ha encontrado la fecha: "+dateTime);
		}	

		}
		System.out.println("Radio finalizado con exito");
	}
	
	public static void Noticias(){
		// TAP EN PESTAÑA DE NOTICIAS
		driver.findElementByAndroidUIAutomator("new UiSelector().index(2).className(\"android.support.v7.app.ActionBar$Tab\")").click();
	//	waitTime(5000);
		//Tap en TODAS LAS COMPETENCIAS
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Todas las Competencias\")").click();
	//	waitTime(5000);
		
		//Tap en competencia LA LIGA
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.widget.ListView\")).scrollIntoView(new UiSelector().text(\"La Liga\"));")
				.click();
	//	waitTime(5000);
		
		
		List<AndroidElement> listNewsTime = driver.findElementsByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/news_list\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/news_time\"));");
		System.out.println("Se ha detectado -"+listNewsTime.size()+"- noticia(s) reciente");
	//	waitTime(5000);
		
		//INgreso a la primer noticia
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/overthumb_play_cta\")").click();
///		waitTime(5000);
		try {
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"com.android.chrome:id/compositor_view_holder\")).scrollIntoView(new UiSelector().resourceId(\"\uF106 Volver al top\"))") //com.android.chrome:id/compositor_view_holder
					.click();
		} catch(Exception e){
			System.out.println("Ha sucedido un inconveniente con el boton 'volver al top'");
		}
		//	Superliga Argentina de Fútbol
		//Regresar
//		waitTime(5000);	
		driver.pressKeyCode(AndroidKeyCode.BACK);
			
//		waitTime(5000);	
		List<AndroidElement> listTime = driver.findElementsByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.support.v7.widget.RecyclerView\")).scrollIntoView(new UiSelector().resourceId(\"com.fic.foxsports:id/news_listitem_time\"));");
		System.out.println("Se ha detectado -"+listTime.size()+"- noticia(s) recientes");
//		waitTime(10000);

		//Ingreso a la segunda noticia
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/news_item\")").click();
	//	waitTime(5000);
		try{
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"com.android.chrome:id/compositor_view_holder\")).scrollIntoView(new UiSelector().resourceId(\"\uF106 Volver al top\"));")
					.click();
		}catch(Exception e){
			System.out.println("Ha sucedido un inconveniente con el boton 'Volver al TOP'");
		}
	//	waitTime(5000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
//		waitTime(5000);
		System.out.println("Noticias finalizado con exito");
		
	}
	public static void resultados(){
		//Tap en Resultados
		// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.LinearLayout/android.widget.ImageView
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.LinearLayout/android.widget.ImageView")).click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().index(2).className(\"android.support.v7.app.ActionBar$Tab\")").click();
	//	waitTime(3000);
		
		//Agregar favoritos
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/fallback_addfavs\")").click();
	//	waitTime(3000);
		
		//SELECCIONAR COMPETICION

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/favorites_list\")).scrollIntoView(new UiSelector().text(\"Bundesliga\"));")
				.click();
//		waitTime(1000);
		 //Primer equipo favorito
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/favorites_list\")).scrollIntoView(new UiSelector().text(\"Hannover 96\"));")
				.click();
//		waitTime(1000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
//		waitTime(1000);
		 
		//Obtener fecha
		int cantidad=0;
		String dateTime;
		DateFormat dateFormat = new SimpleDateFormat("dd MMM");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		for(int i=0;i<2;i++){
			if (i>0){
				cantidad = 1;
			}
		calendar.add(Calendar.DATE, cantidad);
		Date dateNext = calendar.getTime();
		dateTime = dateFormat.format(dateNext).toUpperCase();
		if (i==0){
			dateTime ="HOY";
			
		}else{
			dateTime="MAÑANA";
		}
		try {
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/HomeViewPager\")).scrollIntoView(new UiSelector().text(\""+dateTime+"\"));")
					.click();			
			System.out.println("Si hay resultados en la fecha: "+dateTime);
			
		} catch(Exception e){
			System.out.println("No hay resultados en la fecha: "+dateTime);
		}
		 
		}
		//Seleccionar Hannover 96
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/match_box_container\")").click();;
	//	waitTime(6000);
		System.out.println("Click en Hannover 96");
		//Ir a la derecha
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	//	waitTime(5000);
		//ir a los lados
		for(int a=0;a<4;a++){
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
	//	waitTime(5000);
		//System.out.println("Vuelta numero "+ a);
		}
	//	waitTime(4000);
		//TAP EN BACK
		driver.pressKeyCode(AndroidKeyCode.BACK);
	//	waitTime(1000);
		//TAP PARA VER LOS RESULTADOS DE TODOS
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")).click();
	//	waitTime(3000);
		//COMPROBAR LA FUNCIONALIDAD DEL BOTON "HOY"
		try{
			driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/btn_result_today\")").click();
	//		waitTime(3000);	
		}catch(Exception e){
			System.out.println("El boton 'HOY' no tiene ninguna funcionalidad o no se ha encontrado, esto es relativo.");
		}
				
		System.out.println("Resultados finalizado con Exito");
	}
	
	public static void enVivo(){
		//Tap en el boton EN VIVO
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.LinearLayout")).click();
//		waitTime(3000);
		//Ingreso al primer en vivo
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageButton")).click();
//		waitTime(40000);
		//Ingreso al segundo en vivo
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();
//		waitTime(40000);
		//Buscar programacion para manana y agregarla a notificaciones
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/competition_list\")).scrollIntoView(new UiSelector().text(\"MAÑANA\"));")
				.click();
//		waitTime(3000);
		
		//Ir a una programacion futura y comprobar la funcionalidad del boton"Ir al canal en vivo"
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/epg_item\")").click();
//		waitTime(10000);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/inc_go_to_channel\")").click();
//		waitTime(20000);
		System.out.println("En Vivo finalizado con exito");	
	}
	
	public static void competencias (){		
	//Tap en el icono COMPETENCIAS
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.LinearLayout")).click();
//	waitTime(5000);
	//Seleccionar una competencia
	driver.findElementByAndroidUIAutomator(
			"new UiScrollable(new UiSelector().resourceId(\"com.fic.foxsports:id/competition_list\")).scrollIntoView(new UiSelector().text(\"Bundesliga\"))").click();
//	waitTime(5000);
	//Tap en resultados
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.RelativeLayout/android.widget.TextView")).click();
//	waitTime(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout/android.widget.TextView")).click();
//	waitTime(3000);
	//Ir hacia la derecha
	for(int aux=0;aux<=3;aux++){
		try{
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.RelativeLayout/android.widget.TextView")).click();
	//		waitTime(3000);
		}catch(Exception e){
			
			}	
	}
	
	System.out.println("Competencias ha finalizado con exito.");
	}
	
	public static void Home() {
		// TAP EN BACK
		driver.pressKeyCode(AndroidKeyCode.BACK);
//		waitTime(1000);
		// REALIZAR SCREENSHOT
		//takeScreenshot("Pestaña En Vivo");
		// TAP EN PESTAÑA DE RESULTADOS
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().index(1).className(\"android.support.v7.app.ActionBar$Tab\")").click();
//		waitTime(1000);
		// REALIZAR SCREENSHOT
		//takeScreenshot("Pestaña Resultados");
		// TAP EN PESTAÑA DE NOTICIAS
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().index(2).className(\"android.support.v7.app.ActionBar$Tab\")").click();
///		waitTime(1000);
		// REALIZAR SCREENSHOT
	//	takeScreenshot("Pestaña Noticias");
		// TAP EN PESTAÑA DE COMPETENCIAS
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().index(3).className(\"android.support.v7.app.ActionBar$Tab\")").click();
	//	waitTime(1000);
		// REALIZAR SCREENSHOT
		//takeScreenshot("Pestaña Competencia");
		// TAP EN PESTAÑA DE RADIO
		driver.findElementByAndroidUIAutomator(
				"new UiSelector().index(4).className(\"android.support.v7.app.ActionBar$Tab\")").click();
//		waitTime(1000);
		// REALIZAR SCREENSHOT
		//takeScreenshot("Pestaña Radio");
	}	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
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
}
