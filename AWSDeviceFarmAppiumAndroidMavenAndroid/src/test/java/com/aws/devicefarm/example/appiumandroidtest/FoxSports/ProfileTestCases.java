package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ProfileTestCases {
	Tools tools = new Tools();
	ProfileSteps profileSteps = new ProfileSteps();
	
	public void miPerfil_010(){ //buscar los elementos
		System.out.println("--miPerfil_010-- Estoy verificando que esten tus datos y otros elementos en Mi Perfil");
		
		profileSteps.goToProfile(" miPerfil_010");//Tap en mi perfil
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.searchName();//Buscar nombre
		
		profileSteps.searchId(); //Buscar ID de usuario
		
		profileSteps.searchBtnCloseSession(); //Buscar boton cerrar sesion
		
		profileSteps.searchFavorites(); //Buscar Favoritos
		
		profileSteps.searchHelpCenter(); //buscar centro de ayuda
		
		profileSteps.tapLegals(" miPerfil_010");//Tap en legales
		
		Tools.takeScreenshot("Legales");
		
		profileSteps.searchWhatsNew();//Buscar Que hay de nuevo
		
		profileSteps.searchPrivacyPolicy();//Buscar Politica de privacidad
		
		profileSteps.searchTermsAndConditions();//Buscar Terminos y condiciones
		
		Tools.backToMenu(2);
	}
	
	public void miPerfil_020(){//entrar en favoritos
		System.out.println("--miPerfil_020-- Voy a entrar en favoritos para ver si hay o no equipos favoritos.");
		
		profileSteps.goToProfile(" miPerfil_010");//Tap en perfil
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapFavorites();//ir a favoritos
		
		Tools.takeScreenshot("Favoritos");
		
		profileSteps.searchFavoriteTeams();//Buscar equipos favoritos
		
		Tools.backToMenu(2);
	}
	
	
	public void miPerfil_030(){//agregar un equipo a favoritos
		System.out.println("--miPerfil_030-- Voy a agregar un equipo a favoritos");
		
		profileSteps.goToProfile(" miPerfil_030");//Tap perfil
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapFavorites();
		
		profileSteps.addFavoritesTeams(" miPerfil_030");
		
		profileSteps.adCompetition(" miPerfil_030");//Tap en una competicion
		
		Tools.takeScreenshot("Seleccionar una competencia");
		
		profileSteps.tapTeam(" miPerfil_030"); //TAp en  un equipo
		
		Tools.takeScreenshot("Agregar un equipo a favoritos");
		
		Tools.backToMenu(3);
		
	}
	
	public void miPerfil_040(){//favoritos y agregar una competencia
		System.out.println("--miPerfil_040-- Voy a agregar una competencia...");
		
		profileSteps.goToProfile(" miPerfil_040");//Tap perfil
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapFavorites();//Tap Favoritos
		
		profileSteps.addFavorites(" miPerfil_040");
		
		profileSteps.tapCompetition();//Tap en competencias
		
		profileSteps.addCompetition(" miPerfil_040");//Agregar competencia
		
		Tools.takeScreenshot("Agregar competencia a favoritos");
		
		Tools.backToMenu(3);				
	}
	
	
	public void miPerfil_050(){//ver centro de ayuda
		System.out.println("--miPerfil_050-- Voy a ir a centro de ayuda...");
	
		profileSteps.goToProfile(" miPerfil_050");
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapHelpCenter(" miPerfil_050");
		
		Tools.waitTime(7000);
		
		Tools.backToMenu(2);
	}
	
	public void miPerfil_060(){//ver legales
		System.out.println("--miPerfil_060-- Voy a ir al apartado Que hay de Nuevo");
	
		profileSteps.goToProfile(" miPerfil_060");
		
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapLegals(" miPerfil_060");
		
		profileSteps.tapWathsNews(" miPerfil_060");// tap en que hay de nuevo
		
		Tools.waitTime(7000);
		
		Tools.backToMenu(3);
	}
	
	
	public void miPerfil_070(){//Ver politica de privacidad
		System.out.println("--miPerfil_070-- Voy a ir al apartado de Politica de privacidad..");
		
		profileSteps.goToProfile(" miPerfil_070");
	
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapLegals(" miPerfil_070");
		
		profileSteps.tapPrivacyPolicy();
		
		Tools.waitTime(7000);
		
		Tools.backToMenu(3);
		
	}
	
	
	public void miPerfil_080(){//Ver terminos y condiciones
		System.out.println("--miPerfil_080-- Voy a ver los terminos y condiciones");
		
		profileSteps.goToProfile(" miPerfil_080");
	
		Tools.takeScreenshot("Seccion perfil");
		
		profileSteps.tapLegals(" miPerfil_080");
		
		profileSteps.tapTermsAndConditions();
		
		Tools.waitTime(7000);
		
		Tools.backToMenu(3);
	}
}
