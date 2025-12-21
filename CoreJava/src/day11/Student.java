package day11;

public class Student {
	//class variable 
int sid ;
String Sname;
char grade;


void printStudentData() {
System.out.println(sid+"       "+Sname+"     "+grade+"   ");	
}

void setStudentData(int id,String name,char gr) {//local variable 
	sid=id;
	Sname=name;
	grade=gr;
	
}

Student (int id,String name,char gr){
	sid=id;
	Sname=name;
	grade=gr;
	
}

}
