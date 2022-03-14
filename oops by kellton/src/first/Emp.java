package first;

public class Emp {
	private int empno;
	private String ename,loc;
	private static int empCount=0;
	

	public Emp() {
		empno = 0;
		ename = "NA";
		loc = "NA";
	}
	
	public static int getEmpCount() {
		return empCount;
	}
	
	public Emp(int empno, String ename, String loc) {
		this.empno = empno;
		this.ename = ename;
		this.loc = loc;
		empCount++;
	}
	
	public String toString() {
		String info = "\nEmp No.	: "+empno;
		info += "\nName.	: "+ename;
		info += "\nLoc.	: "+loc;
		return info;
	}
	public void finalize() {
		empCount--;
		try {
			super.finalize();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Object Destroyed");
	}

}