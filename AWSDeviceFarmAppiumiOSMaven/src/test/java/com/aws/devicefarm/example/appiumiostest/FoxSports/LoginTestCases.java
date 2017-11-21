package com.aws.devicefarm.example.appiumiostest.FoxSports;

import org.openqa.selenium.By;

public class LoginTestCases {
	static FoxSports foxSports = new FoxSports();
	static LoginSteps step= new LoginSteps();

	//Método para hacer "login" con un usuario invitado
    public void login_020(){
    		step.tapIconProfile();
    		step.tapEnter();
    		step.tapGuests();
    		Tools.waitTime(5000);
    		step.email("hendrik.hurtarte.fox@gmail.com");
    		step.password("foxplay2017");
    		step.tapCheck();
    		step.tapLogin();
    		Tools.waitTime(10000);
    		Tools.backToMenu();
    }
}
