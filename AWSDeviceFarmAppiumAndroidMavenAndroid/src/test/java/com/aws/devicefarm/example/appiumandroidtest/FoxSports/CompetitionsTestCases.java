package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class CompetitionsTestCases {
	CompetitionsSteps competitionsSteps = new CompetitionsSteps();
	Tools tools = new Tools();
	
	
	public void Competitions_010(){ //Show all competences available 
		System.out.println("--competitions_010-- Voy a verificar que las competencias existan y que pertenezcan a un pais especifico");
		//Tap in competitions
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Verify if a competition is present
		competitionsSteps.verifyIfCompetitionIsPresent();
		//Verify if a Country is present
		competitionsSteps.searchCountry();
	}
	
	public void Competitions_020(){ //Go to the search to perform the search of a competition
		System.out.println("--competitions_020-- Voy a buscar la competencia La Liga");
		//Tap in competitions
		competitionsSteps.tapCompetitions();
		//Take Screenshot
		Tools.takeScreenshot("Seccion Competiciones"); 
		//find the button Search
		competitionsSteps.tapInSearch(" The error ocurred in the method 'tapInSearch' that is present in Competitions_020");
		//Find competition
		competitionsSteps.sendText();
		 //Take screenshot
		Tools.takeScreenshot("Buscar competencia");
		//Return to menu
		Tools.backToMenu(2);
		
	}
	public void Competitions_030(){//Tap into a competition and check tabs content
		System.out.println("--competitions_030-- Voy a entrar en la competencia La Liga y verificar que esten todos los tabs");
		//Tap in competitions
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Tap in search button
		competitionsSteps.tapInSearch(" The error ocurred in the method 'tapInSearch' that is present in Competitions_030");
		//Send text to browser
		competitionsSteps.sendText();
		//Select a competition
		competitionsSteps.tapCompetition();
		//Enter in a competition 
		competitionsSteps.searchTabs();
		//Take screenshot
		Tools.takeScreenshot("Buscar tabs de la seccion competencia");
		//Return to menu
		Tools.backToMenu(1);		
	}
	public void Competitions_040(){//Tap in a Football Competition> Tap in Results
		System.out.println("--competitions_040-- Mostrare los resultados de una liga");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Tap in to competition soccer
		competitionsSteps.tapSoccerCompetition();
		//Search Results
		competitionsSteps.searchResults();
		//Take screenshot
		Tools.takeScreenshot("Resultados de una liga");
		//Return to menu
		Tools.backToMenu(1);
	}
	public void Competitions_050(){//Tap in a Football Competition> Tap in Results> Tap in a Result
		System.out.println("--competitions_050-- Entrare a un resultado de la liga");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Search results
		competitionsSteps.searchResults();
		//Enter in a result
		competitionsSteps.tapResult();
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_060(){//Tap in a Football Competition> Tap in Results> Tap in a Result> Tap in Summary
		System.out.println("--competitions_060-- Entrare al resumen de un partido");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Search Results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Search summary
		competitionsSteps.searchSummary();
		//Take screenshot
		Tools.takeScreenshot("Resumen de un resultado");
		//Verify that the summary is present
		competitionsSteps.validarTab(1);
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_070(){//Tap in a Football Competition> Tap in Results> Tap in a Result> Tap in TimeLine
		System.out.println("--competitions_070-- Entrare a la linea de tiempo de un partido ");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Search results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Tap in TimeLine
		competitionsSteps.searchTimeLine();
		//Take screenshot
		Tools.takeScreenshot("Linea de tiempo de un partido");
		//Verify that  TimeLine is present
		competitionsSteps.validarTab(2);
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_080(){//Tap in a Football Competition> Tap in Results> Tap in a Result> Tap in Statistics
		System.out.println("--competitions_080-- Entrare a las estadisticas de un partido");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Tap in timeLine
		competitionsSteps.searchTimeLine();
		//Tap in Statistics
		competitionsSteps.searchStatistics();
		//Take screenshot
		Tools.takeScreenshot("Estadisticas de un partido");
		//Verify that Statistics is present 
		competitionsSteps.validarTab(3);
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_090(){//Tap in a Football Competition> Tap in Results> Tap in a Result> Tap in Alignments
		System.out.println("--competitions_090-- Entrare a las alineaciones");
		//Tap in to Competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in Results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Tap in TimeLine
		competitionsSteps.searchTimeLine();
		//Tap in Statistics
		competitionsSteps.searchStatistics();
		//Tap in Alignments
		competitionsSteps.searchAlignments();
		//Take screenshot
		Tools.takeScreenshot("Alineaciones de un partido");
		//Verify that Alignments is present
		competitionsSteps.validarTab(4);
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_100(){//Tap in a Football Competition> Tap in Results> Tap in a Result> Tap in History
		System.out.println("--competitions_100-- Entrare al historial");
		//Tap in to competences section	
		competitionsSteps.tapCompetitions();
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Tap in TimeLine
		competitionsSteps.searchTimeLine();
		//Tap in Statistics
		competitionsSteps.searchStatistics();
		//Tap in Alignments
		competitionsSteps.searchAlignments();
		//Tap in History
		competitionsSteps.searchHistory();
		//Take screenshot	
		Tools.takeScreenshot("Historial de un partido");
		//Verify that History is present
		competitionsSteps.validarTab(5);
		//Return to menu
		Tools.backToMenu(2);
	}
	
	public void Competitions_110(){//Tap in a Football Competition> Tap in Results> Tap in Result> Tap in Ranking
		System.out.println("--competitions_110-- Entrare a la clasificacion");
		//Tap in to competences section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select Soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in results
		competitionsSteps.searchResults();
		//Tap in a result
		competitionsSteps.tapResult();
		//Tap in TimeLine
		competitionsSteps.searchTimeLine();
		//Tap in statistics
		competitionsSteps.searchStatistics();
		//tap in Alignments
		competitionsSteps.searchAlignments();
		//tap in History
		competitionsSteps.searchHistory();
		//tap in classification
		competitionsSteps.searchClassification();
		//Take screenshot
		Tools.takeScreenshot("Clasificacion de una liga");
		//Verify that The classification is present
		competitionsSteps.validarTab(6);
		//Return to menu
		Tools.backToMenu(2);
		
	}
	public void Competitions_120(){//Tap in a Football Competition> Tap in News
		System.out.println("--competitions_120-- Entrare a la seccion noticias de una competencia");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in to News Section
		competitionsSteps.searchNews();
		//Take screenshot
		Tools.takeScreenshot("Noticias de una competencia");
		//Return to menu
		Tools.backToMenu(1);
	}
	public void Competitions_130(){//Tap in a Football Competition> Tap in Positions
		System.out.println("--competitions_130-- Entrare a la seccion posiciones");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in to Positions Section
		competitionsSteps.searchPositions();
		//Take screenshot
		Tools.takeScreenshot("Posiciones de una liga");
		//Return to menu
		Tools.backToMenu(1);
	}
	public void Competitions_140(){//Tap in a Football Competition> Tap in Teams
		System.out.println("--competitions_140-- Entrare a ver los equipos de la competencia");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in to Teams section
		competitionsSteps.searchTeams();
		//Take screenshot
		Tools.takeScreenshot("Equipos de una competencia");
		//Return to menu
		Tools.backToMenu(1);
	}
	public void Competitions_150(){//Tap in a Football Competition> Tap in Teams> Tap in a Team
		System.out.println("--competitions_150--  Verificare que un equipo tenga los tabs correctos");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Search tabs of team
		competitionsSteps.searchTabsOfTeams(" error ocurred in the method 'searchTabsOfTeams' that is present in Competitions_150");
		//Take screenshot
		Tools.takeScreenshot("Tabs de un equipo");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_160(){//Tap in Competitions> Tap in a Football Competition> Tap in Statistics
		System.out.println("--competitions_160-- Verificare las estadisticas de una competicion");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a soccer competition
		competitionsSteps.tapSoccerCompetition();
		//Tap in statistics
		competitionsSteps.searchStatisticsOfCompetition();
		//Take screenshot
		Tools.takeScreenshot("Estadisticas de una competicion");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_170(){//Tap in a Motor Competition> Tap in Results
		System.out.println("--competitions_170-- Voy a entrar en una competencia de motor y verificar los resultados");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//tap in results
		competitionsSteps.searchResultsOfMotorCompetition();
		//Take screenshot
		Tools.takeScreenshot("Resultados de una competencia de motor");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_180(){//Tap in a Motor Competition> Tap in Results> Tap in a result (Verify that the ComboBox works in the selection of a pilot)
		System.out.println("--competitions_180-- Voy a verificar un resultado de motor");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//take screenshot
		Tools.takeScreenshot("Resultado de una competencia de motor");
		//Return Return to menu
		Tools.backToMenu(1);
	}
	public void Competitions_190(){//Tap in a Motor Competition> Tap in News
		System.out.println("--competitions_190-- Voy a verificar las noticias de una competencia de motor");
		//Tap in to competition section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//Tap in news
		competitionsSteps.searchNewsOfMotorCompetition();
		//Take screenshot
		Tools.takeScreenshot("Noticias de una competencia de motor");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_200(){//Tap in a Motor Competition> Tap in Positions
		System.out.println("--competitions_200-- Voy a verificar las posiciones de una competencia de motor");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//Tap in Positions
		competitionsSteps.searchPositionsOfMotorCompetition();
		//Take screenshot
		Tools.takeScreenshot("Posiciones de una competencia de motor");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_210(){//Tap in a Motor Competition> Tap in Calendar
		System.out.println("--competitions_210-- Voy a verificar el calendario de una competencia de motor");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//Tap in calendar
		competitionsSteps.searchCalendarOfMotorCompetition();
		//take screenshot
		Tools.takeScreenshot("Calendario de una competencia de motor");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_220(){//Tap in a Motor Competition> Tap in Calendar> Tap in a pilot (Verify that the ComboBox works in the selection of a pilot)
		System.out.println("--competitions_220-- Voy a verificar la funcionalidad del combobox desde el calendario de una competencia de motor");
		//Tap in to competition section
		competitionsSteps.tapCompetitions();
		//take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//Tap in calendar
		competitionsSteps.searchCalendarOfMotorCompetition();
		//take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_230(){//Tap in a Motor Competition> Tap in Pilots
		System.out.println("--competitions_230-- Voy a verificar la seccion pilotos de una competencia de motor");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//Tap in pilots
		competitionsSteps.tapPilots();
		//Take screenshot
		Tools.takeScreenshot("Pilotos de una competencia de motor");
		//Return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_240(){//No se pudo realizar la verificacion del combobox solicitada en el documento de excel.
		System.out.println("--competitions_240-- Voy a verificar la funcionalidad del combobox desde la seccion pilotos");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a motor competition
		competitionsSteps.tapMotorCompetition();
		//tap in pilots
		competitionsSteps.tapPilots();
		//return to menu
		Tools.backToMenu(1);		
	}
	
	public void Competitions_250(){//Tap in a Baseball Competition> Tap in Positions
		System.out.println("--competitions_250-- Voy a ingresar a una competencia de baseball y a buscar las posiciones");
		//tap in to competitions section
		competitionsSteps.tapCompetitions();
		//take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a baseball competition
		competitionsSteps.tapBaseballCompetition();
		//take screenshot
		Tools.takeScreenshot("Posiciones de una competencia de baseball");
		//return to menu
		Tools.backToMenu(1);
	}
	
	public void Competitions_260(){//Tap in a Baseball Competition> Tap in Results
		System.out.println("--competitions_260-- Voy a ingresar a una competencia de baseball y a buscar los resultados");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//Take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a baseball competition
		competitionsSteps.tapBaseballCompetition();
		//tap in results
		competitionsSteps.searchResultsOfBaseballCompetition();
		//take screenshot
		Tools.takeScreenshot("Resultados de una competencia de  baseball");
		//return to menu
		Tools.backToMenu(1);
		
	}
	
	public void Competitions_270(){//Tap in a Baseball Competition> Tap in News
		System.out.println("--competitions_270-- Voy a ingresar a una competencia de baseball y a buscar las noticias");
		//Tap in to competitions section
		competitionsSteps.tapCompetitions();
		//take screenshot
		Tools.takeScreenshot("Seccion Competiciones");
		//Select a baseball competition
		competitionsSteps.tapBaseballCompetition();
		//tap in News
		competitionsSteps.searchNewsOfBaseballCompetition();
		//take screenshot
		Tools.takeScreenshot("Noticias de una competencia de baseaball");
		//return to menu
		Tools.backToMenu(1);
	}
	
}
