
import java.util.*;


public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
Scanner s=new Scanner(System.in);

	public StudentGroup(int length) {
		this.students = new Student[length];
	}


	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}


	public void setStudents(Student[] students)
	 {
		this.students[0]=students[0];
		this.students[1]=students[1];
		this.students[2]=students[2];





		}


	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}


	public void setStudent(Student student, int index) {
		// Add your implementation here
	}


	public void addFirst(Student student) {
		// Add your implementation here
	}


	public void addLast(Student student) {
		// Add your implementation here
	}


	public void add(Student student, int index) {
		// Add your implementation here
	}


	public void remove(int index) {
		// Add your implementation here
	}

	public void remove(Student student) {
		// Add your implementation here
	}

	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	public void removeFromElement(Student student) {
		// Add your implementation here
	}


	public void removeToIndex(int index) {
		// Add your implementation here
	}


	public void removeToElement(Student student) {
		// Add your implementation here
	}

	public void bubbleSort() {
		// Add your implementation here
	}

	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}


	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}


	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
