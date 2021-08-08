package com.fsd1.LockerPvtLtd;

/**
 * @author JJ
 *
 */
import java.util.Scanner;

public class MainMenu {
	/**
	 * MainMenu Java application program provides menu options 
	 * 1 to get the files in directory
	 * 2 to search, add file in the directory
	 * 3 Exit maain Application.
	 */

	static Scanner sc = new Scanner(System.in);
	static MainMenuImpl mmi = new MainMenuImpl();
	static SubMenu sm = new SubMenu();
	

	public void mainMenuimplementation() 
	{
		do 
		{
		String user_input = sc.next();
		
		switch(user_input) 
			{
		// case to Retrieve file name in the directory
		case "1":
			mmi.getFileNames();
			break;
			
		// case to manage the directory files	
		case "2":
			sm.subMenuImplementation();
			break;
			
		// case to exit application	
		case "3":
			mmi.exitApplication();
			break;
		
		default:			
			System.out.println("Invalid input: Please Eenter from the following options:");
			System.out.println("Enter 1. to get the file name in the directory ");
			System.out.println("Enter 2. to search, add or add files in the directory");
			System.out.println("Enter 3. to Exit the Application");	
			
			}
	
		}
		while (true);
	}
}






