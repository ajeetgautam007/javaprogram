package day17;

public class DataConversionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String ----->>>>int
String s ="1234";
int sint=Integer.parseInt(s);
System.out.println(s);

String s1="10";
String s2="20";
System.out.println(Integer.parseInt(s2+s1));
System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
//String    to    double
String s3="10.50";
String s4="20.50";
System.out.println(Double.parseDouble(s4)+Double.parseDouble(s3));
	String s5="Welcome";
	String s6="True";
	System.out.println(Boolean.parseBoolean(s5));
	System.out.println(Boolean.parseBoolean(s6));
	
	
	// int dounble bool char------>String
	
	int a=10;
	double d=10.5;
	char c='A';
	boolean boon =true;
String S7= String.valueOf(a);
	System.out.println(S7);
	
	S7=String.valueOf(d);
	System.out.println(S7);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
