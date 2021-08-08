package com.fsd1.LockerPvtLtd;
/**
 * @author JJ
 *
 */

import java.io.File;
import java.util.Scanner;


public class MainMenuImpl 
{
	
	static String path = "C:\\Users\\shail\\eclipse-workspace\\com.fsd1.Typecast\\src\\com\\fsd1\\LockerPvtLtd\\Documents";
	static MainMenu obj = new MainMenu();
	
	/**
	 * Method to Retrieve file names in the directory (ASC order)
	 * The method does not return anything.
	 * The method displays list of files in the current Documents directory.
	 */
	public void getFileNames() 
	{
		
		System.out.println("The directory contain following files:");
		File dir = new File(path);
		File[] listofFiles = dir.listFiles();
		String[]flist = dir.list();
		
		if (flist == null) 
		{
			System.out.println("The directory is empty");
			
		}
		
		for(File file : listofFiles)
		{
			if (file.isFile())
			{
				System.out.println(file.getName());  
				
			}
						
		}
	}
	
	/**
	 * Method to exit an application. Before exit, It will prompt a question
	 * Y/Y is Yes and it exit an application
	 * N/n is NO  and it will take to Main Menu.
	 */
	
	public void exitApplication()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you sure you want to exit the Application?");
		System.out.println("\n Enter (Y/y)->YES    To exit the Application?");
		System.out.println("\n Enter (N/n)-> NO    To return Main Menu ");
		String exit = sc.next();
		
		if(exit.equals("y") || exit.equals("Y"))
		{
			System.out.println("thank you for using the Application");	
			System.exit(0);
		}
		else if (exit.equals("n") || exit.equals("N"))
		{
			System.out.println("1. to search the file name");
			System.out.println("1. to get the file name in the directory ");
			System.out.println("2. to search, add or add files in the directory");
			System.out.println("3. to Exit the Application");
			obj.mainMenuimplementation();
			
		}
		else if(!(((exit.equals("n")||exit.equals("N"))||(exit.equals("y")||exit.equals("Y")))))
		{
			System.out.println("Please enter valid input");
		}
		
		sc.close();
	}
	
}




