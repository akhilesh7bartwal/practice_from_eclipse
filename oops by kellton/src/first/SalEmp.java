package first;

public class SalEmp extends Emp {
	
	private int sal;
	private static int maxSalary=0, secMaxSal=0;
	

	public SalEmp() {
		super();
		sal=0;
	}

	public SalEmp(int empno, String ename, String loc, int sal) {
		super(empno, ename, loc);
		// TODO Auto-generated constructor stub
		this.sal = sal;	
		if(maxSalary<sal) {
			secMaxSal = maxSalary;
			maxSalary = sal;
		}
	}
	
	public String toString() {
		String info = super.toString();
		info += "\nSalary	: "+sal;
		return info;
	}
	
	public void salIncr(int x) {
		this.sal+=x;
		if(maxSalary<sal) {
			secMaxSal = maxSalary;
			maxSalary = sal;
		}
	}
	public int getSal() {
		return sal;
	}
	public static int maxSalary() {
		return maxSalary;
	}
	public void finalize() {
		try {
			super.finalize();
			maxSalary = secMaxSal;
		}catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Object Destroyed");
	}
	


}