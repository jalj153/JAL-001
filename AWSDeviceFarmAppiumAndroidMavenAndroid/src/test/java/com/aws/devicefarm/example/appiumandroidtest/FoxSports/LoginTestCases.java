package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class LoginTestCases {
Tools tools = new Tools();
LoginSteps loginSteps = new LoginSteps();

public void login_020(){//Log in with Guest user

		System.out.println("--login_020-- Ingresare con usuario Invitado");
		//Tap in button PERFIL
		loginSteps.tapPerfil(" error ocurred in the method 'tapPerfil' that is present in login_020");
		//take screenshot
		Tools.takeScreenshot("Inicio login");
		//Tap in button login
		loginSteps.tapBtnLogin(" error ocurred in the method 'tapBtnLogin' that is present in login_020"); 
		//Wait Time (6 seconds)
		Tools.waitTime(6000);
		//Tap in guests
		loginSteps.tapGuests();
		//Tap in user name section
		loginSteps.tapUserName();
		//Enter user name
		loginSteps.enterUserName();
		//Hide Keyboard
		loginSteps.hideKeyboard();
		//Tap in password section
		loginSteps.tapPassword(" error ocurred in the method 'tapPassword' that is present in login_020");
		//Enter password
		loginSteps.enterPassword();
		//hide keyboard
		loginSteps.hideKeyboard();
		//accept terms
		loginSteps.acceptTerms(" error ocurred in the method 'acceptTerms' that is present in login_020");
		//take screenshot
		Tools.takeScreenshot("Datos ingresados ");
		//Login
		loginSteps.login(" error ocurred in the method 'login' that is present in login_020");
		//Tap in not now
		loginSteps.confirm();
		//Wait time (Seven seconds)
		Tools.waitTime(7000);
		//Return to menu
		Tools.backToMenu(1);
	}
}


