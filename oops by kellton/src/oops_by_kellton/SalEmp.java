package oops_by_kellton;

interface demoInterface{
	void displayInfo();
	void getInfo();
}

public class SalEmp extends Emp {
	private int salary;
	private static int maxSalary=0;
	private static int secmaxSalary=0;
	
	SalEmp(){
		super();
		this.salary=0;
		
	}
	SalEmp(int empno,String empname,String loc,int salary){
		super(empno,empname,loc);
		this.salary=salary;
		if(maxSalary<salary) {
			secmaxSalary=maxSalary;
			maxSalary=salary;
		}
	}
	public void salaryInc(int x) {
		this.salary+=x;
		if(maxSalary<this.salary) {
			secmaxSalary=maxSalary;
			maxSalary=this.salary;
		}
	}
	public static int maxSalary() {
		return maxSalary;
	}
	
	public void finalize() {
		super.finalize();
		maxSalary=secmaxSalary;
	}
	
	public String toString() {
		String info=super.toString();
		info+="\nContract Duration :"+salary;
		return info;
		}

}
