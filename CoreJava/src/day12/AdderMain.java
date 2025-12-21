package day12;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder ad=new Adder();

Box b=new Box();
b.depth=10.90;
b.height=30.09;
b.width=56.90;
Box b2=new Box(10.50);
System.out.println(b2.volume());
double a =b.volume();
System.out.println(a);
ad.sum();
ad.sum(10, 20);
ad.sum(10, 20, 30.00);
ad.sum(123444, 20, 20.20);
	}
	

}
