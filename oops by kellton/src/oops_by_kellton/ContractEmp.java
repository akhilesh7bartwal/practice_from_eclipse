package oops_by_kellton;

public class ContractEmp extends Emp {
	private int contractDur;
	ContractEmp(){
		super();
		this.contractDur=0;
	}
	ContractEmp(int empno,String empname,String loc,int contractDur){
		super(empno,empname,loc);
		this.contractDur=contractDur;
	}
	public String toString() {
		String info=super.toString();
		info+="\nContract Duration :"+contractDur;
		return info;
		}

}
