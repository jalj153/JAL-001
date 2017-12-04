package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class NewsTestCases {
	Tools tools = new Tools();
	public static String competencia;
	NewsSteps newsSteps= new NewsSteps();

	
	public void noticia_010(){ //Mostrar noticias de una liga
		System.out.println("--noticias_010-- Estoy buscando noticias de una liga");
		//tap in to News section
		newsSteps.tapNews();
		//take screenshot
		Tools.takeScreenshot("Seccion noticias");
		//tap in picker
		newsSteps.tapPicker(" error ocurred in the method 'tapPicker' that is present in noticia_010");
		//wait time
		Tools.waitTime(1000);
		competencia = "La Liga";
		//Select a competence
		newsSteps.seleccionarCompetencia(competencia);
		//take screenshot
		Tools.takeScreenshot("Buscar competencia");
		//wait time 3 seconds
		Tools.waitTime(3000);
	}
	
	public void noticia_020(){ //Tap en una noticia
		System.out.println("--noticias_020-- Voy a ingresar a una noticia.");
		//tap in to News section
		newsSteps.tapNews();
		//take screenshot
		Tools.takeScreenshot("Seccion noticias");
		//tap in picker
		newsSteps.tapPicker(" error ocurred in the method 'tapPicker' that is present in noticia_020");
		competencia = "La Liga";
		//Select a competence
		newsSteps.seleccionarCompetencia(competencia);
		//take screenshot
		Tools.takeScreenshot("Buscar competencia");
		//select news from a league
		newsSteps.tapNewsOfLeague(" error ocurred in the method 'tapNewsOfLeague' that is present in noticia_020");
		//wait time (seven seconds)
		Tools.waitTime(7000);
		//return to menu
		Tools.backToMenu(1);
	}
	
	
}
