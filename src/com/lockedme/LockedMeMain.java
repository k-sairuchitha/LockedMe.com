package com.lockedme;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class LockedMeMain {
	
	
	

	



	
	
		public static List<String> getAllFiles(String folderpath){
			//creating File Object
					File fl = new File(folderpath);
					//getting all the files into FileArray
					File[] listofFiles = fl.listFiles();
					//declare a list to store file names
					List<String> fileNames = new ArrayList<String>();
					
					for (File f:listofFiles) //Using ForEach to get the file names 
						fileNames.add(f.getName());
					return fileNames;
		}

		/**
		 * This method will create to append content into the file specified
		 * @param folderpath
		 * @param fileName
		 * @param content
		 * @return boolean
		 * 
		 */
		public static boolean createFiles(String folderpath,String fileName,List<String> Content)
		{
			try 
			{
				File fl = new File(folderpath,fileName);
				FileWriter fw = new FileWriter(fl); //write the userinput to the file
				
				for (String s : Content) 
				{
					fw.write(s+ "\n");
				}
				
				fw.close();
				return true;
			}
			catch(Exception Ex)
			{
				return false;
			}
		}
		
		/**
		 * This method will delete the file name if it exists.
		 * @param folderpath
		 * @param fileName
		 * @return
		 */
			
		
		public static boolean deleteFile(String folderpath,String fileName)
		{
			
			File file = new File(folderpath+"\\"+fileName); //delete the file from the directory 
			
			try {
				if (file.delete()) // if the file exits it will delete the file 
					return true;
				else 
					return false;
			}
			catch(Exception ex) {
				return false;
				
			}
			
		}
		/**
		 * This method will search the file
		 * @param folderpath
		 * @param fileName
		 * @return
		 */
		public static boolean searchFile(String folderpath,String fileName) {
			File file = new File(folderpath+"\\"+fileName);
			if(file.exists())
				return true;
			else
				return false;
			
		}
			
	}

	 
		
		
		// TODO Auto-generated method stub
		
		
		
		

