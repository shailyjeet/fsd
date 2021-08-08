package com.fsd1.LockerPvtLtd;
/**
 * @author JJ
 *
 */

import java.util.Scanner;


public class SubMenu {
	static MainMenu mm = new MainMenu();
	static MainMenuImpl mmi = new MainMenuImpl();
	static SubMenu sm = new SubMenu();
	static SubMenuImpl smi = new SubMenuImpl();
	static Scanner sc = new Scanner(System.in);

	
	/**
	 * The method subMenuImplementation provides menu options to Add file, delete file, 
	 * search file or Go back to main menu. It also prints default options is any 
	 * parameter other than 1,2 or 3 is entered.
	 */
	public void subMenuImplementation() {
		System.out.println("Enter 1. to search the file name");
		System.out.println("Enter 2. to add the file  ");
		System.out.println("Enter 3. to delete the file");
		System.out.println("Enter 4. to go Back to the Main menu");

		do {
			String user_input = sc.next();

			switch (user_input) {

			case "1":
				smi.searchFile();	
				break;
			case "2":
				smi.addFile();
				break;
			case "3":
				smi.deleteFile();
				break;
			case "4":
				System.out.println("Enter 1. to get the file name in the directory ");
				System.out.println("Enter 2. to search, add or delete files in the directory");
				System.out.println("Enter 3. to Exit the Application");
				mm.mainMenuimplementation();
				break;
			default:
				System.out.println(" Invalid input, please Enter: ");
				System.out.println("Enter 1. to search the file name");
				System.out.println("Enter 2. to add the file  ");
				System.out.println("Enter 3. to delete the file");
				System.out.println("Enter 4. to go Back to the Main menu");
				break;

			}

		} while (true);

	}

}








