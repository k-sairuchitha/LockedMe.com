package com.lockedme;
import java.util.Scanner;

public class HandleOptions {
	

	
	
		public static boolean handleWelcomeScreenInput() 
		{
			do { 
				//Using While Condition for Displaying Option again until the user exits the program 
			
				try {	
					Scanner sc = new Scanner(System.in);
					int input;
					MenuOptions.displayMenu();
					input = Integer.parseInt(sc.nextLine()); //Taking Input from the user
					switch (input) {
					case 1:
						FileManagerMain.getAllFiles("directory"); //Display files in the directory
						break;
					case 2:
						HandleOptions.handleFileMenuOptions(); //option to add,delete,search
						break;
					case 3:
						System.out.println("Program exited successfully."); //exit the program
						return true;
					case 4:
						System.exit(0);
						break;
					default:
						System.out.println("Please select a valid option from above.");//In case of invailed Entery   
						
					}
				} 
				catch (Exception e)
				{
					System.out.println(e.getClass().getName());
					handleWelcomeScreenInput();
				} 
				
			}while (true);
			
		

	}

		public static boolean  handleFileMenuOptions() { //Option to add,delete,search the file
			
			Scanner sc = new Scanner(System.in);
			do {
			
				try {
					MenuOptions.displayFileMenuOption();				
					
					int input = Integer.parseInt(sc.nextLine());; //user input option
					switch (input) 
					{
					case 1:
						FileManagerMain.createFiles(); //Create a file 
						break;
					case 2:
						FileManagerMain.deleteFile(); // delete the file from the directory
						break;
					case 3:
						FileManagerMain.searchFile(); // search the file from the directory
						break;
					case 4:
						return false ; //return to the previous Menu
					case 5:
						// Exit
						System.exit(0);
						System.out.println("Program exited successfully."); //exit the program
						return false;
					
						
					default:
						System.out.println("Please select a valid option from above.");
					}
					
				} catch (Exception e) {
					System.out.println(e.getClass().getName());
					 e.printStackTrace();
//					handleFileMenuOptions();
				}
				
			}while (true);
			
		}

	}

