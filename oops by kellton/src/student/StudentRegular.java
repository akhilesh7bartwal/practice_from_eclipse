package student;

public class StudentRegular extends Student{
	
	private int cl;
	private char sec;
	private String stream;
	
	StudentRegular(){
		super();
		this.cl=0;
		this.sec='\u0000';
		this.stream=null;
	}
	
	StudentRegular(int id, String name, String address,int cl,char sec, String stream){
		super(id,name,address);
		this.cl=cl;
		this.sec=sec;
		this.stream=stream;
	}
	
	public String toString() {
		String info=super.toString();
		info+="\nClass :"+cl;
		info+="\nSection :"+sec;
		info+="\nStream :"+stream;
		return info;
	}
	
}
