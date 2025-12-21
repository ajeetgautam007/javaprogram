package day13;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Staticdemo {
static int a =10;//staticcvariable
int b=20;//non static variable
static void m1() {
	System.out.println("this is static method");
}
void m2() {
System.out.println("this is non static method");	
}
void m() {
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		m1();
	}

}
