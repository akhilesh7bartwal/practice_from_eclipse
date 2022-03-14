package student;
import java.util.*;
public class Launcher {
	public static void main(String[]args) {
		
		ArrayList<Student> al= new ArrayList<>(0);
		al.add(new StudentRegular(1,"akhilesh","uttarakhand",9,'A',"CSE"));
		al.add(new StudentRegular(2,"harsh","uttarakhand",11,'A',"IT"));
		al.add(new StudentOptional(3,"amit","bihar","MCA","electronics"));
		
		for(Student s:al) {
			System.out.println(s);
		}
		System.out.println("\nTotal Student count :"+Student.getstudentCount());
	}

}
