package com.lockedme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManagerMain {
	

	
		static final String folderpath ="C:\\Users\\venka\\eclipse-workspace\\LockedMe.com\\directory";

		public static void main(String[] args)
		{
		
			HandleOptions.handleWelcomeScreenInput();
		}
		
		public static void getAllFiles(String directory) {
			//get file names
			//Using forEach 
			List<String> fileName = LockedMeMain.getAllFiles(folderpath);
			for (String f :fileName)
				System.out.println(f);		
		}
		public static void createFiles() {
			Scanner obj = new Scanner(System.in);
			String filename;
			int linesCount;
			List<String> content = new ArrayList<String>();
			//Read file name from user 
			System.out.println("Enter file Name:");
			filename =obj.nextLine();
			//Read number of lines from user
			System.out.println("Enter how many lines in the file:");
			linesCount=Integer.parseInt(obj.nextLine());
			//Read line from user 
			for (int i = 1;i<=linesCount;i++)
			{
				System.out.println("Enter line "+i+":");
				content.add(obj.nextLine());	
			}
			//save the content into the file
			boolean isSaved = LockedMeMain.createFiles(folderpath, filename, content);
			if(isSaved)
				System.out.println("File and data saved successfully");
			else
				System.out.println("some error occured .please contact admin@123.com");
			//close scanner object
//			obj.close();
		}
		@SuppressWarnings("resource")
		public static void deleteFile() {
			String fileName;
			//Read file name from user
			Scanner obj = new Scanner(System.in);
			
			System.out.println("Enter file name to be deleted:");
			fileName = obj.nextLine();
			boolean isDeleted = LockedMeMain.deleteFile(folderpath, fileName);
			if(isDeleted)
				
				System.out.println("File deleted sucessfully");//Delete the content in the file
			else
				
				System.out.println("Enter file not there or some access issuse"); //ShowingError if the content is not present in the file

		}
		public static void searchFile() 
		{
			//code for searching a file
					String fileName;
					Scanner obj = new Scanner(System.in); //Read file name from user
					System.out.println("Enter file name to be searched:");
					fileName = obj.nextLine();
					boolean isFound = LockedMeMain.searchFile(folderpath, fileName);
					if(isFound)
						System.out.println("File is present in the folder"); //If  the content is present in the file
					else
						System.out.println(" file is not present in te folder"); //If  the content is not present in the file
//					obj.close();
		}
		
	}

