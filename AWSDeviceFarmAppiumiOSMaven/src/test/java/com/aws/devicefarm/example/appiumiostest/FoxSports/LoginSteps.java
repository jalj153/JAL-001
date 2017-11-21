package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class LoginSteps {
	
	//Método que hace tap en el botón de "Icon Profile"
	public void tapIconProfile() {
		Tools.searchId("icon profile");
	}
	
	//Método para hacer tap en ingresar
	public void tapEnter() {
		Tools.searchId("INGRESAR");
	}
	
	//Método que hace tap en invitados
	public void tapGuests() {
		Tools.searchPath("//XCUIElementTypeStaticText[@name=\"INVITADOS\"]");
	}
	
	//Método que manda el texto del e-mail
	public void email(String email) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField", email);
	}
	
	//Método que envía el texto del password
	public void password(String password) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField", password);
	}
	
	//Método que hace tap en el "CheckBox" de terminos y condiciones
	public void tapCheck() {
		Tools.searchPath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch");
	}
	
	//Método que hace tap en login para ya iniciar la sesión.
	public void tapLogin() {
		Tools.searchId("Login");
	}
}
