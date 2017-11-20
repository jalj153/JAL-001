package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class LoginSteps {
	public void tapIconProfile() {
		Tools.searchId("icon profile");
	}
	public void tapEnter() {
		Tools.searchId("INGRESAR");
	}
	public void tapGuests() {
		Tools.searchPath("//XCUIElementTypeStaticText[@name=\"INVITADOS\"]");

	}
	public void email(String email) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField", email);
	}
	public void password(String password) {
		Tools.sendText("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField", password);
	}
	public void tapCheck() {
		Tools.searchPath("//XCUIElementTypeOther[@name=\"article\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch");
	}
	public void tapLogin() {
		Tools.searchId("Login");
	}
}
