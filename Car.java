package day261022;

//a)Create a class by name : Car
public class Car {

	//	b)Create a method 
	//	  driveCar->Have a print statement
	//	  applyBrake->Have a print statement
	//	  soundHorn->Have a print statement
	//	  isPuncture->Have a print statement
	int driveCar()
	{
		System.out.print("Drive your Car carefully with ");
		return 100;
	}
	String applyBrake()
	{
		System.out.print("Use ");
		return "FirstBreak";
	}
	String soundHorn()
	{
		System.out.print("Horn is ");
		return "ON";
	}
	boolean isPuncture()
	{
		System.out.print("Is Punture? ");
		return true;
	}
	//c)Create a main method
	public static void main(String[] args) {
		//d)Create an Object
		Car c = new Car();
		//e)Call the methods using the object
		//f)Run and Confirm
		System.out.println(c.driveCar());
		System.out.println(c.applyBrake());
		System.out.println(c.soundHorn());
		System.out.println(c.isPuncture());



	}

}
