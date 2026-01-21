package In.co.rays.basic;

public class swapingtwo {
public static void main(String[]args) {
	int a=25;
	int b=35;
	
	System.out.println("a= "  +a);
	System.out.println("a= "  +b);
	 
	a=a+b; //a=60;
	b=a-b; //b=25;
	a=a-b; //a=35;
	
	System.out.println("-------");
	
	System.out.println("a= "  +a);
	System.out.println("b= "   +b);
	
}
}
