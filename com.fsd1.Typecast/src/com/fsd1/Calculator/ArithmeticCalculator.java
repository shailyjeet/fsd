/**
 * 
 */
package com.fsd1.Calculator;

import java.util.Scanner;

/**
 * @author shail
 *
 */
public class ArithmeticCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,output = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operation like A/S/M/D:");
		// System.out.println("Command Line Args: "+args[0]);
		char ip = sc.next().charAt(0);
		
		System.out.println("Enter the Numbers to be added:");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		switch(ip)
		{
		
		case 'A':
			
				output = a+b;
				break;
				
		case 'S':
			
			output = a-b;
			break;
			
		case 'M':
			
			output = a*b;
			break;
			
		case 'D':
			
			output = a/b;
			break;
			
		default:
			System.out.println("Incorret input");
		}
		
		
		
		System.out.println("The Final Result:"+output);
		sc.close();

	}

}
