package featuresOfJava;

public class WaystoCreateObject {

	public class Student{
		
		public String studentName;
		public String studentAge;
		
		public String message() {
			return studentAge;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.message();
		

	}

}
