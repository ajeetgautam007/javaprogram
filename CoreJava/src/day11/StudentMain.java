package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu =new Student();
		/*stu.grade='A';
		stu.sid=01;
		stu.Sname="AJEET GAUTAM";
		stu.printStudentData();*/
		
		//2 using method 
		//stu.setStudentData(101,"Ajeet", 'A');
		//stu.printStudentData();
		
		//3 using contractor
		Student stu= new Student(01,"ajeet",'A');
		stu.printStudentData();
	}

}
