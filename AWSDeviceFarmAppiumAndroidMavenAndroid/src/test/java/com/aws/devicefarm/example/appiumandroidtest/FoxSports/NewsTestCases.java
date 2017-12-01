package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class NewsTestCases {
	Tools tools = new Tools();
	public static String competencia;
	NewsSteps newsSteps= new NewsSteps();

	
	public void noticia_010(){ //Mostrar noticias de una liga
		System.out.println("--noticias_010-- Estoy buscando noticias de una liga");
		
		newsSteps.tapNews();//Tap en la seccion noticias
		
		Tools.takeScreenshot("Seccion noticias");
		
		newsSteps.tapPicker(" noticia_010");//Tap en el picker
		
		Tools.waitTime(1000);
		
		competencia = "La Liga";
		
		newsSteps.seleccionarCompetencia(competencia);
		
		Tools.takeScreenshot("Buscar competencia");
		
		Tools.waitTime(3000);
	}
	
	public void noticia_020(){ //Tap en una noticia
		System.out.println("--noticias_020-- Voy a ingresar a una noticia.");
		
		newsSteps.tapNews();//Tap en la seccion noticias
		
		Tools.takeScreenshot("Seccion noticias");
		
		newsSteps.tapPicker(" noticia_020");//Tap en el picker
		
		competencia = "La Liga";
		
		newsSteps.seleccionarCompetencia(competencia);
		
		Tools.takeScreenshot("Buscar competencia");
		
		newsSteps.tapNewsOfLeague(" noticia_020");
		
		Tools.waitTime(7000);
		
		Tools.backToMenu(1);
	}
	
	
}
