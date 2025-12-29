package day16;

public class C1  extends C2 implements I1,I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C1 OBJ=new C1();
OBJ.m1();
OBJ.m2();
OBJ.m3();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(y);
	}

}
