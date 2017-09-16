import java.util.*;
public class Main {

	public static void main(String[] args) {
	    StudentGroup m =new StudentGroup(100);
Date d= new Date(4,5,1999);
	    Student s=new Student(20,"student",d,92.0);

		m.getStudent(10);
		m.setStudent(s,10);
		System.out.println("index");
		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
