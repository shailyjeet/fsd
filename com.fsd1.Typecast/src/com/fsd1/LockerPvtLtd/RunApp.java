/**
 * 
 */
package com.fsd1.LockerPvtLtd;

/**
 * @author JJ
 *
 */
public class RunApp {

	/**
	 *  runApp is the first Java program that is called.
	 *  It calls MainMenu.java 
	 */

	static MainMenu obj = new MainMenu();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::LockedMe.com :::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::Application created by: JJ::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("please select from the below options: ");
		System.out.println("  ");
		System.out.println("Enter 1. to get the file name in the directory ");
		System.out.println("Enter 2. to search, add or delete files in the directory");
		System.out.println("Enter 3. to Exit the Application");

		do {
			
			obj.mainMenuimplementation();
			
		} while (true);

	}

}








