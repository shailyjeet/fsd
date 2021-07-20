/**
 * 
 */
package com.fsd1.Oops;

/**
 * @author shail
 *
 */
public class Dog {

	/**
	 * @param args
	 */
	
	// Class Variables
	
	String breed;
	int age;
	String color;
	
	public Dog()
	{
		
	}
	
	//Class Variables
		String name;
		public Dog(String name, String breed, int age, String color) {
			super();
			this.name = name;
			this.breed = breed;
			this.age = age;
			this.color = color;
		}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// toString method  
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog myDog = new Dog ("Andy","BullDog", 4, "Gray");
		myDog.setAge(5);
		System.out.println(myDog.toString()); 
	}

	

}











