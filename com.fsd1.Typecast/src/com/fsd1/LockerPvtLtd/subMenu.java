package com.fsd1.LockerPvtLtd;
/**
 * @author JJ
 *
 */

import java.util.Scanner;


public class subMenu {
	static mainMenu mm = new mainMenu();
	static mainMenuImpl mmi = new mainMenuImpl();
	static subMenu sm = new subMenu();
	static subMenuImpl smi = new subMenuImpl();
	static Scanner sc = new Scanner(System.in);

	public void subMenuImplementation() {
		System.out.println("Enter 1. to search the file name");
		System.out.println("Enter 2. to add the file  ");
		System.out.println("Enter 3. to delete the file");
		System.out.println("Enter 4. to go Back to the Main menu");

		do {
			String user_input = sc.next();

			switch (user_input) {

			case "1":
				smi.searchfile();	
				break;
			case "2":
				smi.addfile();
				break;
			case "3":
				smi.deletefile();
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








