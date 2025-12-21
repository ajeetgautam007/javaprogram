package day15;

class bank{
	double roi() {
		
		return 0;
		
	}
}
class icici extends bank {
double roi() {
		
		return 10.50;
}
}
class sbi extends bank{
double roi() {
		
		return 11.50;
}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		icici ici=new icici();
		System.out.println(ici.roi());
		sbi sb=new sbi();
		sb.roi();
	}

}


