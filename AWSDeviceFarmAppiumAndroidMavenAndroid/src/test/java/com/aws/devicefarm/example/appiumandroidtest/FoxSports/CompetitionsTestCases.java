package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class CompetitionsTestCases {
	CompetitionsSteps competitionsSteps = new CompetitionsSteps();
	Tools tools = new Tools();
	
	public void competitions(){
		Competitions_010();
		Competitions_020();
		Competitions_030();
		Competitions_040();
		Competitions_050();
		Competitions_060();
		Competitions_070();
		Competitions_080();
		Competitions_090();
		Competitions_100();
		Competitions_110();
		Competitions_120();
		Competitions_130();
		Competitions_140();
		Competitions_150();
		Competitions_160();
		Competitions_170();
		Competitions_180();
		Competitions_190();
		Competitions_200();
		Competitions_210();
		Competitions_220();
		Competitions_230();
		Competitions_240();
		Competitions_250();
		Competitions_260();
		Competitions_270();
		
	}
	public void Competitions_010(){
		System.out.println("--competitions_010-- Voy a verificar que las competencias existan y que pertenezcan a un pais especifico");
		competitionsSteps.tapCompetitions();//Tap in competitions
		competitionsSteps.verifyIfCompetitionIsPresent();//Verify if a competition is present
		competitionsSteps.searchCountry();//Verify if a Country is present
	}
	
	public void Competitions_020(){
		System.out.println("--competitions_020-- Voy a buscar la competencia La Liga");
		competitionsSteps.tapCompetitions();//Tap in competitions
		competitionsSteps.tapInSearch(" Competitions_020");//find the button Search
		competitionsSteps.sendText();//Find competition La Liga
		Tools.backToMenu(2);
		
	}
	public void Competitions_030(){
		System.out.println("--competitions_030-- Voy a entrar en la competencia La Liga y verificar que esten todos los tabs");
		competitionsSteps.tapCompetitions();//Tap in competitions
		competitionsSteps.tapInSearch(" Competitions_030");
		competitionsSteps.sendText();
		competitionsSteps.tapCompetition();//Enter in competition La Liga
		tools.waitTime(1000);
		competitionsSteps.searchTabs();
		Tools.backToMenu(1);		
	}
	public void Competitions_040(){
		System.out.println("--competitions_040-- Mostrare los resultados de una liga");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();//Tap en un equipo de futbol
		competitionsSteps.searchResults();//Buscar Resultados
		Tools.backToMenu(1);
	}
	public void Competitions_050(){
		System.out.println("--competitions_050-- Entrare a un resultado de la liga");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		tools.waitTime(2000);
		Tools.backToMenu(2);
	}
	
	public void Competitions_060(){//buscar resumen
		System.out.println("--competitions_060-- Entrare al resumen de un partido");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchSummary();//Search summary
		competitionsSteps.validarTab(1);
		Tools.backToMenu(2);
	}
	public void Competitions_070(){
		System.out.println("--competitions_070-- Entrare a la linea de tiempo de un partido ");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.validarTab(2);
		Tools.backToMenu(2);
	}
	public void Competitions_080(){
		System.out.println("--competitions_080-- Entrare a las estadisticas de un partido");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.validarTab(3);
		Tools.backToMenu(2);
	}
	
	public void Competitions_090(){
		System.out.println("--competitions_090-- Entrare a las alineaciones");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		competitionsSteps.validarTab(4);
		Tools.backToMenu(2);
	}
	
	public void Competitions_100(){
		System.out.println("--competitions_100-- Entrare al historial");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		competitionsSteps.searchRecord();
		competitionsSteps.validarTab(5);
		Tools.backToMenu(2);
	}
	public void Competitions_110(){
		System.out.println("--competitions_110-- Entrare a la clasificacion");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchResults();
		competitionsSteps.tapResult();//Tap in a result
		competitionsSteps.searchTimeLine();
		competitionsSteps.searchStatistics();
		competitionsSteps.searchAlignments();
		competitionsSteps.searchRecord();
		competitionsSteps.searchClassification();
		competitionsSteps.validarTab(6);
		Tools.backToMenu(2);
		
	}
	public void Competitions_120(){
		System.out.println("--competitions_120-- Entrare a la seccion noticias de una competencia");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchNews();
		Tools.backToMenu(1);
	}
	public void Competitions_130(){
		System.out.println("--competitions_130-- Entrare a la seccion posiciones");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchPositions();
		Tools.backToMenu(1);
	}
	public void Competitions_140(){
		System.out.println("--competitions_140-- Entrare a ver los equipos de la competencia");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchTeams();
		Tools.backToMenu(1);
	}
	public void Competitions_150(){
		System.out.println("--competitions_150--  Verificare que un equipo tenga los tabs correctos");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchTabsOfTeams(" Competitions_150");
		Tools.backToMenu(1);
	}
	public void Competitions_160(){
		System.out.println("--competitions_160-- Verificare las estadisticas de una competicion");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapSoccerCompetition();
		competitionsSteps.searchStatisticsOfCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_170(){
		System.out.println("--competitions_170-- Voy a entrar en una competencia de motor y verificar los resultados");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchResultsOfMotorCompetition();
		Tools.backToMenu(1);
	}
	
	public void Competitions_180(){//No se pudo realizar la verificacion del combobox solicitada en el documento de excel.
		System.out.println("--competitions_180-- Voy a verificar un resultado de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_190(){
		System.out.println("--competitions_190-- Voy a verificar las noticias de una competencia de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchNewsOfMotorCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_200(){
		System.out.println("--competitions_200-- Voy a verificar las posiciones de una competencia de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchPositionsOfMotorCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_210(){
		System.out.println("--competitions_210-- Voy a verificar el calendario de una competencia de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchCalendarOfMotorCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_220(){//No se pudo realizar la verificacion del combobox solicitada en el documento de excel.
		System.out.println("--competitions_220-- Voy a verificar la funcionalidad del combobox desde el calendario de una competencia de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.searchCalendarOfMotorCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_230(){
		System.out.println("--competitions_230-- Voy a verificar la seccion pilotos de una competencia de motor");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.tapPilots();
		Tools.backToMenu(1);
	}
	public void Competitions_240(){//No se pudo realizar la verificacion del combobox solicitada en el documento de excel.
		System.out.println("--competitions_240-- Voy a verificar la funcionalidad del combobox desde la seccion pilotos");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapMotorCompetition();
		competitionsSteps.tapPilots();
		Tools.backToMenu(1);		
	}
	public void Competitions_250(){
		System.out.println("--competitions_250-- Voy a ingresar a una competencia de baseball y a buscar las posiciones");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapBaseballCompetition();
		Tools.backToMenu(1);
	}
	public void Competitions_260(){
		System.out.println("--competitions_260-- Voy a ingresar a una competencia de baseball y a buscar los resultados");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapBaseballCompetition();
		competitionsSteps.searchResultsOfBaseballCompetition();
		Tools.backToMenu(1);
		
	}
	public void Competitions_270(){
		System.out.println("--competitions_270-- Voy a ingresar a una competencia de baseball y a buscar las noticias");
		competitionsSteps.tapCompetitions();
		competitionsSteps.tapBaseballCompetition();
		competitionsSteps.searchNewsOfBaseballCompetition();
		Tools.backToMenu(1);
	}
	
}
