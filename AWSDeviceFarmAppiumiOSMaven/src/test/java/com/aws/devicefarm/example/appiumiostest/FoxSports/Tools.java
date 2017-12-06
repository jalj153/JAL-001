package com.aws.devicefarm.example.appiumiostest.FoxSports;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;

public class Tools {
	static FoxSports foxSports = new FoxSports();
	static int failTotal=0;
	static int successTotal=0;
	static int total=0;
	static int percentage=0;
	
	
	///////////////////////Method that calculates the time for an action to be performed
	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.err.println("Timeout");
		}
	}
	
	
	////////////////////////Method for the search of elements and to be able to select it (Search by ID)
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
			System.err.println("It was not found: "+ id);
			failTotal+=1;
		}
	}
	
	
	///////////////////////Method to search for elements and to select it (Search by Xpath)
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
			System.err.println("It was not found: "+path);
			failTotal+=1;
		}
	}
	
	
	//////////////////Method for the search of elements and to be able to select it (Search by Name)
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
			System.err.println("It was not found: "+ name);
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
	
	
	///////////////////////////Method that works to be looking for the "Back" button for when you finish each testCase
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
				System.err.println("It was not found: "+aux);
				waitTime(1000);
			}
			//searchId(aux2);
			try {
				foxSports.driver.findElement(By.id(aux2)).click();
			}catch(Exception e) {
				System.err.println("It was not found: "+aux2);
				waitTime(1000);
			}
			try {
				foxSports.driver.findElement(By.id(aux3));
			}catch(Exception e) {
				System.err.println("It was not found: "+aux3);
				waitTime(1000);
			}
			source1=foxSports.driver.getPageSource();
			isPresent2 = foxSports.driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"FOX Sports\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar")).size() > 0;
		}
	}
	
	
	////////////////////////Method to receive and send text
	public static void sendText(String path, String text) {
		try {
			foxSports.driver.findElement(By.xpath(path)).sendKeys(text);
			successTotal+=1;
		}catch(Exception e) {
			System.err.println("Could not send text to: "+ path);
			failTotal+=1;
		}
	}
	
	
	////////////////////////Method to verify the time the name and type
	public void findHourNameType(String hour, String name, String type) {
		try {
			searchId(hour);
			System.out.println("Yes he found: "+hour);
		}catch(Exception e) {
			System.out.println("The time was not found");
		}
		try {
			searchId(name);
			System.out.println("Yes he found: "+name);
		}catch(Exception e) {
			System.out.println("The event has no name");
		}
		try{
			searchId(type);
			System.out.println("Yes he found: "+type);
		}catch(Exception e){
			System.out.println("The event type is not found");
		}
		try {
			searchName("alarm btn");
			System.out.println("Yes he found: AlarmBTN");
		}catch(Exception e) {
			System.out.println("Can not find reminder button");
		}
	}
	
	
	//////////////////////////////Method to make scroll scroll down and up, used to verify content.
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
	
	
	///////////////////////////Method to make the scroll movement
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
	
	
	////////////////////////////Specific search searches the page for the id, the xpath or name according to the number indicated
	//This specific search looks for verifying and scrolling until finding the element or also not finding it
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
					System.err.println("The item could not be found: " + id);
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
					System.err.println("The item could not be found: " + id);
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
					System.err.println("The item could not be found: " + id);
				}
			}
			break;
		}
		
		
		
	}
	
	
	//////////////////Gesture that decides to select / delete the element, it also searches for xpath, name or id
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
		
	
	///////////////////////Method to make a tap in the middle of the screen is used to select items that the inspector does not recognize
	public static void tap() {
		TouchAction touchAction = new TouchAction(foxSports.driver);
		Dimension dimensions = foxSports.driver.manage().window().getSize();

		int pointX = (dimensions.getWidth() / 2);
		int startPointY = (dimensions.getHeight() / 2);
		touchAction.press(pointX, startPointY).release().perform();
		System.out.println("It was tap");
		
	}
	
	
	///////////////////////Method that scrolls up until it reaches the top
	public static void scrollUp() {
		String source=null;
		String source2=null;
		
		do {
			source=FoxSports.driver.getPageSource();
			scroll("up");
			source2 = FoxSports.driver.getPageSource();
		}while(source==source2);
	}
	
	
	///////////////////////Method that shows the transmissions of the next days
	public static void scrollDown() {
		String source=null;
		String source2=null;
			
		do {
			source = FoxSports.driver.getPageSource();
			Tools.scroll("down");
			source2 = FoxSports.driver.getPageSource();
		}while(source==source2);
	}
	
	
	///////////////////////Method that makes the percentage efficiency calculation of the reproduced cases
	public static void controlFails() {
		total=successTotal+failTotal;
		if(total==0) {
			System.out.println("No tests were run");
		}else {
			percentage=(successTotal+100)/total;
			System.out.println(" ");
			System.out.println("*****************The percentage of effectiveness was: "+percentage+"%"+" "+"***************************");
		}
		
	}
	
	
	///////////////////////Method to read configuration text files
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
	
	///////////////////////Method that takes spaces in each of the tests
	public static void takeSpace() {
		System.out.println("__________________________________________________________________________________");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
	}
	
}