package day5;

public class ConstructorDemo {
	
	
	int x;
	int y;
	
	ConstructorDemo(int a,int b)
	{
		x=a;
		y=b;
	}
	
	
/*	ConstructorDemo()   //Defult Constructor
	{
		x=10;
		y=30;
	}  */
	
	void Display()
	{
		System.out.println(x+y);
	}
	
	public static void main (String[]args)
	{
		//ConstructorDemo cd = new ConstructorDemo();  //Invoks Defult Constructor
		
	//	cd.Display();
		
		ConstructorDemo cm= new ConstructorDemo(10,50); //Invoks parametrerized constructor
				cm.Display();
		
	}

}
