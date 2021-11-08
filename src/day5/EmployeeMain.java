package day5;

public class EmployeeMain {

	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Employee emp1 = new Employee();
			
			emp1.ename="Linux Codefire";
			emp1.eid=345667;
			emp1.deptno=34567;
			emp1.esal=90000;
			emp1.job="SDET";
			
			emp1.display();
			
			Employee emp2 = new Employee();
			
			emp2.deptno=65433;
			emp2.eid=87654;
			emp2.ename="Root CodeFIre";
			emp2.esal=90000.00;		
			emp2.job="SDET";
			emp2.display();
			

		}

	}


