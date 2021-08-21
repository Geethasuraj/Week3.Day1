package week3.day1assignment;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(" The Student id is: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(" The Student id is: " + id);
		System.out.println(" The Student name is: " + name);
	}
	
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println(" The Email is: " + email);
		System.out.println(" The Phone Number is :" + phoneNumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stuObj = new Students();
		stuObj.getStudentInfo(17);
		stuObj.getStudentInfo(7,"Geetha");
		stuObj.getStudentInfo("Anjali", 9884025910L);

	}

}
