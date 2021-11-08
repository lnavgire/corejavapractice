package day5;

public class MethodOverLoading {
	
	
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading mo = new MethodOverLoading();
		
		mo.add(10, 20);
		mo.add(23, 23, 45);
		mo.add(23.4, 23.6);
		mo.add(11, 11.5);
		
		
	}

}
