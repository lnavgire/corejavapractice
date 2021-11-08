package day5;

public class ThisKeyWord {
	
	
	int a,b;
	
	
	void getValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisKeyWord th =new ThisKeyWord();
		
		th.getValues(23, 24);
		th.printValues();

	}

}
