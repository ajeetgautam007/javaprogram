package day14;

class A {
	
		int a=100;
		 void display() {
System.out.println(a);	 
 }

}
class B extends A {
int b=300;
void show() {
	System.out.println(b);
	System.out.println("program end");
}

public class InheritanceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B aoj =new B();
	
		aoj.show();
		aoj.display();
	}
}

}
