package week3.day1assignment;

public class Student extends Department {
	
	public void studentName() {
		System.out.println(" Iyshu");
	}
	
	public void studentDept() {
		System.out.println("CSE");
		
	}
	
	public void studentId() {
		System.out.println("17");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stuObj = new Student();
		stuObj.collegeName();
		stuObj.collegeCode();
		stuObj.collegeRank();
		stuObj.deptName();
		stuObj.studentName();
		stuObj.studentDept();
		stuObj.studentId();
		
		

	}

}
