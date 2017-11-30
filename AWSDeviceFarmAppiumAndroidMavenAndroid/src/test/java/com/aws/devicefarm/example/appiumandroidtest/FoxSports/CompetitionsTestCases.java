package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class CompetitionsTestCases {
	CompetitionsSteps competitionsSteps = new CompetitionsSteps();
	Tools tools = new Tools();
	
	
	public void Competitions_010(){
		System.out.println("--competitions_010-- Voy a verificar que las competencias existan y que pertenezcan a un pais especifico");
		competitionsSteps.tapCompetitions();//Tap in competitions
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.verifyIfCompetitionIsPresent();//Verify if a competition is present
		competitionsSteps.searchCountry();//Verify if a Country is present
	}
	
	public void Competitions_020(){
		System.out.println("--competitions_020-- Voy a buscar la competencia La Liga");
		competitionsSteps.tapCompetitions();//Tap in competitions
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapInSearch(" Competitions_020");//find the button Search
		competitionsSteps.sendText();//Find competition La Liga
		tools.takeScreenshot("Buscar competencia");
		Tools.backToMenu(2);
		
	}
	public void Competitions_030(){
		System.out.println("--competitions_030-- Voy a entrar en la competencia La Liga y verificar que esten todos los tabs");
		competitionsSteps.tapCompetitions();//Tap in competitions
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapInSearch(" Competitions_030");
		competitionsSteps.sendText();
		competitionsSteps.tapCompetition();//Enter in competition La Liga
		tools.waitTime(1000);
		competitionsSteps.searchTabs();
		tools.takeScreenshot("Buscar tabs de la seccion competencia");
		Tools.backToMenu(1);		
	}
	public void Competitions_040(){
		System.out.println("--competitions_040-- Mostrare los resultados de una liga");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();//Tap en un equipo de futbol
		competitionsSteps.searchResults();//Buscar Resultados
		tools.takeScreenshot("Resultados de una liga");
		Tools.backToMenu(1);
	}
	public void Competitions_050(){
		System.out.println("--competitions_050-- Entrare a un resultado de la liga");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		Tools.backToMenu(2);
	}
	
	public void Competitions_060(){//buscar resumen
		System.out.println("--competitions_060-- Entrare al resumen de un partido");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchSummary();//Search summary
		tools.takeScreenshot("Resumen de un resultado");
		competitionsSteps.validarTab(1);
		Tools.backToMenu(2);
	}
	public void Competitions_070(){
		System.out.println("--competitions_070-- Entrare a la linea de tiempo de un partido ");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		tools.takeScreenshot("Linea de tiempo de un partido");
		competitionsSteps.validarTab(2);
		Tools.backToMenu(2);
	}
	public void Competitions_080(){
		System.out.println("--competitions_080-- Entrare a las estadisticas de un partido");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		tools.takeScreenshot("Estadisticas de un partido");
		competitionsSteps.validarTab(3);
		Tools.backToMenu(2);
	}
	
	public void Competitions_090(){
		System.out.println("--competitions_090-- Entrare a las alineaciones");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		tools.takeScreenshot("Alineaciones de un partido");
		competitionsSteps.validarTab(4);
		Tools.backToMenu(2);
	}
	
	public void Competitions_100(){
		System.out.println("--competitions_100-- Entrare al historial");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		competitionsSteps.searchRecord();
		tools.takeScreenshot("Historial de un partido");
		competitionsSteps.validarTab(5);
		Tools.backToMenu(2);
	}
	public void Competitions_110(){
		System.out.println("--competitions_110-- Entrare a la clasificacion");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		competitionsSteps.searchRecord();
		competitionsSteps.searchClassification();
		tools.takeScreenshot("Clasificacion de una liga");
		competitionsSteps.validarTab(6);
		Tools.backToMenu(2);
		
	}
	public void Competitions_120(){
		System.out.println("--competitions_120-- Entrare a la seccion noticias de una competencia");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchNews();
		tools.takeScreenshot("Noticias de una competencia");
		Tools.backToMenu(1);
	}
	public void Competitions_130(){
		System.out.println("--competitions_130-- Entrare a la seccion posiciones");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchPositions();
		tools.takeScreenshot("Posiciones de una liga");
		Tools.backToMenu(1);
	}
	public void Competitions_140(){
		System.out.println("--competitions_140-- Entrare a ver los equipos de la competencia");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchTeams();
		tools.takeScreenshot("Equipos de una competencia");
		Tools.backToMenu(1);
	}
	public void Competitions_150(){
		System.out.println("--competitions_150--  Verificare que un equipo tenga los tabs correctos");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchTabsOfTeams(" Competitions_150");
		tools.takeScreenshot("Tabs de un equipo");
		Tools.backToMenu(1);
	}
	public void Competitions_160(){
		System.out.println("--competitions_160-- Verificare las estadisticas de una competicion");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchStatisticsOfCompetition();
		tools.takeScreenshot("Estadisticas de una competicion");
		Tools.backToMenu(1);
	}
	public void Competitions_170(){
		System.out.println("--competitions_170-- Voy a entrar en una competencia de motor y verificar los resultados");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchResultsOfMotorCompetition();
		tools.takeScreenshot("Resultados de una competencia de motor");
		Tools.backToMenu(1);
	}
	
	public void Competitions_180(){
		System.out.println("--competitions_180-- Voy a verificar un resultado de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		tools.takeScreenshot("Resultado de una competencia de motor");
		Tools.backToMenu(1);
	}
	public void Competitions_190(){
		System.out.println("--competitions_190-- Voy a verificar las noticias de una competencia de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchNewsOfMotorCompetition();
		tools.takeScreenshot("Noticias de una competencia de motor");
		Tools.backToMenu(1);
	}
	public void Competitions_200(){
		System.out.println("--competitions_200-- Voy a verificar las posiciones de una competencia de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchPositionsOfMotorCompetition();
		tools.takeScreenshot("Posiciones de una competencia de motor");
		Tools.backToMenu(1);
	}
	public void Competitions_210(){
		System.out.println("--competitions_210-- Voy a verificar el calendario de una competencia de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchCalendarOfMotorCompetition();
		tools.takeScreenshot("Calendario de una competencia de motor");
		Tools.backToMenu(1);
	}
	public void Competitions_220(){
		System.out.println("--competitions_220-- Voy a verificar la funcionalidad del combobox desde el calendario de una competencia de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchCalendarOfMotorCompetition();
		tools.takeScreenshot("Seccion Competiciones");
		Tools.backToMenu(1);
	}
	public void Competitions_230(){
		System.out.println("--competitions_230-- Voy a verificar la seccion pilotos de una competencia de motor");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.tapPilots();
		tools.takeScreenshot("Pilotos de una competencia de motor");
		Tools.backToMenu(1);
	}
	public void Competitions_240(){//No se pudo realizar la verificacion del combobox solicitada en el documento de excel.
		System.out.println("--competitions_240-- Voy a verificar la funcionalidad del combobox desde la seccion pilotos");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.tapPilots();
		Tools.backToMenu(1);		
	}
	public void Competitions_250(){
		System.out.println("--competitions_250-- Voy a ingresar a una competencia de baseball y a buscar las posiciones");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapBaseballCompetition();
		tools.takeScreenshot("Posiciones de una competencia de baseball");
		Tools.backToMenu(1);
	}
	public void Competitions_260(){
		System.out.println("--competitions_260-- Voy a ingresar a una competencia de baseball y a buscar los resultados");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapBaseballCompetition();
		competitionsSteps.searchResultsOfBaseballCompetition();
		tools.takeScreenshot("Resultados de una competencia de  baseball");
		Tools.backToMenu(1);
		
	}
	public void Competitions_270(){
		System.out.println("--competitions_270-- Voy a ingresar a una competencia de baseball y a buscar las noticias");
		competitionsSteps.tapCompetitions();
		tools.takeScreenshot("Seccion Competiciones");
		competitionsSteps.tapBaseballCompetition();
		competitionsSteps.searchNewsOfBaseballCompetition();
		tools.takeScreenshot("Noticias de una competencia de baseaball");
		Tools.backToMenu(1);
	}
	
}
