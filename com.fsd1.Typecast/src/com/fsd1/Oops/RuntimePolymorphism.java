/**
 * 
 */
package com.fsd1.Oops;

/**
 * @author shail
 *
 */

interface First
{
	
	default void show()
	{
		System.out.println("Default First");		
	}
}

interface Second
{
	
	default void show()
	{
		System.out.println("Default Second");		
	}
}



public class RuntimePolymorphism implements First,Second 
{

	public void show()
	{
	First.super.show();
	Second.super.show();		
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimePolymorphism obj = new RuntimePolymorphism();
		obj.show();

	}

}
