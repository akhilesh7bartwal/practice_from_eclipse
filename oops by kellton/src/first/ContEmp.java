package first;

public class ContEmp extends Emp {
	private int contactDur;

	public ContEmp() {
		contactDur=0;
	}

	public ContEmp(int empno, String ename, String loc, int contactDur) {
		super(empno, ename, loc);
		this.contactDur=contactDur;
	}
	
	public String toString() {
		String info = super.toString();
		info += "\nContact Duration	: "+contactDur;
		return info;
	}


}