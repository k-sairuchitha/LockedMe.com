package com.lockedme;

public class MenuOptions {
	
		public static void displayMenu(){ 
			// Creating a  WelcomeScreen With Company Name And Developer Name
			
			Object appName = "Lockedme";
			Object developerName = "Ruchitha kurra" ;
			String companyDetails = String.format("*********************************************\n"+ "* Welcome to %s.com. \n" + "* This application was developed by %s.\n"+ "************************************************\n", appName, developerName);String appFunction = "You can use this application to :-\n"+ "• Retrieve all file names in the \"directory\" folder\n"+ "• Search, add, or delete files in \"directory\" folder.\n"+ "\nPlease be careful to ensure the correct filename is provided for searching or deleting files.*\n";
			System.out.println(companyDetails);

			System.out.println(appFunction);
			// Creating a DisplayMenu
			
			String menu = "\n\n*** Select any option number from below and press Enter ***\n\n"+ "1) Retrieve all files inside \"directory\" folder\n" + "2) Display menu for File operations\n"+ "3) Exit program\n";
			
			System.out.println(menu);
			System.out.println("Enter The Option: \n");
			
		}
		public static void displayFileMenuOption() {
			// Creating a DisplayFileMenuOption to Add,Search,and Delete File
			String fileMenu = "\n\n*** Select any option number from below and press Enter ***\n\n"
					+ "1) Add a file to \"directoryy\" folder\n" + "2) Delete a file from \"directory\" folder\n"
					+ "3) Search for a file from \"directory\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

			System.out.println(fileMenu);
			
			System.out.println("Enter the option number:"); 
			
		}
		
	}


