package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ProfileSteps {
	Tools tools = new Tools();
	LoginSteps loginSteps =  new LoginSteps();
	FoxSports principal = new FoxSports();
	public static int version = 0;
	public void goToProfile(String location){
		tools.searchId("com.fic.foxsports:id/action_profile", location);//Tap en perfil
	}
	public void searchName(){	//Buscar nombre
		tools.searchElementsOfLogin("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	}
	public void searchId(){
		tools.searchElementsOfLogin("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[3]");
	}
	public void searchBtnCloseSession(){
		tools.searchElementsOfLogin("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button");
	}
	public void searchFavorites(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView", "No se encuentra la seccion favoritos");
	}
	public void searchHelpCenter(){//Buscar centro de ayuda
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView", "No se encuentra la secion centro de ayuda");
	}
	public void tapLegals(String location){
		tools.searchId("com.fic.foxsports:id/more_legal_title", location);
	}
	public void searchWhatsNew(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView", "No se encuentra la seccion que hay de nuevo");
	}
	public void searchPrivacyPolicy(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView", "No se encuentra la seccion politica de privacidad");
	}
	public void searchTermsAndConditions(){
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView", "No se encuentra la seccion terminos y condiciones");
	}
	public void tapFavorites(){
		tools.findBack("Favoritos");
	}
	public void searchFavoriteTeams(){
		try{
			principal.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		}catch(Exception e){
			System.err.println("       Aun no has agregado equipos a la seccion favoritos.");
		}
	}
	public void addFavoritesTeams(String location){
		tools.searchId("com.fic.foxsports:id/add_favorite", location);//Tap agregar favoritos
	}
	public void addCompetition(String location){
		try{
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.support.v7.widget.RecyclerView\")).scrollIntoView(new UiSelector().text(\"La Liga\"));").click();
			version = 2;
		}catch(Exception e){
			tools.searchId("com.fic.foxsports:id/competition_name", location);
			version = 1;
		}
		
	}
	public void adCompetition(String location){
		try{
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.widget.ExpandableListView\")).scrollIntoView(new UiSelector().text(\"La Liga\"));").click();
			version = 2;
		}catch(Exception e){
			tools.searchId("com.fic.foxsports:id/competition_name", location);
			version = 1;
		}
		 
	}
	public void tapTeam(String location){
		tools.searchId("com.fic.foxsports:id/child_container", location);//Tap en un equipo
	}
	public void addFavorites(String location){
			tools.searchId("com.fic.foxsports:id/add_favorite", location);//Tap agregar favoritos		
	}
	public void tapCompetition(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]");
	}
	public void tapHelpCenter(String location){
		tools.searchId("com.fic.foxsports:id/more_help_title", location);
	}
	public void tapWathsNews(String location){
		tools.searchId("com.fic.foxsports:id/more_legal_title", location);
	}
	public void tapPrivacyPolicy(){
		tools.findBack("Política de Privacidad");
	}
	public void tapTermsAndConditions(){
		tools.findBack("Términos y Condiciones");
	}
	
}
