package day13;

public class thiskeyword {
  int x,y;//class /instance variable
  
  thiskeyword(int x,int y){
	 this. x=x;
	 this.y=y;
	  System.out.println(x+y);
  }
void display() {
	  System.out.println(x);
	  System.out.println(y);
  }
  
	public static void main(String[] args) {
		thiskeyword th =new thiskeyword(100,200);
			th.display();
	}

}
