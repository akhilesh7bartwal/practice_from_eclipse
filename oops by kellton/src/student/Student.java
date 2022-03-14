package student;

public abstract class Student {
	
	private String name;
	private int id;
	private String address;
	private static int studentCount=0;
	
	Student(){
		this.id=0;
		this.name=null;	
		this.address=null;
	}
	public static int getstudentCount() {
		return studentCount;
	}
	
	Student(int id, String name, String address){
		this.id=id;
		this.name=name;		
		this.address=address;
		studentCount++;
	}
	public String toString() {
		String info="ID :"+this.id;
		info+="\nName :"+this.name;
		info+="\nAddress :"+this.address;
		return info;
	}
		
}
