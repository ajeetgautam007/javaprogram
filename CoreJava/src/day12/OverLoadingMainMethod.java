package day12;

public class OverLoadingMainMethod {
void main(int x) {
	System.out.println(x);
}
void main(String s) {
	System.out.println(s);
	
}
void main(String s1,String S2) {
	System.out.println(s1+S2);
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingMainMethod ov = new OverLoadingMainMethod();
		ov.main(10);
		ov.main("ajeet");
		ov.main("ajeet", "Gautam");
	}

}
