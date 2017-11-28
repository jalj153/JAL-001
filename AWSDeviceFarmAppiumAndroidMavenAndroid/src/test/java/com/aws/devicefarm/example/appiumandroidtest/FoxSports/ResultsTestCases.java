package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ResultsTestCases {
	ResultSteps resultSteps = new ResultSteps();
	public static boolean tabs;
	
	public void Resultados(){
		//Results_010();
		//Results_020();
		//Results_030();
		//Results_040();
		//Results_050();
		//Results_060();
		//Results_070();
		//Results_080();
		//Results_090();
		Results_100();
		Results_110();
		Results_120();
		Results_130();
		Results_140();
		Results_150();
		Results_160();
	}
	public void Results_010(){//Ver resultados de una competencia
		System.out.println("--resultados_010-- Voy a verificar los resultados");
		resultSteps.findResults();
		resultSteps.searchResults();
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	public void Results_020(){//Tap en un resultado
		System.out.println("--resultados_020-- Voy a verificar un resultado, y que contenga los tabs");
		tabs = true;
		resultSteps.findResults();
		tabs = false;
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	public void Results_030(){//Buscar el resumen de un partido
		System.out.println("--resultados_030-- Voy a buscar el resumen de un partido");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_030");
		resultSteps.searchSumary();//Buscar resumen
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
		
	}
	public void Results_040(){
		System.out.println("--resultados_040-- Voy a buscar la linea de tiempo de un partido");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_040");
		resultSteps.searchTimeLine();//Buscar linea de tiempo
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
		
	}
	public void Results_050(){
		System.out.println("--resultados_050-- Voy a buscar las estadisticas de un partido");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_050");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_060(){
		System.out.println("--resultados_060-- Voy a buscar alineaciones de un partido");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_060");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_070(){
		System.out.println("--resultados_070-- Voy a buscar el historial de un partido");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_070");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		resultSteps.searchRecord();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_080(){
		System.out.println("--resultados_080-- Voy a buscar la clasificacion de la liga");
		resultSteps.findResults();
		resultSteps.tapResult(" Results_080");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		resultSteps.searchRecord();
		resultSteps.searchClassification();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	public void Results_090(){//Ver resultados de una competencia
		System.out.println("--resultados_090-- Voy a verificar los resultados (seccion todos)");
		resultSteps.findResult();
		resultSteps.searchResults();
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
	}
	public void Results_100(){//Tap en un resultado y verificar que esten todos los tabs
		System.out.println("--resultados_100-- Voy a verificar un resultado y que contenga todos los tabs");
		tabs = true;
		resultSteps.findResult();
		//resultSteps.tapResult();
		if(resultSteps.back == true){
			Tools.backToMenu(1);
		}
		tabs = false;
	}
	public void Results_110(){//Buscar el resumen de un partido
		System.out.println("--resultados_110-- Voy a buscar el resumen de un partido");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_110");
		resultSteps.searchSumary();//Buscar resumen
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_120(){
		System.out.println("--resultados_120-- Voy a buscar la linea de tiempo de un partido");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_120");
		resultSteps.searchTimeLine();//Buscar linea de tiempo
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_130(){
		System.out.println("--resultados_130-- Voy a buscar las estadisticas de un partido");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_130");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_140(){
		System.out.println("--resultados_140-- Voy a buscar alineaciones de un partido");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_140");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_150(){
		System.out.println("--resultados_150-- Voy a buscar el historial de un partido");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_150");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		resultSteps.searchRecord();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	public void Results_160(){
		System.out.println("--resultados_160-- Voy a buscar la clasificacion de la liga");
		resultSteps.findResult();
		resultSteps.tapResult(" Results_160");
		resultSteps.searchTimeLine();
		resultSteps.searchStatistics();
		resultSteps.searchAlignments();
		resultSteps.searchRecord();
		resultSteps.searchClassification();
		if(resultSteps.back == true){
			Tools.backToMenu(2);
		}
	}
	
	
	
	

	
}
