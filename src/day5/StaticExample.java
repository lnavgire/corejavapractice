package day5;

public class StaticExample {

	
	static int a=10; //static 
	
	int b= 20;   //non static
	
	
	static void m1()
	{
		System.out.println("THis is static method");
	}
	
	void m2()
	{
		System.out.println("This is non static method");
	}
	
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticExample.a);

		StaticExample.m1();
		
		
		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();
		
		se.m3();

	}

}
