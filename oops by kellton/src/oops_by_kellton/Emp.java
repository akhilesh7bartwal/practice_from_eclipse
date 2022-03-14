package oops_by_kellton;

public abstract class Emp {
	private int empno;
	private String empname;
	private String loc;
	private static int countEmp;
	
	Emp(){
		this.empno=0;
		this.empname=null;
		this.loc=null;
	}
	
	Emp(int empno,String empname,String loc)
	{
		this.empno=empno;
		this.empname=empname;
		this.loc=loc;
		countEmp++;
	}
	public static int getcount() {
		return countEmp;
	}
	public String toString() {
		String info="Empno :"+empno;
		info+="\nEmp name :"+empname;
		info+="\nLocation :"+loc;
		return info;
	}
	
	public void finalize() {
		countEmp--;
		try {
			super.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Object destroyed.");
	}
}
