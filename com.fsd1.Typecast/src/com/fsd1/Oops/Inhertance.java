/**
 * 
 */
package com.fsd1.Oops;

/**
 * @author shail
 *
 */

//Base class / Parent Class
class Bicycle
{
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void speedUp(int increment)
	{
		speed +=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
		
}

//Derived Class / Child Class
class MountainBike extends Bicycle
{
	
	public int seatHeight;

	public MountainBike(int gear, int speed,int startHeight) {
		super(gear, speed);		
		seatHeight = startHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return (super.toString()) + "MountainBike [seatHeight=" + seatHeight + "]";
	}
	
}




public class Inhertance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 100,25);
		mb.speedUp(50);
		mb.applyBrake(20);
		System.out.println(mb.toString());

	}

}








