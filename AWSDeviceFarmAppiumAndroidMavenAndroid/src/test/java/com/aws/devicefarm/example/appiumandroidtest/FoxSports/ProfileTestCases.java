package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ProfileTestCases {
	Tools tools = new Tools();
	ProfileSteps profileSteps = new ProfileSteps();
	
	public void miPerfil_010(){ //buscar los elementos
		System.out.println("--miPerfil_010-- Estoy verificando que esten tus datos y otros elementos en Mi Perfil");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_010");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//verify that name is present
		profileSteps.searchName();
		//verify that Id is present
		profileSteps.searchId(); 
		//search button close session 
		profileSteps.searchBtnCloseSession();
		//search section favorites 
		profileSteps.searchFavorites();
		//search section help center
		profileSteps.searchHelpCenter(); 
		//tap in legals
		profileSteps.tapLegals(" error ocurred in the method 'tapLegals' that is present in miPerfil_010");
		//take screenshot
		Tools.takeScreenshot("Legales");
		//search What's new?
		profileSteps.searchWhatsNew();
		//search privacy policy
		profileSteps.searchPrivacyPolicy();
		//search terms and conditions
		profileSteps.searchTermsAndConditions();
		//return to menu
		Tools.backToMenu(2);
	}
	
	public void miPerfil_020(){//entrar en favoritos
		System.out.println("--miPerfil_020-- Voy a entrar en favoritos para ver si hay o no equipos favoritos.");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_010");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in favorites
		profileSteps.tapFavorites();
		//take screenshot
		Tools.takeScreenshot("Favoritos");
		//search favorite teams
		profileSteps.searchFavoriteTeams();
		//return to menu
		Tools.backToMenu(2);
	}
	
	
	public void miPerfil_030(){//agregar un equipo a favoritos
		System.out.println("--miPerfil_030-- Voy a agregar un equipo a favoritos");
		//tap in profile icon
		profileSteps.goToProfile(" miPerfil_030"); 
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in favorites
		profileSteps.tapFavorites();
		//add favorites teams
		profileSteps.addFavoritesTeams(" error ocurred in the method 'addFavoritesTeams' that is present in miPerfil_030");
		//add a competition
		profileSteps.adCompetition(" error ocurred in the method 'adCompetition' that is present in miPerfil_030");
		//take screenshot
		Tools.takeScreenshot("Seleccionar una competencia");
		//select a team
		profileSteps.tapTeam(" error ocurred in the method 'tapTeam' that is present in miPerfil_030");
		//take screenshot
		Tools.takeScreenshot("Agregar un equipo a favoritos");
		//return to menu
		Tools.backToMenu(3);
	}
	
	public void miPerfil_040(){//favoritos y agregar una competencia
		System.out.println("--miPerfil_040-- Voy a agregar una competencia...");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_040");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in favorites
		profileSteps.tapFavorites();
		//add favorites
		profileSteps.addFavorites(" error ocurred in the method 'addFavorites' that is present in miPerfil_040");
		//select a competition
		profileSteps.tapCompetition();
		//add competition
		profileSteps.addCompetition(" error ocurred in the method 'addCompetition' that is present in miPerfil_040");
		//take screenshot
		Tools.takeScreenshot("Agregar competencia a favoritos");
		//return to menu
		Tools.backToMenu(3);				
	}
	
	
	public void miPerfil_050(){//ver centro de ayuda
		System.out.println("--miPerfil_050-- Voy a ir a centro de ayuda...");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_050");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap help center
		profileSteps.tapHelpCenter(" error ocurred in the method 'tapHelpCenter' that is present in miPerfil_050");
		//wait time (seven seconds)
		Tools.waitTime(7000);
		//return to menu
		Tools.backToMenu(2);
	}
	
	public void miPerfil_060(){//ver legales
		System.out.println("--miPerfil_060-- Voy a ir al apartado Que hay de Nuevo");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_060");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in legals
		profileSteps.tapLegals(" error ocurred in the method 'tapLegals' that is present in miPerfil_060");
		//tap in wath's new?
		profileSteps.tapWathsNews(" error ocurred in the method 'tapWathsNews' that is present in miPerfil_060");
		//wait time (seven seconds)
		Tools.waitTime(7000);
		//return to menu
		Tools.backToMenu(3);
	}
	
	
	public void miPerfil_070(){//Ver politica de privacidad
		System.out.println("--miPerfil_070-- Voy a ir al apartado de Politica de privacidad..");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_070");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in legals
		profileSteps.tapLegals(" error ocurred in the method 'tapLegals' that is present in miPerfil_070");
		//tap in privacy policy
		profileSteps.tapPrivacyPolicy();
		//wait time(seven seconds)
		Tools.waitTime(7000);
		//return to menu
		Tools.backToMenu(3);
	}
	
	
	public void miPerfil_080(){//Ver terminos y condiciones
		System.out.println("--miPerfil_080-- Voy a ver los terminos y condiciones");
		//tap in profile icon
		profileSteps.goToProfile(" error ocurred in the method 'goToProfile' that is present in miPerfil_080");
		//take screenshot
		Tools.takeScreenshot("Seccion perfil");
		//tap in legals
		profileSteps.tapLegals(" error ocurred in the method 'tapLegals' that is present in miPerfil_080");
		//tap in terms and conditions
		profileSteps.tapTermsAndConditions();
		//wait time (seven seconds)
		Tools.waitTime(7000);
		//return to menu
		Tools.backToMenu(3);
	}
}
