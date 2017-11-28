package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class LoginTestCases {
Tools tools = new Tools();
LoginSteps loginSteps = new LoginSteps();
public void miPerfil(){
	
	login_020();
	
}



//Iniciar sesion
public void login_020(){
	System.out.println("--login_020-- Ingresare un usuario");
	loginSteps.tapPerfil(" login_020");
	loginSteps.tapBtnLogin(" login_020"); //Tap boton login
	tools.waitTime(6000);
	loginSteps.tapGuests(); //Tap Invitados
	loginSteps.tapUserName(); //Tap TextBox username
	loginSteps.enterUserName();
	loginSteps.hideKeyboard();
	loginSteps.tapPassword(" login_020");
	loginSteps.enterPassword();
	loginSteps.hideKeyboard();
	loginSteps.acceptTerms(" login_020");
	loginSteps.login(" login_020");
	loginSteps.confirm();
	tools.waitTime(7000);
	Tools.backToMenu(1);
}


	
}


