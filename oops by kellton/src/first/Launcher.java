package first;

import java.util.ArrayList;

import oops_by_kellton.Emp;

public class Launcher {

	public static void main(String[] args) {
	
		/*Emp[] earr = new Emp[4];
		earr[0] = new SalEmp(1,"Harsh","Dehradun",12000);
		earr[1] = new SalEmp(2,"Akhilesh","Uttarakhand",11000);
		earr[2] = new ContEmp(3,"Amit","Bihar",100);
		earr[3] = new SalEmp(4,"Shreya","Bihar",10000);
		for(int i=0; i<4;i++) {
			System.out.println(earr[i]);
			if(earr[i] instanceof SalEmp)
				((SalEmp)earr[i]).salIncr(1000);
		}*/
		
		ArrayList<Emp> el = new ArrayList<>();
		el.add(new SalEmp(1,"Harsh","Dehradun",12000));
		el.add(new SalEmp(2,"Akhilesh","Uttarakhand",11000));
		el.add(new ContEmp(3,"Amit","Bihar",100));
		el.add(new SalEmp(4,"Shreya","Bihar",10000));
		el.remove(0);
		System.gc();
		int salary=0;
		for(Emp e : el) {
			if(e instanceof SalEmp) {
				((SalEmp)e).salIncr(1200);

			}
			System.out.println(e);
		}
		System.out.println("Max Salary	: "+SalEmp.maxSalary());
		//System.out.println("Second Max Sal : "+salary);
		System.out.println("Emp Count	: "+Emp.getEmpCount());
	}

}