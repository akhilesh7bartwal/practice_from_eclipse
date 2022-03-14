package oops_by_kellton;
import java.util.*;

public class Launcher {
	public static void main(String[]args) {
		
		//Emp[] e=new Emp[4]; 
//		ContractEmp e1= new ContractEmp(1000,"akhilesh","uttarakhand",100);
//		SalEmp e2= new SalEmp(1001,"harsh","uttarakhand",5000);
//		SalEmp e3= new SalEmp(1002,"aman","uttarakhand",4000);
		
		ArrayList<Emp> e= new ArrayList<>();
		
		e.add(new ContractEmp(1000,"akhilesh","uttarakhand",100)) ;
		e.add(new SalEmp(1001,"harsh","uttarakhand",12000)) ;
		e.add(new SalEmp(1002,"aman","uttarakhand",11000)) ;
		e.add(new SalEmp(1003,"ashish","PB",10000)) ;
		e.add(new ContractEmp(1004,"vams","UP",300));
		
		e.remove(3);

		System.gc();
//		e.get(0).finalize();
		
		for(Emp em : e) {
			if(em instanceof SalEmp)
				((SalEmp) em).salaryInc(1200);
			System.out.println(em);
		}
//		
//		for(int i=0; i<4; i++) {
//			if(e[i] instanceof SalEmp)
//			((SalEmp)e[i]).salaryInc(200);
//			System.out.println(e[i]);
//		}
		//e[0].finalize();
//		a[0]=null;
//		System.gc();

		System.out.println("Emp. counter :"+Emp.getcount());


		System.out.println("Max salary :"+SalEmp.maxSalary());
		

	}

}
