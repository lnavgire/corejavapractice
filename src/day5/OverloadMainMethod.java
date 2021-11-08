package day5;

public class OverloadMainMethod {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OverloadMainMethod om= new OverloadMainMethod();
		
		om.main(100);
		
		om.main(13, 23);
		
		
		
	}
	
	
	public void main(int x)
	{
		System.out.println(x);
	}
	
	
	public void main(int x,int y)
	{
		System.out.println(x+y);
	}

}
