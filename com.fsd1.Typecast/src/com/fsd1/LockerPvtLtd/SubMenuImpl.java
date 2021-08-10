package com.fsd1.LockerPvtLtd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	 * The Method searchfile() does not return anything. The method just prints
	 * Found if the specified filename exists in the directory.
	 */

	public void searchFile() {
		System.out.println("Please enter the file name");
		String filename = sc1.next();
		File searchfile = new File(path + "/" + filename);

		if (searchfile.exists()) {
			System.out.println(" Found : File \"" + filename + "\" at location" + path + "\n");

			System.out.println("Enter 1. to search the file name");
			System.out.println("Enter 2. to add the file  ");
			System.out.println("Enter 3. to delete the file");
			System.out.println("Enter 4. to go Back to the Main menu");

		} else {
			System.out.println("File not found \n");
		}

	}

	/**
	 * The Method addfile() does not return anything The addfile() simply creates
	 * the filename of extenstion provided. The method also checks if mentioned file
	 * already exists in the directory. If filename specified is not created it
	 * prints out error message.
	 */

	public void addFile() {
		System.out.println("Please enter the file name to be added in the directory" + " " + path);

		// variable declaration
		int linescount;
		List<String> content = new ArrayList<String>();

		String filename = sc2.nextLine();
		// File addfile = new File(path + "/" + filename);

		System.out.println(" Enter how many lines in the file");

		linescount = Integer.parseInt(sc2.nextLine());

		for (int i = 1; i <= linescount; i++) {
			System.out.println("Enter line" + i + " :");
			content.add(sc2.nextLine());
		}

		try {

			File f1 = new File(path, filename);
			FileWriter fw = new FileWriter(f1);

			for (String s : content) {
				fw.write(s + "\n");
			}
			fw.close();

			System.out.println("File and data saved");
			System.out.println("Enter 1. to search the file name");
			System.out.println("Enter 2. to add the file  ");
			System.out.println("Enter 3. to delete the file");
			System.out.println("Enter 4. to go Back to the Main menu");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Some error occured");
		}

		if (sc1.equals("2") || sc1.equals("3") || sc1.equals("4")) {
			return;
		}

	}

	/**
	 * The method deletefile() does not return anything. The method simply deletes
	 * the filename specified. Error message is printed if spcified filename is not
	 * deleted.
	 */
	public void deleteFile() {

		System.out.println("Please enter the file name to be deleted from the directory:" + " " + path);
		String filename = sc3.next();
		File file = new File(path + "/" + filename);

		if (file.delete()) {
			System.out.println(" File \"" + filename + "\" deleted from " + path + "\n");
			System.out.println("Enter 1. to search the file name");
			System.out.println("Enter 2. to add the file  ");
			System.out.println("Enter 3. to delete the file");
			System.out.println("Enter 4. to go Back to the Main menu");
		} else {
			System.out.println(" Delete operation failed. File count not be found \n");
		}

	}

}
