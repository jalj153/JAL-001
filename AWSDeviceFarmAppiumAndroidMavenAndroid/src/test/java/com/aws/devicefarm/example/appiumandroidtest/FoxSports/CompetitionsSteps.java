package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class CompetitionsSteps {
	FoxSports principal = new FoxSports();
	Tools tools = new Tools();
	
	public void tapCompetitions(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.LinearLayout");
	}
	public void verifyIfCompetitionIsPresent(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView", "No hay competiciones disponibles");
	}
	public void searchCountry(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView", "No se ha encontrado el pais al que pertenece la competencia");
	}
	public void tapInSearch(String location){
		tools.searchId("com.fic.foxsports:id/action_search", location);
	}
	public void sendText(){
		principal.driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.fic.foxsports:id/comp_header_title\")").sendKeys("La Liga");
		
	}
	public void tapCompetition(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
	}
	public void searchTabs(){
		tools.searchText("Resultados");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout", "Error al cargar los resultados");
		tools.searchText("Noticias");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]", "Error al cargar las noticias");
		tools.searchText("Posiciones");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar las posiciones");
		tools.searchText("Equipos");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout", "Error al cargar los equipos");
		tools.searchText("Estadísticas");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView", "Error al cargar las estadisticas");
		tools.searchText("Goleadores");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]", "Error al cargar los goleadores");
	}
	
	public void tapSoccerCompetition(){
		tools.scroll("android.support.v4.view.ViewPager", "La Liga");
	}
	public void searchResults(){
		tools.searchText("Resultados");
	}
	public void tapResult(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout");
	}
	public void searchSummary(){
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
	public void searchHistory(){
		tools.searchText("Historial");
	}
	public void searchClassification(){
		tools.searchText("Clasificación");
	}
	public void validarTab(int a){
		if(a==1){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout", "Error al cargar el resumen");
		}else if(a==2){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout", "Error al cargar la linea de tiempo");
		}else if(a==3){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]", "Error al cargar las estadisticas");
		}else if(a==4){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[1]", "Error al cargar las alineaciones");
		}else if(a==5){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout", "Error al cargar el historial");
		}else if(a==6){
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar la tabla de posiciones");		
		}
	}
	
	public void searchNews(){
		tools.searchText("Noticias");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]", "Error al cargar las noticias");
	}

	public void searchPositions(){
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager", "error al cargar las posiciones");
	}
	public void searchTeams(){
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.searchText("Equipos");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout", "Error al cargar los equipos");
		
	}
	
	public void searchTabsOfTeams(String location){
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.searchText("Equipos");
		try{
			principal.driver.findElementById("com.fic.foxsports:id/thumbnail").click();
			tools.totalBuenas+=1;
			tools.searchText("Resultados");
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout", "Error al cargar los resultados del equipo");
			tools.searchText("Estadísticas");
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView", "Error al cargar las estadisticas del equipo");
			tools.searchText("Noticias");
			tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]", "Error al cargar las noticias del equipo");
			Tools.backToMenu(1);
		}catch(Exception e){
			tools.totalMalas +=1;
		}
		
	}
	
	public void searchStatisticsOfCompetition(){
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.searchText("Equipos");
		tools.searchText("Estadísticas");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView", "Error al cargar las estadisticas de la competencia");
	}

	public void tapMotorCompetition(){
		principal.foxTimeOut=10;
		tools.scroll("android.support.v4.view.ViewPager", "Fórmula 1");
		tools.searchText("Resultados");
	}
	public void searchResultsOfMotorCompetition(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager", "No hay resultados de Motor");
	}
	public void searchNewsOfMotorCompetition(){
		tools.searchText("Resultados");
		tools.searchText("Noticias");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]", "Error al cargar las noticias");
	}
	public void searchPositionsOfMotorCompetition(){
		tools.searchText("Resultados");
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar las posiciones");
	}
	public void searchCalendarOfMotorCompetition(){
		tools.searchText("Resultados");
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.searchText("Calendario");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar el calendario");
	}
	public void tapPilots(){
		tools.searchText("Resultados");
		tools.searchText("Noticias");
		tools.searchText("Posiciones");
		tools.searchText("Calendario");
		tools.searchText("Pilotos");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar los pilotos");
	}
	public void tapBaseballCompetition(){
		principal.foxTimeOut=10;
		tools.scroll("android.support.v7.widget.RecyclerView", "MLB");
		tools.searchText("Posiciones");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar las posiciones");
	}
	public void searchResultsOfBaseballCompetition(){
		tools.searchText("Resultados");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout", "Error al cargar los resultados de la MLB");
	}
	public void searchNewsOfBaseballCompetition(){
		tools.searchText("Resultados");
		tools.searchText("Noticias");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]", "Error al cargar las noticias");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView[1]", "Error al mostrar el titulo de la noticia");
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView[3]", "Error al mostrar el tiempo desde que se publico la noticia");
	}
}
