package day5;

public class Calculations {
	
	//method taking parameter and returning value
	int sum(int a,int b)
	{
		return(a+b);
	}
	
	
/* method taking parameter but not returning any value	
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	/* not taking paramter but returm value
	int x=23;
	int y= 34;
	
	
	int sm()
	{
	return (x+y);	
	}
	
/*	
 *not taking any parametre and not return any value
 * void sm()
	{
		System.out.println(x+y);
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculations cal= new Calculations();
		
	//int result=cal.sm();
	//System.out.println(result);
		
	//	cal.sum(100, 200);
		
		System.out.println(cal.sum(100, 200));

	}

}
