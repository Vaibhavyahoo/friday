class Vehicle
{
	int speed=80;
}
class Bike extends Vehicle
{
	int speed=60;
	void display()
	{
         
		System.out.println(super.speed);
	}
}
public class Super
{
	public static void main(String []args)
	{
		Bike b=new Bike();

		b.display();
	}
}

