package day16;
interface shape{
	int length=10; //by defult final and static variable
	int width =20;//by defult final and static variable
	void circle() ;
	
	default void square() {
		System.out.println("thos is square-default method ");
	}

	 static void rectangle() {
		System.out.println("this is rectangle -static method ");
	}
}

public class InterfaceDemo implements shape {
   @Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println(length);
		System.out.println(width);
		
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   InterfaceDemo idobj= new InterfaceDemo();
	   idobj.circle();
	   idobj.square();
	   shape.rectangle();
	}

}