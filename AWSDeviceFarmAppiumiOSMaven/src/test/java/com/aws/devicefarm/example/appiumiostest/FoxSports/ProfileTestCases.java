package com.aws.devicefarm.example.appiumiostest.FoxSports;

public class ProfileTestCases {
		static ProfileSteps step = new ProfileSteps();
		
		//Method that you tap on the "icon profile"
		public void profile_010(){
			Tools.takeSpace();
			System.out.println("----------Profile_010----------");
			step.iconProfile();
			Tools.backToMenu();
		}
		
		//Method that you tap on favorites to add.
		public void profile_020() {
			Tools.takeSpace();
			System.out.println("----------Profile_020----------");
			step.iconProfile();
			step.tapFavorites();
			Tools.backToMenu();
		}
		
		//Method that tap in favorites and add to the selected team
		public void profile_030() {
			Tools.takeSpace();
			System.out.println("----------Profile_030----------");
			step.iconProfile();
			step.tapFavorites();
			step.addFavoriteTeam();
			step.tapNext();
			step.selectTeam("Barcelona");
			step.tapFinalize();
			Tools.backToMenu();
		}
		
		//Method that tap in favorites and add the selected competition 
		public void profile_040() {
			Tools.takeSpace();
			System.out.println("----------Profile_040----------");
			step.iconProfile();
			step.tapFavorites();
			step.addFavoriteComp();
			step.selectCompetition("Superliga Argentina de Fútbol");
			step.tapNext();
			step.tapFinalize();
			Tools.backToMenu();
		}
		
		//Method that presses the "Help Center" and sees what it contains
		public void profile_050() {
			Tools.takeSpace();
			System.out.println("----------Profile_050----------");
			step.iconProfile();
			step.helpCenter();
			Tools.searchId("Back");
			Tools.backToMenu();
		}
		
		//Method that presses on "What's new?" and see what it contains
		public void profile_060() {
			Tools.takeSpace();
			System.out.println("----------Profile_060----------");
			step.iconProfile();
			step.whatsNew();
			step.returnTop();
			Tools.searchId("Back");
			Tools.backToMenu();
		}
		
		//Method that you press in "Privacy Policy" and see what it contains
		public void profile_070() {
			Tools.takeSpace();
			System.out.println("----------Profile_070----------");
			step.iconProfile();
			step.privacyPolicy();
			step.returnTop();
			Tools.searchId("Back");
			Tools.backToMenu();
		}
		
		//Method that you press in "Terms and conditions" and see what it contains
		public void profile_080() {
			Tools.takeSpace();
			System.out.println("----------Profile_080----------");
			step.iconProfile();
			step.termsAndConditions();
			step.returnTop();
			Tools.searchId("Back");
			Tools.backToMenu();
		}
	
}
