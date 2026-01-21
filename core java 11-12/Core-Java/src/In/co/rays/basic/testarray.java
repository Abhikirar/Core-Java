package In.co.rays.basic;

public class testarray {
public static void main(String[]args) {
	int[]a = {5,10,15,20,25,30,35,40};
	
	System.out.println(a[0]+ "," +a[1] +"," +a[2] +"," +a[3] +"," +a[4]+ ",");
	System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
	
	System.out.println("length of a:" + a.length);
	
	System.out.println("---------");
	
	for (int i=0; i<a.length; i++) {
		System.out.println(i+"=" +a[i]);
		
	}
	System.out.println("---------");
	
	for (int b:a) {
		System.out.println(b);
	}
}
}
