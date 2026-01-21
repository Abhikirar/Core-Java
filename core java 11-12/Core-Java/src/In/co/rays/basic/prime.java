package In.co.rays.basic;

public class prime {
public static void main(String[]args) {
	int b=5;
	int count=0;
	for (int i=2; i<b; i++) {
		if(b%i==0) {
			count++;
		}
		
	}
	System.out.println("count :" +count);
	if(count>0){
		System.out.println("not prime");
	}else {
		System.out.println("prime");
		
	}
	
}
}
