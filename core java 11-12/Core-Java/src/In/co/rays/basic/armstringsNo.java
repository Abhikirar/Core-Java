package In.co.rays.basic;

public class armstringsNo {
public static void main(String[]args) {
	int temp= 254;
	int n = temp;
	int r=0;
	int armstringNo= 0;
	
	while (n>0) {
		r=n%10;
		armstringNo=armstringNo + r* r* r;
		n=n/10;
	}
	System.out.println(armstringNo);
	if (temp==armstringNo) {
		System.out.println("armstring no");
	}else {
		System.out.println("not armstring");
	}
}
}
