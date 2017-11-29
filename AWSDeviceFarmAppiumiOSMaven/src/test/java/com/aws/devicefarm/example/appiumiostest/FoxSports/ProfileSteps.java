package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class ProfileSteps {
	
	//Método que busca y presiona "volver al top"
	public void returnTop() {
		Tools.specificSearch("select", "\uF106 Volver al top", 1);
	}
	
	
	//Método que presiona el botón "Agregar"
	public void addFavorite() {
		boolean verification = false;
		Boolean isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
			if (isPresent) {
				FoxSports.driver.findElement(By.id("AGREGAR")).click();
				verification=true;
			} else {				
				System.out.println("No se ha encontrado el elemento: " + "AGREGAR");
			}	
		}
	}
	
	//Método oque presiona el botón "Agregar" O "Agregar Competencia"
	public void addFavoriteComp() {
		boolean verification = false;
		Boolean isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
			if (isPresent) {
				FoxSports.driver.findElement(By.id("AGREGAR")).click();
				verification=true;
			} else {
				if(!isPresent) {
					System.out.println("No se ha encontrado el elemento: " + "AGREGAR");
					Boolean isPresent2 = FoxSports.driver.findElements(By.id("AGREGAR COMPETENCIAS")).size() > 0;
					if(isPresent2) {
						FoxSports.driver.findElement(By.id("AGREGAR COMPETENCIAS")).click();
						break;
					}
					
				}
				
			}	
		}
	}
	
	//Método que presiona el botón "Agregar" o "Agregar Equipo"
	public void addFavoriteTeam() {
		boolean verification = false;
		Boolean isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = FoxSports.driver.findElements(By.id("AGREGAR")).size() > 0;
			if (isPresent) {
				FoxSports.driver.findElement(By.id("AGREGAR")).click();
				verification=true;
			} else {
				if(!isPresent) {
					System.out.println("No se ha encontrado el elemento: " + "AGREGAR");
					Boolean isPresent2 = FoxSports.driver.findElements(By.id("AGREGAR EQUIPOS")).size() > 0;
					if(isPresent2) {
						FoxSports.driver.findElement(By.id("AGREGAR EQUIPOS")).click();
						break;
					}
					
				}
			}	
		}
	}
	
	//Método que presiona el botón "Siguiente"
	public void tapNext() {
		boolean verification = false;
		Boolean isPresent = FoxSports.driver.findElements(By.id("Siguiente")).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = FoxSports.driver.findElements(By.id("Siguiente")).size() > 0;
			if (isPresent) {
				FoxSports.driver.findElement(By.id("Siguiente")).click();
				verification=true;
			} else {
				break;
			}	
		}
		if(verification=false) {
			Tools.backToMenu();
		}
	}
	
	//Método que presiona el botón "Finalizar"
	public void tapFinalize(){
		boolean verification = false;
		Boolean isPresent = FoxSports.driver.findElements(By.id("Finalizar")).size() > 0;
		String source;
		while(verification!=true) {
			isPresent = FoxSports.driver.findElements(By.id("Finalizar")).size() > 0;
			if (isPresent) {
				FoxSports.driver.findElement(By.id("Finalizar")).click();
				verification=true;
			} else {
				break;
			}	
		}
		if(verification=false) {
			Tools.backToMenu();
		}
	}
	
	//Método que busca y presiona el botón del profile
	public void iconProfile() {
		Tools.searchId("icon profile");
	}
	
	//Método que toma el parámetro de la competición, la busca y la presiona
	public void selectCompetition(String competition) {
		Tools.specificSearch("select", competition, 1);
	}
	
	//Método que toma el parámetro del equipo, lo busca y lo toma
	public void selectTeam(String team) {
		Tools.specificSearch("select", team, 1);
	}
	
	//Método que hace tap en "Favoritos"
	public void tapFavorites() {
		Tools.searchId("Favoritos");
	}
	
	//Método que busca el "Centro de Ayuda"
	public void helpCenter() {
		Tools.searchId("Centro de Ayuda");
		Tools.waitTime(3000);
	}
	
	//Método que busca "¿Qué hay de nuevo?"
	public void whatsNew() {
		Tools.searchId("¿Qué hay de nuevo?");
	}
	
	//Método que busca las "Políticas de Privacidad"
	public void privacyPolicy() {
		Tools.searchId("Política de Privacidad");
	}
	
	//Método que busca los términos y condiciones
	public void termsAndConditions() {
		Tools.searchId("Términos y Condiciones");
	}
}
