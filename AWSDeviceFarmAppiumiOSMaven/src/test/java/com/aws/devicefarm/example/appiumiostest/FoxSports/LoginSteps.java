package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class LoginSteps {
	
	//Method that you tap on the "Icon Profile" button
	public void tapIconProfile() {
		Tools.searchId("icon profile");
	}
	
	//Method to tap on enter
	public void tapEnter() {
		Tools.searchId("INGRESAR");
	}
	
	//Method that tap on guests
	public void tapGuests() {
		Tools.searchPath("//XCUIElementTypeStaticText[@name=\"INVITADOS\"]");
	}
	
	//Method that sends the text of the e-mail
	public void email(String email) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField", email);
	}
	
	//Method that sends the password text
	public void password(String password) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField", password);
	}
	
	//Method that does tap on the "CheckBox" of terms and conditions
	public void tapCheck() {
		Tools.searchPath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch");
	}
	
	//Method that makes tap in login to start the session.
	public void tapLogin() {
		Tools.searchId("Login");
	}
}
