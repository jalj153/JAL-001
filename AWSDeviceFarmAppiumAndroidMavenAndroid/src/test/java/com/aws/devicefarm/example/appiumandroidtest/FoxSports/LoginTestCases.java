package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class LoginTestCases {
Tools tools = new Tools();
LoginSteps loginSteps = new LoginSteps();
public void miPerfil(){
	miPerfil_010();
	login_020();
	
}

//Tap en perfil
public void miPerfil_010(){
	System.out.println("Verificare la funcionalidad del boton Mi Perfil");
	loginSteps.tapPerfil();
	Tools.backToMenu(1);
}

//Iniciar sesion
public void login_020(){
	System.out.println("Ingresare un usuario");
	loginSteps.tapPerfil();
	loginSteps.tapBtnLogin(); //Tap boton login
	tools.waitTime(6000);
	loginSteps.tapGuests(); //Tap Invitados
	loginSteps.tapUserName(); //Tap TextBox username
	loginSteps.enterUserName();
	loginSteps.hideKeyboard();
	loginSteps.tapPassword();
	loginSteps.enterPassword();
	loginSteps.hideKeyboard();
	loginSteps.acceptTerms();
	loginSteps.login();
	loginSteps.confirm();
	tools.waitTime(7000);
	Tools.backToMenu(1);
}


	
}


