package com.fsd1.LockerPvtLtd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author JJ
 *
 */
public class SubMenuImpl {

	static String path = MainMenuImpl.path;
	static Scanner sc1 = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Scanner sc3 = new Scanner(System.in);

	/**
	 * The Method searchfile() does not return anything.
	 * The method just prints Found if the specified filename exists in the directory.
	 */
	
	public void searchFile() {
		System.out.println("Please enter the file name");
		String filename = sc1.next();
		File searchfile = new File(path + "/" + filename);

		if (searchfile.exists()) {
			System.out.println(" Found : File \"" + filename + "\" at location" + path + "\n");
		} else {
			System.out.println("File not found \n");
		}

	}

	/**
	 * The Method addfile() does not return anything
	 * The addfile() simply creates the filename of extenstion provided.
	 * The method also checks if mentioned file already exists in the directory.
	 * If filename specified is not created it prints out error message.
	 */
	public void addFile() {
		System.out.println("Please enter the file name to be added in the directory" + " " + path);

		String filename = sc2.next();
		File addfile = new File(path + "/" + filename);

		try {

			if (addfile.createNewFile())
				System.out.println("    File \"" + filename + "\" added to " + path + "\n");
			else if (addfile.exists())
				System.out.println("    File \"" + filename + "\" already exists at " + path + "\n");
			else
				System.out.println("Something went wrong. File NOT added\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (sc1.equals("2") || sc1.equals("3") || sc1.equals("4")) {
			return;
		}

	}
	
	/**
	 * The method deletefile() does not return anything.
	 * The method simply deletes the filename specified.
	 * Error message is printed if spcified filename is not deleted.
	 */
	public void deleteFile() {
		
		System.out.println("Please enter the file name to be deleted from the directory:" + " " + path);
		String filename = sc3.next();
		File file = new File(path+ "/" + filename);
		
		if(file.delete()) 
		{
			System.out.println(" File \""+filename +"\" deleted from " +path + "\n");
		}
		else 
		{
			System.out.println(" Delete operation failed. File count not be found \n");
		}
		
		
	}

}
