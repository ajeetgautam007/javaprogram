package day18;
public class TypeCastingConcept {
public static void main(String[] args) {
// upcasting --autocasting----smaller to larger
	/*int intvalve=100;
	long longvalue=intvalve;
	System.out.println(longvalue);*/
	
	// float ----double     
/*	float floatvalue=10.5F;
	double doublevalue=floatvalue;
	System.out.println(doublevalue);
	*/
	//downcasting ----manually ----larger to smaller
	int longvalue=1000000000;
	int intvalue=(int)longvalue;
	System.out.println(intvalue);
	
	}

}
