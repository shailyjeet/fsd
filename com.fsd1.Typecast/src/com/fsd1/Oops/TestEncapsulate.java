/**
 * 
 */
package com.fsd1.Oops;

/**
 * @author shail
 *
 */

class Encapsulate 
{
	private String Name;
	private int Roll;
	public int Age;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) { 
		Roll = roll;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
}


public class TestEncapsulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj = new Encapsulate();
		obj.setAge(30);
		obj.setName("Johnson");
		obj.setRoll(50);
		
		obj.Age = 25;
		
		System.out.println("My Name:"+obj.getName());
		System.out.println("My Age:"+obj.getAge());
		System.out.println("My ROll:"+obj.getRoll());

	}

}
