package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class ProfileSteps {
	
	//Method that seeks and presses "return to the top"
	public void returnTop() {
		Tools.specificSearch("select", "\uF106 Volver al top", 1);
	}
	
	
	//Method that press the "Add" button
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
				System.out.println("Element not found: " + "AGREGAR");
			}	
		}
	}
	
	//Method by pressing the "Add" or "Add Competition" button.
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
	
	//Method that press the "Add" or "Add Team" button.
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
	
	//Method that press the "Next" button.
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
	
	//Method that press the "Finish" button
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
	
	//Method that looks for and presses the profile button
	public void iconProfile() {
		Tools.searchId("icon profile");
	}
	
	//Method that takes the parameter of the competition, looks for it and presses it
	public void selectCompetition(String competition) {
		Tools.specificSearch("select", competition, 1);
	}
	
	//Method that takes the parameter of the equipment, looks for it and takes it
	public void selectTeam(String team) {
		Tools.specificSearch("select", team, 1);
	}
	
	//Method that you tap on "Favorites"
	public void tapFavorites() {
		Tools.searchId("Favoritos");
	}
	
	//Método que busca el "Centro de Ayuda"
	public void helpCenter() {
		Tools.searchId("Centro de Ayuda");
		Tools.waitTime(3000);
	}
	
	//Method that seeks "What's new?"
	public void whatsNew() {
		Tools.searchId("¿Qué hay de nuevo?");
	}
	
	//Method that seeks the "Privacy Policies"
	public void privacyPolicy() {
		Tools.searchId("Política de Privacidad");
	}
	
	//Method that searches the terms and conditions
	public void termsAndConditions() {
		Tools.searchId("Términos y Condiciones");
	}
}
