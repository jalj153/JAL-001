package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class Tools {
	static FoxSports foxSports = new FoxSports();
	static int failTotal=0;
	static int successTotal=0;
	static int total=0;
	static int percentage=0;
	///////////////////////Método que calcula el tiempo para que se efectue una acción
	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.err.println("Timeout");
		}
	}
	
	
	////////////////////////Metodo para la busqueda de elementos y para poder seleccionarlo(Busca por ID)
	public static void searchId(String id) {
		/*boolean verification = false;
		Boolean isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
			if (isPresent) {
				foxSports.driver.findElement(By.id(id)).click();
				verification=true;
			} else {
				System.out.println("No se ha encontrado el elemento: " + id);
				waitTime(1000);
			}	
		}*/
		try {
			foxSports.driver.findElement(By.id(id)).click();
			successTotal+=1;
		}catch(Exception e) {
			System.err.println("No se encontró: "+ id);
			failTotal+=1;
		}
	}
	
	
	///////////////////////Metodo para la busqueda de elementos y para poder seleccionarlo(Busca por Xpath)
	public static void searchPath(String path) {
		/*boolean verification=false;
		while(verification!=true) {
			Boolean isPresent=foxSports.driver.findElements(By.xpath(path)).size()>0;
			if(isPresent) {
				foxSports.driver.findElement(By.xpath(path)).click();	
				verification=true;
			}else {
				System.out.println("No se encontro el elemento: "+ path);
				waitTime(1000);
			}	
		}*/
		try {
			foxSports.driver.findElement(By.xpath(path)).click();	
			successTotal+=1;
		}catch(Exception e) {
			System.err.println("No se encontró el elemento");
			failTotal+=1;
		}
	}
	
	
	//////////////////Metodo para la busqueda de elementos y para poder seleccionarlo(Busca por Name)
	public static void searchName(String name) {
		/*boolean verification=false;
		while(verification!=true) {
			Boolean isPresent=foxSports.driver.findElements(By.name(name)).size()>0;
			if(isPresent) {
				//foxSports.driver.findElement(By.name(name)).click();
				foxSports.driver.findElementByName(name).click();
				verification=true;
			}else {
				System.out.println("No se encontro el elemento: "+ name);
				waitTime(1000);
			}	
		}*/
		try {
			foxSports.driver.findElementByName(name).click();
			successTotal+=1;
		}catch(Exception e) {
			System.err.println("No se encontró: "+ name);
			failTotal+=1;
		}
		
	}
	
	//Método que busca la tecla "back" para retroceder cuando se termina la instrucción

	/*public static void backToMenu() {
		String aux = null;
		String aux2 = null;
		aux="Back"; aux2="backWebViewBtn";
		boolean verification=false;
		
		while(verification!=true) {
			Boolean isPresent=foxSports.driver.findElements(By.id(aux)).size()>0;
			Boolean isPresent2=foxSports.driver.findElements(By.id(aux2)).size()>0;
			if(isPresent) {
				foxSports.driver.findElement(By.id(aux)).click();
				verification=true;
			}else {
				waitTime(2000);
				System.out.println("No se encontró el elemento "+aux);
				if(isPresent2) {
					foxSports.driver.findElement(By.id(aux2)).click();
					verification=true;
				}else {
					waitTime(1000);
					System.out.println(" ");
				}	
			}	
		}
		if(verification=true) {
			Boolean isPresent=foxSports.driver.findElements(By.id(aux)).size()>0;
			Boolean isPresent2=foxSports.driver.findElements(By.id(aux2)).size()>0;
			while(isPresent || isPresent2) {
				if(isPresent) {
					waitTime(1000);
					foxSports.driver.findElement(By.id(aux)).click();
				}else if(isPresent2){
					waitTime(1000);
					foxSports.driver.findElement(By.id(aux2)).click();
				}	
			}
		}	
	}*/
	
	///////////////////////////Método que funciona para estar buscando el botón "Back" para cuando termine cada testCase
	public static void backToMenu() {
		//Boolean isVisible=foxSports.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar")).isDisplayed();
		Boolean isPresent2 = foxSports.driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar")).size() > 0;
		String aux = null;
		String aux2 = null;
		String aux3=null;
		String source1=null;
		String source2=null;
		aux="Back"; aux2="backWebViewBtn"; aux3="navBar back";
		while(!isPresent2) {	
			//searchId(aux);
			try {
				foxSports.driver.findElement(By.id(aux)).click();			
			}catch(Exception e) {
				System.err.println("No se encontró");
				waitTime(1000);
			}
			//searchId(aux2);
			try {
				foxSports.driver.findElement(By.id(aux2)).click();
			}catch(Exception e) {
				System.err.println("No se encontró");
				waitTime(1000);
			}
			try {
				foxSports.driver.findElement(By.id(aux3));
			}catch(Exception e) {
				System.err.println("No se encontró");
				waitTime(1000);
			}
			source1=foxSports.driver.getPageSource();
			isPresent2 = foxSports.driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar")).size() > 0;
		}
	}
	
	
	////////////////////////Método para enviar un texto y escribir en el textBox que se encuentre
	public static void sendText(String path, String text) {
		try {
			foxSports.driver.findElement(By.xpath(path)).sendKeys(text);
			successTotal+=1;
		}catch(Exception e) {
			System.err.println("No se pudo mandar texto a "+ path);
			failTotal+=1;
		}
	}
	
	////////////////////////Método para verificar la hora el nombre y tipo
	public void findHourNameType(String hour, String name, String type) {
		try {
			searchId(hour);
			System.out.println("Encontrado");
		}catch(Exception e) {
			System.out.println("No se encontró la hora");
		}
		try {
			searchId(name);
			System.out.println("Encontrado");
		}catch(Exception e) {
			System.out.println("El evento no tiene nombre");
		}
		try{
			searchId(type);
			System.out.println("Encontrado");
		}catch(Exception e){
			System.out.println("No se encuentra el tipo del evento");
		}
		try {
			searchName("alarm btn");
			System.out.println("Encontrado");
		}catch(Exception e) {
			System.out.println("No se encuentra el botón de recordatorio");
		}
	}
	
	//////////////////////////////Método para hacer que el scroll baje y suba, se utiliza para verificar el contenido.
	public static void scrollChecker() {
		int counter=0;
		int counter2 =0;		
		while(counter<2) {
			scroll("down");
			counter++;
		}
		while(counter2<2) {
			scroll("up");
			counter2++;	
		}		
	}
	
	
	/////////////////////////// Metodo para hacer el movimiento scroll
	public static void scroll(String direction) {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();
		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		int endPointY;
			
		if (direction.equals("down")) {
			endPointY = (int) (dimensions.getHeight() * -0.5);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		} else if (direction.equals("up")) {
			endPointY = (int) (dimensions.getHeight() * 0.5);
			touchAction.press(pointX, startPointY).moveTo(0, endPointY).release().perform();
		}
	}
	
	
	////////////////////////////Búsqueda específica busca en la página el id, el xpath o name según el número que se le indique
	//Esta búsqueda específica busca va verificando y haciendo scroll hasta encontrar el elemento o asímismo no encontrarlo
	//1====ID
	//2====Xpath
	//3====Name
	public static void specificSearch(String action, String id, int selection) {
		String source1;
		String source2;
		switch(selection) {
		case 1:
			Boolean isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
			while (!isPresent) {
				source1 = foxSports.driver.getPageSource();
				scroll("down");
				source2 = foxSports.driver.getPageSource();
				isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
				if (source1.equals(source2)) {
					break;
				}
			}

			if (isPresent) {
				Boolean isVisible = foxSports.driver.findElement(By.id(id)).isDisplayed();

				while (!isVisible) {
					source1 = foxSports.driver.getPageSource();
					scroll("down");
					source2 = foxSports.driver.getPageSource();
					isVisible = foxSports.driver.findElement(By.id(id)).isDisplayed();
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isVisible) {
					gesture(action, id, selection);
				}
			} else {
				while (!isPresent) {
					source1 = foxSports.driver.getPageSource();
					scroll("up");
					source2 = foxSports.driver.getPageSource();
					isPresent = foxSports.driver.findElements(By.id(id)).size() > 0;
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isPresent) {
					Boolean isVisible = foxSports.driver.findElement(By.id(id)).isDisplayed();

					while (!isVisible) {
						source1 = foxSports.driver.getPageSource();
						scroll("up");
						source2 = foxSports.driver.getPageSource();
						isVisible = foxSports.driver.findElement(By.id(id)).isDisplayed();
						if (source1.equals(source2)) {
							break;
						}
					}

					if (isVisible) {
						gesture(action, id, selection);
					}
				} else {
					System.err.println("No se ha encontrado el elemento: " + id);
				}
			}
			break;
		case 2:
			Boolean isPresent2 = foxSports.driver.findElements(By.xpath(id)).size() > 0;
			while (!isPresent2) {
				source1 = foxSports.driver.getPageSource();
				scroll("down");
				source2 = foxSports.driver.getPageSource();
				isPresent2 = foxSports.driver.findElements(By.xpath(id)).size() > 0;
				if (source1.equals(source2)) {
					break;
				}
			}

			if (isPresent2) {
				Boolean isVisible = foxSports.driver.findElement(By.xpath(id)).isDisplayed();

				while (!isVisible) {
					source1 = foxSports.driver.getPageSource();
					scroll("down");
					source2 = foxSports.driver.getPageSource();
					isVisible = foxSports.driver.findElement(By.xpath(id)).isDisplayed();
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isVisible) {
					gesture(action, id, selection);
				}
			} else {
				while (!isPresent2) {
					source1 = foxSports.driver.getPageSource();
					scroll("up");
					source2 = foxSports.driver.getPageSource();
					isPresent2 = foxSports.driver.findElements(By.xpath(id)).size() > 0;
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isPresent2) {
					Boolean isVisible = foxSports.driver.findElement(By.xpath(id)).isDisplayed();

					while (!isVisible) {
						source1 = foxSports.driver.getPageSource();
						scroll("up");
						source2 = foxSports.driver.getPageSource();
						isVisible = foxSports.driver.findElement(By.xpath(id)).isDisplayed();
						if (source1.equals(source2)) {
							break;
						}
					}

					if (isVisible) {
						gesture(action, id, selection);
					}
				} else {
					System.err.println("No se ha encontrado el elemento: " + id);
				}
			}
			break;
		case 3:
			Boolean isPresent3 = foxSports.driver.findElements(By.name(id)).size() > 0;
			while (!isPresent3) {
				source1 = foxSports.driver.getPageSource();
				scroll("down");
				source2 = foxSports.driver.getPageSource();
				isPresent3 = foxSports.driver.findElements(By.name(id)).size() > 0;
				if (source1.equals(source2)) {
					break;
				}
			}

			if (isPresent3) {
				Boolean isVisible = foxSports.driver.findElement(By.name(id)).isDisplayed();

				while (!isVisible) {
					source1 = foxSports.driver.getPageSource();
					scroll("down");
					source2 = foxSports.driver.getPageSource();
					isVisible = foxSports.driver.findElement(By.name(id)).isDisplayed();
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isVisible) {
					gesture(action, id, selection);
				}
			} else {
				while (!isPresent3) {
					source1 = foxSports.driver.getPageSource();
					scroll("up");
					source2 = foxSports.driver.getPageSource();
					isPresent3 = foxSports.driver.findElements(By.name(id)).size() > 0;
					if (source1.equals(source2)) {
						break;
					}
				}

				if (isPresent3) {
					Boolean isVisible = foxSports.driver.findElement(By.name(id)).isDisplayed();

					while (!isVisible) {
						source1 = foxSports.driver.getPageSource();
						scroll("up");
						source2 = foxSports.driver.getPageSource();
						isVisible = foxSports.driver.findElement(By.name(id)).isDisplayed();
						if (source1.equals(source2)) {
							break;
						}
					}

					if (isVisible) {
						gesture(action, id, selection);
					}
				} else {
					System.err.println("No se ha encontrado el elemento: " + id);
				}
			}
			break;
		}
		
		
		
	}
	
	
	//////////////////Gesto que decide seleccionar/eliminar el elemento, este también busca por xpath, name o id
	public static void gesture(String action, String id, int decision) {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();
		
		switch(decision) {
		case 1:
			int pointX = (dimensions.getWidth() / -2);
			int pointY = foxSports.driver.findElement(By.id(id)).getSize().getHeight();

			if (action.equals("select")) {
				searchId(id);
			} else if (action.equals("delete")) {
				touchAction.press(foxSports.driver.findElement(By.id(id))).moveTo(pointX, pointY).release().perform();
				searchId("Delete");
			}
			break;
		case 2:
			int pointX2 = (dimensions.getWidth() / -2);
			int pointY2 = foxSports.driver.findElement(By.xpath(id)).getSize().getHeight();

			if (action.equals("select")) {
				searchPath(id);
			} else if (action.equals("delete")) {
				touchAction.press(foxSports.driver.findElement(By.xpath(id))).moveTo(pointX2, pointY2).release().perform();
				searchId("Delete");
			}
			break;	
		case 3:
			int pointX3 = (dimensions.getWidth() / -2);
			int pointY3 = foxSports.driver.findElement(By.name(id)).getSize().getHeight();

			if (action.equals("select")) {
				searchName(id);
			} else if (action.equals("delete")) {
				touchAction.press(foxSports.driver.findElement(By.name(id))).moveTo(pointX3, pointY3).release().perform();
				searchId("Delete");
			}
			break;
			
		}
		
		
	}
	
	
	
	
	
	///////////////////////Método para hacer un tap en medio de la pantalla se utiliza para seleccionar elementos que el inspector no reconoce
	public static void tap() {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		touchAction.press(pointX, startPointY).release().perform();
		System.out.println("Se hizo tap");
		
	}
	
	///////////////////////Método que hace scroll arriba hasta que llega al tope
	public static void scrollUp() {
		String source=null;
		String source2=null;
		
		do {
			source=FoxSports.driver.getPageSource();
			scroll("up");
			source2 = FoxSports.driver.getPageSource();
		}while(source==source2);
	}
	
	
	///////////////////////Método que muestra las transmisiones de los próximos días
	public static void scrollDown() {
		String source=null;
		String source2=null;
			
		do {
			source = FoxSports.driver.getPageSource();
			Tools.scroll("down");
			source2 = FoxSports.driver.getPageSource();
		}while(source==source2);
	}
	
	///////////////////////Método que hace el cálculo de porcentaje de eficiencia de los casoss reproducidos
	public static void controlFails() {
		total=successTotal+failTotal;
		if(total==0) {
			System.out.println("No se corrió ningún test");
		}else {
			percentage=(successTotal+100)/total;
			System.out.println("El porcentaje de efectividad fue: "+percentage);
		}
		
	}
	
}