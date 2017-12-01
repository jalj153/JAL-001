package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class CompetitionsSteps {
	static FoxSports foxSports = new FoxSports();
	
	//Method to verify the competencies that are available
	public void verifyCompetitions1() {
		String source=null;
		String source2=null;
		System.out.println("Estas son las competencias disponibles");
		do {
			source=foxSports.driver.getPageSource();
			Tools.scroll("down");
			source2=foxSports.driver.getPageSource();
			if(source.equals(source2)) {
				break;
			}
		}while(source!=source2);
		
	}
	
	//Method to return after verifying the available competences
	public void verifyCompetitions2() {
		String source=null;
		String source2=null;
		System.out.println("Estas son las competencias disponibles");
		do {
			source=foxSports.driver.getPageSource();
			Tools.scroll("up");
			source2=foxSports.driver.getPageSource();
			if(source.equals(source2)) {
				break;
			}
		}while(source!=source2);
		
	}
	
	//Method that presses the textBox of competitions to look for the desired competences
	public void searchCompetition(String team) {
		Tools.waitTime(2000);
		//foxSports.driver.findElement(By.id("Buscar Competencia")).sendKeys(team);
		//Tools.searchId("Clear text");
		try {
			//foxSports.driver.findElement(By.xpath("//XCUIElementTypeSearchField[@name=\\\"Buscar Competencia\\\"]")).click();
			foxSports.driver.findElement(By.id("Clear text")).click();
		}catch(Exception e) {System.out.println("");}
		Tools.sendText("//XCUIElementTypeSearchField[@name=\"Buscar Competencia\"]", team);
		foxSports.driver.hideKeyboard();
		Tools.searchId(team);
		Tools.waitTime(4000);
	}
	
	//Method that verifies each of the tabs of a competition.
	public void verifyTabsCompetition() {
		Boolean isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
		String source;
		try {
			//Tools.searchId("RESULTADOS");
			foxSports.driver.findElement(By.id("RESULTADOS")).click();
			source=foxSports.driver.getPageSource();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay resultados");
		}
		try {
			foxSports.driver.findElement(By.id("EN VIVO")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay transmisiones en vivo de esta liga");
		}
		try {
			foxSports.driver.findElement(By.id("NOTICIAS")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay noticias disponibles en este momento.")).size()>0;
			if(isPresent) {
					System.out.println("No hay contenido disponible en este momento.");

			}
		}catch(Exception e) {
			System.out.println("No hay noticias");
		}
		try {
			//Tools.searchId("POSICIONES");
			foxSports.driver.findElement(By.id("POSICIONES")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");

			}
		}catch(Exception e) {
			System.out.println("No hay posiciones");
		}
		try {
			Tools.searchId("RESULTADOS");
			Tools.searchId("EQUIPOS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay equipos");
		}
		try {
			Tools.searchId("ESTADÍSTICAS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {		
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay estadísticas");
		}
		Tools.searchId("Competencias");
	}
	
	//Method that verifies each of the tabs of a result.
	public void verifyTabsResult() {
		Boolean isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
		try {
			//Tools.searchId("RESULTADOS");
			foxSports.driver.findElement(By.id("RESUMEN")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay resumen");
		}
		try {
			foxSports.driver.findElement(By.id("NOTICIAS")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay noticias");
		}
		try {
			//Tools.searchId("POSICIONES");
			foxSports.driver.findElement(By.id("LÍNEA DE TIEMPO")).click();
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay línea de tiempo");
		}
		try {
			Tools.searchId("ESTADÍSTICAS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay estadísticas");
		}
		try {
			Tools.searchId("ALINEACIONES");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay alineaciones");
		}
		try {
			Tools.searchId("HISTORIAL");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay historial");
		}
		try {
			Tools.searchId("CLASIFICACIÓN");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				Boolean isVisible=foxSports.driver.findElement(By.id("No hay contenido disponible en este momento.")).isDisplayed();
				if(isVisible) {
					System.out.println("No hay contenido disponible en este momento.");
				}	
			}
		}catch(Exception e) {
			System.out.println("No hay clasificaciones");
		}
	}
	
	
	
	
	
	//Method that looks for a category like for example "Soccer Europe" and when finding it, it selects a competition of that category
	public void searchCategory() {
		Boolean isPresent=foxSports.driver.findElements(By.name("Fútbol Europa")).size()>0;
		String source;
		String source2;
		while(!isPresent) {
			source=foxSports.driver.getPageSource();
			Tools.scroll("down");
			source2=foxSports.driver.getPlatformName();
			isPresent=foxSports.driver.findElements(By.name("Fútbol Europa")).size()>0;
			if(source.equals(source2)) {
				System.err.println("No se ha encontrado la categoría deseada");
				Tools.failTotal+=1;
				break;
			}
		}
		if(isPresent) {
			System.out.println("Sí se encuentra "+"Fútbol Europa");
			Boolean isVisible=foxSports.driver.findElement(By.name("Fútbol Europa")).isDisplayed();
			System.out.println("se verá si está presente "+"Fútbol Europa");
			while(!isVisible) {
				System.out.println("No está visible "+"Fútbol Europa");
				Tools.scroll("down");
				source=foxSports.driver.getPageSource();
				//isPresent=foxSports.driver.findElements(By.id(search)).size()>0;
				isVisible=foxSports.driver.findElement(By.name("Fútbol Europa")).isDisplayed();
				if(isVisible){
					break;
				}
			}
			if(isVisible) {
				System.out.println("Se empezará a buscar el equipo que gusta");
				Tools.specificSearch("select", "La Liga", 1);
				System.out.println("Se presionó el equipo");
								
			}
		}
		
	}
	
	//Method that tap results
	public void tapResults() {
		Tools.searchId("RESULTADOS");
	}
	
	//Method that tap on news
	public void tapNews() {
		Tools.searchId("NOTICIAS");
	}
	
	//Method that tap in positions
	public void tapPosition() {
		Tools.searchId("POSICIONES");
	}
	
	//Method that makes tap on equipment
	public void tapTeam() {
		Tools.searchId("EQUIPOS");
	}
	
	//Method that makes tap in statistics
	public void tapStats() {
		Tools.searchId("ESTADÍSTICAS");
	}
	
	//Method that a team looks for in the "Equipment" section and verifies that the tabs are correct.
	public void verifyTabsTeam() {
		Boolean isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
		
		try {
			Tools.searchId("ESTADÍSTICAS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay estadísticas");
		}
		
		try {
			Tools.searchId("RESULTADOS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay resultados");
		}
		
		try {
			Tools.searchId("NOTICIAS");
			isPresent=foxSports.driver.findElements(By.id("No hay contenido disponible en este momento.")).size()>0;
			if(isPresent) {
				System.out.println("No hay contenido disponible en este momento.");
			}
		}catch(Exception e) {
			System.out.println("No hay noticias");
		}
		
		
	}
}
