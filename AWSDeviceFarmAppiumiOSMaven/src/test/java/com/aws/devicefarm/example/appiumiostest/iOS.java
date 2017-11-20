package com.aws.devicefarm.example.appiumiostest;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iOS {
	private static IOSDriver<IOSElement> driver;

	/**
	 * Run before each method
	 * 
	 * @throws MalformedURLException
	 */
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("app", "/Users/imac/Desktop/UI Test/Aplicaciones/FOXSports.app");
		capabilities.setCapability("noReset", "false");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.7.1");
		

		URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new IOSDriver<IOSElement>(appiumURL, capabilities);
	}

	/**
	 * Run After each test method
	 */
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void basicTest() {
		waitTime(5000);
		buscar("Allow");

		waitTime(5000);
		buscar("OMITIR");

		waitTime(5000);
		buscar("OK");
		
		waitTime(1000);
		//buscar("icon profile");

		//login();
		//waitTime(5000);
		//buscar("backWebViewBtn");
		//perfil();
		//noticias();
		radio();
	}

	private static void perfil() {
		waitTime(1000);
		buscar("icon profile");

		login();
		favoritos();

		waitTime(1000);
		buscar("Centro de Ayuda");
		waitTime(10000);
		buscar("Back");

		waitTime(1000);
		buscar("¿Qué hay de nuevo?");
		waitTime(10000);
		buscarFavoritos("seleccionar", "\uF106 Volver al top");
		waitTime(1000);
		buscar("Back");

		waitTime(1000);
		buscar("Política de Privacidad");
		waitTime(10000);
		buscarFavoritos("seleccionar", "\uF106 Volver al top");
		waitTime(1000);
		buscar("Back");

		waitTime(1000);
		buscar("Términos y Condiciones");
		waitTime(10000);
		buscarFavoritos("seleccionar", "\uF106 Volver al top");
		waitTime(1000);
		buscar("Back");

		waitTime(1000);
		buscar("backWebViewBtn");
	}

	private static void radio() {
		waitTime(2500);
		buscar("Radio");

		int contador = 0;
		List<IOSElement> playBtns = driver.findElements(By.name("playBtn"));
		Boolean isPresent = playBtns.size() > 0;
		if (isPresent) {
			for (IOSElement elem : playBtns) {
				elem = playBtns.get(contador);
				elem.click();
				contador++;
				
				waitTime(10000);
				if (elem == playBtns.get(playBtns.size() - 1)) {
					elem.click();
				}
			}
		}

		int cantidad = 0;
		String date;
		DateFormat dateFormat = new SimpleDateFormat("dd MMM");
		Date fechaActual = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(fechaActual);

		for (int i = 0; i <= 10; i++) {
			if (i > 0) {
				cantidad = 1;
			}

			c.add(Calendar.DATE, cantidad);
			Date fechaSiguiente = c.getTime();
			date = dateFormat.format(fechaSiguiente).toUpperCase();

			if (fechaActual.equals(fechaSiguiente)) {
				date = "HOY";
			} else if (i == 1) {
				date = "MAÑANA";
			}

			buscarFavoritos("ninguna", date);
		}
	}

	private static void noticias() {
		waitTime(1000);
		buscar("Noticias");

		waitTime(1000);
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView"
				+ "/XCUIElementTypeCell[1]")).click();
		waitTime(5000);
		buscarFavoritos("seleccionar", "\uF106 Volver al top");
		waitTime(1000);
		buscar("Back");

		waitTime(1000);
		driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"
				+ "/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView"
				+ "/XCUIElementTypeCell[3]")).click();
		waitTime(5000);
		buscarFavoritos("seleccionar", "\uF106 Volver al top");
		waitTime(1000);
		buscar("Back");
	}

	private static void login() {
		waitTime(1000);
		buscar("CERRAR SESIÓN");

		waitTime(1000);
		buscar("INGRESAR");

		waitTime(10000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"INVITADOS\"]")).click();

		waitTime(10000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElement"
				+ "TypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"))
				.sendKeys("hendrik.hurtarte.fox@gmail.com");

		waitTime(1000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElement"
				+ "TypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField"))
				.sendKeys("foxplay2017");

		waitTime(1000);
		driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElement"
				+ "TypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch")).click();

		waitTime(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Login\"]")).click();
	}

	private static void favoritos() {
		waitTime(10000);
		buscar("Favoritos");

		waitTime(1000);
		buscar("AGREGAR");

		waitTime(1500);
		buscarFavoritos("seleccionar", "Superliga Argentina de Fútbol");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Liga Bancomer MX");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Primera división Colombia");

		waitTime(1000);
		driver.findElement(By.id("Siguiente")).click();

		waitTime(1500);
		buscarFavoritos("seleccionar", "Barcelona");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Manchester City");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Bayern Munchen");

		waitTime(1000);
		driver.findElement(By.id("Finalizar")).click();

		waitTime(1500);
		buscarFavoritos("eliminar", "Barcelona");
		waitTime(1000);
		buscarFavoritos("eliminar", "Manchester City");
		waitTime(1000);
		buscarFavoritos("eliminar", "Liga Bancomer MX");
		waitTime(1000);
		buscarFavoritos("eliminar", "Primera división Colombia");

		waitTime(1000);
		driver.findElement(By.id("AGREGAR EQUIPOS")).click();

		waitTime(1500);
		buscarFavoritos("seleccionar", "Campeonato Brasileiro A");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Chapecoense");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Vitória");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Campeonato Brasileiro A");

		waitTime(1000);
		buscarFavoritos("seleccionar", "UEFA Champions League");
		waitTime(1000);
		buscarFavoritos("seleccionar", "Roma");
		waitTime(1000);
		buscarFavoritos("seleccionar", "APOEL");
		waitTime(1000);
		buscarFavoritos("seleccionar", "UEFA Champions League");

		waitTime(1000);
		driver.findElement(By.id("Back")).click();

		waitTime(1500);
		driver.findElement(By.id("AGREGAR COMPETENCIAS")).click();

		waitTime(1500);
		buscarFavoritos("seleccionar", "Bundesliga");
		waitTime(1000);
		buscarFavoritos("seleccionar", "UEFA Europa League");

		waitTime(1000);
		driver.findElement(By.id("Back")).click();

		waitTime(1500);
		buscarFavoritos("eliminar", "Bayern Munchen");
		waitTime(1000);
		buscarFavoritos("eliminar", "Chapecoense");
		waitTime(1000);
		buscarFavoritos("eliminar", "Vitória");
		waitTime(1000);
		buscarFavoritos("eliminar", "Bundesliga");
		waitTime(1000);
		buscarFavoritos("eliminar", "Superliga Argentina de Fútbol");
		waitTime(1000);
		buscarFavoritos("eliminar", "UEFA Europa League");

		waitTime(1000);
		driver.findElement(By.id("Back")).click();
	}

	private static void buscarFavoritos(String accion, String id) {
		String source1;
		String source2;
		Boolean isPresent = driver.findElements(By.id(id)).size() > 0;

		while (!isPresent) {
			source1 = driver.getPageSource();
			scroll("abajo");
			source2 = driver.getPageSource();
			isPresent = driver.findElements(By.id(id)).size() > 0;
			if (source1.equals(source2)) {
				break;
			}
		}

		if (isPresent) {
			Boolean isVisible = driver.findElement(By.id(id)).isDisplayed();

			while (!isVisible) {
				source1 = driver.getPageSource();
				scroll("abajo");
				source2 = driver.getPageSource();
				isVisible = driver.findElement(By.id(id)).isDisplayed();
				if (source1.equals(source2)) {
					break;
				}
			}

			if (isVisible) {
				gesto(accion, id);
			}
		} else {
			while (!isPresent) {
				source1 = driver.getPageSource();
				scroll("arriba");
				source2 = driver.getPageSource();
				isPresent = driver.findElements(By.id(id)).size() > 0;
				if (source1.equals(source2)) {
					break;
				}
			}

			if (isPresent) {
				Boolean isVisible = driver.findElement(By.id(id)).isDisplayed();

				while (!isVisible) {
					source1 = driver.getPageSource();
					scroll("arriba");
					source2 = driver.getPageSource();
					isVisible = driver.findElement(By.id(id)).isDisplayed();
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isVisible) {
					gesto(accion, id);
				}
			} else {
				System.out.println("No se ha encontrado el elemento: " + id);
			}
		}
	}

	// Metodo para la busqueda de elementos y para poder seleccionarlo.
	private static void buscar(String id) {
		Boolean isPresent = driver.findElements(By.id(id)).size() > 0;

		if (isPresent) {
			driver.findElement(By.id(id)).click();
		} else {
			System.out.println("No se ha encontrado el elemento: " + id);
		}
	}

	// Metodo para hacer el movimiento scroll
	private static void scroll(String direccion) {
		TouchAction touchAction = new TouchAction(driver);
		Dimension dimensions = driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		int endPointY;

		if (direccion.equals("abajo")) {
			endPointY = (int) (dimensions.getHeight() * -0.5);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		} else if (direccion.equals("arriba")) {
			endPointY = (int) (dimensions.getHeight() * 0.5);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		}
	}

	// Metodo para hacer los diferentes gestos: seleccionar, eliminar
	private static void gesto(String accion, String id) {
		TouchAction touchAction = new TouchAction(driver);
		Dimension dimensions = driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / -2);
		int pointY = driver.findElement(By.id(id)).getSize().getHeight();

		if (accion.equals("seleccionar")) {
			buscar(id);
		} else if (accion.equals("eliminar")) {
			touchAction.press(driver.findElement(By.id(id))).moveTo(pointX, pointY).release().perform();
			buscar("Delete");
		}
	}

	private static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.out.println("Tiempo de espera terminado");
		}
	}
}
