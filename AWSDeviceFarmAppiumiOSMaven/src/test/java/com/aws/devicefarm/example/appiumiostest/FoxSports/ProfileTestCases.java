package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ProfileTestCases {
		static ProfileSteps step = new ProfileSteps();
	
		private void profile_010(){
			step.iconProfile();
			Tools.backToMenu();
		}
	
		private void profile_020() {
			step.iconProfile();
			step.tapFavorites();
			Tools.backToMenu();
		}
		private void profile_040() {
			step.iconProfile();
			step.tapFavorites();
			step.addFavorite();
			step.selectCompetition("Superliga Argentina de Fútbol");
			step.tapNext();
			step.tapFinalize();
			Tools.backToMenu();
		}
		private void profile_030() {
			step.iconProfile();
			step.tapFavorites();
			step.addFavorite();
			step.tapNext();
			step.selectTeam("Barcelona");
			step.tapFinalize();
			Tools.backToMenu();
		}
		private void profile_050() {
			step.iconProfile();
			step.helpCenter();
			Tools.searchId("Back");
		}
		private void profile_060() {
			step.iconProfile();
			step.whatsNew();
			step.returnTop();
			Tools.searchId("Back");
		}
		private void profile_070() {
			step.iconProfile();
			step.privacyPolicy();
			step.returnTop();
			Tools.searchId("Back");
		}
		private void profile_080() {
			step.iconProfile();
			step.termsAndConditions();
			step.returnTop();
			Tools.searchId("Back");	
		}
	
}
