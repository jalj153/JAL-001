package com.aws.devicefarm.example.appiumandroidtest.FoxSports;

public class NewsSteps {
	Tools tools = new Tools();
	FoxSports principal = new FoxSports();
	
	public void tapNews(){
		tools.findBack("Noticias");//buscar la seccion noticias
	}
	public void tapPicker(){
		tools.searchId("android:id/text1");//Tap en el pickercom.fic.foxsports:id/spinner_competition
	}
	public void seleccionarCompetencia(String competencia){
		try{
		principal.driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.widget.ListView\")).scrollIntoView(new UiSelector().text(\""+competencia+"\"));").click();
		}catch(Exception e){
			tapPicker();
			seleccionarCompetencia(competencia);
		}
	
	}
	public void tapNewsOfLeague(){
		tools.searchId("com.fic.foxsports:id/news_image_thumb");//Tap en una noticia
	}

}
