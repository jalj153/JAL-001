package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class LoginSteps {
	static Tools tools = new Tools();
	static FoxSports principal = new FoxSports();
	int version = 0;
	
	public  void tapPerfil(){
		tools.searchId("com.fic.foxsports:id/action_profile");	 //tap en boton perfil
	}
	
	public  void tapBtnLogin(){
		tools.searchId("com.fic.foxsports:id/btn_user_login"); //Tap en boton de login
	}
	
	public  void tapGuests(){
		principal.scroll("abajo");
		try{
			principal.driver.findElementByXPath("//android.view.View[@content-desc=\"INVITADOS\"]").click();
		}catch(Exception e){
			tools.searchPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]");	//Ingresar en invitados
		}

	}
	
	public void tapUserName(){
		try{
			principal.driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View[2]/android.widget.EditText").click();
			version = 1;
		}catch(Exception e){
			tools.searchPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[1]/android.widget.EditText");
			version = 2;
		}
		
	}
	public void enterUserName(){
		if (version ==1){
			principal.driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View[2]/android.widget.EditText").sendKeys("elio.raymundo.fox@gmail.com");
		}else if (version ==2){
			tools.sendText("Usuario", "elio.raymundo.fox@gmail.com"); //ingresar nombre de usuario
		}
			
		
			
		
						
	}
	public void hideKeyboard(){
		tools.ocultarTeclado(); //ocultar teclado
	}
	public void tapPassword(){
		
		if (version == 1){
			tools.searchPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.widget.EditText");
		}else if (version ==2){
			tools.searchId("password");//tap en campo de contrasena
		}
			
	}
	public void enterPassword(){
		if (version == 1){
			principal.driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View[2]/android.widget.EditText").sendKeys("foxplay2017");
		}else if (version ==2){
			tools.sendText("Password", "foxplay2017"); //ingresar contrasena
		}
	}
	public void acceptTerms(){
		if (version ==1){
			principal.driver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Fox Play - Login\"]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[3]").click();
		}else if(version == 2){
			tools.searchId("terms"); //aceptar los terminos de Uso		
		}
				
	}
	public void login(){
		if (version == 1){
			principal.driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]").click();
		}else if (version == 2){
			tools.searchId("regularsubmit");//login		
		}
		
	}
	public void confirm(){
		try{
			tools.searchText("Ahora no.");
		}catch(Exception e){
			System.out.println("");
		}
	}
	
}
