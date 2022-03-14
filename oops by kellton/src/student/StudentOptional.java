package student;

public class StudentOptional extends Student{
	
	private String course;
	private String optTopics;
	
	StudentOptional(){
		super();
		this.course=null;
		this.optTopics=null;
	}
	StudentOptional(int id,String name,String address,String course,String optTopics){
		super(id,name,address);
		this.course=course;
		this.optTopics=optTopics;
	}
	
	public String toString() {
		String info=super.toString();
		info+="\nCourse"+course;
		info+="\nOpt Topics :"+optTopics;
		return info;
	}

}
