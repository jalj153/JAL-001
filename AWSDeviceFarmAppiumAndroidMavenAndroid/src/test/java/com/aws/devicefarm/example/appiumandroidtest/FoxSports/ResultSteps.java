package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ResultSteps {
	ProfileSteps profileSteps = new ProfileSteps();
	Tools tools = new Tools();
	NewsTestCases  newsTestCases = new NewsTestCases();
	public static String competencia = "La Liga";
	FoxSports principal = new FoxSports();
	CompetitionsSteps competitionsSteps = new CompetitionsSteps();
	public static boolean back;
	
	
	public void tapResults(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.LinearLayout/android.widget.ImageView");	
	}
	public void searchCompetition(){
		try{
			principal.driver.findElementById("com.fic.foxsports:id/header_live_title").click();
			back = true;
		}catch(Exception e){
			back = false;
		}
	}
	public void searchResults(){
		tools.searchText("Resultados");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager", "No hay resultados");
	}
	public void tapResult(String location){
		tools.searchText("Resultados");
		tools.searchId("com.fic.foxsports:id/teamBadge", location);
	}
	public void findResults(){
		tapResults();//Tap en resultados
		searchCompetition();//Buscar competencia
		if (back == true){
			if (ResultsTestCases.tabs == true){
				competitionsSteps.searchTabs();
			}
		}else{
			System.out.println("          No has agregado ninguna competencia a favoritos. ******************************");
		}
	}
	public void findResult(){
		tapResults();//Tap en resultados
		tapInAll();
		searchCompetition();
		if (ResultsTestCases.tabs == true){
			competitionsSteps.searchTabs();
		}
		
	}
	public void searchSumary(){
		tools.searchText("Resumen");
	}
	
	public void searchTimeLine(){
		tools.searchText("Línea de Tiempo");
	}
	public void searchStatistics(){
		tools.searchText("Estadísticas");
	}
	public void searchAlignments(){
		tools.searchText("Alineaciones");
	}
	public void searchRecord(){//Buscar historial
		tools.searchText("Historial");
	}
	public void searchClassification(){
		tools.searchText("Clasificación");
	}
	public void tapInAll(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]");
	}
	
}
