package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ProfileSteps {
	Tools tools = new Tools();
	LoginSteps loginSteps =  new LoginSteps();
	FoxSports principal = new FoxSports();
	public static int version = 0;
	public void goToProfile(){
		tools.searchId("com.fic.foxsports:id/action_profile");//Tap en perfil
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
	public void tapLegals(){
		tools.searchId("com.fic.foxsports:id/more_legal_title");
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
		tools.findAndReport("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView", "No hay equipos favoritos");
	}
	public void addFavoritesTeams(){
		tools.searchId("com.fic.foxsports:id/add_favorite");//Tap agregar favoritos
	}
	public void addCompetition(){
		try{
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.support.v7.widget.RecyclerView\")).scrollIntoView(new UiSelector().text(\"La Liga\"));").click();
			version = 2;
		}catch(Exception e){
			tools.searchId("com.fic.foxsports:id/competition_name");
			version = 1;
		}
		
	}
	public void adCompetition(){
		try{
			principal.driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().className(\"android.widget.ExpandableListView\")).scrollIntoView(new UiSelector().text(\"La Liga\"));").click();
			version = 2;
		}catch(Exception e){
			tools.searchId("com.fic.foxsports:id/competition_name");
			version = 1;
		}
		 
	}
	public void tapTeam(){
		tools.searchId("com.fic.foxsports:id/child_container");//Tap en un equipo
	}
	public void addFavorites(){
			tools.searchId("com.fic.foxsports:id/add_favorite");//Tap agregar favoritos		
	}
	public void tapCompetition(){
		tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]");
	}
	public void tapHelpCenter(){
		tools.searchId("com.fic.foxsports:id/more_help_title");
	}
	public void tapWathsNews(){
		tools.searchId("com.fic.foxsports:id/more_legal_title");
	}
	public void tapPrivacyPolicy(){
		tools.findBack("Política de Privacidad");
	}
	public void tapTermsAndConditions(){
		tools.findBack("Términos y Condiciones");
	}
	
}
