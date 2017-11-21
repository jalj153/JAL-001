package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ProfileSteps {
	
	//Método que busca y presiona "volver al top"
	public void returnTop() {
		Tools.specificSearch("select", "\uF106 Volver al top", 1);
	}
	
	//Método oque presiona el botón "Agregar"
	public void addFavorite() {
		Tools.searchId("AGREGAR");
	}
	
	//Método que presiona el botón "Siguiente"
	public void tapNext() {
		Tools.searchId("Siguiente");
	}
	
	//Método que presiona el botón "Finalizar"
	public void tapFinalize(){
		Tools.searchId("Finalizar");
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
