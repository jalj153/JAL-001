package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class ProfileTestCases {
	Tools tools = new Tools();
	ProfileSteps profileSteps = new ProfileSteps();
	public void miPerfil(){
		miPerfil_010();
		miPerfil_020();
		miPerfil_030();
		miPerfil_040();
		miPerfil_050();
		miPerfil_060();
		miPerfil_070();
		miPerfil_080();
	}
	
	public void miPerfil_010(){ //buscar los elementos
		System.out.println("Estoy verificando que esten tus datos y otros elementos en Mi Perfil");
		profileSteps.goToProfile();//Tap en mi perfil
		profileSteps.searchName();//Buscar nombre
		profileSteps.searchId(); //Buscar ID de usuario
		profileSteps.searchBtnCloseSession(); //Buscar boton cerrar sesion
		profileSteps.searchFavorites(); //Buscar Favoritos
		profileSteps.searchHelpCenter(); //buscar centro de ayuda
		System.out.println("Voy a entrar en legales");		
		profileSteps.tapLegals();//Tap en legales
		profileSteps.searchWhatsNew();//Buscar Que hay de nuevo
		profileSteps.searchPrivacyPolicy();//Buscar Politica de privacidad
		profileSteps.searchTermsAndConditions();//Buscar Terminos y condiciones
		Tools.backToMenu(2);
	}
	
	public void miPerfil_020(){//entrar en favoritos
		System.out.println("Voy a entrar en favoritos para ver si hay o no equipos favoritos.");
		profileSteps.goToProfile();//Tap en perfil
		profileSteps.tapFavorites();//ir a favoritos
		profileSteps.searchFavoriteTeams();//Buscar equipos favoritos
		Tools.backToMenu(2);
	}
	
	public void miPerfil_030(){//agregar un equipo a favoritos
		System.out.println("Voy a agregar un equipo a favoritos");
		profileSteps.goToProfile();//Tap perfil
		profileSteps.tapFavorites();
		profileSteps.addFavoritesTeams();
		profileSteps.adCompetition();//Tap en una competicion
		profileSteps.tapTeam(); //TAp en  un equipo
		Tools.backToMenu(3);
		
	}
	
	public void miPerfil_040(){//favoritos y agregar una competencia
		System.out.println("Voy a agregar una competencia...");
		profileSteps.goToProfile();//Tap perfil
		profileSteps.tapFavorites();//Tap Favoritos
		profileSteps.addFavorites();
		profileSteps.tapCompetition();//Tap en competencias
		profileSteps.addCompetition();//Agregar competencia
		Tools.backToMenu(3);				
	}
	
	public void miPerfil_050(){//ver centro de ayuda
		System.out.println("Voy a ir a centro de ayuda...");
		profileSteps.goToProfile();
		profileSteps.tapHelpCenter();
		tools.waitTime(7000);
		Tools.backToMenu(2);
	}
	public void miPerfil_060(){//ver legales
		System.out.println("Voy a ir al apartado Que hay de Nuevo");
		profileSteps.goToProfile();
		profileSteps.tapLegals();
		profileSteps.tapWathsNews();// tap en que hay de nuevo
		tools.waitTime(7000);
		Tools.backToMenu(3);
	}
	public void miPerfil_070(){//Ver politica de privacidad
		System.out.println("Voy a ir al apartado de Politica de privacidad..");
		profileSteps.goToProfile();
		profileSteps.tapLegals();
		profileSteps.tapPrivacyPolicy();
		tools.waitTime(7000);
		Tools.backToMenu(3);
		
	}
	public void miPerfil_080(){//Ver terminos y condiciones
		System.out.println("Voy a ver los terminos y condiciones");
		profileSteps.goToProfile();
		profileSteps.tapLegals();
		profileSteps.tapTermsAndConditions();
		tools.waitTime(7000);
		Tools.backToMenu(3);
	}
}
