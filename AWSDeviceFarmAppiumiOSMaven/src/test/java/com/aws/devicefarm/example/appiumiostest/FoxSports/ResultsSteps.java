package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ResultsSteps {
	
	//Método para hacer tap en Resultados
	public void tapResults() {
		Tools.searchId("Resultados");
	}
	
	//Método para seleccionar Todas las Competencias para agregarlas a favoritos
	public void allCompetences() {
		Tools.specificSearch("select", "(//XCUIElementTypeButton[@name=\"VER TODAS LAS COMPETENCIAS\"])[2]", 2);
	}
	
	//Método para hacer tap en resúmen
	public void tapSummary() {
		Tools.searchId(("RESUMEN"));
	}
	
	//Método para hacer tap en una línea de tiempo
	public void tapTimeLine() {
		Tools.searchId("LÍNEA DE TIEMPO");	
	}
	
	//Método para hacer tap en estadísticas
	public void tapStats() {
		Tools.searchId("ESTADÍSTICAS");
	}
	
	//Método para hacer tap en alineaciones
	public void tapAlignments() {
		Tools.searchId("ALINEACIONES");
	}
	
	//Método para hacer tap en Historial
	public void tapBackground() {
		Tools.searchId("HISTORIAL");
	}
	
	//Método para hacer tap en clasificación
	public void tapClasification() {
		Tools.searchId("CLASIFICACIÓN");
	}
	
	//Método para hacer tap en Favoritos
	public void tapFavorite() {
		Tools.searchId("FAVORITOS");
	}
}
