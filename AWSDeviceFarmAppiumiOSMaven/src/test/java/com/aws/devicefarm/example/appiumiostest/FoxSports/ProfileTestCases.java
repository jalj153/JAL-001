package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ProfileTestCases {
		static ProfileSteps step = new ProfileSteps();
		
		//Método que hace tap en el "icon profile"
		public void profile_010(){
			step.iconProfile();
			Tools.backToMenu();
		}
		
		//Método que hace tap en favoritos para agregar.
		public void profile_020() {
			step.iconProfile();
			step.tapFavorites();
			Tools.backToMenu();
		}
		
		//Método que hace tap en favoritos y agrega al equipo seleccionado 
		public void profile_030() {
			step.iconProfile();
			step.tapFavorites();
			step.addFavorite();
			step.tapNext();
			step.selectTeam("Barcelona");
			step.tapFinalize();
			Tools.backToMenu();
		}
		
		//Método que hace tap en favoritos y agregar la competencia seleccionada 
		public void profile_040() {
			step.iconProfile();
			step.tapFavorites();
			step.addFavorite();
			step.selectCompetition("Superliga Argentina de Fútbol");
			step.tapNext();
			step.tapFinalize();
			Tools.backToMenu();
		}
		
		//Método que presiona el "Centro de ayuda" y ve lo que contiene
		public void profile_050() {
			step.iconProfile();
			step.helpCenter();
			Tools.searchId("Back");
		}
		
		//Método que presiona en "¿Qué hay de nuevo?" y ve lo que contiene
		public void profile_060() {
			step.iconProfile();
			step.whatsNew();
			step.returnTop();
			Tools.searchId("Back");
		}
		
		//Método que presiona en "Politicas de Privacidad" y ve lo que contiene
		public void profile_070() {
			step.iconProfile();
			step.privacyPolicy();
			step.returnTop();
			Tools.searchId("Back");
		}
		
		//Método que presiona en "Términos y condiciones" y ve lo que contiene
		public void profile_080() {
			step.iconProfile();
			step.termsAndConditions();
			step.returnTop();
			Tools.searchId("Back");	
		}
	
}
