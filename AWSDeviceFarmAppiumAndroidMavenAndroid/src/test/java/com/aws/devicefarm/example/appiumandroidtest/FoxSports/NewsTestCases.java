package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class NewsTestCases {
	Tools tools = new Tools();
	public static String competencia;
	NewsSteps newsSteps= new NewsSteps();
	public void noticias(){
		noticia_010();
		noticia_020();
	}
	
	public void noticia_010(){ //Mostrar noticias de una liga
		System.out.println("Estoy buscando noticias de una liga");
		newsSteps.tapNews();//Tap en la seccion noticias
		newsSteps.tapPicker();//Tap en el picker
		tools.waitTime(1000);
		competencia = "La Liga";
		newsSteps.seleccionarCompetencia(competencia);
		tools.waitTime(3000);
	}
	
	public void noticia_020(){ //Tap en una noticia
		System.out.println("Voy a ingresar a una noticia.");
		//newsSteps.tapNews();//Tap en la seccion noticias
		newsSteps.tapNews();//Tap en la seccion noticias
		newsSteps.tapPicker();//Tap en el picker
		//newsSteps.tapPicker();//Tap en el picker
		competencia = "La Liga";
		newsSteps.seleccionarCompetencia(competencia);
		newsSteps.tapNewsOfLeague();
		tools.waitTime(7000);
		Tools.backToMenu(1);
	}
	
	
}
