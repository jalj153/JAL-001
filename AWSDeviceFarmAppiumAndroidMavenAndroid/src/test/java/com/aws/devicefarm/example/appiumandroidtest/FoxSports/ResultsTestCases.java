package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ResultsTestCases {
	ResultSteps resultSteps = new ResultSteps();
	Tools tools = new Tools();
	public static boolean tabs;
	
	
	public void Results_010(){//Ver resultados de una competencia
		System.out.println("--resultados_010-- Voy a verificar los resultados de una competencia.");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//search results
		resultSteps.searchResults();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	
	
	public void Results_020(){//Tap en un resultado
		System.out.println("--resultados_020-- Voy a verificar un resultado, y que contenga los tabs");
		tabs = true;
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		tabs = false;
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	
	
	public void Results_030(){//Buscar el resumen de un partido
		System.out.println("--resultados_030-- Voy a buscar el resumen de un partido");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_030");
		//search summary
		resultSteps.searchSumary();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_040(){
		System.out.println("--resultados_040-- Voy a buscar la linea de tiempo de un partido");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_040");
		//search time line
		resultSteps.searchTimeLine();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_050(){
		System.out.println("--resultados_050-- Voy a buscar las estadisticas de un partido");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_050");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_060(){
		System.out.println("--resultados_060-- Voy a buscar alineaciones de un partido");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_060");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_070(){
		System.out.println("--resultados_070-- Voy a buscar el historial de un partido");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_070");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//search record
		resultSteps.searchHistory();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_080(){
		System.out.println("--resultados_080-- Voy a buscar la clasificacion de la liga");
		//tap in to results section
		resultSteps.findResults();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_080");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//search record
		resultSteps.searchHistory();
		//search classification
		resultSteps.searchClassification();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	
	public void Results_090(){//Ver resultados de una competencia
		System.out.println("--resultados_090-- Voy a verificar los resultados (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//search results
		resultSteps.searchResults();
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	
	
	public void Results_100(){//Tap en un resultado y verificar que esten todos los tabs
		System.out.println("--resultados_100-- Voy a verificar un resultado y que contenga todos los tabs (seccion todos)");
		tabs = true;
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
		tabs = false;
	}
	
	
	public void Results_110(){//Buscar el resumen de un partido
		System.out.println("--resultados_110-- Voy a buscar el resumen de un partido (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_110");
		//search summary
		resultSteps.searchSumary();
		//take screenshot
		Tools.takeScreenshot("Resultados_Resumen");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_120(){
		System.out.println("--resultados_120-- Voy a buscar la linea de tiempo de un partido (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_120");
		//search time line
		resultSteps.searchTimeLine();
		//take screenshot
		Tools.takeScreenshot("Resultados_Linea_De_Tiempo");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_130(){
		System.out.println("--resultados_130-- Voy a buscar las estadisticas de un partido (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_130");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//take screenshot
		Tools.takeScreenshot("Resultados_Estadisticas");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_140(){
		System.out.println("--resultados_140-- Voy a buscar alineaciones de un partido (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_140");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//take screenshot
		Tools.takeScreenshot("Resultados_Alineaciones");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_150(){
		System.out.println("--resultados_150-- Voy a buscar el historial de un partido (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_150");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//search history
		resultSteps.searchHistory();
		//take screenshot
		Tools.takeScreenshot("Resultados_Historial");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	public void Results_160(){
		System.out.println("--resultados_160-- Voy a buscar la clasificacion de la liga (seccion todos)");
		//tap in to result section
		resultSteps.findResult();
		//take screenshot
		Tools.takeScreenshot("Seccion Resultados");
		//tap in a result
		resultSteps.tapResult(" error ocurred in the method 'tapResult' that is present in Results_160");
		//search time line
		resultSteps.searchTimeLine();
		//search statistics
		resultSteps.searchStatistics();
		//search alignments
		resultSteps.searchAlignments();
		//search history
		resultSteps.searchHistory();
		//search classification
		resultSteps.searchClassification();
		//take screenshot
		Tools.takeScreenshot("Resultados_Clasificacion");
		//return to menu
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
}
